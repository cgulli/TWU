package com.thoughtworks;

public class Main {

    public static void main(String[] args) {
        System.out.println("1st Diamond Task: Isosceles Triangle");
	DiamondExercises first = new DiamondExercises();
	System.out.println(first.isoTriangle(3));
        System.out.println("2nd Diamond Task: Print a Diamond");
	DiamondExercises second = new DiamondExercises();
        System.out.println(second.printDiamond(3));
        System.out.println("3rd Diamond Task: Diamond with name");
    DiamondExercises third = new DiamondExercises();
    System.out.println(third.nameDiamond(3, "Caitlin"));


    }
}
