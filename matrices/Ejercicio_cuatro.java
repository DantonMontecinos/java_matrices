package matrices;
import java.util.*;
/*2 - Definir un vector de 5 componentes de tipo float que representen las alturas de
5 personas.
Implementar los siguientes métodos:
- Obtener el promedio de las alturas.
- Contar cuántas personas son más altas que el promedio y cuántas más bajas.
*/
public class Ejercicio_cuatro {
    float [] alturas = new float[5];
    float promedio,suma;
    int altas,bajas;
    Scanner entrada;
    public Ejercicio_cuatro(){
        entrada =new Scanner(System.in);
        System.out.println("Ingresar alturas: ");
        for (int i=0;i< alturas.length;i++){
            alturas[i]=entrada.nextFloat();
        }

    }
    public void getPromedio(){
        suma=0;
        for (int i=0;i< alturas.length;i++){
            suma = suma+alturas[i];
        }
        promedio = suma/alturas.length;
        System.out.println("El promedio de altura es: "+promedio);
    }
    public static void main(String[]args){
        Ejercicio_cuatro e = new Ejercicio_cuatro();
        e.getPromedio();
        e.getMenorMayor();
    }
    public void getMenorMayor(){
        for (int i=0;i< alturas.length;i++){
            if (alturas[i]>promedio){
                altas++;
            }if (alturas[i]<promedio){
                bajas++;
            }
        }
        System.out.println("Personas mayor promedio: "+altas+". Perosnas bajas promedio: "+bajas);
    }

}
