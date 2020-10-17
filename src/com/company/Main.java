package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

    Coder c=new Coder();

        String fileName = "C:\\Users\\Евгений\\IdeaProjects\\ToC_3\\text.txt";
        String contents = c.readUsingScanner(fileName);
        System.out.println(contents);
        c.launch(contents);
    }
}