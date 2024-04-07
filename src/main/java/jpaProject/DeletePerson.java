package jpaProject;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeletePerson {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id which u want to delete");
		int id=sc.nextInt();
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction t=manager.getTransaction();
		Person p=manager.find(Person.class, id);
			if(p!=null) {
				manager.remove(p);
				t.begin();
				t.commit();
			}
			else {
				System.err.println("invalid id");
			}
	}
}
