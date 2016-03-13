package boletin.pkg21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author galle
 */
public class Metodos {

    ArrayList<String> frase = new ArrayList();

    public void cargarArray() {
        frase.add(JOptionPane.showInputDialog("Introduce la frase"));
    }

    public void mostrarDatos() {
        for (int i = 0; i < frase.size(); i++) {
            System.out.println(frase.get(i));
        }
    }

    public void ordenarAlfabeticamente() {
        Collections.sort(frase);
    }

    public void guardarArchivo() {
        File archivo = new File("src/boletin/pkg21/archivo.txt");
        PrintWriter escribir = null;
        try {
            escribir = new PrintWriter(archivo);
            for (int i = 0; i < frase.size(); i++) {
                escribir.println(frase.get(i));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("error escritura" + ex.getMessage());
        } finally {
            escribir.close();
        }
    }
}
