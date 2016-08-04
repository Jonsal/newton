/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.newton.yapp;

/**
 *
 * @author jonas
 */
public class HelloWorld2 {
    public static void main(String[] args) {
        printMessage();
        testMethod();
    }

    private static void printMessage() {
        System.out.println("Hello World from a method!");
    }
    
    public static void testMethod(){
        int i = 20;
        while(i > 0){
            System.out.print(i + "\n");
            i--;
        }
    }
        
//    public static void testMethod2(){
//        int i;
//        for(i; 1 > 0; i++){
//            System.out.print(i + "\n");
//        }
//        
//        switch(i){
//                case 1:
//        }
  //  }
}