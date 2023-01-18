package org.dio.desafio.domain;

public class Course {

    private String title;
    private String description;
    private Integer workload;

    public Course() {}

    public Course(String title, String description, Integer workload) {
        this.title = title;
        this.description = description;
        this.workload = workload;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", workload=" + workload +
                '}';
    }
}