package company_employee_onetomany;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dao.CompanyDao;
import dao.EmployeeDao;

public class Driver 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("solo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Scanner sc = new Scanner(System.in);
		
//		Employee e1 = new Employee();
//		e1.setEmpName("hemanathan");
//		e1.setEmpEmail("hemanathan@gmail.com");
//		e1.setEmpContact(123456789);
//		e1.setEmpSalary(10000);
//		
//		Employee e2 = new Employee();
//		e2.setEmpName("jeyavarshan");
//		e2.setEmpEmail("jeyavarshan@gmail.com");
//		e2.setEmpContact(123456789);
//		e2.setEmpSalary(10000);
//		
//		Employee e3 = new Employee();
//		e3.setEmpName("purushoth");
//		e3.setEmpEmail("purushoth@gmail");
//		e3.setEmpContact(123456789);
//		e3.setEmpSalary(10000);
//		
//		List<Employee> employees = new ArrayList<Employee>();
//		employees.add(e1);
//		employees.add(e2);
//		employees.add(e3);
//		
//		Company c = new Company();
//		c.setCompanyEmployees(employees);
//		c.setCompanyName("AbcPrivateLtd");
//		
//		et.begin();
//		//em.persist(e1);
//		//em.persist(e2);
//		//em.persist(e3);
//		em.persist(c);
//		et.commit();
		//update salary
//		Company c1 = em.find(Company.class, 1);
//		
//		List<Employee> oldEmloyees = c1.getCompanyEmployees();
//		
//		for(Employee e : oldEmloyees)
//		{
//			e.setEmpSalary(e.getEmpSalary() + e.getEmpSalary() * 0.5);
//			et.begin();
//			em.merge(e);
//			et.commit();
//		}
//		
//		for(Employee e : oldEmloyees)
//		{
//			System.out.println(e);
//		}
//		
//		c1.setCompanyEmployees(oldEmloyees);
//		et.begin();
//		Company c2 = em.merge(c1);
//		et.commit();
//		System.out.println(c2);
		
		//update name
//		Company c = em.find(Company.class, 1);
//		List<Employee> employees = c.getCompanyEmployees();
//		
//		for(Employee e : employees)
//		{
//			if(e.getEmpName().equals("purushoth"))
//			{
//				System.out.print("Enter name to change : ");
//				String name = sc.nextLine();
//				e.setEmpName(name);
//				et.begin();
//				em.merge(e);
//				et.commit();
//			}
//		}
//		
//		c.setCompanyEmployees(employees);
//		et.begin();
//		Company c1 = em.merge(c);
//		et.commit();
//		System.out.println(c1);
		
		//update contact
//		Company c = em.find(Company.class, 1);
//		List<Employee> employees = c.getCompanyEmployees();
//		
//		for(Employee e : employees)
//		{
//			if(e.getEmpName().equals("purushothaman"))
//			{
//				System.out.print("Enter contact no to change : ");
//				long contact = sc.nextLong();
//				e.setEmpContact(contact);
//				et.begin();
//				em.merge(e);
//				et.commit();
//			}
//		}
//		
//		c.setCompanyEmployees(employees);
//		et.begin();
//		Company c1 = em.merge(c);
//		et.commit();
//		System.out.println(c1);
		
		//delete employee
		CompanyDao cdao = new CompanyDao();
		EmployeeDao edao = new EmployeeDao();
//		Company c = cdao.findCompany(1);
//		System.out.println(c);
//		List<Employee> employees = c.getCompanyEmployees();
//		
//		for(Employee e : employees)
//		{
//			if(e.getEmpName().equals("hemanathan"))
//			{
//				employees.remove(e);
//				c.setCompanyEmployees(employees);
//				Company cc = cdao.updateCompany(c, 1);
//				edao.deleteEmployee(e.getEmpId());
//				//System.out.println(cc);
//			}
//		}
		
//		Company c = cdao.findCompany(1);
//		List<Employee> employees = c.getCompanyEmployees();
//		List<Employee> newEmployees = new ArrayList<Employee>();
//		for(Employee e : employees)
//		{
//			if(!e.getEmpName().equals("purushoth")) 
//			{
//				newEmployees.add(e);
//			}
//			else if(e.getEmpName().equals("purushoth"))
//			{
//				c.setCompanyEmployees(newEmployees);
//				Company cc = cdao.updateCompany(c, 1);
//				edao.deleteEmployee(e.getEmpId());
//			}
//		}
//		c.setCompanyEmployees(newEmployees);
//		Company cc = cdao.updateCompany(c, 1);
//		System.out.println(cc);
//		Employee e4 = new Employee();
//		e4.setEmpName("solo");
//		e4.setEmpEmail("solo@gmail.com");
//		e4.setEmpContact(123456789);
//		e4.setEmpSalary(349999);
//		
//		Company c = cdao.findCompany(1);
//		c.getCompanyEmployees().add(e4);
//		Company c1 = cdao.updateCompany(c, 1);
//		System.out.println(c1);
	}

}