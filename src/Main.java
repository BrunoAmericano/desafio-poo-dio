import java.time.LocalDate;  // Importando LocalDate

public class Main {
    public static void main(String[] args) {
        // Criando o Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Full Stack");
        bootcamp.setDescricao("Aprenda tudo sobre Java e desenvolvimento Full Stack!");

        // Criando conteúdos (Curso e Mentoria)
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Aprenda os conceitos básicos de Java.");
        curso1.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Sessão de perguntas e respostas sobre Java.");
        mentoria1.setData(LocalDate.now().plusDays(1));

        // Adicionando conteúdos ao Bootcamp
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        // Criando um desenvolvedor
        Dev dev1 = new Dev();
        dev1.setNome("Bruno");

        // Inscrevendo o desenvolvedor no bootcamp
        dev1.inscreverBootcamp(bootcamp);

        // Exibindo os conteúdos inscritos do dev
        System.out.println("Conteúdos inscritos para " + dev1.getNome() + ":");
        dev1.getConteudosInscritos().forEach(System.out::println);

        // O dev progride (completa um conteúdo)
        System.out.println("\n" + dev1.getNome() + " progrediu!");
        dev1.progredir();

        // Exibindo os conteúdos concluídos do dev
        System.out.println("\nConteúdos concluídos para " + dev1.getNome() + ":");
        dev1.getConteudosConcluidos().forEach(System.out::println);

        // Exibindo o XP total do dev
        System.out.println("\nXP total de " + dev1.getNome() + ": " + dev1.calcularTotalXp());
    }
}
