package com.saline.naton.repository;

import com.saline.naton.entity.Purchase;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class PurchaseRepositoryImpl implements PurchaseRepositoryCustom {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public Iterable<Purchase> findAll() {
        List<Purchase> purchases = em
                .createQuery("select distinct p " + "from Purchase p " + "left join fetch p.itemsPurchase  ",
                        Purchase.class).getResultList();

        purchases = em
                .createQuery("select distinct p from Purchase p left join fetch p.payments t where p in :purchases ",
                        Purchase.class)
                .setParameter("purchases", purchases).getResultList();

        return purchases;
    }

}
