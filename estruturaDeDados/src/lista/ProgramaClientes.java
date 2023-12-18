package lista;

public class ProgramaClientes {
    public static void main(String[] args) {
        ListaLigada<Cliente> clientes = new ListaLigada<Cliente>();
        clientes.adicionar(new Cliente("05964107516", "Jadson"));
        clientes.adicionar(new Cliente("16750164059","Caio"));
        clientes.adicionar(new Cliente("61570146950","Jefferson"));

        System.out.println("Tamanho: " + clientes.getTamanho());
        for (int i = 0; i < clientes.getTamanho(); i++) {
            System.out.println(clientes.get(i).getValor());
        }
    }
}
