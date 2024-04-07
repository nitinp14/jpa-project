package jpaProject;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Transaction;

public class UpdatePerson {
	public static void main(String[] args) {
		System.out.println("enter existin id");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter password");
		String password=sc.nextLine();
		System.out.println("enter phone");
		long phone=sc.nextLong();
		sc.nextLine();
		System.out.println("enter name");
		String name=sc.nextLine();
		
		
		Person p=new Person();
		p.setId(id);
		p.setName(name);
		p.setPassword(password);
		p.setPhone(phone);
//		EntityManagerFactory
		
		 EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction t=manager.getTransaction();
		manager.merge(p);
		t.begin();
		t.commit();
		
	}
}
