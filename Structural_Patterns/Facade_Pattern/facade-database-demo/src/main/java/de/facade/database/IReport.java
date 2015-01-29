package de.facade.database;

import java.sql.Connection;

import de.facade.database.HelperFacade.ReportTypes;

public interface IReport {
    public void generateReport(ReportTypes reportType, String tableName,
            Connection con);

}
