/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicodelabs.core.example;

import com.unicodelabs.core.DumbPassword;
import java.io.IOException;

/**
 *
 * @author Raphson
 */
public class DumbPasswordClient {
    public static void main(String[] args) {
        DumbPassword dumbPasswords = new DumbPassword();
        try {
            if(dumbPasswords.checkPassword("222777")){
                System.out.println("This password is just too common. Please try another!");
            } else {
                //This password is awesome!
                //This user SMART! Give them the Major key! #takeit!!
                System.out.println("This password is awesome");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
