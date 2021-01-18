package com.technical.eleven.menu;

import com.technical.eleven.controllers.HumanController;

import java.util.Scanner;

public class Menu {
    HumanController humanController = new HumanController();
    private final MenuItem[] items = new MenuItem[]{
            new AddHumanMenuItem(humanController),
            new ShowAllMenuItem(humanController),
            new RemoveHumanMenuItem(humanController),
            new FindBySurnameMenuItem(humanController),
            new FindByNameMenuItem(humanController),
            new ExitingMenuItem()
    };
    private final Scanner sc = new Scanner(System.in);


    public void run() {
        while (true) {
            showMenu();
            int choice = getUserChoice();
            if (isChoiceInvalid(choice)) {
                System.out.println("Error, try again!");
                continue;
            }
            items[choice].exec();
            if (items[choice].closeAfter()) break;
        }
    }

    private boolean isChoiceInvalid(int choice) {
        return choice < 0 || choice >= items.length;
    }


    private int getUserChoice() {
        System.out.println("Chose Menu item");
        int choice = sc.nextInt() - 1;
        sc.nextLine();
        return choice;
    }

    private void showMenu() {
        System.out.println("\n-------------MENU----------------");
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + 1 + ". " + items[i].getName());
        }
        System.out.println("---------------------------------");

    }

}
