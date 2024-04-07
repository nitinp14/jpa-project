package EmbedEx;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Construct the composite primary key
        UserId1 userId = new UserId1();
        userId.setPhone(123L);
        userId.setEmail("example@example.com");

        // Find the user by composite primary key
        User1 user = entityManager.find(User1.class, userId); 

        if (user != null) {
            System.out.println("User found: " + user.getName());
            // Access other properties of the user as needed
        } else {
            System.out.println("User not found.");
        }

        entityManager.close();
        entityManagerFactory.close();
    }
}

