package ArbolBinario.ArbolCadena;

import ArbolBinario.Nodo;

public class ArbolCadena {
    //nodo root
    private NodoCadena raiz;
    public ArbolCadena() {
        this.raiz = null;
    }

    public void insertar(String dato){
        if (this.raiz == null){
            this.raiz = new NodoCadena(dato);
        } else {
            this.insertar(this.raiz.GetSubarbolDcho(), dato);
        }
    }

    private void insertar(Nodo padre, String dato){
        if (dato.compareTo(dato) > 0){
            if(padre.GetSubarbolIzdo() == null){
                padre.SetRamaIzdo(new Nodo(dato));
            }else {
                insertar(padre.GetSubarbolIzdo(), dato);
            }
        }else if(dato.compareTo(dato) < 0){
            if(padre.GetSubarbolDcho() == null){
                padre.SetRamaDcho(new Nodo(dato));
            } else {
                insertar(padre.GetSubarbolDcho(), dato);
            }
        }
    }
}
