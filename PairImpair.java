/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicejava;
import java.util.Scanner;
/**
 *
 * @author stagiaire acs
 */
public class PairImpair {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("Tapez la valeur de l'entier n :");
      Scanner entier=new Scanner(System.in);
      
     
      
      int n=entier.nextInt();
      //n=q*2+ r
       int r=n%2;
       if (r==0){
           System.out.println("Le nombre n que vous avez tapé est pair");
       }
       
       else{
           System.out.println("Le nombre n que vous avez tapé est impair");
       }
    }
    
}
