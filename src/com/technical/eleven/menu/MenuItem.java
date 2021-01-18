package com.technical.eleven.menu;

import com.technical.eleven.controllers.HumanController;

public abstract class MenuItem {
    protected HumanController humanController;
    private final String name;
    private final boolean closeAfter;

    public MenuItem(HumanController humanController, String name, boolean closeAfter) {
        this.humanController = humanController;
        this.name = name;
        this.closeAfter = closeAfter;
    }

    public MenuItem(HumanController humanController, String name) {
        this(humanController, name, false);
    }

    public String getName() {
        return name;
    }

    public abstract void exec();

    public boolean closeAfter() {
        return closeAfter;
    }
}
