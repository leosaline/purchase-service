package com.saline.naton.serviceimp;

import com.saline.naton.entity.Payment;
import com.saline.naton.repository.PaymentRepository;
import com.saline.naton.service.PaymentService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {
	private final PaymentRepository paymentRepo;

    public PaymentServiceImpl(PaymentRepository paymentRepo) {
        this.paymentRepo = paymentRepo;
    }

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
