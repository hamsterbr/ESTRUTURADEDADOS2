package br.univille;

public class Stack {
    private Object[] elementos;
    private int topo;

    public Stack(int capacidade) {
        elementos = new Object[capacidade];
        topo = -1;
    }

    public void push(Object item) {
        if (topo == elementos.length - 1) {
            throw new RuntimeException("Stack overflow");
        }
        elementos[++topo] = item;
    }

    public Object pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack underflow");
        }
        return elementos[topo--];
    }

    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return elementos[topo];
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public int getCapacidade() {
        return elementos.length;
    }
}