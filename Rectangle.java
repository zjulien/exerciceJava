/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicejava;

/**
 *
 * @author stagiaire acs
 */
public class Rectangle {
    public Double Longueur;
    public Double Largeur;
    
public Rectangle(Double L,Double l){
    this.Longueur=L;
    this.Largeur=l;
    
    }
public Double surface(){
    return this.Longueur*this.Largeur;
}
public Double périmètre(){
    return 2*(this.Longueur+this.Largeur);
}
public void afficher(){
    System.out.println("La surface du rectangle est :"+ this.surface());
    System.out.println("Le périmètre du rectangle est : " + this.périmètre());
}
}
