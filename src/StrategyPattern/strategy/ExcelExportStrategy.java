package StrategyPattern.strategy;

public class ExcelExportStrategy implements ExportStrategy {

    @Override
    public void export(String data) {
        System.out.println("ExcelExportStrategy " + data);
    }
}
