package project_student_MtoO;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Project 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int proId;
	private String proName;
	private double proCost;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<StudentMember> proSmembers;
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public double getProCost() {
		return proCost;
	}
	public void setProCost(double proCost) {
		this.proCost = proCost;
	}
	public List<StudentMember> getProSmembers() {
		return proSmembers;
	}
	public void setProSmembers(List<StudentMember> proSmembers) {
		this.proSmembers = proSmembers;
	}
	@Override
	public String toString() {
		return "Project [proId=" + proId + ", proName=" + proName + ", proCost=" + proCost + "]";
	}
	
}
