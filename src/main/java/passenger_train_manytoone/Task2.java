package passenger_train_manytoone;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Task2 
{

	public static void main(String[] args)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("solo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Query query = em.createQuery("select p from Passenger p where p.passengerName = ?1");
		query.setParameter(1, "hemanathan");
		System.out.println(query.getSingleResult());
		
		Query query1 = em.createQuery("select p from Passenger p");
		List<Passenger> plist = query1.getResultList();
		
		for (Passenger passenger : plist) 
		{
			System.out.println(passenger);
		}
	}

}
