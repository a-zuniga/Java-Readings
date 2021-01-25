package com.company;

public class Main {

    public static void main(String[] args) {
	// Test for generic memory cell that uses the superclass object class for genericity
        MemoryCell test = new MemoryCell();
        test.write("Alejandro Zuniga");
        String value = (String) test.read();
        System.out.print(String.format("Stored value: %s", value));
    }

}
