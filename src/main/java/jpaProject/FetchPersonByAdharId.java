package jpaProject;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class FetchPersonByAdharId {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter adhar id to be printed");
	int id=sc.nextInt();
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	
	Aadharcard card=manager.find(Aadharcard.class, id);
	if(card!=null) {
		Persons p=card.getP();
		System.out.println("Id"+ p.getId());
		System.out.println("name" + p.getName());
		System.out.println("phone"+ p.getPhone());
		
	}
	else
	{
		System.out.println("wrong id number");
	}
}
}
