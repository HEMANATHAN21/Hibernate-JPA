package custom_table_name;

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
		
		RegisterOffice t1 = new RegisterOffice();
		t1.setHname("purushothaman");
		t1.setWname("sangeetha");
		
		RegisterOffice t2 = new RegisterOffice();
		t2.setHname("jeyavarshan");
		t2.setWname("shahis fathima");
		
		
		
		et.begin();
		em.persist(t1);
		em.persist(t2);
		et.commit();
		
	}

}
