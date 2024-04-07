package EmbedEx;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveUser1 {
public static void main(String[] args) {
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	EntityTransaction t=manager.getTransaction();
	UserId1 id=new UserId1();
	id.setEmail("dragon@gmail.com");
	id.setPhone(987456);
	
	User1 u=new User1();
	u.setId(id);
	u.setName("mahesh");
	u.setPassword("secret");
	manager.persist(u);
	t.begin();
	t.commit();
	System.err.println("saved");
}
}
