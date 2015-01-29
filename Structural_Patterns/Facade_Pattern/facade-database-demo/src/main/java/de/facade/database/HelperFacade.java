package de.facade.database;

import java.sql.Connection;

public class HelperFacade {

       
    private HelperFacade() {

    }

    public static void generateReport(DBTypes dbType, ReportTypes reportType,
            String tableName) {
        Connection con = null;
        switch (dbType) {
        case MYSQL:
            con = MySqlHelper.getMySqlDBConnection();
            MySqlHelper mySqlHelper = new MySqlHelper();
            mySqlHelper.generateReport(reportType, tableName, con);
            break;
        case ORACLE:
            con = OracleHelper.getOracleDBConnection();
            OracleHelper oracleHelper = new OracleHelper();
            oracleHelper.generateReport(reportType, tableName, con);
            break;
        case POSTGRES:
            con = PostGresHelper.getPostGresDBConnection();
            PostGresHelper postGresHelper = new PostGresHelper();
            postGresHelper.generateReport(reportType, tableName, con);
            break;
        default:
            break;
        }

    }

    public static enum DBTypes {
        MYSQL, ORACLE, POSTGRES;
    }

    public static enum ReportTypes {
        HTML, PDF, WORD;
    }
}
