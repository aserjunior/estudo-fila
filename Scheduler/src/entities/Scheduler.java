package entities;

public class Scheduler {

    private ListaDeProcessos alta;

    private ListaDeProcessos media;

    private ListaDeProcessos baixa;

    private ListaDeProcessos bloqueados;

    private Integer countCiclos;

    public Scheduler(ListaDeProcessos alta, ListaDeProcessos media, ListaDeProcessos baixa, ListaDeProcessos bloqueados, Integer countCiclos) {
        this.alta = alta;
        this.media = media;
        this.baixa = baixa;
        this.bloqueados = bloqueados;
        this.countCiclos = countCiclos;
    }

    public Scheduler(){}

    public void executarCicloDeCpu() {
        System.out.println(this.alta.getProcesso().getCiclosNecessarios());
    }
}
