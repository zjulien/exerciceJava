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
public class Somme100premiersNombres {
    
public static void main(String[] args)
{
    System.out.println("Tapez la valeur n afin de connaitre la somme des premiers nombres : ");
    Scanner nombre=new Scanner(System.in);
int n=nombre.nextInt(); 
int j=0;
for(int i=1;i<=n;i++){
    j=j+i;
    
}
System.out.println("La somme des " + n + "  premiers nombres est : " + j);
    }


}