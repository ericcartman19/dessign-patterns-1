package com.valoyes.patterns.adapter.assignment;

public class PaymentProcessorImpl implements PaymentProcessor {

	@Override
	public double payInEuros(double amount) {
		return amount;
	}
}
