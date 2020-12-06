/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programingWithJava.FileManagement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
    public static void writeFile(String fileName, String content){
        PrintWriter output = null;
        File file = new File(fileName);
        try {
            output = new PrintWriter(fileName);
            output.println(new Date()+" ### "+content);
            System.out.println("The file was written");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            output.close();
            System.out.println("File create successful");
        } finally {
            output.close();
        }
    }
}
