/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatchfinally;

/**
 *
 * @author radya
 */
public class TryCatchFinally {

   public TryCatchFinally(){
   }
    public static void main(String[] args) {
        int zeroInt=0;
        int anInt=10;
        try{
        int Divresult = anInt / zeroInt;
            System.out.println("Hasilnya adalah "+Divresult);
        } catch (java.lang.ArithmeticException e ){
            System.out.println("Terjadi pembagian dengan 0");
            System.out.println("Diatasi blok penanganan sendiri");
            System.out.println(e);
        } finally {
            System.out.println("kalimat di finally");
        }
        System.out.println("Kalimat diluar blok try-catch-finally");
    }
}
