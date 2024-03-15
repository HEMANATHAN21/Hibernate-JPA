package company_employee_onetomany;

import java.util.ArrayList;
import java.util.List;

import dao.CompanyDao;
import dao.EmployeeDao;

public class Task2 {

	public static void main(String[] args) 
	{
		CompanyDao cdao = new CompanyDao();
		EmployeeDao edao = new EmployeeDao();
		//Save company with 2 employees
//		Employee e1 = new Employee();
//		e1.setEmpName("hemanathan");
//		e1.setEmpEmail("hemanathan@gmail.com");
//		e1.setEmpContact(123456789);
//		e1.setEmpSalary(50000);
//		
//		Employee e2 = new Employee();
//		e2.setEmpName("jeyavarshan");
//		e2.setEmpEmail("jeyavarshan@gmail.com");
//		e2.setEmpContact(123456789);
//		e2.setEmpSalary(50000);
//		
//		List<Employee> employees = new ArrayList<Employee>();
//		employees.add(e1);
//		employees.add(e2);
//		
//		Company c1 = new Company();
//		c1.setCompanyName("AbcPvtLtd");
//		c1.setCompanyEmployees(employees);
//		
//		Company c = cdao.saveCompany(c1);
		
		//Save company 2 with no employees
		
//		Company c2 = new Company();
//		c2.setCompanyName("DefPvtLtd");
//		Company c = cdao.saveCompany(c2);
		
		//Save four employees id as 3,4,5,6
		
//		Employee e3 = new Employee();
//		e3.setEmpName("purushothaman");
//		e3.setEmpEmail("purushothaman@gmail.com");
//		e3.setEmpContact(123456789);
//		e3.setEmpSalary(50000);
//		
//		Employee e4 = new Employee();
//		e4.setEmpName("akash");
//		e4.setEmpEmail("akash@gmail.com");
//		e4.setEmpContact(123456789);
//		e4.setEmpSalary(50000);
//		
//		Employee e5 = new Employee();
//		e5.setEmpName("kiruba");
//		e5.setEmpEmail("kiruba@gmail.com");
//		e5.setEmpContact(123456789);
//		e5.setEmpSalary(50000);
//		
//		Employee e6 = new Employee();
//		e6.setEmpName("ranjith");
//		e6.setEmpEmail("ranjith@gmail.com");
//		e6.setEmpContact(123456789);
//		e6.setEmpSalary(50000);
//		
//		Employee es3 = edao.saveEmployee(e3);
//		Employee es4 = edao.saveEmployee(e4);
//		Employee es5 = edao.saveEmployee(e5);
//		Employee es6 = edao.saveEmployee(e6);
		
		
		//add 3 and 4 employee to company 2
		
		Company c = cdao.findCompany(2);
		List<Employee> employees = c.getCompanyEmployees();
		employees.add(edao.findEmployee(3));
		employees.add(edao.findEmployee(4));
		c.setCompanyEmployees(employees);
		Company c2 = cdao.updateCompany(c, 2);
		System.out.println(c2);
	}

}
