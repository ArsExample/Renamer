package com.company;

import javax.swing.*;
import java.io.File;

public class Renaming extends JFrame {

    public static void ren(String path, String ext) {
        String reverse = "\u202E";
            System.out.println("Input absolute path to your file (type /stop to finish): ");
            String input = path;
            input = input.replaceAll("\"", "");

            File toRename = new File(input);
            if (!toRename.exists()) {
                System.out.println("File not found!!!");
            } else {
                //Фотка л'усю'пит.ст тип
                System.out.println("Input a new extension");
                String rev = new StringBuilder(ext).reverse().toString();
                //String revOld = new StringBuilder(toRename.getName().split("\\.")[1]).reverse().toString();
                String newName = toRename.getName().split("\\.")[0] + reverse + rev + '.' + toRename.getName().split("\\.")[1];
                String oldEx = input.split("\\.")[input.split("\\.").length - 1];
                System.out.println("Old extension of the file is " + oldEx);
                System.out.println("Path to folder is " + input.replaceAll(toRename.getName(), ""));
                String newPath = input.replaceAll(toRename.getName(), "") + newName;
                boolean res;
                res = toRename.renameTo(new File(newPath));

                if (!res)
                    System.out.println("failed to rename file " + input);
                else
                    System.out.println("Successfully renamed file " + input);
            }

    }
}