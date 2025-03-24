package br.com.bootcamp;

public class Curso extends Conteudo {
    private int cargaHoraria;

    // Construtor com parâmetros
    public Curso(String nome, String descricao, int cargaHoraria) {
        super(nome, descricao);  // Chama o construtor da classe pai (Conteudo)
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + (cargaHoraria * 0.5); // Lógica de XP para o curso
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
