package ch.adesso.teleport.report.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Report {
    private Integer acceptedRoutes;
    private Integer completedRoutes;
}
