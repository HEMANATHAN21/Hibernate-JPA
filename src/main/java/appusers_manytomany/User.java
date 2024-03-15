package appusers_manytomany;

import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
@Cacheable
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userName;
	private long userContact;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Application> userApplications;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getUserContact() {
		return userContact;
	}
	public void setUserContact(long userContact) {
		this.userContact = userContact;
	}
	public List<Application> getUserApplications() {
		return userApplications;
	}
	public void setUserApplications(List<Application> userApplications) {
		this.userApplications = userApplications;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userContact=" + userContact
				+ ", userApplications=" + userApplications + "]";
	}
	
	

}
