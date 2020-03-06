package com.saline.naton.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.saline.naton.entity.Purchase;
import com.saline.naton.service.PurchaseService;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class PurchaseController {
	@Autowired
	PurchaseService purchaseService;
	
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Return list of purchase") })
	@RequestMapping(value="/purchases", method=RequestMethod.GET, produces = "application/json", consumes = "application/json")
	@ResponseBody
	public ResponseEntity<Collection<Purchase>> listPurchase() {
		return ResponseEntity.ok(this.purchaseService.listPurchase());
	}
	
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Return a single purchase created") })
	@RequestMapping(value="/product", method=RequestMethod.POST, produces = "application/json", consumes = "application/json")
	@ResponseBody	
	public ResponseEntity<Purchase> createPurchase(@RequestBody Purchase purchase){
		return ResponseEntity.ok(this.purchaseService.save(purchase));
	}
	
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Return a single purchase") })
	@RequestMapping(value="/product/{id}", method=RequestMethod.GET, produces = "application/json", consumes = "application/json")
	@ResponseBody
	public ResponseEntity<Purchase> getProductById(@PathVariable Long id) {
		return ResponseEntity.ok(this.purchaseService.getPurchaseById(id));
	}

}
