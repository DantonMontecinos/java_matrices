package matrices;

import java.util.Scanner;

/*3 - Crear una matriz de n * m filas (cargar n y m por teclado) Intercambiar la
primer fila con la segundo. Imprimir luego la matriz.
Imprimir los cuatro valores que se encuentran en los vértices de la misma
(mat[0][0] etc.*/
public class Ejercicio_matriz_tres {

    Scanner entrada;
    int [][] matriz;
    public static void main(String[] args) {

        Ejercicio_matriz_tres e = new Ejercicio_matriz_tres();
        e.cargar(3,3);
        e.imprimir();

    }
    public void cargar(int n, int m){
        matriz = new int[n][m];
        entrada = new Scanner(System.in);

        for(int i =0;i<matriz.length;i++){
            for (int x=0;x<matriz.length;x++){
                matriz[i][x] = entrada.nextInt();
            }
        }

    }
    public void imprimir(){
        for(int n=0; n<matriz.length;n++){
            for (int m =0;m< matriz.length;m++){
                System.out.print(matriz[n][m] + " ");
            }
            System.out.println("");
        }

        System.out.println("+++++++++++++++++++++++++");
        for(int i=0; i<matriz.length;i++){
            int neutro = matriz[i][0];
            matriz[i][0] = matriz[i][1];
            matriz[i][1] = neutro;

        }
        for(int m=0; m<matriz.length;m++){
            for (int n =0;n< matriz.length;n++){
                System.out.print(matriz[m][n] + " ");
            }
            System.out.println("");
        }

    }
}
