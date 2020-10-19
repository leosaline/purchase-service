package com.saline.naton.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.saline.naton.entity.Payment;
import com.saline.naton.service.PaymentService;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class PaymentController {
	@Autowired
	PaymentService paymentService;

	@ApiResponses(value = { @ApiResponse(code = 200, message = "Return list of payments") })
	@GetMapping(value = "/payments", produces = "application/json")
	@ResponseBody
	public ResponseEntity<Collection<Payment>> listPayment() {
		return ResponseEntity.ok(this.paymentService.listPayment());
	}

	@ApiResponses(value = { @ApiResponse(code = 200, message = "Return a single payment") })
	@GetMapping(value = "/payment/{id}", produces = "application/json", consumes = MediaType.ALL_VALUE)
	@ResponseBody
	public ResponseEntity<Payment> getProductById(@PathVariable Long id) {
		return ResponseEntity.ok(this.paymentService.getPaymentById(id));
	}

}
