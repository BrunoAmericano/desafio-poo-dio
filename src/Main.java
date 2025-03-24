package br.com.bootcamp;

public class Main {

    public static void main(String[] args) {

        // Criando cursos e mentorias
        Curso curso1 = new Curso("Curso de Java", "Aprenda Java do zero", 80);
        Curso curso2 = new Curso("Curso de Python", "Aprenda Python", 60);
        Mentoria mentoria1 = new Mentoria("Mentoria de Desenvolvimento", "Mentoria para desenvolvedores", 40);

        // Criando bootcamp e adicionando cursos e mentorias
        Bootcamp bootcamp = new Bootcamp("Bootcamp de Desenvolvimento");
        bootcamp.addConteudo(curso1);
        bootcamp.addConteudo(curso2);
        bootcamp.addConteudo(mentoria1);

        // Criando devs
        Dev dev1 = new Dev("Bruno");
        Dev dev2 = new Dev("Eduarda");

        // Inscrevendo devs no bootcamp
        dev1.inscreverBootcamp(bootcamp);
        dev2.inscreverBootcamp(bootcamp);

        // Progredindo devs
        System.out.println("XP antes de progredir:");
        System.out.println(dev1.getNome() + ": " + dev1.getXp());
        System.out.println(dev2.getNome() + ": " + dev2.getXp());

        dev1.progredir();
        dev2.progredir();

        System.out.println("XP após progredir:");
        System.out.println(dev1.getNome() + ": " + dev1.getXp());
        System.out.println(dev2.getNome() + ": " + dev2.getXp());

        // Mostrando os detalhes dos devs
        System.out.println("\nDetalhes dos Devs:");
        System.out.println(dev1);
        System.out.println(dev2);
    }
}
