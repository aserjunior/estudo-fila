package entities;

public class ListaDeProcessos {
    private Processo processo;
    private ListaDeProcessos next;

    public ListaDeProcessos(Processo processo) {
        this.processo = processo;
        this.next = null;
    }

    public ListaDeProcessos(){}

    public Processo getProcesso() {
        return processo;
    }

    public void setProcesso(Processo processo) {
        this.processo = processo;
    }

    public ListaDeProcessos getNext() {
        return next;
    }

    public void setNext(ListaDeProcessos next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListaDeProcessos{" +
                "processo=" + processo +
                ", next=" + next +
                '}';
    }
}
