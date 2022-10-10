package com.chapter3;

interface Eatable{
	 void eat();
	}

	class TestAnynymousInner1
	{
	 public static void main(String args[])
	 {
	 
	 Eatable e=new Eatable()
	 {
	  public void eat(){System.out.println("best fruits");
	 }
	 };
	 e.eat();
	 }
	}
