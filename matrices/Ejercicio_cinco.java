package matrices;
import java.util.*;
/*
Crear un vector de 5 elementos de tipo entero por teclado. Implementar un
método que imprima si está ordenado de menor a mayor*/
public class Ejercicio_cinco {
    Scanner entrada;
    int [] numeros;

    public Ejercicio_cinco(){
        entrada = new Scanner(System.in);
        numeros = new int[5];
        System.out.println("Ingresar 5 numeros: ");

        for (int i =0;i<numeros.length;i++){
            numeros[i]=entrada.nextInt();

        }
        for (int i =0;i<numeros.length;i++){
            System.out.print(numeros[i]+"-");

        }

    }

    public void ordenar() {
        for (int k = 0; k < numeros.length; k++) {
            for (int f = 0; f < numeros.length - 1 - k; f++) {


                if(numeros[f]>numeros[f+1]){
                    int aux;
                    aux=numeros[f];
                    numeros[f] = numeros[f+1];
                    numeros[f+1]=aux;
                }
            }
        }
        System.out.println("--");
        for (int i =0;i<numeros.length;i++){
            System.out.print(numeros[i]+"-");

        }

    }
    public static void main(String[]args){
        Ejercicio_cinco e = new Ejercicio_cinco();
        e.ordenar();
    }
}
