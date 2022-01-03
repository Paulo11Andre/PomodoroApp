package Clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Utilidades {
    public static ArrayList<Usuario> usuarios;

    public void listaDeUsuarios() {
        BufferedReader bufferLectura = null;
        try {
            bufferLectura = new BufferedReader(new FileReader("Users info.csv"));
            String linea = bufferLectura.readLine();
            linea = bufferLectura.readLine();
            while (linea != null) {

                String[] datos = linea.split(";");

                Usuario user = new Usuario(datos[0],datos[1],datos[2],datos[3],datos[4]);
                usuarios.add(user);
                linea = bufferLectura.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (bufferLectura != null) {
                try {
                    bufferLectura.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public Utilidades(){

    }
}
