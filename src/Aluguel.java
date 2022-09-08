import java.util.ArrayList;

public class Aluguel {
    private String data;
    private int periodo;
    private String cpf;
    private String nome;
    private double valorFinal;
    private Alugavel imovelAlugado;

    public double calculcaValorFinal() {
        double valor = (periodo * imovelAlugado.getPrecoDiario());
        if(periodo > 7) {
            double desconto = valor * 10/100;
            return valorFinal = (valor - desconto);
        }
        return valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public Alugavel getImovelAlugado() {
        return imovelAlugado;
    }

    public void setImovelAlugado(Alugavel imovelAlugado) {
        this.imovelAlugado = imovelAlugado;
    }
}
