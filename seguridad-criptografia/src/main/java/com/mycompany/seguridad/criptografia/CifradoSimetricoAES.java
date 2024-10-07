/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.seguridad.criptografia;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 *
 * @author josca
 */
public class CifradoSimetricoAES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String mensaje = "Hola mundo Criptografia";
            System.out.println("Mensaje a cifrar: " + mensaje);
    //-------------PROCESO DE ENCRIPTACION
            KeyGenerator keygen = KeyGenerator.getInstance("AES"); // GENERO LA KEY simetrica para AES
            SecretKey key = keygen.generateKey(); // AOKICO OPACIDAD A LA KEY
            
            Cipher aesCipher = Cipher.getInstance("AES"); // ACTIVO CIFRADOR AES
            aesCipher.init(Cipher.ENCRYPT_MODE,key);// ACTIVO CIFRADOR AES CON LA LLAVE
            byte[] mensajeCifrado = aesCipher.doFinal(mensaje.getBytes()); //LO CIFRO
    //--------------------------------------------
    
            System.out.println("Mensaje cifrado: " + new String(mensajeCifrado));
            
    // PROCESO DE LA DESENCRIPTADO
    
        aesCipher.init(Cipher.DECRYPT_MODE,key);// ACTIVO MODO DESCIFRADOR CON LA LLAVE
        byte[] desencriptado = aesCipher.doFinal(mensajeCifrado); //DESTINO
            System.out.println("Mensaje descifrado: " + new String(desencriptado));  
                    
                    
                    
                    
        } catch (Exception e) {e.printStackTrace();
        }


    }
    
}
