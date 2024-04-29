package matrices;
import java.util.*;
/*Problemas propuestos
1 - Desarrollar un programa que permita ingresar un vector de 4 elementos de tipo
int, e implemente los siguientes métodos:
a) El constructor donde creamos el vector.
b) Un método para cargar sus componentes.
– Algoritmos y Estructuras de Datos II –
c) Calcular el valor acumulado de todos los elementos del vector.
d) Cantidad de valores mayores a 50.*/
public class Ejercicio_tres {
    int [] vector;
    int total,mayores;
    Scanner entrada;
    public static void main(String[]args){

        Ejercicio_tres e = new Ejercicio_tres();
        e.cargar();
        e.mostrar();

    }

    public Ejercicio_tres(){
        vector = new int[4];


    }
    public void cargar(){
        System.out.println("Ingresar: "+vector.length+" elementos");
        entrada = new Scanner(System.in);
        for (int i=0;i<vector.length;i++){
            vector[i]=entrada.nextInt();
        }

    }
    public void mostrar(){
        for (int i=0;i<vector.length;i++){
            System.out.print(vector[i]+" ");
        }
        for (int x=0;x<vector.length;x++){
            total = total+vector[x];
        }
        System.out.println("El total acomulado: "+total);
        for (int j=0;j<vector.length;j++){
            if(vector[j]>50){
                mayores++;
            }
        }
        System.out.println("Mayores a 50: "+mayores);
    }
}
