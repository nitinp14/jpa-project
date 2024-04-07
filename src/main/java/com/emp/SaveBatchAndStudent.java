package com.emp;

import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBatchAndStudent {
public static void main(String[] args) {
	 Batch b1=new Batch();
	 b1.setCode("b01s01");
	 b1.setSubject("core java");
	 
	 Batch b2=new Batch();
	 b2.setCode("b02s02");
	 b2.setSubject("adv java");
	 
	 Batch b3=new Batch();
	 b3.setCode("b03s03");
	 b3.setSubject("framework");
	 
	 Student s1=new Student();
	 s1.setName("rahul");
	 s1.setPerc(70);
	 
	 Student s2=new Student();
	 s2.setName("rohit");
	 s2.setPerc(80);
	 
	 Student s3=new Student();
	 s3.setName("ishan");
	 s3.setPerc(75);
	 
//	 adding students for subjects;
	 b1.setStudents(new ArrayList<Student>(Arrays.asList(s1,s2,s3)));
	 
	 b2.setStudents(new ArrayList<Student>(Arrays.asList(s1,s2,s3)));
	 
	 b3.setStudents(new ArrayList<Student>(Arrays.asList(s1,s2,s3)));
	 
	 EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	 EntityTransaction t=manager.getTransaction();
	 t.begin();
	 manager.persist(b1);
	 manager.persist(b2);
	 manager.persist(b3);
	
	 System.out.println("saved successfully");
	 t.commit();
	 
}
}
