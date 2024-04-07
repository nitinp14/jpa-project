package jpaProject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
private String question,questionedBy;

	public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public String getQuestionedBy() {
	return questionedBy;
}
public void setQuestionedBy(String questionedBy) {
	this.questionedBy = questionedBy;
}
	
	
}
