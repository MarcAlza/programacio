/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author cep
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int prova[] = new int[8]; //Creem un array i li donem nom. (new int, per la capacitat del array)
        int numero;
        int posicio=0;

        for (int a = 0; a < prova.length; a++) {
            System.out.print("Indica un numero: ");
            prova[a] = Teclat.llegirInt();
        }

         for (int i = 0; i < prova.length; i++) {
             if (posicio == 0 || posicio == 2 || posicio == 4 || posicio == 6 || posicio == 8) {
                 prova[i] = prova[i]*2;
             } else {
                 prova [i] = prova[i]*3;
             }
             posicio++;
             System.out.println(prova[i]);
         }  
        }
    }


