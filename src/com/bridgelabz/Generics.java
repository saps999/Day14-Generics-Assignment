package com.bridgelabz;

class FindMaximum<T extends Comparable<T> {

    public void findMaximum(T a, T b, T c) {
        T max = a;
        if (b.compareTo(a) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println("Maximum number is: " + max);
    }
}
public class Generics {
    public static void main(String[] args) {
        System.out.println("Welcome to the Day-14 Generics Assignment");
        FindMaximum fm =new FindMaximum();
        fm.findMaximum(10,20,30);
        fm.findMaximum(30.5,20.5,10.5);
        fm.findMaximum("Apple","Peach","Banana");
    }
}
