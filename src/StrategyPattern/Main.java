package StrategyPattern;

import StrategyPattern.services.BaseExporter;
import StrategyPattern.services.InvoiceExporter;
import StrategyPattern.services.ReportExporter;

public class Main {
    public static void main(String[] args) {
        BaseExporter invoiceExporter = new InvoiceExporter();
        invoiceExporter.export("invoice.txt");

        BaseExporter reportExporter = new ReportExporter();
        reportExporter.export("report.txt");
    }
}
