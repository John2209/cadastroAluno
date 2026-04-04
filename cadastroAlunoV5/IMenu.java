/**
 * Define os serviços de entrada e saída da aplicação.
 * Permite alternar entre implementações em modo texto e modo gráfico.
 *
 * @author Julio Arakaki
 * @version 1.0 2026/04/03
 */
public interface IMenu {
    /**
     * Cria a implementação de menu usada pela aplicação.
     * Para trocar a interface, basta alterar a linha de retorno.
     *
     * @return implementação de menu escolhida
     */
    static IMenu criar() {
        // return new MenuGrafico();
        return new MenuTexto();
    }

    /**
     * Exibe o menu principal e retorna a opção escolhida pelo usuário.
     *
     * @param opcoes vetor com as opções que serão exibidas no menu
     * @return opção selecionada pelo usuário
     */
    int criarMenu(String opcoes[]);

    /**
     * Solicita uma entrada textual ao usuário.
     *
     * @param mensagem texto apresentado ao usuário
     * @return valor informado
     */
    String lerEntrada(String mensagem);

    /**
     * Exibe uma mensagem ao usuário.
     *
     * @param mensagem texto a ser apresentado
     */
    void exibirMensagem(String mensagem);
}
