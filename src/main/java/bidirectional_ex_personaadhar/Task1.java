package bidirectional_ex_personaadhar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Task1 {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("solo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		//Save 3 persons with 3 aadhar
		
//		PersonBidire p1 = new PersonBidire();
//		p1.setpName("jeyavarshan");
//		p1.setpEmail("jeyavarshan@gmail.com");
//		
//		AadharBidirec a1 = new AadharBidirec();
//		a1.setaAddress("thiruvanmiyur");
//		a1.setaContact(123456789);
//		
//		a1.setP(p1);
//		p1.setA(a1);
//		
//		PersonBidire p2 = new PersonBidire();
//		p2.setpName("purushothaman");
//		p2.setpEmail("purushothaman@gmail.com");
//		
//		AadharBidirec a2 = new AadharBidirec();
//		a2.setaAddress("guduvancheri");
//		a2.setaContact(123456789);
//		
//		a2.setP(p2);
//		p2.setA(a2);
//		
//		PersonBidire p3 = new PersonBidire();
//		p3.setpName("kiruba");
//		p3.setpEmail("kiruba@gmail.com");
//		
//		AadharBidirec a3 = new AadharBidirec();
//		a3.setaAddress("thiruporur");
//		a3.setaContact(123456789);
//		
//		a3.setP(p3);
//		p3.setA(a3);
//		
//		et.begin();
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		et.commit();
		
		//Save 4th person with no aadhar
		
//		PersonBidire p4 = new PersonBidire();
//		p4.setpName("ranjith");
//		p4.setpEmail("ranjith@gmail.com");
//		
//		et.begin();
//		em.persist(p4);
//		et.commit();
		
		//save new aadhar and save to 4th person
		
//		PersonBidire p4 = em.find(PersonBidire.class, 31);
//		AadharBidirec a4 = new AadharBidirec();
//		a4.setaAddress("parrys");
//		a4.setaContact(123456789);
//		
//		a4.setP(p4);
//		p4.setA(a4);
//		
//		et.begin();
//		em.persist(p4);
//		et.commit();
		
		//Using person id update aadhar address where id = 25
		
//		PersonBidire p2 = em.find(PersonBidire.class, 25);
//		AadharBidirec a2 = p2.getA();
//		a2.setaAddress("japan");
//		p2.setA(a2);
//		
//		et.begin();
//		em.persist(p2);
//		et.commit();
		
		//Delete aadhar using person id = 31
		
		PersonBidire p5 = em.find(PersonBidire.class, 31);
		AadharBidirec a5 = p5.getA();
		p5.setA(null);
		et.begin();
		em.merge(p5);
		em.remove(a5);
		et.commit();
	}

}
