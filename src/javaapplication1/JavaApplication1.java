/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author jonas
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("What's your name?");
        JavaApplication1 plutt = new JavaApplication1();
        String test = plutt.ReadLine();
        printHelloWorldToScreen(test);
    }
    
    public static void printHelloWorldToScreen(String myStr) {
        System.out.print("Change this to Github!\nHello " + myStr + "\n");
    }
    
    public String ReadLine(){
        Scanner sc = new Scanner(System.in);
        String plupp = sc.nextLine();
        return plupp;
    }
    
}
