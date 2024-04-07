package jpaProject;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@NamedQueries(@NamedQuery (name="FindAll",query="select p from Persons p"))
@Entity 
public class Persons {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String name,password;
		private long phone;
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name ="Aadharcard_Id")
		private Aadharcard card;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public Aadharcard getCard() {
			return card;
		}
		public void setCard(Aadharcard card) {
			this.card = card;
		}
		public long getPhone() {
			return phone;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}
 		@Override
		public String toString() {
			return "Persons [id=" + id + ", name=" + name + ", password=" + password + ", phone=" + phone + "]";
		}

}
