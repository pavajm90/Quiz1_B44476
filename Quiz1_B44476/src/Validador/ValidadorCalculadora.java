/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author JOCSELY
 */
public class ValidadorCalculadora
{
    private final static String metodospattern = "^\\d+@{digit}+\\s$";
    
    
     public boolean validarMetodos(String resultado)
     {
        Pattern pat = Pattern.compile(metodospattern, Pattern.CASE_INSENSITIVE);
        Matcher mat = pat.matcher(resultado);
        return mat.find();       
    }
}

