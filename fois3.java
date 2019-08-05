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
public class fois3 {
     public static void main(String[] args){
            
    System.out.println("tapez un nombre");
    Scanner nombre=new Scanner(System.in);
    
    
    int n=nombre.nextInt ();
    int m=3*n;
    System.out.print("Le triple du nombre" + n +" est :" +m);
    
    
    }
    
}

