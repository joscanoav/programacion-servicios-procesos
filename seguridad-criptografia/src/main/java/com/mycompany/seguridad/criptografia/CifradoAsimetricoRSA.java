/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.seguridad.criptografia;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import javax.crypto.Cipher;

/**
 *
 * @author josca
 */
public class CifradoAsimetricoRSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
    //--------PROCESO DE ENCRIPTACION
            KeyPairGenerator keygen = KeyPairGenerator.getInstance("RSA");// GENERO LA LLAVE ASIMETRICA PARA RSA
            KeyPair keypair = keygen.generateKeyPair();// GENERO LA KEY
            Cipher rsaCipher = Cipher.getInstance("RSA");// ACTIVO EL CIIFRAFOR RSA
            rsaCipher.init(Cipher.ENCRYPT_MODE,keypair.getPrivate());// METO LA LLAVE PRIVADA EN EL CIFRADOR
            String mensaje = "Mensaje de prueba del cifrado asimetrico";
            byte[] mensajeCifrado = rsaCipher.doFinal(mensaje.getBytes());// ENCRYTO
            System.out.println(new String(mensajeCifrado));
            
    //--------PROCESO DE DESENCRIPTACION
    
            rsaCipher.init(Cipher.DECRYPT_MODE,keypair.getPublic());// METO LA LLAVE EN PUBLICA EN EL DESCIFRADOR
            byte[] desencriptado = rsaCipher.doFinal(mensajeCifrado);// DESCIFRO
            System.out.println(new String(desencriptado));
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
