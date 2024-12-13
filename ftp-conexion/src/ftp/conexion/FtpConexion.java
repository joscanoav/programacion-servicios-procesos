/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ftp.conexion;

import org.apache.commons.net.ftp.*;
import java.io.*;
/**
 *
 * @author josca
 */


public class FtpConexion {
    public static void main(String[] args) {
        // Datos del servidor FTP
        String servidor = "demo.wftpserver.com";
        int puerto = 21; // Puerto estándar de FTP
        String usuario = "demo";
        String password = "demo";

        // Inicialización del cliente FTP
        FTPClient clienteFtp = new FTPClient();

        try {
            // 1) Conexión al servidor
            clienteFtp.connect(servidor, puerto);
            int respuesta = clienteFtp.getReplyCode();

            if (!FTPReply.isPositiveCompletion(respuesta)) {
                System.out.println("Error al conectar con el servidor: " + respuesta);
                return;
            }

            System.out.println("Conexion establecida con exito.");

            // 2) Login al servidor
            boolean loginSatisfactorio = clienteFtp.login(usuario, password);

            if (!loginSatisfactorio) {
                System.out.println("Error al iniciar sesion.");
                return;
            }
            System.out.println("Inicio de sesion correcto.");

            // 3) Listar archivos
            // Listar archivos en la raíz
            System.out.println("Archivos en la raiz:");
            FTPFile[] archivosRaiz = clienteFtp.listFiles();
            for (FTPFile archivo : archivosRaiz) {
                System.out.println("- " + archivo.getName());
            }

            // 4) Listar archivos en /download
            System.out.println("Archivos en /download:");
            FTPFile[] archivosDownload = clienteFtp.listFiles("/download");
            for (FTPFile archivo : archivosDownload) {
                System.out.println("- " + archivo.getName());
            }

            // 5) Descargar un archivo de /download
            String archivoDescargar = "/download/version.txt"; // Cambia según el archivo disponible
            FileOutputStream fos = new FileOutputStream("version.txt");
            boolean descargado = clienteFtp.retrieveFile(archivoDescargar, fos);
            fos.close();
            if (descargado) {
                System.out.println("Archivo descargado con exito.");
            } else {
                System.out.println("Error al descargar el archivo.");
            }

            // 6) Subir un archivo a /upload
            File archivoSubir = new File("archivo.doc");
            FileWriter writer = new FileWriter(archivoSubir);
            writer.write("Este es un archivo de prueba para subir al servidor FTP.");
            writer.close();

            FileInputStream fis = new FileInputStream(archivoSubir);
            boolean subido = clienteFtp.storeFile("/upload/archivo2.doc", fis);
            fis.close();

            if (subido) {
                System.out.println("Archivo subido con exito.");
            } else {
                System.out.println("Error al subir el archivo.");
            }

            // 7) Desconexión del servidor
            clienteFtp.logout();
            clienteFtp.disconnect();
            System.out.println("Desconexion exitosa.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
