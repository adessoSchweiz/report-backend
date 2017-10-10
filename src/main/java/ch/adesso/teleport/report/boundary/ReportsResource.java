package ch.adesso.teleport.report.boundary;

import ch.adesso.teleport.report.entity.Report;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("reports")
@Produces(MediaType.APPLICATION_JSON)
public class ReportsResource {

    @GET
    public List<Report> getReports() {
        List<Report> reports = new ArrayList<>();
        reports.add(new Report(12, 4));
        reports.add(new Report(34, 2));
        return reports;
    }

}
