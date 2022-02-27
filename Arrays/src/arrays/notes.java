/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

/**
 *
 * @author Alza
 */
public class notes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int notes[] = new int[30];
        int contadores[]= new int[10];
        int posicio = 0;
        int contador = 0;
        int contador2=0;
        int aux=notes[0];

        do {
            System.out.println("Introduiex la nota: ");
            notes[posicio] = Teclat.llegirInt();
            posicio++;
            contador++;
        } while (notes[posicio - 1] >= 0 && notes[posicio - 1] <= 10 && contador < 30);
        
        for (int i = 0; i < contador; i++) {
            contadores[notes[i]]+=1;
        }
        for (int a = 0; a < contadores.length; a++) {
            System.out.println("La nota " + a +" es repeteix: "+ contadores [a] + " cops");
        }
        
    }

}
