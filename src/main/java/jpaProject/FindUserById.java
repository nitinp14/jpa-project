package jpaProject;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindUserById {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the id to print the details");
	int id=sc.nextInt();
	
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
	EntityManager manager=factory.createEntityManager();
	Person p=manager.find(Person.class,id);
	if(p!=null) {
		System.out.println("id:"+p.getId());
		System.out.println("name:"+ p.getName());
		System.out.println("phone: "+p.getPhone());
	}
	else {
		System.out.println("invalid id");
	}
	
}
}
