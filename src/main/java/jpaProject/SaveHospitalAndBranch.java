package jpaProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveHospitalAndBranch {
	public static void main(String[] args) {
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction t=manager.getTransaction();
		t.begin();
		Hospital h=new Hospital();
		h.setName("apolo");
		h.setFounder("ram");
		h.setGst("ap123");
		
		Branch b1=new Branch();
		b1.setEmail("apolo1@gmail.com");
		b1.setName("bangalore branch");
		b1.setPhone(78945);
		
		Branch b2=new Branch();
		b2.setEmail("apolo2@gmail.com");
		b2.setName("andra branch");
		b2.setPhone(11111);
		
		Branch b3=new Branch();
		b3.setEmail("apolo3@gmail.com");
		b3.setName("tamil branch");
		b3.setPhone(22222);
		
		/*Branch b4=new Branch();
		b4.setEmail("apolo4@gmail.com");
		b4.setName("keral branch");
		b4.setPhone(44444);
		
		Branch b5=new Branch();
		b5.setEmail("apolo5@gmail.com");
		b5.setName("MP branch");
		b5.setPhone(55555);*/
		
		List <Branch> branches = new ArrayList<Branch>();
		branches.add(b1);
		branches.add(b2);
		branches.add(b3);
//		branches.add(b4);
		
		h.setBranches(new ArrayList<Branch>(Arrays.asList(b1,b2,b3)));
		manager.persist(h);
		
		t.commit();
		System.out.println("all fields set");
	}
}
