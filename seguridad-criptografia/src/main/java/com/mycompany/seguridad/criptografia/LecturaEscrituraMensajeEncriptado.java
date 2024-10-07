/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.seguridad.criptografia;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 *
 * @author josca
 */
public class LecturaEscrituraMensajeEncriptado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);//lectura de teclado
        
        try {
            KeyGenerator keygen = KeyGenerator.getInstance("AES");// GENERO LA KEY simetrica para DES
            SecretKey clave = keygen.generateKey();// APLICO OPACIDAD A LA KEY
            Cipher desCipher = Cipher.getInstance("AES");// ACTIVO CIFRADOR
            String direccion = "C:\\DAN\\PROGRAMACION\\programacion-servicios-procesos\\seguridad-criptografia\\src\\main\\resources\\Fichero.txt";
            //System.out.println("Introduce el nombre de un fichero");// leo el fichero que contiene la palabra encrypt
            //String direccion = lector.nextLine();
            Path fichero_aleer = Paths.get(direccion);
            
            desCipher.init(Cipher.ENCRYPT_MODE,clave);// ACTIVO CIFRADOR AES CON LA CLAVE
            byte[] lectura = Files.readAllBytes(fichero_aleer);// leo el fichero y lo almaceno en
            System.out.println("El mensaje que vemos a encriptar es : " + new String(lectura));// muestro el array del byte
            
            byte[] encriptado = desCipher.doFinal(lectura);// LO CIFRO
            
            System.out.println("El mensaje encriptado es " + new String(encriptado));// Muestra el mensaje encriptado
            
            System.out.println("Dame el fichero donde quieres guardar el mensaje");
            String direccionCrypt = lector.nextLine();//direccion del fichero donde guardare el mensaje encriptado
            File fCipher = new File(direccionCrypt);// abro fichero
            FileOutputStream escritor = new FileOutputStream(fCipher,true);// abro el buffer para
            escritor.write(encriptado);// escribo en fichero
            escritor.close();// cierro el buffer
            
            
        } catch (Exception e) {
        }
        
    }
    
}
