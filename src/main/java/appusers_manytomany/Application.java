package appusers_manytomany;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Cacheable
public class Application 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int appId;
	private String appName;
	private double appCost;
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
	@Override
	public String toString() {
		return "Application [appId=" + appId + ", appName=" + appName + ", appCost=" + appCost + "]";
	}
	
	
}
