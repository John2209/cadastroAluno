import javax.swing.JOptionPane;

/**
 * Implementa as entradas e saídas da aplicação em modo gráfico.
 *
 * @author Julio Arakaki
 * @version 1.0 2026/04/03
 */
public class MenuGrafico implements IMenu {

    /**
     * Monta o menu principal e realiza a leitura da opção escolhida.
     *
     * @param opcoes vetor com as opções do menu
     * @return opção válida escolhida pelo usuário
     */
    public int criarMenu(String opcoes[]) {
        String itens = "";

        for (int i = 0; i < opcoes.length; i++) {
            itens = itens + "\n" + opcoes[i];
        }

        itens = itens + "\n\nSelecione a opcao: ";

        while (true) {
            String entrada = lerEntrada(itens);

            if (entrada == null) {
                return opcoes.length;
            }

            try {
                int opcao = Integer.parseInt(entrada);

                if (opcao > 0 && opcao <= opcoes.length) {
                    return opcao;
                }
            } catch (NumberFormatException e) {
            }

            exibirMensagem("Opcao invalida");
        }
    }

    /**
     * Solicita uma entrada textual ao usuário por meio de uma janela.
     *
     * @param mensagem texto apresentado ao usuário
     * @return valor informado
     */
    public String lerEntrada(String mensagem) {
        return JOptionPane.showInputDialog(mensagem);
    }

    /**
     * Exibe uma mensagem ao usuário por meio de uma janela.
     *
     * @param mensagem texto a ser exibido
     */
    public void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
