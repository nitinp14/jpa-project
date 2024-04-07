package com.emp;

import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveEmployeeAndDepartment {
public static void main(String[] args) {
	Department d=new Department();
	d.setName("Development");
	d.setLocation("bangalore");
	
	Employee e=new Employee();
	e.setDept(d);
	e.setName("rahul");
	e.setSalary(30000);
	e.setDesg("frontend trainer");
	
	Employee e2=new Employee();
	e2.setDept(d);
	e2.setName("rohit");
	e2.setSalary(100000);
	e2.setDesg("java developer");
	
	Employee e3=new Employee();
	e3.setDept(d);
	e3.setName("naina");
	e3.setSalary(50000);
	e3.setDesg("hr");
	
	d.setEmps(new ArrayList<Employee>(Arrays.asList(e,e2,e3)));
	
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	EntityTransaction t=manager.getTransaction();
	t.begin();
	manager.persist(d);
	

	System.out.println("data saved successfully");
	
	t.commit();
}
}
