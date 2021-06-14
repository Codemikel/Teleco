import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Hashtable<Arbol, Persona> clientes = new Hashtable<>();
        registrarCliente(clientes);


        /*try {


            int n=2;
            do {
                System.out.println("____________________________________");
                System.out.println("Ingrese 1 para agregar una línea\n" +
                        "Ingrese 2 para buscar una línea\n"+
                        "Ingrese 3 para agregar un cliente");
                int opcion = sc.nextInt();
                clientes = new Hashtable<Nodo, Persona>();
                switch (opcion) {
                    case 1 -> {
                        System.out.println("Ingrese el número");
                        long numero = sc.nextLong();
                        A.insertarNodo(numero);
                    }
                    case 2 -> {
                        System.out.println("Busqueda de elemento");
                        long numero = sc.nextLong();
                        A.buscar(A.raiz, numero);
                    }
                    case 3 -> {
                        registrarCliente();
                    }
                    default -> System.out.println();
                }
            }while (n == 2);
        }catch (Exception e){
            System.out.println("Ingresar algo valido");
        }*/
    }

    private static void registrarCliente(Hashtable<Arbol, Persona> clientes){
        int n=2;
        try {
            Arbol A = new Arbol();
            do {
                System.out.println("Nombre");
                String name = sc.next();
                System.out.println("Documento");
                String doc = sc.next();
                System.out.println("Línea de celular");
                long num = sc.nextLong();
                //creación de objetos
                Persona andrea = new Persona(name, doc);
                Cliente cliente = new Cliente();
                //Asignando los valores
                A.insertarNodo(num);
                cliente.setPersona(andrea);
                cliente.setCelular(A);
                clientes.put(A, andrea);
                System.out.println(cliente.getPersona().getNombre());
                long d = sc.nextLong();
                A.buscar(A.raiz, d);
            }while (n==2);
        }catch (Exception e){
            System.out.println("Algo está mal");
        }

    }

}
