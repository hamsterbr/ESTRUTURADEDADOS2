package br.univille;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Teste Pilha ===");
        Stack pilha = new Stack(5);
        pilha.push("A");
        pilha.push("B");
        pilha.push("C");
        System.out.println("Topo: " + pilha.peek());
        pilha.pop();
        System.out.println("Depois do pop, topo: " + pilha.peek());

        System.out.println("\n=== Teste Desfazer/Refazer ===");
        DoUndoAlgo editor = new DoUndoAlgo(10);
        editor.insertText("Hello");
        System.out.println("Texto atual: " + editor.getText());
        editor.insertText(" World");
        System.out.println("Texto atual: " + editor.getText());
        editor.undo();
        System.out.println("Depois de desfazer: " + editor.getText());
        editor.redo();
        System.out.println("Depois de refazer: " + editor.getText());

        System.out.println("\n=== Teste Fila ===");
        Fila fila = new Fila(5);
        fila.enfileirar("X");
        fila.enfileirar("Y");
        fila.enfileirar("Z");
        fila.mostrar();
        fila.desenfileirar();
        System.out.println("Depois de desenfileirar:");
        fila.mostrar();

        System.out.println("\n=== Teste Fila de Impressão ===");
        FilaImpressao impressora = new FilaImpressao(5);
        impressora.adicionarDocumento(new Documento("Doc1", 10));
        impressora.adicionarDocumento(new Documento("Doc2", 20));
        impressora.mostrarFila();
        impressora.imprimirProximo();
        impressora.mostrarFila();
    }
}
