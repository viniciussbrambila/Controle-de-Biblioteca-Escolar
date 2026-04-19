public class Livro {
    private String titulo;
    private String autor;
    private int quantidadeDisponivel;

    public Livro(String titulo, String autor, int quantidadeDisponivel) {
        setTitulo(titulo);
        this.autor = autor;
        setQuantidade(quantidadeDisponivel);
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro: O título do livro não pode ser vazio.");
        }
        this.titulo = titulo;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Erro: A quantidade do livro não pode ser negativa.");
        }
        this.quantidadeDisponivel = quantidade;
    }

    // Regra de Empréstimo
    public void subtrairEstoque() {
        if (this.quantidadeDisponivel <= 0) {
            throw new IllegalStateException("Erro: O livro '" + titulo + "' não tem cópias disponíveis.");
        }
        this.quantidadeDisponivel--;
    }

    // Regra de Devolução
    public void adicionarEstoque() {
        this.quantidadeDisponivel++;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getQuantidadeDisponivel() { return quantidadeDisponivel; }
}