package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuMaker {
private ArrayList<String> options;
private Scanner in;

public MenuMaker() {     //Constructor, creates an empty menu.
    options = new ArrayList<String>();
    in = new Scanner(System.in);
}

public void AddOption (String option) {

    options.add(option);
}

public int getInput() {
        int input;
        do {
            for (int i = 0;i < options.size(); i++) {
                int choice = i + 1;

                System.out.println(choice + ") " + options.get(i));
            }
            input = in.nextInt();
        }
        while (input < 1 || input > options.size());
        return input;
     }



}



