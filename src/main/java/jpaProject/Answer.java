package jpaProject;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
private String answer,ansdwereBy;
@ManyToOne(cascade = CascadeType.ALL)
private Question q; 

	public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}
public String getAnsdwereBy() {
	return ansdwereBy;
}
public void setAnsdwereBy(String ansdwereBy) {
	this.ansdwereBy = ansdwereBy;
}
public Question getQ() {
	return q;
}
public void setQ(Question q) {
	this.q = q;
}
	
	
	
}
