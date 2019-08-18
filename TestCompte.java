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
public class TestCompte {
    
    public static void main(String[] args){
        Compte monCompte=new Compte(5000.0);
            monCompte.deposer(2000.0);
            monCompte.retirer(1000.0);
            monCompte.afficher();
        
        
    }
    
    
}
