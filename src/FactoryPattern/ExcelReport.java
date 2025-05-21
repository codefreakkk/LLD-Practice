package FactoryPattern;

public class ExcelReport implements Report {
    @Override
    public void generate(String data) {
        System.out.println("Generating Excel Report for " + data);
    }
}
