package com.bean;

public class ServerSideApplication implements java.io.Serializable{
	private int roll;
	private int id;
	private String name;
	private String Course;
	public ServerSideApplication() {
	}
	
	
	//getter method to use the value
	public void set_roll(int roll)
	{
		this.roll=roll;
	}
	public void set_id(int roll)
	{
		this.id=id;
	}
	public void set_name(String roll)
	{
		this.name=name;
	}
	public void set_course(String course)
	{
		this.Course=course;
	}
	public int  get_roll()
	{
		return roll;
	}
	public int  get_id()
	{
		return id;
	}
	public String get_name()
	{
		return name;
	}
	public String set_course()
	{
		return Course;
	}
}
