package country_states_OtoM_MtoO;

import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Cacheable
public class Country 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int conId;
	private String conName;
	private int conNoOfStates;
	private String conCapital;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<States> conStates;
	public int getConId() {
		return conId;
	}
	public void setConId(int conId) {
		this.conId = conId;
	}
	public String getConName() {
		return conName;
	}
	public void setConName(String conName) {
		this.conName = conName;
	}
	public int getConNoOfStates() {
		return conNoOfStates;
	}
	public void setConNoOfStates(int conNoOfStates) {
		this.conNoOfStates = conNoOfStates;
	}
	public String getConCapital() {
		return conCapital;
	}
	public void setConCapital(String conCapital) {
		this.conCapital = conCapital;
	}
	public List<States> getConStates() {
		return conStates;
	}
	public void setConStates(List<States> conStates) {
		this.conStates = conStates;
	}
	@Override
	public String toString() {
		return "Country [conId=" + conId + ", conName=" + conName + ", conNoOfStates=" + conNoOfStates + ", conCapital="
				+ conCapital + "]";
	}
	
}
