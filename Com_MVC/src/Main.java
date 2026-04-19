import Controller.EmprestimoController;
import View.EmprestimoView;
import Model.Aluno;
import Model.Livro;
import Model.Emprestimo;

public class Main {
    public static void main(String[] args) {

        EmprestimoView view = new EmprestimoView();
        EmprestimoController controller = new EmprestimoController();

        try {
            view.mostrarMensagem("Iniciando Sistema da Biblioteca...");

            Aluno aluno1 = new Aluno("Diego");
            Aluno aluno2 = new Aluno("Vinícius");

            Livro livro1 = new Livro("Harry Potter", "J.K.", 1);
            Livro livro2 = new Livro("Senhor dos Anéis", "Sei lá", 3);

            view.mostrarMensagem("Registrando empréstimos...");
            Emprestimo emp1 = controller.realizarEmprestimo(aluno1, livro1);
            Emprestimo emp2 = controller.realizarEmprestimo(aluno2, livro2);

            var listaAtivos = controller.consultarEmprestimosAtivos();
            view.exibirEmprestimosAtivos(listaAtivos);

            view.mostrarMensagem(aluno1.getNome() + " está devolvendo o livro " + livro1.getTitulo() + "...");
            controller.realizarDevolucao(emp1);
            view.mostrarMensagem("Devolução concluída! Estoque atual de " + livro1.getTitulo() + ": " + livro1.getQuantidadeDisponivel());

            listaAtivos = controller.consultarEmprestimosAtivos();
            view.exibirEmprestimosAtivos(listaAtivos);

        } catch (Exception e) {
            view.mostrarErro(e.getMessage());
        }
    }
}