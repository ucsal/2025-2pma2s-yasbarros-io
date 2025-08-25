package br.com.mariojp.solid.srp;

public class ReceiptService {
	private TaxCalculator tc;
	private ReceiptFormatter rf;

	public ReceiptService() {
        this.tc = new TaxCalculator();
        this.rf = new ReceiptFormatter();
    }

	public String generate(Order order) {
		double subtotal = order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
		double tax = tc.Calculate(subtotal);
		double total = subtotal + tax;
		return rf.format(order, subtotal, tax, total);
	}
}
