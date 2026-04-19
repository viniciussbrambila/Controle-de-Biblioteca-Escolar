import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Emprestimo> listaDeEmprestimos = new ArrayList<>();

        try {
            // 1. Cadastrando Alunos e Livros
            Aluno aluno1 = new Aluno("Diego");
            Aluno aluno2 = new Aluno("Vinícius");

            Livro livro1 = new Livro("Harry Potter", "J.K.", 1);
            Livro livro2 = new Livro("Senhor dos Anéis", "Sei Lá", 3);

            System.out.println("--- Realizando Empréstimos ---");

            Emprestimo emp1 = new Emprestimo(aluno1, livro1);
            listaDeEmprestimos.add(emp1);
            System.out.println(aluno1.getNome() + " pegou o livro: " + livro1.getTitulo());

            Emprestimo emp2 = new Emprestimo(aluno2, livro2);
            listaDeEmprestimos.add(emp2);
            System.out.println(aluno2.getNome() + " pegou o livro: " + livro2.getTitulo());

            System.out.println("\n--- Consultando Livros em Aberto ---");
            for (Emprestimo e : listaDeEmprestimos) {
                if (e.isEmAberto()) {
                    System.out.println("Aluno: " + e.getAluno().getNome() + " | Livro pendente: " + e.getLivro().getTitulo());
                }
            }

            System.out.println("\n--- Realizando Devolução ---");
            emp1.devolverLivro();
            System.out.println(aluno1.getNome() + " devolveu o livro: " + livro1.getTitulo());
            System.out.println("Estoque atual de Harry Potter: " + livro1.getQuantidadeDisponivel());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}