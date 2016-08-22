package proyecto.datos.pkg2;

public class Enlace {

    private String destino;
    private int peso;

    public Enlace(String desti, int peso1) {
        destino = desti;
        peso = peso1;
    }

    public Enlace(String desti) {
        destino = desti;
        peso = -1;
    }

    public void modificar(int peso1) {
        peso = peso1;
    }

    public String getDestino() {
        return destino;
    }

    public int getPeso() {
        return peso;
    }
}
