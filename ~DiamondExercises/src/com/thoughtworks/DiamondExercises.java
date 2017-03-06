package com.thoughtworks;

/**
 * Created by caitlingulliford on 03/03/2017.
 */
public class DiamondExercises {

    String ast = "*";

    void isoTriangle(int n) {

//        for (int i = 1; i <= n; i += 2) {
//            for (int k = 0; k < (4 - i / 2); k ++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i; j ++) {
//                System.out.print(ast);
//            }
//            System.out.println("");


        for (int i = 1;i <= n; i ++){

            for (int k = 1; k <= n-i; k ++)
                System.out.print(" ");

            for (int j = 1; j <= 2 * i - 1; j ++)
                System.out.print(ast);

            System.out.println("");

        }
    }

    void printDiamond(int n){
        isoTriangle(n);
        printLowerTriangle(n - 1);
    }

    void printLowerTriangle(int n) {
        int starCounter = n;

        for (int k = 1; k <= n; k ++){
            for (int j =1; j <= k; j ++)
                System.out.print(" ");

            for (int star = 1; star <= 2*starCounter - 1; star ++) {
                System.out.print(ast);
            }
            starCounter --;
            System.out.println("");
        }
    }
}


