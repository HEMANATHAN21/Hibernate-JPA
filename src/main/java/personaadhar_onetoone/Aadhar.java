package personaadhar_onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aadhar 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long aNumber;
	private String aAddress;
	private long aContact;
	
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
		return "Aadhar [aNumber=" + aNumber + ", aAddress=" + aAddress + ", aContact=" + aContact + "]";
	}
	
	
	
	

}
