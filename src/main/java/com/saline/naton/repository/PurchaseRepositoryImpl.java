package com.saline.naton.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.annotations.QueryHints;
import org.springframework.transaction.annotation.Transactional;

import com.saline.naton.entity.Purchase;

public class PurchaseRepositoryImpl implements PurchaseRepositoryCustom {

	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public Iterable<Purchase> findAll() {
		List<Purchase> purchases = em
				.createQuery("select distinct p " + "from Purchase p " + "left join fetch p.itemsPurchase  ",
						Purchase.class)
				.setHint(QueryHints.PASS_DISTINCT_THROUGH, false).getResultList();

		purchases = em
				.createQuery("select distinct p from Purchase p left join fetch p.payments t where p in :purchases ",
						Purchase.class)
				.setParameter("purchases", purchases).setHint(QueryHints.PASS_DISTINCT_THROUGH, false).getResultList();

		return purchases;
	}

}
