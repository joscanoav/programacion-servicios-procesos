/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf1.repaso.programacion;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import javax.crypto.*;
/**
 *
 * @author josca
 */
public class FicheroCifrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);//lectura teclado
        
        
        try{
        
        // **** SE GENERA LA CLAVE Y EL CIFRADOR
        KeyGenerator keygen = KeyGenerator.getInstance("AES");// genero KEy Simetrica AES
        SecretKey clave = keygen.generateKey();// aplica opacidad
        Cipher desCipher = Cipher.getInstance("AES");// ACTIVO CIFRADOR AES
        // **** SE UBICA EL FICHERO
        System.out.println("Introduzca el nombre de un fichero");// leo el fichero
        String direccion = sc.nextLine();
        Path fichero_aleer = Paths.get(direccion);
        //**** SE ENCRIPTA EL FICHERO
        desCipher.init(Cipher.ENCRYPT_MODE,clave);// Activo Cifrador con la llave aes
        byte[] lectura = Files.readAllBytes(fichero_aleer);//lee el fichero y lo almacena eun array de bytes
        System.out.println("El mensaje que vamos a encriptar es: " + new String(lectura));
        
        byte[] encriptado = desCipher.doFinal(lectura);//Lo Cifro
        
        System.out.println("El mensaje encriptado es " + new String(encriptado));// Muestro mensaje
        
            System.out.println("Donde quieres guardar el mensaje en que fichero");
            String direccionCrypt = sc.nextLine();//direccion del fichero donde se guardara el mensaje
            File fcipher = new File(direccionCrypt);// abro fichero
            FileOutputStream escritor = new FileOutputStream(fcipher,true);// anre  el buffer apara la escritrura
            escritor.write(encriptado);// escribo en fichero
            escritor.close();//cierro buffer
        
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
