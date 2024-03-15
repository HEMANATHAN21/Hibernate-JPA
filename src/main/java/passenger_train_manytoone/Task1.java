package passenger_train_manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Task1 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("solo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		//save 2 train with no passengers
//		Train t1 = new Train();
//		t1.setTrainName("covai express");
//		t1.setTrainNoOfCoach(20);
//		t1.setTrainStartFrom("chennai");
//		t1.setTrainEndTo("coimbatore");
//		
//		Train t2 = new Train();
//		t2.setTrainName("Bharath express");
//		t2.setTrainNoOfCoach(30);
//		t2.setTrainStartFrom("chennai");
//		t2.setTrainEndTo("mysore");
//		
//		et.begin();
//		em.persist(t1);
//		em.persist(t2);
//		et.commit();
		

//		//save 4 passengers to train 1
//		Train t1 = em.find(Train.class, 15);
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
//		Passenger p4 = new Passenger();
//		p4.setPassengerName("kiruba");
//		p4.setPassengerContact(123456789);
//		p4.setTrainInfo(t1);
//		
//		et.begin();
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		em.persist(p4);
//		et.commit();
		
		//change 4th passenger train from 1 to 2
//		Train t2 = em.find(Train.class, 16);
//		Passenger p4 = em.find(Passenger.class, 20);
//		p4.setTrainInfo(t2);
//		et.begin();
//		em.merge(p4);
//		et.commit();
		
		//add 5,6 passengers to train no 2
//		Train t2 = em.find(Train.class, 16);
//		Passenger p5 = new Passenger();
//		p5.setPassengerName("ranjith");
//		p5.setPassengerContact(123456789);
//		p5.setTrainInfo(t2);
//		
//		Passenger p6 = new Passenger();
//		p6.setPassengerName("akash");
//		p6.setPassengerContact(123456789);
//		p6.setTrainInfo(t2);
//		
//		et.begin();
//		em.persist(p5);
//		em.persist(p6);
//		et.commit();
		
		//delete train 1
		Passenger p1 = em.find(Passenger.class, 17);
		p1.setTrainInfo(null);
		Passenger p2 = em.find(Passenger.class, 18);
		p2.setTrainInfo(null);
		Passenger p3 = em.find(Passenger.class, 19);
		p3.setTrainInfo(null);
		Train t1 = em.find(Train.class, 15);
		et.begin();
		em.merge(p1);
		em.merge(p2);
		em.merge(p3);
		em.remove(t1);
		et.commit();
		
	}

}
