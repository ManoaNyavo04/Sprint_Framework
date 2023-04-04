/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import annotation.Urls;

/**
 *
 * @author manou cherie
 */
public class Employes {
    int id;
    String nom;

    public Employes(){}
    
    @Urls(url="all_employes")
    public String findAll(){
        return nom;
    }
    
}
