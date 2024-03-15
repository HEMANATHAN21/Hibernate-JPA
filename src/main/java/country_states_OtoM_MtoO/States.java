package country_states_OtoM_MtoO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class States 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int staId;
	private String staName;
	private String staCapital;
	@ManyToOne
	private Country country;
	public int getStaId() {
		return staId;
	}
	public void setStaId(int staId) {
		this.staId = staId;
	}
	public String getStaName() {
		return staName;
	}
	public void setStaName(String staName) {
		this.staName = staName;
	}
	public String getStaCapital() {
		return staCapital;
	}
	public void setStaCapital(String staCapital) {
		this.staCapital = staCapital;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "States [staId=" + staId + ", staName=" + staName + ", staCapital=" + staCapital + ", country=" + country
				+ "]";
	}
	
}
