package br.com.bootcamp;

public class Mentoria extends Conteudo {

    private String dataMentoria;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;  // A XP da mentoria é sempre XP_PADRAO + 20
    }

    // Getters e Setters
    public String getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(String dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    @Override
    public String toString() {
        return super.toString() + " | Data da Mentoria: " + dataMentoria;
    }
}
