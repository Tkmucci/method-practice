package com.pluralsight;

public class Format {



    //My Main method that will call the data from other methods and print the result.
    public static void main(String[] args) {

        //outputs formatName("Last", "First");
        System.out.println(formatName("Bob", "Smith"));

    }

    //My formatName method returns the name in the format of "Last, First"
    public static String formatName(String first, String last) {

        return last + ", " + first;
    }
}
