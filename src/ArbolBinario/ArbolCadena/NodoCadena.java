package ArbolBinario.ArbolCadena;

import umg.demostracion.ArbolBinario.Nodo;

public class NodoCadena {
    protected String dato;
    protected NodoCadena izdo;
    protected NodoCadena dcho;

    //primer constructor
    public NodoCadena(String valor){
        dato = valor;
        izdo = null;
    }

    //segundo constructor
    public NodoCadena(NodoCadena ramaIzdo, String valor, NodoCadena ramadcho){
        dato = valor;
        izdo = ramaIzdo;
        dcho = ramadcho;
    }

    //accesos
    public String valorNodoCadena(){
        return dato;
    }

    public NodoCadena GetSubarbolIzdo(){
        return izdo;
    }

    public Nodo GetSubarbolDcho(){
        return dcho.GetSubarbolDcho();
    }

    public void SetRamaIzdo(NodoCadena n){
        izdo = n;
    }

    public void SetRamaDcho(NodoCadena n){
        dcho = n;
    }

    public void imprimirDato(){
        System.out.println(this.valorNodoCadena());
    }
}
