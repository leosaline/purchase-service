package com.saline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.saline.naton.repository.PaymentRepository;
import com.saline.naton.repository.PurchaseRepository;

@Component
public class PurchaseGenerator implements ApplicationRunner {
	@Autowired
	private PurchaseRepository purchaseRepo;

	@Autowired
	private PaymentRepository paymentRepo;

	@Override
	public void run(ApplicationArguments args) throws Exception {

//		for (long i = 0; i < 3000; i++) {
//			Purchase purchase = new Purchase();
//			purchase.setId(i);
//			ItemPurchase item = new ItemPurchase();
//			item.setId(i);
//			item.setPurchase(purchase);
//			purchase.setItemsPurchase(new ArrayList<>());
//			purchase.getItemsPurchase().add(item);
//			Payment payment = new Payment();
//			payment.setId(i);
//			payment.setPaymentType(PaymentTypeEnum.CASH);
//			payment.setTotalValue(new BigDecimal(12));
//			payment.setPurchase(purchase);
//			purchase.setPayments(new ArrayList<>());
//			purchase.getPayments().add(payment);
//
//			purchaseRepo.save(purchase);
//
//			System.out.println("saved purchase...");
//		}
	}

}
