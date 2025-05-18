package StrategyPattern.services;

import StrategyPattern.strategy.ExportStrategy;

public class BaseExporter {
    protected ExportStrategy exportStrategy;

    public BaseExporter(ExportStrategy exportStrategy) {
        this.exportStrategy = exportStrategy;
    }

    public void export(String data) {
        exportStrategy.export(data);
    }
}
