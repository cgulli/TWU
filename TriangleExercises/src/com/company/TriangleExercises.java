package com.company;


public class TriangleExercises {

    String star = "*";

    void asterisk(){
        System.out.println(star);
    }

    void horizontalLine(int n) {
        System.out.println("2nd Task: line of asterisks");

        for (int i = 0; i < n; i ++) {
            System.out.print(star);
        }
        System.out.println("");
    }

    void verticalLine(int n) {
        System.out.println("3rd task: vertical line of asterisks");

        for (int i = 0; i < n; i ++) {
            System.out.println(star);
        }
    }

    void rightTriangle(int n) {
        System.out.println("4th task: asterisks in a right triangle");

        for (int i = 0; i < n; i ++) {
            for (int j = 0; j <= i; j ++) {
                System.out.print(star);
            }
            System.out.println("");
        }
    }


}
