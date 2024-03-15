package appusers_MtoM_bidirectional;

import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.TableGenerator;

import org.hibernate.annotations.Cache;

@Entity
@Cacheable
public class UserBidir 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userName;
	private long userContact;
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "userList")
//	@JoinTable(name = "renametable")
	private List<ApplicationBidir> userApplications;
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
	public List<ApplicationBidir> getUserApplications() {
		return userApplications;
	}
	public void setUserApplications(List<ApplicationBidir> userApplications) {
		this.userApplications = userApplications;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userContact=" + userContact
				+ ", userApplications=" + userApplications + "]";
	}
	
	

}
