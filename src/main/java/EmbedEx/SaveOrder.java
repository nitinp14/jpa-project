package EmbedEx;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveOrder {
public static void main(String[] args) {
	EntityManager manager =Persistence.createEntityManagerFactory("dev").createEntityManager();
	EntityTransaction t=manager.getTransaction();
	
	FoodOrder order=new FoodOrder(); 
	order.setLocation("ram nagar");
	order.setCost(10);
	 order.setOrderTime(LocalDateTime.of(2024, 4, 4, 10,1));
	manager.persist(order);
	t.begin();
	t.commit();
}
}
