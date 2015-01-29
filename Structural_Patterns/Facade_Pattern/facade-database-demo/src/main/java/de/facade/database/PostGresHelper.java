package de.facade.database;

import java.sql.Connection;
import java.util.logging.Logger;

import de.facade.database.HelperFacade.ReportTypes;

public class PostGresHelper implements IReport {
    private static final String TABLE_NAME = "TableName";
    private static final String CONNECTION = "Connection";
   private static final Logger LOGGER = Logger.getLogger("PostGresHelper");

    public static Connection getPostGresDBConnection() {
        // get MySql DB connection using connection parameters
        return null;
    }

    public void generateReport(ReportTypes reportType, String tableName,
            Connection con) {
        generateReport(tableName, con);
    }

    private void generateReport(String tableName, Connection con) {
        LOGGER.fine(TABLE_NAME + ": " + tableName + " / "  +  CONNECTION + ": "  + con.toString());
       LOGGER.fine("get data from table and generate pdf report");
    }

}
