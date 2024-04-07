package jpaProject;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchPersonAadharcardId2 {
public static void main(String[] args) {
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	String qry="select p from Persons p where p.card=?1";
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the id number ");
	int id=sc.nextInt();
	
	Query q=manager.createQuery(qry);
	q.setParameter(1,id);
	Persons p=(Persons)q.getSingleResult();
	if(p!=null) {
		System.out.println("id: "+p.getId());
		System.out.println("name :"+p.getName());
		System.out.println("phone :"+p.getPhone());
		
	}
}
}
