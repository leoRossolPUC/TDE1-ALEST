public class Nodos {

    int valor;
    Nodos esq;
    Nodos dir;
    Nodos cen;
    boolean isLeaf;

    public Nodos (int value){
        this.valor=valor;
        this.cen=null;
        this.dir=null;
        this.esq=null;
        this.isLeaf=false;
    }
}
