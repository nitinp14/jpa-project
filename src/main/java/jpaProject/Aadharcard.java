package jpaProject;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Aadharcard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private long number;
	private LocalDate dob;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "card")
	private Persons p;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public LocalDate getDob() {
		return dob;
	}

	@Override
	public String toString() {
		return "Aadharcard [id=" + id + ", number=" + number + ", dob=" + dob + ", p=" + p + "]";
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Persons getP() {
		return p;
	}

	public void setP(Persons p) {
		this.p = p;
	}
	
}
