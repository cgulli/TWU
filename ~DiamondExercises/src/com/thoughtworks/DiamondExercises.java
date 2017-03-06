package com.thoughtworks;

/**
 * Created by caitlingulliford on 03/03/2017.
 */
public class DiamondExercises {

    String star = "*";

    void isotriangle(int n) {
        System.out.println("1st Diamond Task: Isosceles Trianlge");

        for (int i = 1; i <= n; i += 2) {
            for (int k = 0; k < (4 - i / 2); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(star);
            }
            System.out.println("");

        }
    }
}


