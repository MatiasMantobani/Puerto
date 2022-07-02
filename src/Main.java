import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println();

        //main
//        ArrayList<Barco> barcos = new ArrayList<>();

        Lancha lancha1 = new Lancha("Yamaha","Speed",1000,2000,20);
        System.out.println(lancha1);
        System.out.println(lancha1.pescar(10));
        System.out.println(lancha1.pescar(5));
        System.out.println();

        Corbeta corbeta1 = new Corbeta("Pluton","Draft",1000,2000,10);
        System.out.println(corbeta1);
        System.out.println(corbeta1.pescar(10));
        System.out.println(corbeta1.pescar(3));
        System.out.println();

        System.out.println("Total Lanchas : "+Lancha.getTotalLanchas());    //total lanchas
        System.out.println("Total Corbetas : "+Corbeta.getTotalCorbetas()); //total corbetas
        System.out.println("Total General : "+Barco.getTotalBarco());       //total general



//        barcos.add(lancha1);
//        System.out.println(barcos);



    }
}
