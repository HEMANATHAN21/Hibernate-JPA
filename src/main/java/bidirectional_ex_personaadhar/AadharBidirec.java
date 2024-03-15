package bidirectional_ex_personaadhar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AadharBidirec 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long aNumber;
	private String aAddress;
	private long aContact;
	@OneToOne
	private PersonBidire p;
	
	public PersonBidire getP() {
		return p;
	}
	public void setP(PersonBidire p) {
		this.p = p;
	}
	public long getaNumber() {
		return aNumber;
	}
	public void setaNumber(long aNumber) {
		this.aNumber = aNumber;
	}
	public String getaAddress() {
		return aAddress;
	}
	public void setaAddress(String aAddress) {
		this.aAddress = aAddress;
	}
	public long getaContact() {
		return aContact;
	}
	public void setaContact(long aContact) {
		this.aContact = aContact;
	}
	@Override
	public String toString() {
		return "AadharBidirec [aNumber=" + aNumber + ", aAddress=" + aAddress + ", aContact=" + aContact + "]";
	}
	
	
	
	
	
	

}
