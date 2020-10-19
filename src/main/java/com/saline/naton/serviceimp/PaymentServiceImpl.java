package com.saline.naton.serviceimp;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saline.naton.entity.Payment;
import com.saline.naton.repository.PaymentRepository;
import com.saline.naton.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	PaymentRepository paymentRepo;

	@Override
	public Collection<Payment> listPayment() {
		return (Collection<Payment>) paymentRepo.findAll();
	}

	@Override
	public Payment getPaymentById(Long id) {
		Optional<Payment> optPayment = paymentRepo.findById(id);
		if (optPayment.isPresent())
			return optPayment.get();
		else
			return new Payment();
	}

}
