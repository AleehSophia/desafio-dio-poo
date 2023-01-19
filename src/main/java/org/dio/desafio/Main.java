package org.dio.desafio;

import org.dio.desafio.domain.Bootcamp;
import org.dio.desafio.domain.Course;
import org.dio.desafio.domain.Dev;
import org.dio.desafio.domain.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course();
        course1.setTitle("curso java");
        course1.setDescription("descricao curso java");
        course1.setWorkload(8);

        Course course2 = new Course();
        course2.setTitle("curso javascript");
        course2.setDescription("descricao curso javascript");
        course2.setWorkload(10);

        System.out.println(course1);
        System.out.println(course2);

        System.out.println("==============");

        Mentoring javaMentoring = new Mentoring();
        javaMentoring.setTitle("Mentoria java");
        javaMentoring.setDescription("descricao da mentoria");
        javaMentoring.setDate(LocalDate.now());
        System.out.println(javaMentoring);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp java developer");
        bootcamp.setDescription("descrição bootcamp java developer");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(javaMentoring);

        System.out.println("==============");

        Dev devAlessia = new Dev();
        devAlessia.setName("Alessia");
        devAlessia.subscribeBootcamp(bootcamp);
        System.out.println("Alessia's subscribed content: " + devAlessia.getSubscribedContents());
        devAlessia.progress();
        devAlessia.progress();
        System.out.println("XP: " + devAlessia.calculateXp());

        System.out.println("==============");

        Dev devCamila = new Dev();
        devCamila.setName("Camila");
        devCamila.subscribeBootcamp(bootcamp);
        System.out.println("Camila's subscribed content: " + devCamila.getSubscribedContents());
        devCamila.progress();
        devCamila.progress();
        devCamila.progress();
        System.out.println("XP: " + devCamila.calculateXp());
    }
}