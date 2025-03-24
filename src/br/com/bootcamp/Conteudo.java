package br.com.bootcamp;

public abstract class Conteudo {
    private String nome;
    private String descricao;
    
    // Definindo XP_PADRAO
    protected static final double XP_PADRAO = 10;

    // Construtor com parâmetros
    public Conteudo(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public abstract double calcularXp();

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Conteudo{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
