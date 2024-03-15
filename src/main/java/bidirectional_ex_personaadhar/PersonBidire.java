package bidirectional_ex_personaadhar;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class PersonBidire 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pId;
	private String pName;
	private String pEmail;
	@OneToOne(cascade = CascadeType.ALL)
	private AadharBidirec a;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpEmail() {
		return pEmail;
	}
	public void setpEmail(String pEmail) {
		this.pEmail = pEmail;
	}
	public AadharBidirec getA() {
		return a;
	}
	public void setA(AadharBidirec a) {
		this.a = a;
	}
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", pEmail=" + pEmail + ", a=" + a + "]";
	}
	
	
}
