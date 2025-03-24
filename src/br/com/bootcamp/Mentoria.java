package br.com.bootcamp;

public class Mentoria extends Conteudo {
    private int duracao;

    // Construtor com parâmetros
    public Mentoria(String nome, String descricao, int duracao) {
        super(nome, descricao);  // Chama o construtor da classe pai (Conteudo)
        this.duracao = duracao;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + (duracao * 0.2);  // Lógica de XP para a mentoria
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
