package View;

import Model.Emprestimo;
import java.util.List;

public class EmprestimoView {

    public void mostrarMensagem(String msg) {
        System.out.println(">> " + msg);
    }

    public void mostrarErro(String erro) {
        System.err.println("[ERRO] " + erro);
    }

    public void exibirEmprestimosAtivos(List<Emprestimo> emprestimos) {
        System.out.println("\n=== Livros Atualmente Emprestados ===");
        if(emprestimos.isEmpty()) {
            System.out.println("Nenhum livro emprestado no momento.");
        } else {
            for (Emprestimo e : emprestimos) {
                System.out.println("Aluno: " + e.getAluno().getNome() + " | Livro: " + e.getLivro().getTitulo());
            }
        }
        System.out.println("=====================================\n");
    }
}
