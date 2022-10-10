package com.chapter3;

class dftConst {
    int num;
    String name;
 
    // this would be invoked while an object
    // of that class is created.
    dftConst() { System.out.println("Constructor called"); }
}
 
public class Constructor {
    public static void main(String[] args)
    {
        // this would invoke default constructor.
        dftConst dft1 = new dftConst();
 
        // Default constructor provides the default
        // values to the object like 0, null
        System.out.println(dft1.name);
        System.out.println(dft1.num);
    }
}