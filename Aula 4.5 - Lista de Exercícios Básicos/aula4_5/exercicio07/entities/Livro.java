package aula4_5.exercicio07.entities;

public class Livro {
    private String titulo;
    private String autor;
    private int numPag;
    private boolean isDisponivel;

    public Livro(String titulo, String autor, int numPag, boolean isDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
        this.isDisponivel = isDisponivel;
    }

    @Override
    public String toString() {
        return String.format("\nTitulo: '%s' \nAutor: %s \nNumero de paginas: %d \nDisponivel para emprestimo? %s", titulo, autor, numPag, isDisponivel);
    }

    public void emprestar() {
        System.out.print("\nLivro emprestado");
        isDisponivel = false;
    }

    public void devolver() {
        System.out.print("\nLivro devolvido");
        isDisponivel = true;
    }
}
