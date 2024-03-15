package personaadhar_onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import dao.AadharDao;
import dao.PersonDao;


public class Driver {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("solo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		Aadhar ad = new Aadhar();
//		ad.setaNumber(1);
//		ad.setaContact(1234567890);
//		ad.setaAddress("chengalpattu");
//		
//		et.begin();
//		em.persist(ad);
//		et.commit();
		
//		Aadhar ad = em.find(Aadhar.class, 1l);
//		System.out.println(ad);
//		Person p = new Person();
//		p.setpId(1);
//		p.setpEmail("solo@gmail.com");
//		p.setpName("solo");
//		p.setA(ad);
//		et.begin();
//		em.persist(p);
//		et.commit();
//		System.out.println(p);
		
//		AadharDao ad = new AadharDao();
//		
//		Aadhar a = ad.deleteAadhar(1l);
//		System.out.println(a);
//		PersonDao pd = new PersonDao();
//		Person p = pd.deletePerson(1l);
//		System.out.println(p);
		
		PersonDao pdao = new PersonDao();
		AadharDao aado = new AadharDao();
		
//		Person p = pdao.findPerson(1);
//		p.setA(null);
//		Person p1 = pdao.updatePerson(p,1);
//		Aadhar a = aado.deleteAadhar(1l);
//		System.out.println(a);
		
//		Aadhar ad = new Aadhar();
//		ad.setaContact(1234567890);
//		ad.setaAddress("chengalpattu");
//		Aadhar ad1 = aado.saveAadhar(ad);
//		System.out.println(ad1);
//		
//		Person p = new Person();
//		p.setpName("solo");
//		p.setpEmail("solo@gmail.com");
//		p.setA(ad);
//		
//		Person p1 = pdao.savePerson(p);
		//delete person
//		Person p = pdao.findPerson(2);
//		
//		Aadhar a = p.getA();
//		
//		p.setA(null);
//		pdao.updatePerson(p, 2);
//		aado.deleteAadhar(a.getaNumber());
//		
		
//		Aadhar ad = new Aadhar();
//		ad.setaAddress("chengalpattu");
//		ad.setaContact(1234567890);
//		Aadhar a1 = aado.saveAadhar(ad);
//		System.out.println(a1);
//		
//		Person p = new Person();
//		p.setpName("varshan");
//		p.setpEmail("varshan@gmail.com");
//		p.setA(ad);
//		Person p1 = pdao.savePerson(p);
//		System.out.println(p1);
		
//		Person p2 = pdao.findPerson(4);
//		System.out.println(p2);
//		Aadhar a = p2.getA();
//		
//		p2.setA(null);
//		pdao.updatePerson(p2, 4);
//		Aadhar a2 = aado.deleteAadhar(a.getaNumber());
//		System.out.println("deleted"+a2);
		
//		Aadhar a1 = new Aadhar();
//		a1.setaContact(123456789);
//		a1.setaAddress("kanchipuram");
//		Aadhar ad1 = aado.saveAadhar(a1);
		
		Aadhar add1 = aado.findAadhar(6);
		System.out.println(add1);
		Person p1 = pdao.findPerson(4);
		p1.setA(add1);
		pdao.updatePerson(p1, p1.getpId());
		
	}

}
