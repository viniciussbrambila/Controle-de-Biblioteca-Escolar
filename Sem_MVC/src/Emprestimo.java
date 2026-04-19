public class Emprestimo {
    private Aluno aluno;
    private Livro livro;
    private boolean emAberto; // true = emprestado, false = devolvido

    public Emprestimo(Aluno aluno, Livro livro) {
        this.aluno = aluno;
        this.livro = livro;
        this.emAberto = true;

        // Tira 1 do estoque do livro na hora que cria o empréstimo
        livro.subtrairEstoque();
    }

    public void devolverLivro() {
        if (emAberto) {
            this.emAberto = false;
            livro.adicionarEstoque(); // Devolve 1 para o estoque
        }
    }

    public Aluno getAluno() { return aluno; }
    public Livro getLivro() { return livro; }
    public boolean isEmAberto() { return emAberto; }
}
