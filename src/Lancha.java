public class Lancha extends Barco{

    private Integer kgXhs;
    private Boolean estaPescando;
    private static Double totalLanchas = 0.0;


    public Lancha(String marca, String modelo, Integer capCombustible, Integer capCarga, Integer kilosXhora) {
        super(marca, modelo, capCombustible, capCarga);
        this.kgXhs = kilosXhora;
        this.estaPescando = false;
    }


    @Override
    public Double pescar(Integer hs) {
            Double rta = (double)this.kgXhs * (double) hs * super.getPrecioMerluza();
            setTotalLanchas(rta);
            setTotalBarco(rta);
            return rta;
    }

    private static void setTotalLanchas(Double rta) {
        totalLanchas += rta;
    }


    public static Double getTotalLanchas() {
        return Lancha.totalLanchas;
    }





    @Override
    public String toString() {
        return "Lancha{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capCombustible=" + capCombustible +
                ", capCarga=" + capCarga +
                ", id=" + id +
                ", precioMerluza=" + precioMerluza +
                ", kgXhs=" + kgXhs +
                ", estaPescando=" + estaPescando +
                '}';
    }
}
