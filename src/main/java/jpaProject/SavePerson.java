package jpaProject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePerson {
public static void main(String[] args) {
	Person p=new Person();
	p.setName("mohit");
	p.setPassword("chauhan");
	p.setPhone(8787);
	
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
	EntityManager manager=factory.createEntityManager();
	manager.persist(p);
	EntityTransaction transaction=manager.getTransaction();
	transaction.begin();
	transaction.commit();
	System.out.println("person saved"+ p.getId());
}
}
