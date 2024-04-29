package matrices;

/*Crear una clase con un vector de 100 elementos enteros. Almacenar valores aleatorios
comprendidos entre 1 y 10. Imprimir el vector y mostrar la cantidad de elementos que tienen
almacenado el valor 10*/

public class Ejercicio_uno {

    int [] numeros;
    int suma;
    public static void main(String[]args){

        Ejercicio_uno e =new Ejercicio_uno();
        e.imprimir();
        e.iguales();
    }

    public Ejercicio_uno(){
        numeros = new int[100];

        int suma=0;

        for (int i=0;i<numeros.length;i++){
            numeros[i] = 1 + (int) (Math.random() * 10);
        }


    }

    public void imprimir(){

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "-");
        }

    }

    public void iguales(){
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]==10){
                suma ++;
            }
        }
        System.out.println("");
        System.out.println("Numeros iguales a 10: "+suma);
    }
}
