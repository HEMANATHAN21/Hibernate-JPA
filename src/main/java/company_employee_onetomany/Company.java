package company_employee_onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int companyId;
	private String companyName;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Employee> companyEmployees;
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
	public List<Employee> getCompanyEmployees() {
		return companyEmployees;
	}
	public void setCompanyEmployees(List<Employee> companyEmployees) {
		this.companyEmployees = companyEmployees;
	}
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", companyEmployees="
				+ companyEmployees + "]";
	}
	
	

}
