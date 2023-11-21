package com.example.hibernatesession;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@PersistenceContext
    private EntityManager entityManager;

	@Autowired
	private SessionFactory sessionFactory; 

	public void insertProduct() {
        Product product = new Product();
        product.setName("Sample Product");
        product.setPrice(99.99);
        entityManager.persist(product);
    }

	public Product getProductById(Long id) {
		insertProduct();
		
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		Product product1 = session.get(Product.class, 1L);
		Product product2 = session.get(Product.class, 1L);

		System.out.println("First fetch: " + product1.getName());
        System.out.println("Second fetch: " + product2.getName());
		return product1;
	} 
	
}
