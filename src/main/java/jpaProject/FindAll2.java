package jpaProject;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindAll2 {
public static void main(String[] args) {
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	Query q=manager.createQuery("select p from persons p");
	List<Persons> person=q.getResultList();
	for(Persons s:person) {
		System.out.println(s);
	}
}
}
