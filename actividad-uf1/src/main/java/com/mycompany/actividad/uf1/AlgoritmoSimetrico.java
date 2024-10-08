/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.actividad.uf1;
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
public class AlgoritmoSimetrico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in); // Lectura de teclado

        try {
            // 1. Genero la clave simétrica
            KeyGenerator keygen = KeyGenerator.getInstance("AES");
            SecretKey clave = keygen.generateKey(); // 2. Aplico la opacidad a la clave
            Cipher aesCipher = Cipher.getInstance("AES"); // 3. Activo el cifrador

            int opcion;
            do {
                System.out.println("Selecciona una opcion: ");
                System.out.println("1. Cifrar");
                System.out.println("2. Descifrar");
                System.out.println("3. Salir");
                opcion = lector.nextInt();
                lector.nextLine(); // Consumir el salto de línea después de leer el entero

                switch (opcion) {
                    case 1:
                        // a. Opción 1.Cifrar
                        System.out.println("Introduce el nombre del fichero a cifrar (ej: fichero1.txt):");
                        String nombreFichero = lector.nextLine();
                        Path ficheroAleer = Paths.get(nombreFichero); // Pedimos el nombre del fichero

                        // Leer el contenido del fichero
                        byte[] lectura = Files.readAllBytes(ficheroAleer);
                        System.out.println("El mensaje que vamos a encriptar es: " + new String(lectura));

                        // Combinamos el cifrador con la clave creada
                        aesCipher.init(Cipher.ENCRYPT_MODE, clave);

                        // Encriptamos la cadena
                        byte[] encriptado = aesCipher.doFinal(lectura);

                        // Pedimos al usuario el nombre del fichero nuevo para guardar (fichero2.txt)
                        System.out.println("Introduce el nombre del fichero para guardar el mensaje encriptado (ej: fichero2.txt):");
                        String nombreFicheroEncriptado = lector.nextLine();

                        // Guardamos en el fichero la cadena encriptada
                        File fCipher = new File(nombreFicheroEncriptado);
                        FileOutputStream escritor = new FileOutputStream(fCipher);
                        escritor.write(encriptado);
                        escritor.close();

                        System.out.println("Mensaje encriptado guardado en " + nombreFicheroEncriptado);
                        break;

                    case 2:
                        // b. Opción 2.Descifrar
                        System.out.println("Introduce el nombre del fichero a descifrar (ej: fichero2.txt):");
                        String nombreFicheroDescifrar = lector.nextLine();
                        Path ficheroEncriptado = Paths.get(nombreFicheroDescifrar);

                        // Leer contenido cifrado del fichero
                        byte[] lecturaCifrada = Files.readAllBytes(ficheroEncriptado);

                        // Activamos el modo descifrado con la llave
                        aesCipher.init(Cipher.DECRYPT_MODE, clave);

                        // Desencriptamos la cadena
                        byte[] desencriptado = aesCipher.doFinal(lecturaCifrada);

                        // Mostramos la cadena desencriptada
                        System.out.println("El mensaje desencriptado es: " + new String(desencriptado));
                        break;

                    case 3:
                        // c. Opción 3. Salir del bucle
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                        break;
                }

            } while (opcion != 3); // El bucle continúa hasta que se elige "Salir"

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}