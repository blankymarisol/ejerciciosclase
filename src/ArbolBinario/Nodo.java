package ArbolBinario;

public class Nodo {

    protected int dato;
    protected Nodo izdo;
    protected  Nodo dcho;

    //primer constructor
    public Nodo(int valor){
        dato = valor;
        izdo = null;
    }

    //segundo constructor
    public Nodo(Nodo ramaIzdo, int valor, Nodo ramadcho){
        dato = valor;
        izdo = ramaIzdo;
        dcho = ramadcho;
    }

    public Nodo(String dato) {
    }

    //accesos
    public int valorNodo(){
        return dato;
    }

    public Nodo GetSubarbolIzdo(){
        return izdo;
    }

    public Nodo GetSubarbolDcho(){
        return dcho;
    }

    public void SetRamaIzdo(Nodo n){
        izdo = n;
    }

    public void SetRamaDcho(Nodo n){
        dcho = n;
    }

    public void imprimirDato(){
        System.out.println(this.valorNodo());
    }
}
