/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etu2041.model;

import etu2041.annotation.Urls;

/**
 *
 * @author manou cherie
 */
public class Emp {
    int id;
    String nom;
    @Urls(value="/emp-all")
    public String findAll(){
        return "nety";
    }
    @Urls(value="emp-all1")
    public String findAll1(){
        return "nety";
    }

    @Urls(value="select")
    public String select(){
        return "select" ;
    }
    
}
