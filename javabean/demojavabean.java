package com.Rkmvc;

public class Student {
	int roll;
	int id;
	String name;
	String Course;
	void register_student(int roll,int id,String name,String course)
	{
		this.roll=roll;
		this.id=id;
		this.name=name;
		this.Course=course;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", id=" + id + ", name=" + name + ", Course=" + Course + "]";
	}
	public static void main(String args[])
	{
		Student s=new Student();
		s.register_student(701,1001,"SDG","C101");
		System.out.println(s);
	}
	
}

