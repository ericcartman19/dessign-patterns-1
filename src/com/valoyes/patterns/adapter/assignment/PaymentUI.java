package com.valoyes.patterns.adapter.assignment;

public class PaymentUI {

	public void pay(int amount, CurrencyTypeEnum currency) {
		
		PaymentAdapter adapter = new PaymentAdapter();
		System.out.println("We're paying " + adapter.pay(amount, currency));
	}
	
	public static void main(String[] args) {
		PaymentUI ui = new PaymentUI();
		ui.pay(100, CurrencyTypeEnum.DOLLAR);
	}
}
