public class Nodo {
    private long dato;
    private Nodo izq;
    private Nodo der;

    public Nodo(long dato) {
        this.dato = dato;
        this.der = null;
        this.izq = null;
    }

    public void insertarBinario(long Elem){
        if (Elem < dato){
            if(this.izq==null){
                this.izq = new Nodo(Elem);
            }else {
                this.izq.insertarBinario(Elem);
            }
        }else {
            if (Elem>dato){
                if (this.der==null){
                    this.der = new Nodo(Elem);
                }else{
                    this.der.insertarBinario(Elem);
                }
            }
        }
    }

    public long getDato() {
        return dato;
    }



    public Nodo getIzq() {
        return izq;
    }



    public Nodo getDer() {
        return der;
    }

}
