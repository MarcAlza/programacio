/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.text.DecimalFormat;

/**
 *
 * @author Alza
 */
public class Alumnes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float notes[] = new float[5];
        int contador = 0;
        int posicio = 0;
        float mitjana = 0;
        float mitjanaFinal;
        final int totalNotes = 5;
        float mayor = 0;

        do {
            System.out.println("Notes");
            notes[posicio] = Teclat.llegirFloat();
            if (notes[posicio] < 0 || notes[posicio] > 10) {
                System.out.println("Nota no valida");

            } else {
                contador++;
                posicio++;
            }

        } while (contador < 5);
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] > mayor) {
                mayor = notes[i];
            }
        }
        for (int i = 0; i < notes.length; i++) {
            mitjana = mitjana + notes[i];
        }

        mitjanaFinal = mitjana / totalNotes;
        DecimalFormat df = new DecimalFormat("#.#");
        System.out.println("La nota mitja de la classe es: " + df.format(mitjanaFinal));
        System.out.println("La nota mes gran es un " + df.format(mayor));

    }

}
