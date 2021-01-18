package com.technical.eleven.ui;

import com.technical.eleven.main.items.Human;

import java.util.List;

public interface HumanUI {


    String readSurname();
    String readName();
    Human readHuman();
    int getIndexOfHuman();
    void showHumans(List<Human> humans);

}


