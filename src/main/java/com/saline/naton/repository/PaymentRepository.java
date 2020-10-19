package com.saline.naton.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.saline.naton.entity.Payment;

@Repository
public interface PaymentRepository extends CrudRepository<Payment, Long> {

}
