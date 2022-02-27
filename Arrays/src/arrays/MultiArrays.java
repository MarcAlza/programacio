/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

/**
 *
 * @author Alza
 */
public class MultiArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int array1[] = new int[5];
        int array2[] = new int[5];
        int array3[] = new int[5];
        int posicio1 = 0;
        int posicio2 = 0;

        do {
            System.out.println("Ingresa un numero enter per el primer array: ");
            array1[posicio1] = Teclat.llegirInt();
            posicio1++;
        } while (posicio1 < 5);
        System.out.println("--------------------------------------------------\n--------------------------------------------------");
        do {
            System.out.println("Ingresa un numero enter per el segon array: ");
            array2[posicio2] = Teclat.llegirInt();
            posicio2++;
        } while (posicio2 < 5);

        System.out.println("--------------------------------------------------\n--------------------------------------------------");

        posicio1 = 0;
        posicio2 = 4;
        for (int i = 0; i < array3.length; i++) {
            array3[i] = array1[posicio1] * array2[posicio2];
            System.out.println(array1[posicio1] + " * " + array2[posicio2] + "  = " + array3[i]);
            posicio1++;
            posicio2--;
        }

    }

}
