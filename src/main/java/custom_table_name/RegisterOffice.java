package custom_table_name;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="marriage",schema = "marriage")
public class RegisterOffice 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="marriageid")
	private int id;
	@Column(name="husbandname")
	private String hname;
	@Column(name="wifename")
	private String wname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public String getWname() {
		return wname;
	}
	public void setWname(String wname) {
		this.wname = wname;
	}
	
	
	
	
}
