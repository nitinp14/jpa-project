package jpaProject;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePersonAadharcard {
public static void main(String[] args) {
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	EntityTransaction t=manager.getTransaction();
	Persons p1=new Persons();
	p1.setName("secondone");
	p1.setPhone(77777);
	
	Aadharcard a1=new Aadharcard();
	a1.setDob(LocalDate.parse("2000-12-24"));
	a1.setNumber(4567);
	
	a1.setP(p1);
	p1.setCard(a1);
	manager.persist(p1);
	t.begin();
	t.commit();
}
}
