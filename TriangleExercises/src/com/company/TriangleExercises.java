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


}
