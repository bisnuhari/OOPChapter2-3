package com.chapter3;

import java.util.Scanner;

	class Area 
	{

	int length;
    int breadth;
    Area(int a, int b)
    {
         length = a;
         breadth = b;
    }
    public int returnarea()
    {
        return length * breadth;
    }
}

public class Rectangle {
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the lenght of Recatangle");
         a = obj.nextInt();
        obj.nextLine();
        System.out.println("Enter the breadth of Recatangle");
        b = obj.nextInt();
        Area ob1 = new Area(a,b);
        System.out.println("Area = "+ ob1.returnarea());
    }
}
