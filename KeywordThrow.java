/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keywordthrow;

/**
 *
 * @author radya
 */
public class KeywordThrow {

    /**
     *
     * @param n
     */
    public static void test (int n){
   if (n<0){
   throw new NullPointerException(
   "Kesalahan: null pointer" );
   }else{
   throw new ArithmeticException(
   "kesalahan: arithmetic exception");
   
   }
       
       }   
    public static void main(String[] args) {
        try {
        test(-12);
        }  catch(ArithmeticException|NullPointerException e)
        {
            System.out.println("Expresi ditangkap disini...");
            System.out.println(e.getMessage());
            
        }
        System.out.println("Statmen setelah blok try-catch ");
    }
}
