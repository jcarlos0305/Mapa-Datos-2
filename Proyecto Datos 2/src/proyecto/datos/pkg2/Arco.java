package proyecto.datos.pkg2;

public class Arco {

    private String inicial;
    private String terminal;
    private int peso;

    public Arco(String ini, String ter, int pes) {
        inicial = ini;
        terminal = ter;
        peso = pes;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getInicial() {
        return inicial;
    }

    public void setInicial(String inicial) {
        this.inicial = inicial;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String toString() {
        return "(" + inicial + ", " + terminal + ", " + peso + ")";
    }
}
