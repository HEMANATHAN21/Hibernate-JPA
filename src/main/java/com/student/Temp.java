package com.student;

import dao.StudentDao;

public class Temp 
{
	public static void main(String[] args)
	{
		StudentDao sdao = new StudentDao();
		//Student updateddata = sdao.deleteStudent(2);
		//System.out.println(updateddata);
		Student s = sdao.findStudent(2);
		System.out.println(s);
	}

}
