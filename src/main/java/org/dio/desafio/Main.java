package org.dio.desafio;

import org.dio.desafio.domain.Course;
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

        Mentoring javaMentoring = new Mentoring();
        javaMentoring.setTitle("Mentoria java");
        javaMentoring.setDescription("descricao da mentoria");
        javaMentoring.setDate(LocalDate.now());
        System.out.println(javaMentoring);
    }
}