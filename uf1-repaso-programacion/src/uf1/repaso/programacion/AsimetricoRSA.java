/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf1.repaso.programacion;

import javax.crypto.*;
import java.security.*;
/**
 *
 * @author josca
 */
public class AsimetricoRSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            
    //-----PROCESO DE ENCRIPTACION
        KeyPairGenerator keygen = KeyPairGenerator.getInstance("RSA");//Genero llave simetrica
        KeyPair keypair = keygen.generateKeyPair();//Genero la Key
        Cipher rsaCipher = Cipher.getInstance("RSA");// Activo el Cifrador RSA
        rsaCipher.init(Cipher.ENCRYPT_MODE,keypair.getPrivate());//Mete llave privada en Cipher
        
        String mensaje = "Mensaje de prueba del cifrado asimetrico";
        byte[] mensajeCifrado = rsaCipher.doFinal(mensaje.getBytes());//Encripto
            System.out.println(new String(mensajeCifrado));
            
    //------PROCESO DE DESENCRIPTACION
        rsaCipher.init(Cipher.DECRYPT_MODE,keypair.getPublic()); // meto la llava publica recuerda es decrypt
        byte[] desencriptado = rsaCipher.doFinal(mensajeCifrado);// Descrifro
        System.out.println(new String(desencriptado));
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
