package jpaProject;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AadharByPersonName {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name to display Aadhar details");
		String name=sc.next();
		String qry="select c from Aadharcard c where c.p.name=?1";
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		
		Query q=manager.createQuery(qry);
		q.setParameter(1, name);
		List<Aadharcard> cards=q.getResultList();
		if(cards.size()>0)
		{
			for(Aadharcard a:cards) {
				System.out.println(a);
			}
		}
		else {
			System.out.println("no aadharcard found with this name"+name);
		}
	}
}
