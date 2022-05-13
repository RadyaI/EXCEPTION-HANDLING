/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmeticexception;

import java.util.Scanner;

public class ArithmeticException{
    public static void main(String[] args) {
        Scanner console =new Scanner(System.in);
        
        System.out.println("Enter value for C");
        
        //Exception handling
        try{
        int c = console.nextInt();
        int res=c/0;
            System.out.println("the result is"+res);
        }
        catch(Exception exception_message){
            System.out.println("Adalah= "+exception_message);
}
    }
    }

   
 
