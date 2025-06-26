package estrutura;

public class Pilha<T> {
    private No<T> topo;

    public void push(T valor) {
        No<T> novo = new No<>(valor);
        novo.setProximo(topo);
        topo = novo;
    }

    public T pop() {
        if (estaVazia()) {
            throw new IllegalStateException("Pilha vazia");
        }
        T valor = topo.getInfo();
        topo = topo.getProximo();
        return valor;
    }

    public T peek() {
        if (estaVazia()) {
            throw new IllegalStateException("Pilha vazia");
        }
        return topo.getInfo();
    }

    public boolean estaVazia() {
        return topo == null;
    }

    public void liberar() {
        topo = null;
    }
}
