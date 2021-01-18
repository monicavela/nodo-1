package nodouno;
import java.util.Scanner;
public class nodo {

    Scanner sc = new Scanner(System.in);
    String dato;
    nodo sig;
    nodo fin = null;


    public void agregar() {
        nodo temp;
        String msg;
        System.out.println("agregar el dato ");
        if (fin == null) {
        fin = new nodo();
        fin.dato = sc.nextLine();
        fin.sig = null;
        } else {
        temp = new nodo();
        temp.dato = sc.nextLine();
        temp.sig = fin;
        fin = temp;
        }
        }

    public void mostrar() {
        nodo actual = new nodo();
        actual = fin;
        if (fin != null) {
        while (actual != null) {
        System.out.print(" DATO " + "[" + actual.dato + "]");
        actual = actual.sig;
        }
        } else {
        System.out.println("\n La lista se encuentra vacia\n");
        }
        }

    public void eliminar(){
        System.out.println("El dato se elimino correctamente: "+fin.dato);
        fin = fin.sig;
    }
    }