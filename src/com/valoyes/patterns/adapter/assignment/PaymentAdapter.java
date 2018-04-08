package com.valoyes.patterns.adapter.assignment;

/**
 * Usaremos el Adapter pattern, para el parametro String
 * convertirlo al Enum que nuestra clase metier espera
 * 
 * @author benito
 *
 */
public class PaymentAdapter {

	public double pay(int amount, CurrencyTypeEnum currency) {
		
		PaymentProcessor paymentProcessor = new PaymentProcessorImpl();
		double payment;
		
		if(CurrencyTypeEnum.EURO == currency) {
			System.out.println("Paying in Euros, no exchange needed");
			payment = paymentProcessor.payInEuros(amount);
		}else if (CurrencyTypeEnum.DOLLAR == currency) {
			System.out.println("Paying in dollars, exchange used is 0.82");
			payment = paymentProcessor.payInEuros(amount*.82);
		}else {
			System.out.println("Paying in pounds, exchange used is 1.1");
			payment = paymentProcessor.payInEuros(amount*1.1);
		}
		
		return payment;
	}
	
}
