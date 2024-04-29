package matrices;

public class Prueba_matriz {
    public static void main(String[]args){
        Prueba_matriz p = new Prueba_matriz();

    }
    public Prueba_matriz(){

        int[][]matriz = new int[3][5];

        for(int i=0;i<3;i++){
            for(int x=0;x<5;x++){
                matriz[i][x] = x;
            }
        }
        for(int j=0;j<3;j++){
            for(int x=0;x<5;x++){
                System.out.print(matriz[j][x]+" ");
            }
            System.out.println(" ");
        }

    }
}
