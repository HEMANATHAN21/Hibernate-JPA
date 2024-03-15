package country_states_OtoM_MtoO;

import java.util.ArrayList;
import java.util.List;

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
		
		EntityManager em2 = emf.createEntityManager();
		EntityManager em3 = emf.createEntityManager();
		
		
//		Country c1 = new Country();
//		c1.setConName("india");
//		c1.setConCapital("delhi");
//		c1.setConNoOfStates(29);
//		
//		States s1 = new States();
//		s1.setStaName("tamilnadu");
//		s1.setStaCapital("chennai");
//		s1.setCountry(c1);
//		
//		States s2 = new States();
//		s2.setStaName("telungana");
//		s2.setStaCapital("hydrabad");
//		s2.setCountry(c1);
//		
//		States s3 = new States();
//		s3.setStaName("maharastra");
//		s3.setStaCapital("mumbai");
//		s3.setCountry(c1);
//		
//		List<States> states = new ArrayList<States>();
//		states.add(s1);
//		states.add(s2);
//		states.add(s3);
//		
//		c1.setConStates(states);
//		
//		et.begin();
//		em.persist(c1);
//		et.commit();
		
		em.find(Country.class, 1);
		em2.find(Country.class, 1);
		em3.find(Country.class, 1);

	}

}
