package passenger_train_manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Train 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int trainId;
	private String trainName;
	private int trainNoOfCoach;
	private String trainStartFrom;
	private String trainEndTo;
	public int getTrainId() {
		return trainId;
	}
	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public int getTrainNoOfCoach() {
		return trainNoOfCoach;
	}
	public void setTrainNoOfCoach(int trainNoOfCoach) {
		this.trainNoOfCoach = trainNoOfCoach;
	}
	public String getTrainStartFrom() {
		return trainStartFrom;
	}
	public void setTrainStartFrom(String trainStartFrom) {
		this.trainStartFrom = trainStartFrom;
	}
	public String getTrainEndTo() {
		return trainEndTo;
	}
	public void setTrainEndTo(String trainEndTo) {
		this.trainEndTo = trainEndTo;
	}
	@Override
	public String toString() {
		return "Train [trainId=" + trainId + ", trainName=" + trainName + ", trainNoOfCoach=" + trainNoOfCoach
				+ ", trainStartFrom=" + trainStartFrom + ", trainEndTo=" + trainEndTo + "]";
	}
	
	
}
