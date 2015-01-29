package de.facade.database;

import java.sql.Connection;
import java.util.logging.Logger;

import de.facade.database.HelperFacade.ReportTypes;

public class MySqlHelper implements IReport {

    private static final String TABLE_NAME = "TableName";
    private static final String CONNECTION = "Connection";
  private static final Logger LOGGER = Logger.getLogger("MySqlHelper");

    public static Connection getMySqlDBConnection() {
        // get MySql DB connection using connection parameters
        return null;
    }

    public void generateReport(ReportTypes reportType, String tableName,
            Connection con) {

        LOGGER.fine("WORD and HTML Reports not supported!");
        generatePDFReport(tableName, con);
    }

    public void generatePDFReport(String tableName, Connection con) {
        LOGGER.fine(TABLE_NAME + ": " + tableName + " / "  +  CONNECTION + ": "  + con.toString());

        LOGGER.fine("get data from table and generate pdf report");
    }

}
