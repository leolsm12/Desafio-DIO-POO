package org.desafio;

import org.desafio.dominio.Bootcamp;
import org.desafio.dominio.Curso;
import org.desafio.dominio.Dev;
import org.desafio.dominio.Mentoria;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao("descrição curso java");
        curso2.setCargaHoraria(8);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLeo = new Dev();
        devLeo.setNome("Leonardo");
        devLeo.increverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscritos Leo" + devLeo.getConteudosInscritos());
        devLeo.progredir();
        devLeo.progredir();
        System.out.println("------");
        System.out.println("Conteúdo Inscritos Leo" + devLeo.getConteudosInscritos());
        System.out.println("Conteúdo Inscritos Leo" + devLeo.getConteudoConcluidos());
        System.out.println("XP:" + devLeo.calcularTotalXp());

        System.out.println("------");
        System.out.println("------");

        Dev devJao = new Dev();
        devJao.setNome("João");
        devJao.increverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscritos joão" + devJao.getConteudosInscritos());
        devJao.progredir();
        System.out.println("------");
        System.out.println("Conteúdo Inscritos joão" + devJao.getConteudosInscritos());
        System.out.println("Conteúdo Inscritos joão" + devJao.getConteudoConcluidos());
        System.out.println("XP:" + devJao.calcularTotalXp());

    }
}