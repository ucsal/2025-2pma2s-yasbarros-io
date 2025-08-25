package br.com.mariojp.solid.srp;

public class TaxCalculator {

	private double taxRate;

	public TaxCalculator(){
		String tax = System.getProperty("tax.rate");
		this.taxRate = Double.parseDouble(tax);
	}

	public double Calculate(double subtotal){
		return subtotal * this.taxRate;
	}

}
