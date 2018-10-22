import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OrderBy;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company {
	@Id
	@Column(name = "comp_id")
	@GeneratedValue
	public int companyId;

	@Column(name = "cname")
	public String companyName;

	@Column(name = "cloc")
	public String companyLocation;

	@Column(name = "num_of_emp")
	@OrderBy("cname asc")
	public int numberOfCompanyEmployees;

	public Company(String companyName, String companyLocation, int numberOfCompanyEmployees) {
		this.companyName = companyName;
		this.companyLocation = companyLocation;
		this.numberOfCompanyEmployees = numberOfCompanyEmployees;
	}

	public Company() {

	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyLocation() {
		return companyLocation;
	}

	public void setCompanyLocation(String companyLocation) {
		this.companyLocation = companyLocation;
	}

	public int getNumberOfCompanyEmployees() {
		return numberOfCompanyEmployees;
	}

	public void setNumberOfCompanyEmployees(int numberOfCompanyEmployees) {
		this.numberOfCompanyEmployees = numberOfCompanyEmployees;
	}

}
