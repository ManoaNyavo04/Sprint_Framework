/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitaire;

import etu2041.annotation.Urls;
import etu2041.framework.Mapping;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author manou cherie
 */
public class Utilitaire {
    public String url(String url) throws Exception{    
        String supprime_le_baseurl=url.split("\\?")[0];
        return supprime_le_baseurl;
    }
    
    public HashMap<String , Mapping> tout_fichier( String emplacement_des_classes, File dir , HashMap<String, Mapping> resultat) throws Exception{
        File[] liste= dir.listFiles();
        for(int i=0 ; i< liste.length ; i++){
            if(liste[i].isDirectory()){
                resultat= tout_fichier(emplacement_des_classes,liste[i] , resultat);
            }else{
                if(liste[i].getName().contains(".class")){
                    String classe_avec_son_package=liste[i].toString().split("\\.")[0].replace(emplacement_des_classes , "").replace("\\" , ".");
                    Class A=Class.forName(classe_avec_son_package);
                    Method[] emp= A.getDeclaredMethods() ;
                    Class urls= Class.forName("etu1852.annotation.Urls");
                            System.out.println(classe_avec_son_package);
                    for(int j=0 ; j<emp.length ; j++){
                        Urls u= (Urls)emp[j].getAnnotation(urls);
                        if(emp[i].isAnnotationPresent(urls) ){
                            resultat.put(  u.value(), new Mapping( classe_avec_son_package, emp[j].getName()));
                        }
                    }
                }
            }
        }
        return resultat;
    } 

    
    public static void main(String[] args){
        try{
            List<Mapping> resultat= new ArrayList<Mapping>();
            HashMap<String,Mapping> a = new HashMap<String, Mapping>();
            String pkg="\\";
            File dir = new File(System.getProperty("user.dir")+"\\");
            // System.out.println(System.getProperty("user.dir")+"\\");
            // File dir = new File("E:\\apache_tomcat9\\webapps\\Sprint3\\WEB-INF\\classes\\");
            Utilitaire fonction = new Utilitaire();
            // System.out.println(fonction.tout_fichier1("E:\\apache_tomcat9\\webapps\\Sprint3\\WEB-INF\\classes\\",dir , resultat).get(0).getMethod());
            System.out.println(fonction.tout_fichier("E:\\apache_tomcat9\\webapps\\Sprint4\\framework\\WEB-INF\\classes\\",dir , a).get("emp-all"));
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
