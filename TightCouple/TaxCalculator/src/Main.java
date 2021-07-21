public class Main {
    public static void main(String[] args)  {
        TaxCalculator2020 taxCalculator2020 = new TaxCalculator2020(50_000.34);
        TaxReport taxReport = new TaxReport(taxCalculator2020);
        taxReport.show();
    }
}
