package com.saline.naton.service;

import java.util.Collection;

import com.saline.naton.entity.Payment;

public interface PaymentService {
	public Collection<Payment> listPayment();

	public Payment getPaymentById(Long id);

}
