public class JFT2Ex6 {
	
	public static void main (String[] args) {
		
		System.out.println("Welcome to the FX Currency Converter.");
		
		/*
		Currency Conversion Rates:
		1.00 EUR = 0.697443 GBP
		1.00 EUR = 1.08901 USD
		1.00 EUR = 135.090 JPY 
		*/
		
		double GBPConversionRate = 0.697443;
		double USDConversionRate = 1.08901;
		double JPYConversionRate = 135.090;
		
		System.out.println("Euro 100 will buy "+(100*GBPConversionRate)+" British Pounds.");
		System.out.println("Euro 100 will buy "+(100*USDConversionRate)+" American Dollars");
		System.out.println("Euro 100 will buy "+(100*JPYConversionRate)+" Japanese Yen.");
	}
	
}