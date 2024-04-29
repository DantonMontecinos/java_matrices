package matrices;
import java.util.*;
import java.math.*;
/*4 – Crear un vector de n elementos de tipo entero. Cargar valores aleatorios
comprendidos entre 1 y 100.
Implementar dos métodos, uno que imprima el mayor valor y otro el menor valor
del vector.*/
public class Ejercicio_seis {
    Scanner entrada;
    int cantidad;
    int [] numeros;
    public Ejercicio_seis(){
        entrada = new Scanner(System.in);
        System.out.println("Ingresar canitdad numeros del array: ");
        cantidad = entrada.nextInt();
        numeros = new int[cantidad];

        for(int i=0;i<numeros.length;i++){
            numeros[i] = (int) (Math.random() * 100);
        }

    }
    public void getArray(){
        for(int i=0;i<numeros.length;i++){
            System.out.print(numeros[i]+" ");
        }
        System.out.println(" ");
    }
    public void getMayor(){
        int mayor=0;
        mayor=numeros[0];
        for(int i=0;i<numeros.length;i++){


            if(numeros[i]>mayor){
                mayor=numeros[i];
            }
        }
        System.out.println("el mayor es: "+mayor);
    }
    public void getMenor(){
        int menor=0;
        menor=numeros[0];
        for(int i=0;i<numeros.length;i++){

            if(numeros[i]<menor){
                menor=numeros[i];
            }
        }
        System.out.println("El menor es: "+menor);
    }
    public static void main(String[]args){
        Ejercicio_seis e = new Ejercicio_seis();
        e.getArray();
        e.getMayor();

        e.getMenor();
    }

}
