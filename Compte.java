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
public class Compte {
    
    public Double solde;
    public Compte(Double s){
        this.solde=s;
    }
    public void deposer(Double d){
        this.solde+=d;
    }
    public void retirer(Double r){
        this.solde-=r;
    }
    
    public void afficher(){
        System.out.println("votre solde est " + this.solde + "Euro Sauf erreur");
    }
    
}
