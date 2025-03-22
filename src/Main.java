import ArbolBinario.Arbol;

public class Main {
    public static void main(String[] args) {
            Arbol arbol = new Arbol();
            arbol.insertar(4);
            arbol.insertar(2);
            arbol.insertar(6);
            arbol.insertar(1);
            arbol.insertar(3);
            arbol.insertar(5);
            arbol.insertar(7);

            //recorrer el arbon en preorden
            System.out.println("Recorrido en preorden");
            arbol.preorden();

            //recorrer el arbol en postorden
            System.out.println("\nRecorrido en postorden");
            arbol.postorden();

            //recorrer el arbol en inorden
            System.out.println("\nRecorrido en inorden");
            arbol.inorden();
        }
    }