/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicodelabs.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Raphson
 */
public class DumbPassword {
    /**
     * Reads text from a character-input stream
     * @var BufferedReader
     */
    private BufferedReader br;
    
    /**
     * Check if user's password is dumb or not
     * @param inputedPassword
     * @return 
     * @throws java.io.FileNotFoundException 
     */
    public boolean checkPassword(String inputedPassword ) throws  IOException{
        Set<String> dumbPasswordList = this.readPasswordResource();
        return dumbPasswordList.contains(inputedPassword);
    }
    
    
    /**
     * Read all collection of dumb password...
     * @return 
     * @throws java.io.FileNotFoundException
     * @throws java.io.UnsupportedEncodingException
     */
    public Set<String> readPasswordResource() throws IOException{
        Set<String> passwordSet = new HashSet<String>();
        
        br  = new BufferedReader(
                new InputStreamReader(
                        getClass().getClassLoader().getResourceAsStream("passwordlist.txt"), "utf-8"));
        
        String sCurrentLine;

        while ((sCurrentLine = br.readLine()) != null) {
            passwordSet.add(sCurrentLine);
        }
        return passwordSet;
    }
}
