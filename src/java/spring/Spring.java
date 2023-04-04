/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring;

import etu2041.framework.Mapping;
import etu2041.framework.Traitement;
import java.util.HashMap;

/**
 *
 * @author manou cherie
 */
public class Spring {
    public static void main(String[] args) throws ClassNotFoundException {
        HashMap<String,Mapping> MappingUrls = Traitement.getAnnotedUrls(Traitement.getClasses("modele"));
            try {
                Mapping mapping = MappingUrls.get("all_employes");
                System.out.println(mapping.getMethod()  + mapping.getClassName());
            } catch (Exception e) {           
            }     
    }   
    
}
