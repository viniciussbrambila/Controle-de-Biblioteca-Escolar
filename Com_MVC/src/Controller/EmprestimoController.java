package Controller;

import Model.Aluno;
import Model.Livro;
import Model.Emprestimo;
import java.util.ArrayList;
import java.util.List;

public class EmprestimoController {

    private List<Emprestimo> bancoDeEmprestimos = new ArrayList<>();

    public Emprestimo realizarEmprestimo(Aluno aluno, Livro livro) {
        Emprestimo novoEmprestimo = new Emprestimo(aluno, livro);
        bancoDeEmprestimos.add(novoEmprestimo);
        return novoEmprestimo;
    }

    public void realizarDevolucao(Emprestimo emprestimo) {
        emprestimo.devolverLivro();
    }

    public List<Emprestimo> consultarEmprestimosAtivos() {
        List<Emprestimo> ativos = new ArrayList<>();
        for (Emprestimo e : bancoDeEmprestimos) {
            if (e.isEmAberto()) {
                ativos.add(e);
            }
        }
        return ativos;
    }
}