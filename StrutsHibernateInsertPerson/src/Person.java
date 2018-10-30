import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {
	@Column(name = "name")
	public String personName;

	@Id
	@Column(name = "email")
	public String emailId;

	@Column(name = "age")
	public int age;

	@Column(name = "country")
	public String country;

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Person [personName=" + personName + ", emailId=" + emailId + ", age=" + age + ", country=" + country
				+ "]";
	}

}
