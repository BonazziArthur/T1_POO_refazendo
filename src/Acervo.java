import java.util.ArrayList;

public class Acervo {
    private ArrayList<Alugavel> listaImoveisAlugaveis = new ArrayList<>();

    public boolean adicionaAlugavel(Alugavel imovelAlugavel) {
        for (Alugavel imovel :
                listaImoveisAlugaveis) {
            if (imovelAlugavel.equals(imovel.getCodigo())) {
                return false;
            }
            listaImoveisAlugaveis.add(imovelAlugavel);
        }
        return true;
    }

    public Alugavel pesquisaAlugavel(int codigo) {
        for (Alugavel item :
                listaImoveisAlugaveis) {
            if (item.equals(codigo)) {
                return item;
            }
        }
        return null;
    }
    public ArrayList<Alugavel> pesquisaAlugavel(String nome) {
        ArrayList<Alugavel> listaDesejada = new ArrayList<>();
        for (Alugavel item :
                listaImoveisAlugaveis) {
            if(item.getNome().equals(nome)) {
                listaDesejada.add(item);
            }
            return listaDesejada;
        }
        return null;
    }

    public ArrayList<Alugavel> getListaImoveisAlugaveis() {
        return listaImoveisAlugaveis;
    }
}
