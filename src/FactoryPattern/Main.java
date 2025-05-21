package FactoryPattern;

public class Main {
    public static void main(String[] args) throws Exception {
        Report report = ReportFactory.getReport("pdf");
        report.generate("This is some random data");
    }
}
