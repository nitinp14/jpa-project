package EmbedEx;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class User1 {
@EmbeddedId

	private UserId1 id;
private String name,password;

	public UserId1 getId() {
	return id;
}
public void setId(UserId1 id) {
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
}
