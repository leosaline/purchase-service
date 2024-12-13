package com.saline;

import com.saline.naton.repository.PaymentRepository;
import com.saline.naton.repository.PurchaseRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class PurchaseGenerator implements ApplicationRunner {
	private final PurchaseRepository purchaseRepo;
	private final PaymentRepository paymentRepo;

    public PurchaseGenerator(PurchaseRepository purchaseRepo, PaymentRepository paymentRepo) {
        this.purchaseRepo = purchaseRepo;
        this.paymentRepo = paymentRepo;
    }

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
