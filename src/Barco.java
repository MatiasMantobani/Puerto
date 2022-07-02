public abstract class Barco {   //debe tener al menos 1 metodo abstracto

    protected String marca;
    protected String modelo;
    protected Integer capCombustible;    //en litros
    protected Integer capCarga;          //en Kg
    protected static Integer ID = 0;      //Se define aca por ser static
    protected Integer id;
    protected final double precioMerluza = 11.0;
    private static Double totalBarco = 0.0;


    public Barco(String marca, String modelo, Integer capCombustible, Integer capCarga) {
        this.marca = marca;
        this.modelo = modelo;
        this.capCombustible = capCombustible;
        this.capCarga = capCarga;
        this.id = idAutoincremental();
    }

    //metodos
    public abstract Double pescar(Integer dato);

    public static Double getTotalBarco() {
        return totalBarco;
    }

    protected static void setTotalBarco(Double total) {
        totalBarco += total;
    }

    public double getPrecioMerluza() {
        return precioMerluza;
    }

    public Integer idAutoincremental() {
        ID += 1;
        return ID;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capCombustible=" + capCombustible +
                ", capCarga=" + capCarga +
                ", id=" + id +
                '}';
    }
}
