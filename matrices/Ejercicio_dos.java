package matrices;
import java.util.*;
/*Problema 3:
Crear un vector con la cantidad de elementos que ingresa el operador por teclado. Luego cargar
valores aleatorios comprendidos entre 1 y 10. Imprimir el vector*/
public class Ejercicio_dos {
    private int []numeros;
    private Scanner entrada;
    private int cantidad;

    public static void main(String[]args){

        Ejercicio_dos e = new Ejercicio_dos();
        e.cargar();
        e.mostrar();

    }
    public Ejercicio_dos(){

        entrada = new Scanner(System.in);
        System.out.println("Ingresar cantidad de elementos array: ");
        System.out.print("");
        cantidad = entrada.nextInt();
        numeros = new int[cantidad];



    }
    public void cargar(){
        for (int i=0;i<numeros.length;i++){
            numeros[i] = 1 + (int) (Math.random() * 10);
        }
    }
    public void mostrar(){
        for (int i=0;i<numeros.length;i++){
            System.out.print(numeros[i]+" ");
        }
    }

}
