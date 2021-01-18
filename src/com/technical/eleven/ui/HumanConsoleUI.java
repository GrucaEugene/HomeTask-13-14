package com.technical.eleven.ui;

import com.technical.eleven.main.items.Human;

import java.util.List;
import java.util.Scanner;

public class HumanConsoleUI implements HumanUI {
    private final Scanner sc;

    public HumanConsoleUI(Scanner sc){
        this.sc = sc;
    }

    @Override
    public String readSurname() {
        System.out.println("Введите фамилию");
        return sc.nextLine();
    }

    @Override
    public String readName() {
        System.out.println("Введите имя");
        return sc.nextLine();
    }

    @Override
    public Human readHuman() {
        System.out.println("Enter surname of Human");
        String surname = sc.nextLine();

        System.out.println("Enter name of Human");
        String name = sc.nextLine();

        System.out.println("Enter patronymic of Human");
        String patronymic = sc.nextLine();

        return new Human(surname, name, patronymic);
    }

    @Override
    public int getIndexOfHuman() {
        System.out.println("Введите номер человека");
        int number = sc.nextInt();
         return number - 1;

    }

    @Override
    public void showHumans(List<Human> humans){
        for (int i = 0; i < humans.size(); i++) {
            System.out.println(i+1+". "+humans.get(i));
        }
    }

}
