package proyecto.datos.pkg2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gestor {

    Grafo grafo;
    int[][] adyacencia;

    public Gestor() {

        adyacencia = new int[30][30];
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 30; j++) {
                adyacencia[i][j] = 0;
            }
        }

        grafo = new Grafo();
        //Nodos
        grafo.ingresarNodo("1");
        grafo.ingresarNodo("2");
        grafo.ingresarNodo("3");
        grafo.ingresarNodo("4");
        grafo.ingresarNodo("5");
        grafo.ingresarNodo("6");
        grafo.ingresarNodo("7");
        grafo.ingresarNodo("8");
        grafo.ingresarNodo("9");
        grafo.ingresarNodo("10");
        grafo.ingresarNodo("11");
        grafo.ingresarNodo("12");
        grafo.ingresarNodo("13");
        grafo.ingresarNodo("14");
        grafo.ingresarNodo("15");
        grafo.ingresarNodo("16");
        grafo.ingresarNodo("17");
        grafo.ingresarNodo("18");
        grafo.ingresarNodo("19");
        grafo.ingresarNodo("20");
        grafo.ingresarNodo("21");
        grafo.ingresarNodo("22");
        grafo.ingresarNodo("23");
        grafo.ingresarNodo("24");
        grafo.ingresarNodo("25");
        grafo.ingresarNodo("26");
        grafo.ingresarNodo("27");
        grafo.ingresarNodo("28");
        grafo.ingresarNodo("29");
        grafo.ingresarNodo("30");

        //Enlaces
        //1
        grafo.adicionarEnlace("1", "2", 1);
        grafo.adicionarEnlace("1", "10", 1);
        //2
        grafo.adicionarEnlace("2", "1", 1);
        grafo.adicionarEnlace("2", "3", 1);
        grafo.adicionarEnlace("2", "11", 3);
        grafo.adicionarEnlace("2", "12", 4);
        grafo.adicionarEnlace("2", "26", 4);
        //3
        grafo.adicionarEnlace("3", "2", 1);
        grafo.adicionarEnlace("3", "25", 2);
        //4
        grafo.adicionarEnlace("4", "25", 2);
        grafo.adicionarEnlace("4", "24", 1);
        grafo.adicionarEnlace("4", "8", 1);
        //5
        grafo.adicionarEnlace("5", "7", 8);
        grafo.adicionarEnlace("5", "8", 1);
        grafo.adicionarEnlace("5", "9", 3);
        //6
        grafo.adicionarEnlace("6", "7", 10);
        grafo.adicionarEnlace("6", "8", 1);
        //7
        grafo.adicionarEnlace("7", "5", 8);
        grafo.adicionarEnlace("7", "9", 7);
        grafo.adicionarEnlace("7", "23", 3);
        //8
        grafo.adicionarEnlace("8", "4", 1);
        grafo.adicionarEnlace("8", "5", 1);
        grafo.adicionarEnlace("8", "6", 1);
        grafo.adicionarEnlace("8", "9", 1);
        //9
        grafo.adicionarEnlace("9", "5", 3);
        grafo.adicionarEnlace("9", "7", 7);
        grafo.adicionarEnlace("9", "8", 1);
        grafo.adicionarEnlace("9", "24", 1);
        //10
        grafo.adicionarEnlace("10", "1", 1);
        grafo.adicionarEnlace("10", "23", 1);
        //11
        grafo.adicionarEnlace("11", "2", 3);
        grafo.adicionarEnlace("11", "12", 7);
        grafo.adicionarEnlace("11", "26", 7);
        //12
        grafo.adicionarEnlace("12", "2", 4);
        grafo.adicionarEnlace("12", "11", 7);
        grafo.adicionarEnlace("12", "13", 2);
        grafo.adicionarEnlace("12", "26", 8);
        //13
        grafo.adicionarEnlace("13", "12", 2);
        grafo.adicionarEnlace("13", "14", 5);
        grafo.adicionarEnlace("13", "21", 10);
        //14
        grafo.adicionarEnlace("14", "13", 5);
        grafo.adicionarEnlace("14", "15", 7);
        grafo.adicionarEnlace("14", "17", 3);
        //15
        grafo.adicionarEnlace("15", "14", 7);
        grafo.adicionarEnlace("15", "29", 4);
        grafo.adicionarEnlace("15", "30", 1);
        //16
        grafo.adicionarEnlace("16", "27", 2);
        grafo.adicionarEnlace("16", "30", 2);
        //17
        grafo.adicionarEnlace("17", "14", 3);
        grafo.adicionarEnlace("17", "18", 5);
        grafo.adicionarEnlace("17", "20", 4);
        grafo.adicionarEnlace("17", "27", 4);
        //18
        grafo.adicionarEnlace("18", "17", 5);
        grafo.adicionarEnlace("18", "28", 4);
        //19
        grafo.adicionarEnlace("19", "28", 1);
        //20
        grafo.adicionarEnlace("20", "17", 4);
        grafo.adicionarEnlace("20", "21", 1);
        grafo.adicionarEnlace("20", "22", 1);
        //21
        grafo.adicionarEnlace("21", "12", 10);
        grafo.adicionarEnlace("21", "13", 10);
        grafo.adicionarEnlace("21", "20", 1);
        //22
        grafo.adicionarEnlace("22", "20", 1);
        //23
        grafo.adicionarEnlace("23", "7", 3);
        grafo.adicionarEnlace("23", "10", 1);
        //24
        grafo.adicionarEnlace("24", "4", 1);
        grafo.adicionarEnlace("24", "9", 1);
        //25
        grafo.adicionarEnlace("25", "3", 2);
        grafo.adicionarEnlace("25", "4", 2);
        //26
        grafo.adicionarEnlace("26", "2", 4);
        grafo.adicionarEnlace("26", "11", 7);
        grafo.adicionarEnlace("26", "12", 8);
        //27
        grafo.adicionarEnlace("27", "14", 3);
        grafo.adicionarEnlace("27", "16", 2);
        grafo.adicionarEnlace("27", "17", 4);
        //28
        grafo.adicionarEnlace("28", "18", 4);
        grafo.adicionarEnlace("28", "19", 1);
        //29
        grafo.adicionarEnlace("29", "15", 4);
        grafo.adicionarEnlace("29", "30", 3);
        //30
        grafo.adicionarEnlace("30", "15", 1);
        grafo.adicionarEnlace("30", "29", 3);

        ArrayList<Arco> aux = grafo.getAristas();
        for (Arco temp : aux) {
            adyacencia[Integer.parseInt(temp.getInicial()) - 1][Integer.parseInt(temp.getTerminal()) - 1] = temp.getPeso();
        }

    }

    public String[] ir(String desde, String hasta) {
        String[] ruta = new String[31];
        String[] visitados = new String[31];
        int distancia = 0;
        boolean enRuta = true;
        Nodo aux = grafo.getNodo(desde);
        int menor;

        for (int i = 0; i < 30; i++) {
            ruta[i] = "INF";
            visitados[i] = "INF";
        }
        ruta[0] = visitados[0] = aux.getNombre();
        for (int i = 1; enRuta; i++) {
            menor = 100;
            ArrayList<Enlace> enlances = aux.getEnlaces();
            for (Enlace temp : enlances) {
                if (temp.getPeso() < menor && !(Arrays.asList(visitados).contains(temp.getDestino()))) {
                    aux = grafo.getNodo(temp.getDestino());
                    distancia += temp.getPeso();
                    menor = temp.getPeso();
                }
            }

            ruta[i] = visitados[i] = aux.getNombre();

            if (aux.getNombre().equals(hasta)) {
                enRuta = false;
            }
        }
        ruta[30] = Integer.toString(distancia);
        return ruta;
    }

    int minDistance(int distancias[], Boolean sptSet[]) {

        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < 30; v++) {
            if (sptSet[v] == false && distancias[v] <= min) {
                min = distancias[v];
                min_index = v;
            }
        }

        return min_index;
    }

    public String dijkstra(int src, int dest) {
        int distancias[] = new int[30];
        Boolean sptSet[] = new Boolean[30];
        int ruta[] = new int[30];

        for (int i = 0; i < 30; i++) {
            ruta[src] = -1;
            distancias[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        distancias[src] = 0;

        for (int count = 0; count < 30 - 1; count++) {
            int u = minDistance(distancias, sptSet);
            sptSet[u] = true;
            for (int v = 0; v < 30; v++) {
                if (!sptSet[v] && adyacencia[u][v] != 0 && distancias[u] != Integer.MAX_VALUE && distancias[u] + adyacencia[u][v] < distancias[v]) {
                    distancias[v] = distancias[u] + adyacencia[u][v];
                    ruta[v] = u;
                }
            }
        }
        String result = imprimirCaminos(distancias, (src + 1), ruta, dest);
        String resultado = "La distancia desde " + (src + 1) + " hasta " + (dest + 1) + " es: " + distancias[dest] + ".\nEl camino es: " + (src + 1) + " - " + result + ".";
        return resultado;
    }

    void impimir(int parent[], int j, List<String> resultado) {
        if (parent[j] == -1) {
            return;
        }
        impimir(parent, parent[j], resultado);
        resultado.add((j + 1) + " ");
    }

    String imprimirCaminos(int dist[], int src, int parent[], int dest) {
        List<String> resultado = new ArrayList<String>();
        for (int i = 0; i < 30; i++) {
            impimir(parent, i, resultado);
            resultado.add("@");
        }
        int cuenta = 0;
        int index = 0;
        for (; cuenta < dest; index++) {
            if (resultado.get(index).equals("@")) {
                cuenta++;
            }
        }
        String result = " ";
        for (; !(resultado.get(index).equals("@")); index++) {
            result += resultado.get(index) + " - ";
        }
        result = result.substring(0, result.length() - 2);
        return result;
    }

}
