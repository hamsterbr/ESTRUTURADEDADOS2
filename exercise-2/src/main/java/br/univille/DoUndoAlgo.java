package br.univille;

public class DoUndoAlgo {
    private Stack pilhaUndo;
    private Stack pilhaRedo;
    private String textoAtual;

    public DoUndoAlgo(int capacidade) {
        pilhaUndo = new Stack(capacidade);
        pilhaRedo = new Stack(capacidade);
        textoAtual = "";
        pilhaUndo.push(textoAtual);
    }

    public void insertText(String novoTexto) {
        textoAtual += novoTexto;
        pilhaUndo.push(textoAtual);
        pilhaRedo = new Stack(pilhaRedo.getCapacidade());
    }

    public void undo() {
        if (!pilhaUndo.isEmpty()) {
            pilhaRedo.push(pilhaUndo.pop());
            if (!pilhaUndo.isEmpty()) {
                textoAtual = (String) pilhaUndo.peek();
            } else {
                textoAtual = "";
            }
        }
    }

    public void redo() {
        if (!pilhaRedo.isEmpty()) {
            String estado = (String) pilhaRedo.pop();
            pilhaUndo.push(estado);
            textoAtual = estado;
        }
    }

    public String getText() {
        return textoAtual;
    }
}