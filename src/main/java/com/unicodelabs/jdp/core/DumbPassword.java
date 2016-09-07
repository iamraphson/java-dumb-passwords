/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicodelabs.jdp.core;

import com.google.common.base.Strings;
import com.unicodelabs.jdp.core.exceptions.IsNullException;
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
     * Holds All Collection of dumb password
     * @Set<Strinh>
     */
    private Set<String> dumbPasswordList  = null;
    
    
    /**
     * Check if user's password is dumb or not
     * @param inputedPassword
     * @return 
     * @throws java.io.IOException 
     * @throws com.unicodelabs.jdp.core.exceptions.IsNullException 
     */
    public boolean checkPassword(String inputedPassword ) throws  IOException, IsNullException{
        if(Strings.isNullOrEmpty(inputedPassword))
            throw new IsNullException("The Password can not be null or empty. Please pass it as a parameter");
        
        
        this.dumbPasswordList = this.readPasswordResource();
        
        return this.dumbPasswordList.contains(inputedPassword);
    }
    
    
    /**
     * Read all collection of dumb password...
     * @return 
     * @throws java.io.IOException
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
