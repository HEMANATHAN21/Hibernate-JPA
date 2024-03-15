package project_student_MtoO;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class StudentMember 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stuId;
	private String stuName;
	@ManyToOne
	private Project stuProject;
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public Project getStuProject() {
		return stuProject;
	}
	public void setStuProject(Project stuProject) {
		this.stuProject = stuProject;
	}
	@Override
	public String toString() {
		return "StudentMember [stuId=" + stuId + ", stuName=" + stuName + ", stuProject=" + stuProject + "]";
	}
	
	
}
