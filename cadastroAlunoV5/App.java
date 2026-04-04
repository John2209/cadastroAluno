/**
 * Classe principal da aplicação.
 * Responsável por iniciar a interface e controlar o fluxo do menu.
 *
 * @author Julio Arakaki
 * @version 1.0 2026/04/03
 */
public class App {
    /**
     * Inicia a aplicação e mantém o laço principal do menu.
     *
     * @param args argumentos recebidos pela linha de comando
     */
    public static void main(String[] args) {
        IMenu mn = IMenu.criar();
        int qtde = lerQuantidadeAlunos(mn);

        CadastroAlunos ca = new CadastroAlunos(qtde, mn);
        String[] itensMenu = {"1 - inserir", "2 - remover", "3 - listar", "4 - atualizar dados", "5 - sair"};

        int opcao = 0;

        do {
            opcao = mn.criarMenu(itensMenu);

            switch(opcao) {
                case 1:
                    if (ca.inserirAluno(qtde)) {
                        mn.exibirMensagem("Aluno inserido com sucesso!!");
                    }
                break;
                case 2:
                    if (ca.removerAluno(qtde)) {
                        mn.exibirMensagem("Aluno removido com sucesso!!");
                    }
                break;
                case 3:
                    ca.listarAluno(qtde);
                break;
                case 4:
                    if (ca.atualizarAluno(qtde)) {
                        mn.exibirMensagem("Aluno atualizado com sucesso!!");
                    }
                break;
            }
        } while(opcao > 0 && opcao < 5);
    }

    /**
     * Solicita a capacidade máxima do cadastro de alunos.
     *
     * @param mn implementação de entrada e saída utilizada pela aplicação
     * @return quantidade máxima de alunos que poderão ser cadastrados
     */
    private static int lerQuantidadeAlunos(IMenu mn) {
        while (true) {
            String entrada = mn.lerEntrada("Forneca a quantidade de alunos: ");

            try {
                int qtde = Integer.parseInt(entrada);

                if (qtde > 0) {
                    return qtde;
                }
            } catch (NumberFormatException e) {
            }

            mn.exibirMensagem("Informe uma quantidade valida de alunos.");
        }
    }
}
