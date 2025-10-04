package br.univille;

public class FilaImpressao {
    private Fila fila;

    public FilaImpressao(int capacidade) {
        fila = new Fila(capacidade);
    }

    public void adicionarDocumento(Documento doc) {
        fila.enfileirar(doc);
    }

    public void imprimirProximo() {
        if (!fila.estaVazia()) {
            Documento doc = (Documento) fila.desenfileirar();
            System.out.println("Imprimindo: " + doc);
        } else {
            System.out.println("Fila de impressão vazia.");
        }
    }

    public void mostrarFila() {
        System.out.println("Fila atual:");
        fila.mostrar();
    }
}
