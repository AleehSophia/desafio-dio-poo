package org.dio.desafio;

import org.dio.desafio.domain.Course;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course("Curso java", "descricao curso java", 8);
        Course course2 = new Course("Curso javascript", "descricao curso javascript", 10);

        System.out.println(course1);
        System.out.println(course2);
    }
}