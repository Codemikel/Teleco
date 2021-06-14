public class Arbol {
    public Nodo raiz;

    public Arbol() {
        this.raiz = null;
    }

    public void insertarNodo(long Elem){
        if (this.raiz == null){
            this.raiz = new Nodo(Elem);
        }else {
            this.raiz.insertarBinario(Elem);
        }
        System.out.println("Nodo añadido con éxito");
    }

    public void buscar(Nodo nodo, long dato){
        boolean enc = false;
        if (nodo == null){
            return;
        }else {
            while (nodo !=null && !enc){
                if (dato != nodo.getDato()){
                    if (dato < nodo.getDato()){
                        nodo = nodo.getIzq();
                    }else {
                        nodo = nodo.getDer();
                    }
                }else {
                    enc = true;
                }
            }
        }
        if (enc){
            System.out.println("El dato "+dato+" Fue encontrado");
        }else {
            System.out.println("El dato "+dato+" No fue encontrado");
        }
    }
}
