package passenger_train_manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("solo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		Train t1 = new Train();
//		t1.setTrainName("ChennaiExpress");
//		t1.setTrainNoOfCoach(30);
//		t1.setTrainStartFrom("chennai");
//		t1.setTrainEndTo("mumbai");
//		
//		Passenger p1 = new Passenger();
//		p1.setPassengerName("hemanathan");
//		p1.setPassengerContact(123456789);
//		p1.setTrainInfo(t1);
//		
//		Passenger p2 = new Passenger();
//		p2.setPassengerName("jeyavarshan");
//		p2.setPassengerContact(123456789);
//		p2.setTrainInfo(t1);
//		
//		Passenger p3 = new Passenger();
//		p3.setPassengerName("purushothaman");
//		p3.setPassengerContact(123456789);
//		p3.setTrainInfo(t1);
//		
//		et.begin();
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		et.commit();
		
	//Delete Pasanger
//		Passenger p1 = em.find(Passenger.class, 14);
//		p1.setTrainInfo(null);
//		et.begin();
//		em.merge(p1);
//		Passenger p2 = em.find(Passenger.class, 14);
//		em.remove(p2);
//		et.commit();
		
	}

}
