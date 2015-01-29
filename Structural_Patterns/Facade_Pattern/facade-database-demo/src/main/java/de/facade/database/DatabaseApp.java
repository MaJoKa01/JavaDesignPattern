package de.facade.database;

import java.util.logging.*;


public class DatabaseApp {

    private static final Logger LOGGER = Logger.getLogger("DataBaseApp");

    private DatabaseApp() {

    }

    public static void main(String[] args) {
        LOGGER.fine("Database App started!");

        String tableName = "Employee";

        // generating MySql HTML report and Oracle PDF report using Facade
        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL,
                HelperFacade.ReportTypes.HTML, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL,
                HelperFacade.ReportTypes.WORD, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL,
                HelperFacade.ReportTypes.PDF, tableName);

        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE,
                HelperFacade.ReportTypes.PDF, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE,
                HelperFacade.ReportTypes.HTML, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE,
                HelperFacade.ReportTypes.WORD, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.POSTGRES,
                HelperFacade.ReportTypes.PDF, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.POSTGRES,
                HelperFacade.ReportTypes.HTML, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.POSTGRES,
                HelperFacade.ReportTypes.WORD, tableName);

    }
}
