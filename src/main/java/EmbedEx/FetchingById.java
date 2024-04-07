package EmbedEx;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
public class FetchingById {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter user1 id to be printed");
		int id=sc.nextInt();
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		
		User1 uu=manager.find(User1.class, id);
		if(uu!=null) {
			
			System.out.println("Id"+ uu.getId().getPhone());
			System.out.println("name" + uu.getId().getEmail());	
			System.out.println(uu.getName());
		}
		else
		{
			System.out.println("wrong id number");
		}
	}
}
