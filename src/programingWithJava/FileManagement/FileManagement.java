/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programingWithJava.FileManagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sc
 */
public class FileManagement {

    public static void createFile(String fileName) {
        PrintWriter output = null;
        try {
            File file = new File(fileName);
            output = new PrintWriter(fileName);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            output.close();
            System.out.println("File create successful");
        } finally {
            output.close();
        }
    }

    public static void writeFile(String fileName, String content) {
        PrintWriter output = null;
        File file = new File(fileName);
        try {
            output = new PrintWriter(fileName);
            output.println(new Date() + " ### " + content);
            System.out.println("The file was written");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            output.close();
            System.out.println("File create successful");
        } finally {
            output.close();
        }
    }

    public static void addContentToFile(String fileName, String content) {
        PrintWriter output = null;
        try {
            File file = new File(fileName);
            output = new PrintWriter(new FileWriter(fileName, true));
            output.println(new Date() + " ### " + content);
            System.out.println("Add content to file");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            output.close();
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        } finally {
            output.close();
        }
    }

    public static void readFile(String fileName) {
        BufferedReader input = null;
        File file = new File(fileName);
        try {
            input = new BufferedReader(new FileReader(file));
            String reader = input.readLine();
            int line = 1;
            while (reader != null) {
                System.out.println("line="+(line++)+"reader = " + reader);
                reader = input.readLine();
            }
            input.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                input.close();
            } catch (IOException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }
}
