package br.com.bootcamp;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Aprenda Java do básico ao avançado");

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Aprenda os fundamentos de Java");
        curso1.setCargaHoraria(20);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Tire suas dúvidas sobre Java");
        mentoria1.setData(LocalDate.now());

        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Bruno");
        dev1.inscreverBootcamp(bootcamp);

        System.out.println("XP antes de progredir: " + dev1.calcularTotalXp());
        dev1.progredir();
        System.out.println("XP após progredir: " + dev1.calcularTotalXp());
    }
}