package StrategyPattern.strategy;

public class PDFExportStrategy implements ExportStrategy {
    @Override
    public void export(String data) {
        System.out.println("PDFExportStrategy " + data);
    }
}
