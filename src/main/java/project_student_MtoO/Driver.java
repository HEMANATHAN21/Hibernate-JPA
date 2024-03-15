package project_student_MtoO;

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
		//save 2 project with 4 students each
//		Project p1 = new Project();
//		p1.setProName("project1");
//		p1.setProCost(20000);
//		
//		
//		StudentMember s1 = new StudentMember();
//		s1.setStuName("hemanathan");
//		s1.setStuProject(p1);
//		
//		StudentMember s2 = new StudentMember();
//		s2.setStuName("jeyavarshan");
//		s2.setStuProject(p1);
//		
//		StudentMember s3 = new StudentMember();
//		s3.setStuName("purus");
//		s3.setStuProject(p1);
//		
//		StudentMember s4 = new StudentMember();
//		s4.setStuName("kiruba");
//		s4.setStuProject(p1);
//		
//		List<StudentMember> studentMemberList = new ArrayList<StudentMember>();
//		studentMemberList.add(s1);
//		studentMemberList.add(s2);
//		studentMemberList.add(s3);
//		studentMemberList.add(s4);
//		
//		p1.setProSmembers(studentMemberList);
		
//		Project p2 = new Project();
//		p2.setProName("project2");
//		p2.setProCost(30000);
//		
//		StudentMember s1 = new StudentMember();
//		s1.setStuName("mamtha");
//		s1.setStuProject(p2);
//		
//		StudentMember s2 = new StudentMember();
//		s2.setStuName("suji");
//		s2.setStuProject(p2);
//		
//		StudentMember s3 = new StudentMember();
//		s3.setStuName("sangeetha");
//		s3.setStuProject(p2);
//		
//		StudentMember s4 = new StudentMember();
//		s4.setStuName("heera");
//		s4.setStuProject(p2);
//		
//		List<StudentMember> studentMemberList = new ArrayList<StudentMember>();
//		studentMemberList.add(s1);
//		studentMemberList.add(s2);
//		studentMemberList.add(s3);
//		studentMemberList.add(s4);
//		
//		p2.setProSmembers(studentMemberList);
//		
//		
//		et.begin();
//		em.persist(p2);
//		et.commit();
		
		//add 2 students
		
//		StudentMember s9 = new StudentMember();
//		s9.setStuName("ranjith");
//		
//		StudentMember s10 = new StudentMember();
//		s10.setStuName("krishna");
//		
//		et.begin();
//		em.persist(s9);
//		em.persist(s10);
//		et.commit();
		
		//add stmem 9 to project 1;
//		StudentMember s9 = em.find(StudentMember.class, 9);
//		Project p1 = em.find(Project.class, 1);
//		List<StudentMember> memberlist = p1.getProSmembers();
//		memberlist.add(s9);
//		p1.setProSmembers(memberlist);
//		s9.setStuProject(p1);
//		et.begin();
//		em.merge(p1);
//		em.merge(s9);
//		et.commit();
//		
		//add stmem 10 to project 2
//		StudentMember s10 = em.find(StudentMember.class, 10);
//		Project p2 = em.find(Project.class, 2);
//		List<StudentMember> memberlist = p2.getProSmembers();
//		memberlist.add(s10);
//		p2.setProSmembers(memberlist);
//		s10.setStuProject(p2);
//		et.begin();
//		em.merge(p2);
//		em.merge(s10);
//		et.commit();
		
		//create new project 3 
//		Project p3 = new Project();
//		p3.setProName("project3");
//		p3.setProCost(200000);
//		et.begin();
//		em.persist(p3);
//		et.commit();
		
		//assign 2 students from each of the project
		
//		Project p1 = em.find(Project.class, 1);
//		List<StudentMember> memberlistp1 = p1.getProSmembers();
//
//		List<StudentMember> alterlistp1 = new ArrayList<StudentMember>();
//		
//		for (StudentMember studentMember : memberlistp1) 
//		{
//			if(studentMember.getStuId() == 1 || studentMember.getStuId() == 2)
//			{
//				studentMember.setStuProject(null);
//				et.begin();
//				em.merge(studentMember);
//				et.commit();
//				
//			}
//			else
//			{
//				alterlistp1.add(studentMember);
//			}
//			
//		}
//		p1.setProSmembers(alterlistp1);		
//		et.begin();
//		em.merge(p1);
//		et.commit();
//		
//		Project p3 = em.find(Project.class, 3);
//		List<StudentMember> memberp3 = p3.getProSmembers();
//		memberp3.add(em.find(StudentMember.class, 1));
//		memberp3.add(em.find(StudentMember.class, 2));
//		p3.setProSmembers(memberp3);
//		et.begin();
//		em.merge(p3);
//		et.commit();
		
		Project p3 = em.find(Project.class, 3);
		StudentMember s1 = em.find(StudentMember.class, 1);
		StudentMember s2 = em.find(StudentMember.class, 2);
		s1.setStuProject(p3);
		s2.setStuProject(p3);
		et.begin();
		em.merge(s1);
		em.merge(s2);
		et.commit();
		

	}

}
