package ch.adesso.teleport.report.boundary;

import ch.adesso.teleport.report.entity.Report;

import javax.json.bind.JsonbBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.List;

@Path("reports")
public class ReportsResource {

    @GET
    public String getReports() {
        List<Report> reports = new ArrayList<>();
        reports.add(new Report(12, 4));
        reports.add(new Report(34, 2));
        return JsonbBuilder.create().toJson(reports);
    }

}
