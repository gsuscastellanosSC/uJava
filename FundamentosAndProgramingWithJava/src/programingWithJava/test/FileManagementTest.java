package programingWithJava.test;

import programingWithJava.FileManagement.FileManagement;

/**
 *
 * @author sc
 */
public class FileManagementTest {

    public static void main(String[] args) {
        //FileManagement.createFile("/home/sc/Documents/github/uJava/test.txt");
//        FileManagement.writeFile("/home/sc/Documents/github/uJava/test.txt", "Test");
//        FileManagement.addContentToFile("/home/sc/Documents/github/uJava/test.txt", "Test");
        FileManagement.readFile("/home/sc/Documents/github/uJava/test.txt");
    }
}