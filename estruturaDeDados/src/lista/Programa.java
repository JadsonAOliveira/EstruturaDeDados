package lista;

public class Programa {
    public static void main(String[] args) {

        ListaLigada list = new ListaLigada();
        list.add("SE");
        list.add("MG");
        list.add("BA");
        list.add("RJ");
        System.out.println("Tamanho: " + list.getSize());
        System.out.println("Primeiro: " + list.getFirst().getValue());
        System.out.println("Ultimo: " + list.getLast().getValue());
        System.out.println(list.get(0).getValue());
        System.out.println(list.get(1).getValue());
        System.out.println(list.get(2).getValue());
        System.out.println(list.get(3).getValue());
    }

}
