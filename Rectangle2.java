package com.chapter3;

class rect
{
    int lenght;
    int breath;

    rect(int l, int b) {
        this.lenght = l;
        this.breath = b;
    }

    public int returnarea()
    {
        return lenght * breath;
    }
}
 public class Rectangle2{
    public static void main(String[] args) {
        rect obj = new rect(4,5);
        rect obj1 = new rect(5,8);

        System.out.println(obj.returnarea());
        System.out.println(obj1.returnarea());

    }


}