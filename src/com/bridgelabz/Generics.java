package com.bridgelabz;

class FindMaximum {

    public void findMaximum(String a, String b, String c) {
        String max = a;
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
        fm.findMaximum("Apple","Peach","Banana");
    }
}
