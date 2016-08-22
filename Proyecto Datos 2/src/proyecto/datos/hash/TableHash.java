/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.datos.hash;
/**
 *
 * @author tonyx
 */
public class TableHash {

    private static final int MAX = 30;

    private static TableHash instance = null;
    private ValuesHash[] arrayValues = new ValuesHash[MAX];

    private TableHash() {
        for (int i = 0; i < MAX; i++) {
            arrayValues[i] = new ValuesHash("");
            arrayValues[i] = null;
        }
    }

    public static TableHash getInstance() {
        if (instance == null) {
            instance = new TableHash();
        }
        return instance;
    }

    public int HashAndHashing(String key) {
        int value = Hash(key);
        value = Hashing(value);

        return value;
    }

    public void addValueAux(String name, String node) {
        int index = 0;
        index = HashAndHashing(name);
        addValue(index, new ValuesHash(node));

    }

    public void addValue(int index, ValuesHash value) {

        if (arrayValues[index] == null) {
            arrayValues[index] = value;
        } else {
            ValuesHash aux = arrayValues[index];

            while (aux.getM_sig() != null) {
                aux = aux.getM_sig();
            }

            aux.setM_sig(value);
        }
    }

    public String getValue(int index) {
        ValuesHash aux = arrayValues[index];
        String tmp = "";
        if (aux != null) {
            tmp = aux.getNode();
            while (aux != null && aux.getM_sig() != null) {
                if (tmp != aux.getM_sig().getNode()) {
                    tmp = tmp + ", " + aux.getM_sig().getNode();
                }
                aux = aux.getM_sig();
            }
        }else{
            tmp = "No existe esa dirección";
        }
        return tmp;
    }

    public int Hashing(int num) {
        return (num % (MAX - 1));
    }

    public int Hash(String chain) {
        int hash = 0;
        for (int i = 0; i < chain.length(); i++) {
            hash = hash + chain.charAt(i);
        }
        return (hash % 13);

    }
}
