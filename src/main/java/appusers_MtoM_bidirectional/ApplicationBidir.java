package appusers_MtoM_bidirectional;

import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Cacheable
public class ApplicationBidir 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int appId;
	private String appName;
	private double appCost;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<UserBidir> userList;
	public int getAppId() {
		return appId;
	}
	public void setAppId(int appId) {
		this.appId = appId;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public double getAppCost() {
		return appCost;
	}
	public void setAppCost(double appCost) {
		this.appCost = appCost;
	}
	
	public List<UserBidir> getUserList() {
		return userList;
	}
	public void setUserList(List<UserBidir> userList) {
		this.userList = userList;
	}
	@Override
	public String toString() {
		return "Application [appId=" + appId + ", appName=" + appName + ", appCost=" + appCost + "]";
	}
	
	
}
