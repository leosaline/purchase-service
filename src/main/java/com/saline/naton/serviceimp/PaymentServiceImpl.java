package com.saline.naton.serviceimp;

import com.saline.naton.entity.Payment;
import com.saline.naton.repository.PaymentRepository;
import com.saline.naton.service.PaymentService;
import org.springframework.stereotype.Service;

import java.util.Collection;

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
        return paymentRepo.findById(id).orElse(new Payment());
    }

}
