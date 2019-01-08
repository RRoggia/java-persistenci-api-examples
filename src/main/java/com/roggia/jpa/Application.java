package com.roggia.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.roggia.jpa.entities.Book;

public class Application {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Library");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Book book = new Book();
		book.setName("Game of thrones");
		book.setPages(300);

		em.persist(book);

		em.getTransaction().commit();

		System.out.println(book);

	}

}
