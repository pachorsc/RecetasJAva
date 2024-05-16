/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

/**
 *
 * @author EAG
 */
public class Sesion {
    private static String nomUsu = "No registrado";
    
    public static void setNomUsu(String nom){
        nomUsu = nom;
    } 
    
    public static String getNom(){
        return nomUsu;
    }
}
