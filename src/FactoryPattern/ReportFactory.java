package FactoryPattern;

import java.io.IOException;

public class ReportFactory {
    public static Report getReport(String reportType) throws Exception {
        switch (reportType.toLowerCase()) {
            case "pdf":
                return new PDFReport();
            case "excel":
                return new ExcelReport();
            default:
                throw new Exception();
        }
    }
}
