package com.chapter3;

class Student1
{  
	 int rollno;  
	 String name;  
	 void insertRecord(int r, String n)
	 {
		 rollno = r;
		 name =n;
	 }
	 void displayinformation()
	 {
		 System.out.println(rollno+"  "+name);
	 }
}  
class InitializationMethod
{
	public static void main(String args[])
	{  
	  Student1 s1=new Student1();
	  Student1 s2 = new Student1();
	  s1.insertRecord (111, "karan");
	  s2.insertRecord(112, "arjun");
	  s1.displayinformation();
	  s2.displayinformation();
	   
	 }  
}  