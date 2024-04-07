package jpaProject;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindAll {
	public static void main(String[] args) {
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query a=manager.createNamedQuery("FindAll");
		List<Persons> person=a.getResultList();
		for(Persons p:person) {
			System.out.println(p);
		}
	}
}
