package org.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {
    //Subir archivo local
    String archivo ;

    public String getArchivo(String archivo) throws IOException {
        this.archivo = archivo;
        BufferedReader br = new BufferedReader(new FileReader(archivo));
        String numeroDelArchivo = br.readLine();
        br.close();
        return numeroDelArchivo;
    }
}
