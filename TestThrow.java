/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testthrow;

/**
 *
 * @author radya
 */

class AgeInvalid extends Exception{
 AgeInvalid(String s){
 super (s);
 }
} 
  public class TestThrow{
  static void validate(int age)throw AgeInvalid{
  if(age<38)
        throw new AgeInvalid ("not valid ");
  else 
          System.out.println("Welcome to vote");
  }
      public static void main(String[] args) {
          try{
          validate(13);
          }
          catch(Exception i){
              System.out.println("exception aktif"+i);
          }
          System.out.println("rest: ");
      }
  }

  

