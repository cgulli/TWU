package com.thoughtworks;


import java.util.List;

public class Main {

    public static void main(String[] args) {
        PrimeNumbMachine generator = new PrimeNumbMachine();
	    List factors = generator.generate(30);
        System.out.println(factors);
    }
}
