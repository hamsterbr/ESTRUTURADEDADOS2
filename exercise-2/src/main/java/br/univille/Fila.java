package br.univille;

public class Fila {
    private Object[] data;
    private int inicio;
    private int fim;
    private int tamanho;

    public Fila(int capacidade) {
        data = new Object[capacidade];
        inicio = 0;
        fim = -1;
        tamanho = 0;
    }

    public void enfileirar(Object obj) {
        if (tamanho == data.length) {
            throw new RuntimeException("Fila cheia");
        }
        fim = (fim + 1) % data.length;
        data[fim] = obj;
        tamanho++;
    }

    public Object desenfileirar() {
        if (estaVazia()) {
            throw new RuntimeException("Fila vazia");
        }
        Object valor = data[inicio];
        inicio = (inicio + 1) % data.length;
        tamanho--;
        return valor;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }

    public void mostrar() {
        for (int i = 0; i < tamanho; i++) {
            int idx = (inicio + i) % data.length;
            System.out.println(data[idx]);
        }
    }
}
