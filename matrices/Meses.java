package matrices;

/*1 	Enero 	31 días
2 	Febrero 	28 o 29 días
3 	Marzo 	31 días
4 	Abril 	30 días
5 	Mayo 	31 días
6 	Junio 	30 días*/
public class Meses {
    String[]meses;
    int[]dias;
    public static void main(String[]args){
        Meses m = new Meses();
        m.getMayorDias();

    }
    public Meses(){
        meses=new String[]{"Enero","Febrero","Marzo","Abril","MAyo","Junio"};
        dias=new int[]{31,28,31,30,31,30};
        for (int i=0;i<dias.length;i++){
            System.out.println("Mes: "+meses[i]+", Dias: "+dias[i]);
        }
        System.out.println("*******************+");
    }
    public void getMayorDias(){
        for(int i=0;i<dias.length;i++){
            int pos=0;
            if(dias[i]>=31){
                pos=i;
                System.out.println("Meses con 31 dias: "+meses[pos]);

            }
        }

    }

}
