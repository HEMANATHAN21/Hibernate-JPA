package passenger_train_manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Passenger 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int passengerId;
	private String passengerName;
	private long passengerContact;
	@ManyToOne(cascade = CascadeType.ALL)
	private Train trainInfo;
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public long getPassengerContact() {
		return passengerContact;
	}
	public void setPassengerContact(long passengerContact) {
		this.passengerContact = passengerContact;
	}
	public Train getTrainInfo() {
		return trainInfo;
	}
	public void setTrainInfo(Train trainInfo) {
		this.trainInfo = trainInfo;
	}
	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", passengerName=" + passengerName + ", passengerContact="
				+ passengerContact + ", trainInfo=" + trainInfo + "]";
	}
	
	
}
