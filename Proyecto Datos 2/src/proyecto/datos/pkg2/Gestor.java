package proyecto.datos.pkg2;

public class Gestor {
    public Gestor(){
        Grafo grafo = new Grafo();
        grafo.ingresarNodo("1");
        grafo.ingresarNodo("2");
        grafo.adicionarEnlace("1", "2", 1);
        
    }
}
