package com.saline.naton.controller;

import com.saline.naton.entity.Payment;
import com.saline.naton.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class PaymentController {
	@Autowired
	PaymentService paymentService;

	@GetMapping(value = "/payments", produces = "application/json")
	@ResponseBody
	public ResponseEntity<Collection<Payment>> listPayment() {
		return ResponseEntity.ok(this.paymentService.listPayment());
	}

	@GetMapping(value = "/payment/{id}", produces = "application/json", consumes = MediaType.ALL_VALUE)
	@ResponseBody
	public ResponseEntity<Payment> getProductById(@PathVariable Long id) {
		return ResponseEntity.ok(this.paymentService.getPaymentById(id));
	}

}
