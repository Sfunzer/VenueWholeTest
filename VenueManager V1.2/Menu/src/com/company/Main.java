package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

       MenuMaker mainMenu = new MenuMaker();

       mainMenu.AddOption("optie1");
       mainMenu.AddOption("optie2");
       mainMenu.AddOption("optie3");



        int input = mainMenu.getInput();
        System.out.println("Input: " + input);

        if (input == 2) {
            System.out.println("check!");
        }
    }
}
