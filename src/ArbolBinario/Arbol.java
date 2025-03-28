package ArbolBinario;

public class Arbol {
    //nodo root
    private Nodo raiz;
    public Arbol() {
        this.raiz = null;
    }

    public void insertar(int dato){
        if (this.raiz == null){
            this.raiz = new Nodo(dato);
        } else {
            this.insertar(this.raiz, dato);
        }
    }

    private void insertar(Nodo padre, int dato){
        if (dato < padre.valorNodo()){
            if(padre.GetSubarbolIzdo() == null){
                padre.SetRamaIzdo(new Nodo(dato));
            }else {
                insertar(padre.GetSubarbolIzdo(), dato);
            }
        }else if(dato > padre.valorNodo()){
            if(padre.GetSubarbolDcho() == null){
                padre.SetRamaDcho(new Nodo(dato));
            } else {
                insertar(padre.GetSubarbolDcho(), dato);
            }
        }
    }

    //metodo para recorrido en postorden
    public void postorden(){
        postorden(this.raiz);
    }

    public void postorden(Nodo nodo){
        if(nodo != null){
            postorden(nodo.GetSubarbolIzdo());
            postorden(nodo.GetSubarbolDcho());
            System.out.print(nodo.valorNodo() + " ");
        }
    }

    //metodo para recorrido en preorden
    public void preorden(){
        preorden(this.raiz);
    }

    public void preorden(Nodo nodo){
        if(nodo != null){
            System.out.print(nodo.valorNodo() + " ");
            postorden(nodo.GetSubarbolIzdo());
            postorden(nodo.GetSubarbolDcho());
        }
    }

    //Metodo para recorrido en inorden
    public void inorden(){
        inorden(this.raiz);
    }

    private void inorden(Nodo nodo){
        if (nodo != null){
            inorden(nodo.GetSubarbolIzdo());
            System.out.print(nodo.valorNodo() + " ");
            inorden(nodo.GetSubarbolDcho());
        }
    }
}
