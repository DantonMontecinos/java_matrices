package matrices;
/*
1 –Se pide crear una matriz de 4×4 de números enteros.
a) Rellenar la matriz con valores aleatorios comprendidos entre 1 y 9.
b) Sumar la diagonal principal.
x - - -
- x - -
- - x -
- - - x
c) Sumar la diagonal secundaria.
- - - x
- - x -
- x - -
x - - -
d) Suma de una fila que debe llegar como parámetro al método.
e) Calcular el promedio de todos sus elementos la matriz*/

import java.util.Scanner;

public class Ejercicio_matriz {
    int [][]numeros;
     public Ejercicio_matriz(){
         numeros=new int[4][4];

         for(int i=0;i<4;i++){
             for (int x=0;x<4;x++){
                 numeros[i][x]= (int) (Math.random() * 9);
                 ;

             }
         }
     }
     public void getMatriz(){
         for(int i=0;i<4;i++){
             for (int x=0;x<4;x++){
                 System.out.print(numeros[i][x]+" ");

             }
             System.out.println(" ");
         }

     }
     public void sumarDiagonalPrincipal(){
         int suma=0;
         for(int i=0;i<4;i++){
             for (int x=0;x<4;x++){
                 if(i==x){
                     suma = suma+numeros[i][x];
                 }

             }
         }
         System.out.println("Suma primer diagonal: "+suma);
     }
     public void sumarDiagonalSec(){
         int suma=0;
         for(int i=4;i>=0;i--){
             for (int x=0;x<4;x++){
                    if(i+x==3){
                        suma = suma+numeros[i][x];
                    }
             }

         }
         System.out.println("suma segunda diagonal: "+suma);

     }




    public void sumarFila(int nroFila ){

        Scanner entrada = new Scanner(System.in);
        nroFila = entrada.nextInt();
        nroFila = nroFila-1;
        int  suma=0;
        for(int i=0;i<4;i++){
            suma=suma+numeros[nroFila][i];
        }
        System.out.println("La suma de la fila es: "+suma);
    }



     public static void main(String[]args){
         Ejercicio_matriz e = new Ejercicio_matriz();
         e.getMatriz();
         e.sumarDiagonalPrincipal();
         e.sumarDiagonalSec();
         System.out.println("Elegir fila que desea sumar: 1, 2, 3 o 4 : ");
         e.sumarFila(2);




     }


}