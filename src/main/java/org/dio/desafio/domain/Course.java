package org.dio.desafio.domain;

public class Course extends Content {

    private Integer workload;

    public Course() {}


    public Course(Integer workload) {
        this.workload = workload;
    }

    @Override
    public double calculateXp() {
        return xp + workload;
    }

    public Integer getWorkload() {
        return workload;
    }

    public void setWorkload(Integer workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title=" + getTitle() +
                "description=" + getDescription() +
                "workload=" + workload +
                '}';
    }
}