package com.saline.naton.enumerator;

public enum PaymentTypeEnum {
	CREDITCARD("Credit Card", 1), DEBITCARD("Debit Card", 2), CHEQUE("cheque", 3), MONEYTRANSFER("Money Transfer", 4),
	CASH("Cash", 5);

	private Integer id;
	private String paymentTypeName;

	PaymentTypeEnum(String value, Integer id) {
		this.paymentTypeName = value;
		this.id = id;
	}

	public String getPaymentTypeName() {
		return paymentTypeName;
	}

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return this.id + " " + this.name();
	}
}
