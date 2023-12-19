package lista;

import java.util.ArrayList;

public class Comparacao {
    public static void main(String[] args) {

        ListaLigada<Integer> lista = new ListaLigada<>();

        ArrayList<Integer> vetor = new ArrayList<Integer>();

        // adicionar elementos

        int limite = 10000;
        long tempInicial = System.currentTimeMillis();
        long tempFinal = System.currentTimeMillis();

        for (int i = 0; i < limite; i++) {
            vetor.add(i);
        }

        tempFinal = System.currentTimeMillis();
        System.out.println("Adicionou " + limite + " elementos no vetor");
        System.out.println(tempFinal - tempInicial);

        limite = 10000;
        tempInicial = System.currentTimeMillis();
        tempFinal = System.currentTimeMillis();

        for (int i = 0; i < limite; i++) {
            lista.adicionar(i);
        }

        tempFinal = System.currentTimeMillis();
        System.out.println("\n\nAdicionou " + limite + " elementos na lista");
        System.out.println(tempFinal - tempInicial);

        // ler valores
        tempInicial = System.currentTimeMillis();
        for (int i = 0; i < vetor.size(); i++) {
            vetor.get(i);
        }

        tempFinal = System.currentTimeMillis();
        System.out.println("\n\nTempo de leitura do vetor");
        System.out.println(tempFinal - tempInicial);

        tempInicial = System.currentTimeMillis();
        IteratorListaLigada<Integer> iterator = lista.getIterator();

        while (iterator.temProximo()) {
            iterator.getProximo();
        }

        tempFinal = System.currentTimeMillis();
        System.out.println("\n\nTempo de leitura da lista");
        System.out.println(tempFinal - tempInicial);
    }
}
