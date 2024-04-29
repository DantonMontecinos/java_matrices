package matrices;
/*Crear una matriz de 2 filas y 5 columnas. Realizar la carga de componentes por
columna (es decir primero ingresar toda la primer columna, luego la segunda
columna y así sucesivamente, por teclado)
Imprimir luego la matriz*/

import java.util.Scanner;

public class Ejercicio_matriz_dos {
    int [][]matriz;
    public static void main(String[] args) {
        Ejercicio_matriz_dos d = new Ejercicio_matriz_dos();
        d.cargarMatriz();
        d.imprimir();
    }
    public void cargarMatriz() {
        matriz = new int[2][5];

        Scanner entrada = new Scanner(System.in);

        for (int i =0; i<5;i++){
            System.out.println("Ingresar la "+ (i+1)+" columna: ");
            for (int x =0; x<2;x++){
                matriz[x][i] = entrada.nextInt();
            }
        }
    }

    public void imprimir(){
        for (int i=0;i<2;i++){
            for(int x=0;x<5;x++){
                System.out.print(matriz[i][x]+ " ");
            }
            System.out.println("");
        }
    }

}
