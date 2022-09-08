import java.util.ArrayList;

public class Locacoes {
    private ArrayList<Aluguel> listaDeAlugueis;

    public Locacoes() {
        listaDeAlugueis = new ArrayList<>();
    }

    public void adicionaAluguel(Aluguel aluguel) {
        listaDeAlugueis.add(aluguel);
    }

    public ArrayList<Aluguel> pesquisaAluguel(String cpf) {
        ArrayList<Aluguel> listaDesejadaAlugueis = new ArrayList<>();
        for (Aluguel aluguel :
                listaDeAlugueis) {
            if (aluguel.getCpf().equals(cpf)) {
                return listaDesejadaAlugueis;
            }
        }
        return null;
    }

    public ArrayList<Aluguel> getListaDeAlugueis() {
        return listaDeAlugueis;
    }
}
