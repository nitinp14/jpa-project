package jpaProject;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveQuestionAndAnswer {
	public static void main(String[] args) {
		Question q=new Question();
		q.setQuestion("what is java");
		q.setQuestionedBy("ranjan sir");
		
		Answer a=new Answer();
		a.setAnswer("it is a programming language"); 
		a.setAnsdwereBy("ramesh");
		a.setQ(q);
		
		Answer a2=new Answer();
		a2.setAnswer("it is a platform independent lang");
		a2.setAnsdwereBy("roy");
		a2.setQ(q);
		
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		manager.persist(a);
		manager.persist(a2);
		EntityTransaction t=manager.getTransaction();
		t.begin();
		t.commit();
	}
}
