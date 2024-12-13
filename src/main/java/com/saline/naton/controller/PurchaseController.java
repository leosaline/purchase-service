package com.saline.naton.controller;

import com.saline.naton.entity.ItemPurchase;
import com.saline.naton.entity.Purchase;
import com.saline.naton.service.PurchaseService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Date;

@RestController
public class PurchaseController {
    private final PurchaseService purchaseService;

    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @GetMapping(value = "/purchases", produces = "application/json")
    public ResponseEntity<Collection<Purchase>> listPurchase() {
        return ResponseEntity.ok(this.purchaseService.listPurchase());
    }

    @GetMapping(value = "/purchases/items", produces = "application/json")
    public ResponseEntity<Collection<ItemPurchase>> listItemPurchase() {
        return ResponseEntity.ok(this.purchaseService.listItemPurchase());
    }

    @GetMapping(value = "/purchase", produces = "application/json", consumes = "application/json")
    public ResponseEntity<Purchase> createPurchase(@RequestBody Purchase purchase) {
        return ResponseEntity.ok(this.purchaseService.save(purchase));
    }

    @GetMapping(value = "/purchase/{id}", produces = "application/json", consumes = MediaType.ALL_VALUE)
    public ResponseEntity<Purchase> getProductById(@PathVariable Long id) {
        return ResponseEntity.ok(this.purchaseService.getPurchaseById(id));
    }

    @PostMapping(value = "/purchase", produces = "application/json")
    public ResponseEntity<Purchase> createProduct(@RequestBody Purchase purchase) {
        purchase.setDatePurchase(new Date());
        purchase.setCustomer(1L);

        return ResponseEntity.ok(this.purchaseService.save(purchase));
    }

}