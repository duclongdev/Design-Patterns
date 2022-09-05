package FactoryMethod;

import java.util.Scanner;

import javax.swing.Renderer;

import FactoryMethod.factory.UI;
import FactoryMethod.factory.ui.AndroidUI;
import FactoryMethod.factory.ui.IosUI;

class Main {
    private static UI ui;

    public static void main(String[] args) {
        config();
        render();
    }

    private static void config() {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the operating system (a. Android, other. Ios): ");
        String result = ip.nextLine();
        if (result.equals("a"))
            ui = new AndroidUI();
        else
            ui = new IosUI();
    }

    private static void render() {
        ui.renderUI();
    }
}
