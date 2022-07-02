public class Corbeta extends Barco{

    private Integer cantJaulas;
    private Integer kgXjaula;
    private Boolean estaPescando;
    private static Double totalCorbetas = 0.0;


    public Corbeta(String marca, String modelo, Integer capCombustible, Integer capCarga, Integer kgXjaula) {
        super(marca, modelo, capCombustible, capCarga);
        this.cantJaulas = 0;
        this.kgXjaula = 10;
    }


    @Override
    public Double pescar(Integer cantJaulas){
            this.cantJaulas=cantJaulas;
            Double rta = (double)this.kgXjaula*(double)this.cantJaulas*super.getPrecioMerluza();
            setTotalCorbetas(rta);
            setTotalBarco(rta);
            return rta;
    }

    private static void setTotalCorbetas(Double rta) {
        Corbeta.totalCorbetas += rta;
    }

    public static Double getTotalCorbetas() {
        return totalCorbetas;
    }

    @Override
    public String toString() {
        return "Corbeta{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capCombustible=" + capCombustible +
                ", capCarga=" + capCarga +
                ", id=" + id +
                ", precioMerluza=" + precioMerluza +
                ", cantJaulas=" + cantJaulas +
                ", kgXjaula=" + kgXjaula +
                ", estaPescando=" + estaPescando +
                '}';
    }
}
