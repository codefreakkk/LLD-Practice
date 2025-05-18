package StrategyPattern.services;

import StrategyPattern.strategy.ExportStrategy;
import StrategyPattern.strategy.PDFExportStrategy;

public class InvoiceExporter extends BaseExporter {

    public InvoiceExporter() {
        super(new PDFExportStrategy());
    }
}
