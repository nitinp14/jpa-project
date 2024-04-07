package jpaProject;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePersonAdhar {
public static void main(String[] args) {
	
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	EntityTransaction t=manager.getTransaction(); 
	Person p=new Person();
	p.setName("eminem");
	p.setPhone(656565);
	
	Adharcard a=new Adharcard();
	a.setDob(LocalDate.parse("1988-11-04"));
	a.setNumber(1234567);
	
	p.setCard(a);
	manager.persist(p);
	t.begin();
	t.commit();
	
}
}
