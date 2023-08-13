
package metodoburbuja;

import java.util.Scanner;

public class MetodoBurbuja {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamaño;
        System.out.println("Ingrese el tamaño del arreglo: ");
        tamaño = teclado.nextInt();
        int numeros[] = new int[tamaño]; //arreglo
        
        System.out.println("Ingrese los " + tamaño + " numeros enteros: ");
        
        for(int i = 0; i < tamaño; i++){
            numeros[i] = teclado.nextInt(); //llenado arreglo
        }
        //ordenar numeros menor a mayor
        int aux = 0;
        for (int i = 0; i < tamaño; i++){  //j = 0
            
            for (int j = 0; j < tamaño - 1; j++){ // i = 0  evitar analizar la ultima pocion vacia
                if(numeros[j] > numeros[j + 1]){
                    aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                }
            }
        }
        //datos
        System.out.println("Numeros ordenados menor a mayor");
        for (int i = 0; i < tamaño; i++){
            System.out.println(numeros[i]);
        }  
    }
}
