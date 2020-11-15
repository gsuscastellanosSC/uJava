/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosJava;

/**
 *
 * @author sc
 */
public class Box {

    public static void main(String[] args) {
        System.out.println("Box One:    ");
        BoxClass BoxOne = new BoxClass();
        BoxOne.height = 3;
        BoxOne.width = 3;
        BoxOne.depth = 3;
        System.out.println("        The volume of Box One is: " + BoxOne.volume());
        
        System.out.println("\nBox Two:    ");
        BoxClass BoxTwo = new BoxClass(2, 2, 2);
        System.out.println("        The volume of Box Two is: " + BoxTwo.volume());

    }

    public static class BoxClass {

        int height;
        int width;
        int depth;

        public BoxClass() {
            System.out.println("        Builder Empty");
        }

        public BoxClass(int height, int width, int depth) {
            System.out.println("        Builder with Arguments");
            this.height = height;
            this.width = width;
            this.depth = depth;
        }

        public int volume() {
            return height * width * depth;
        }
    }
}
