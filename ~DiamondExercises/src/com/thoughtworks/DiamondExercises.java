package com.thoughtworks;

/**
 * Created by caitlingulliford on 03/03/2017.
 */
public class DiamondExercises {

    private final String ast = "*";

    public String isoTriangle(int n) {
        StringBuilder output = new StringBuilder("");
        for (int i = 1;i <= n; i ++){

            for (int k = 0; k <= n-i; k ++) {
                output.append(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j ++) {
                output.append(ast);
            }

            for (int k = 0; k <= n-i; k ++) {
                output.append(" ");
            }

            if (i < n) {
                output.append("\n");
            }
        }
        return output.toString();
    }

    public String printDiamond(int n){
        StringBuilder topTriangle = new StringBuilder(isoTriangle(n));
        StringBuilder bottomTriangle = new StringBuilder(lowerTriangle(n));

        // The middle line will be duplicated, so remove the last line from the top triangle
        int last = topTriangle.lastIndexOf("\n");
        if (last >= 0) { topTriangle.delete(last, topTriangle.length()); }


        StringBuilder output = new StringBuilder(topTriangle);
        output.append("\n");
        output.append(lowerTriangle(n));
        output.append("\n");

        return output.toString();
    }

    private String lowerTriangle(int n) {
        return new StringBuilder(isoTriangle(n)).reverse().toString();
    }

    public String nameDiamond(int n, String name) {
        StringBuilder output = new StringBuilder(isoTriangle(n-1));
        output.append("\n");
        output.append(name);
        output.append("\n");
        output.append(lowerTriangle(n-1));
        return output.toString();
    }
}


