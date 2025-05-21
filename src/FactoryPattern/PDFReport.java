package FactoryPattern;

public class PDFReport implements Report {
    @Override
    public void generate(String data) {
        System.out.println("Generating PDF report for " + data);
    }
}
