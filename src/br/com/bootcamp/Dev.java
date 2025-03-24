package br.com.bootcamp;

import java.util.HashSet;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new HashSet<>();
    private Set<Conteudo> conteudosConcluidos = new HashSet<>();
    private double xp;

    public Dev(String nome) {
        this.nome = nome;
        this.xp = 0.0;
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
    }

    public void progredir() {
        if (!conteudosInscritos.isEmpty()) {
            Conteudo conteudo = conteudosInscritos.iterator().next(); // Pega o primeiro conteúdo inscrito
            conteudosConcluidos.add(conteudo); // Adiciona ao conjunto de concluídos
            xp += conteudo.calcularXp(); // Acumula XP
            conteudosInscritos.remove(conteudo); // Remove o conteúdo da lista de inscritos
        } else {
            System.out.println("Você não está inscrito em nenhum conteúdo.");
        }
    }

    public String getNome() {
        return nome;
    }

    public double getXp() {
        return xp;
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                ", xp=" + xp +
                ", conteudosInscritos=" + conteudosInscritos +
                ", conteudosConcluidos=" + conteudosConcluidos +
                '}';
    }
}
