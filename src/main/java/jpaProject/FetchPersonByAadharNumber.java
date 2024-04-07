package jpaProject;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchPersonByAadharNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the aadhar number u want to be displayed");
		
		long number=sc.nextLong();
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		String qry="select p from Persons p where p.card.number=?1";
		
		Query q=manager.createQuery(qry);
		q.setParameter(1, number);
		Persons  p=(Persons)q.getSingleResult();
		if(p!=null) {
			System.out.println("id: "+p.getId());
			System.out.println("name :"+p.getName());
			System.out.println("phone :"+p.getPhone());
			
		}
	}
}
