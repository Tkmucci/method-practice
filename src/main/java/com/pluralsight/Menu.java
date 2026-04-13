package com.pluralsight;

public class Menu {

    //My main method that will call the displayMenu method twice to show the menu two times.
    public static void main(String[] args) {

        displayMenu();
        displayMenu();
    }

    //My Menu method that will display the menu.
    public static void displayMenu() {

        //System.out.println("====== MENU ======");
        System.out.println("""
                ====== MENU ======
                
                1.Coffee_____$3.99
                2.Tea________$2.99
                3. Cookie____$1.99
                """);

    }
}
