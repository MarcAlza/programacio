/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

/**
 *
 * @author Alza
 */
public class SumaArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int array1[] = new int[5];
        int array2[] = new int[8];
        int array3[] = new int[13];
        int posicio1=0;
        int posicio2=0;

        array1[0] = 1;
        array1[1] = 3;
        array1[2] = 5;
        array1[3] = 7;
        array1[4] = 9;

        array2[0] = 0;
        array2[1] = 2;
        array2[2] = 4;
        array2[3] = 8;
        array2[4] = 6;
        array2[5] = 10;
        array2[6] = 12;
        array2[7] = 14;
        
        for (int i = 0; i < 5; i++) {
            array3[i]=array1[posicio1];
            posicio1++;
            System.out.println(array3[i]);
        }
        for (int a = 5; a < 13; a++) {
            array3[a]=array2[posicio2];
            posicio2++;
            System.out.println(array3[a]);
        }
        
     
        
        }

    }


