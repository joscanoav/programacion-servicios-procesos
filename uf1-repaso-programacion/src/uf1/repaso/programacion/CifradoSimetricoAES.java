/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf1.repaso.programacion;

import javax.crypto.*;
/**
 *
 * @author josca
 */
public class CifradoSimetricoAES {
    //UTILIZA LA MISMA LLAVE - ALGORITMO AES
   // AES ES UNA EVOLUCION DEL ALGORITMOS DES 128 - 256 BYTES SENCILLOS Y RAPIDO
    public static void main(String[] args) {
        try{
            String mensaje = "Hola mundo Criptografia";
            System.out.println("Mensaje a cifrar: " +mensaje);
        
        //1 PROCESO ES ENCRIPTAR
        KeyGenerator keygen = KeyGenerator.getInstance("AES");// Genero la key simetrica para AES
        SecretKey key = keygen.generateKey();//aplicar opacidad a la KEY
        
        Cipher aesCipher = Cipher.getInstance("AES");//Activo el Cifrador AES
        
        aesCipher.init(Cipher.ENCRYPT_MODE,key);// ACtivo cifrador AES con la llave
        byte[] mensajeCifrado = aesCipher.doFinal(mensaje.getBytes());//Lo cifro
        //-------------------------------------------------------------------------------
        
            System.out.println("Mensaje cifrado: " + new String(mensajeCifrado));
        
        // 2 PROCESO DE  DESENCRIPTADO
        
        aesCipher.init(Cipher.DECRYPT_MODE,key);// Activar modod descifrador, con la llave
        byte[] desencriptado = aesCipher.doFinal(mensajeCifrado);//Descifro
            System.out.println("Mensaje descifrado: " + new String(desencriptado));
        
        
        }catch(Exception e){
            e.printStackTrace();
        }
        // TODO code application logic here
    }
    
}
