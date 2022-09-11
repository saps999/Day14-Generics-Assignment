package com.bridgelabz;

class FindMaximum<T extends Comparable<T> {
    T a, b, c;

    FindMaximum(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static <T extends Comparable<T> void findMaximum(T a, T b, T c) {
        T max = a;
        if (b.compareTo(a) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println("Maximum number is: " + max);
    }

    public void testMaximum() {
        FindMaximum.findMaximum(a, b, c);
    }

}


public class Generics {
    public static void main(String[] args) {
        new FindMaximum<>(10, 20, 30).testMaximum();
        new FindMaximum<>(3.5, 5.6, 3.9).testMaximum();
        new FindMaximum<>("Apple", "Peach", "Banana").testMaximum();
    }
}
