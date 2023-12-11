package org.example;

import org.example.singleton.Settings;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Settings setting1 = Settings.getInstance();
        Settings setting2 = Settings.getInstance();
        Settings setting3 = Settings.getInstance();
        System.out.println(setting3.equals(setting1));

        //Settings setting4 = new Settings();
        //System.out.println(setting4.equals(setting1));
    }
}