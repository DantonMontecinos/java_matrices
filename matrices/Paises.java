package matrices;

public class Paises {
    String[] paises;
    int[] habitantes;
    public Paises(){

        paises = new String[]{"Argentina", "Chile", "Uruguay", "Brasil", "Colombia"};
        habitantes = new int[]{45_000_000, 19_000_000, 3_500_000, 212_000_000, 50_000_000 };
    }
    public void getMayor(){
        int pos=0;
        for (int i=0;i<habitantes.length;i++){
            if(habitantes[i]>habitantes[pos]){
                pos=i;
            }

        }
        System.out.println("El pais mmayor habitantes es: "+paises[pos]);

    }
    public static void main(String[]args){
        Paises p = new Paises();
        p.getMayor();
    }
}
