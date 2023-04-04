/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etu2041.framework;

/**
 *
 * @author manou cherie
 */
public class Mapping {
    String ClassName ;
    String Method;
    
    public Mapping(String classeName , String method){
        this.ClassName=classeName;
        this.Method=method;
    }

    public String getClassName(){
        return this.ClassName;
    }
    public void setClassName( String classeName){
        this.ClassName=classeName;
    }
    public String getMethod(){
        return this.Method;
    }
    public void setMethod( String Method){
        this.ClassName=Method;
    }
    
}
