package StrategyPattern.services;

import StrategyPattern.strategy.ExcelExportStrategy;

public class ReportExporter extends BaseExporter {
    public ReportExporter() {
        super(new ExcelExportStrategy());
    }
}
