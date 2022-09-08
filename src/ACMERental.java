import java.util.ArrayList;
import java.util.Scanner;

public class ACMERental {
    private Acervo acervo;
    private Locacoes locacoes;
    private Scanner in;

    public ACMERental() {
        acervo = new Acervo();
        locacoes = new Locacoes();
        in = new Scanner(System.in);
    }
    public void executa() {
        int esc;
        do {
            menu();
            esc = in.nextInt();
            in.nextLine();
            switch(esc) {
                case 1:
                    dadosCadastrados();
                    break;
                case 2:
                    pesquisarImovelCodigo();
                    break;
                case 3:
                    pesquisarImoveisNome();
                    break;
                case 4:
                    pesquisarAlugueisCPF();
                    break;
                case 5:
                    break;
            }
        } while(esc != 5);
    }

    private void menu() {
        System.out.println("=============================");
        System.out.println("Opcoes:");
        System.out.println("[1] Mostrar todos os dados cadastrados");
        System.out.println("[2] Pesquisar item alugavel pelo codigo");
        System.out.println("[3] Pesquisar itens alugaveis pelo nome");
        System.out.println("[4] Pesquisar alugueis de um cliente");
        System.out.println("[5] Sair");
        System.out.println("Opcao desejada: ");
    }
    public void preCadastra() {
        Alugavel imovel1, imovel2, imovel3;
        Aluguel aluguel1, aluguel2, aluguel3, aluguel4, aluguel5;

        imovel1 = new Alugavel(1, "Joao", 90, "Freire Alemao", "Mont Serrat");
        acervo.adicionaAlugavel(imovel1);
        imovel2 = new Alugavel(2, "Arthur", 70, "Ramiro Barcelos", "Floresta");
        acervo.adicionaAlugavel(imovel2);
        imovel3 = new Alugavel(3, "Clara", 100, "Pedro Ivo", "Bela Vista");
        acervo.adicionaAlugavel(imovel3);

        System.out.println("Imóveis e aluguéis pre-cadastrados.");
    }

    private void dadosCadastrados() {

    }
    private void pesquisarImovelCodigo() {

    }
    private void pesquisarImoveisNome() {

    }
    private void pesquisarAlugueisCPF() {

    }
}
