package de.facade.database;

import java.sql.Connection;
import java.util.logging.Logger;

import de.facade.database.HelperFacade.ReportTypes;

public class OracleHelper implements IReport {

     private static final String TABLE_NAME = "TableName";
    private static final String CONNECTION = "Connection";
   private static final Logger LOGGER = Logger.getLogger("OracleHelper");

    public static Connection getOracleDBConnection() {
        // get MySql DB connection using connection parameters
        return null;
    }

    public void generateReport(ReportTypes reportType, String tableName,
            Connection con) {
        switch (reportType) {
        case PDF:
            generatePDFReport(tableName, con);
            break;
        case HTML:
            generateHTMLReport(tableName, con);
            break;
        case WORD:
            generateWORDReport(tableName, con);
            break;
        default:
            break;
        }
    }

    private void generatePDFReport(String tableName, Connection con) {
        LOGGER.fine(TABLE_NAME + ": " + tableName + " / "  +  CONNECTION + ": "  + con.toString());
        LOGGER.fine("get data from table and generate pdf report");
    }

    private void generateHTMLReport(String tableName, Connection con) {
        LOGGER.fine(TABLE_NAME + ": " + tableName + " / "  +  CONNECTION + ": "  + con.toString());
      LOGGER.fine("get data from table and generate html report");
    }

    private void generateWORDReport(String tableName, Connection con) {
        LOGGER.fine(TABLE_NAME + ": " + tableName + " / "  +  CONNECTION + ": "  + con.toString());
     LOGGER.fine("get data from table and generate word report");
    }
}
