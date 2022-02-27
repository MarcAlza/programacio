/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

/**
 *
 * @author Alza
 */
public class DobleArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[] = new int[5];
        int array2[] = new int[5];
        int posicio = 0;

        do {
            System.out.println("Ingresa un numero enter: ");
            array[posicio] = Teclat.llegirInt();
            posicio++;
        } while (posicio < 5);
        
        System.out.println("---------------------------------------------");
        
        for (int i = 4; i >= 0; i--) {
            
            System.out.println(array[i]);
        }

    }

}
