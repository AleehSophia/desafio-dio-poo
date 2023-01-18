package org.dio.desafio.domain;

import java.time.LocalDate;

public class Mentoring extends Content {

    private LocalDate date;

    public Mentoring() {}


    public Mentoring(LocalDate date) {
        this.date = date;
    }

    @Override
    public double calculateXp() {
        return xp + 20;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "title=" + getTitle() +
                "description=" + getDescription() +
                "date=" + date +
                '}';
    }
}