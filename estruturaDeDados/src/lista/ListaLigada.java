package lista;

public class ListaLigada {
    private Elemento first;
    private Elemento last;
    private int size;

    public ListaLigada() {
        this.size = 0;
    }

    public Elemento getFirst() {
        return first;
    }

    public void setFirst(Elemento first) {
        this.first = first;
    }

    public Elemento getLast() {
        return last;
    }

    public void setLast(Elemento last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void add(String newValue) {
        Elemento newElement = new Elemento(newValue);
        if (this.first == null && this.last == null) {
            this.first = newElement;
            this.last = newElement;
        } else {
            this.last.setNext(newElement);
            this.last = newElement;
        }
        this.size++;
    }

    public void remove(String newValue) {

    }

    public Elemento get(int position) {
        Elemento current = this.first;
        for(int i = 0; i < position; i++){
            if(current.getNext() != null){
                current = current.getNext();
            }
        }
        return current;
    }
}




