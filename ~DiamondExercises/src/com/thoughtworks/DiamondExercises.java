package com.thoughtworks;

/**
 * Created by caitlingulliford on 03/03/2017.
 */
public class DiamondExercises {

    String star = "*";

    void isotriangle(int n) {
        System.out.println("1st Diamond Task: Isosceles Trianlge");
        for (int i = 1;i <= n; i ++){

            for (int k = 1; k <= n-i; k ++)
                System.out.print(" ");

            for (int j = 1; j <= 2 * i - 1; j ++)
                System.out.print(star);

            System.out.println("");

        }
    }
}


