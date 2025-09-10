import entities.ListaDeProcessos;
import entities.Processo;
import entities.Scheduler;
import enums.PrioridadeProcesso;

public class Main {
    public static void main(String[] args) {

        Processo processo2 = new Processo();
        Processo processo3 = new Processo(1, "Teste", 2, 90, "Recurso 1");
        Processo processo4 = new Processo(2, "Teste2", 3, 92, "Recurso 2");

        ListaDeProcessos media = new ListaDeProcessos(processo3);
        ListaDeProcessos alta = new ListaDeProcessos(processo4);
        ListaDeProcessos baixa = new ListaDeProcessos(processo4);
        ListaDeProcessos bloqueado = new ListaDeProcessos(processo4);

        Scheduler scheduler = new Scheduler(alta, media, baixa, bloqueado, 90);

        scheduler.executarCicloDeCpu();

    }
}