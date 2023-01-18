package org.dio.desafio.domain;

public abstract class Content {

    private String title;
    private String description;
    protected static final double xp = 10;

    public Content() {}

    public Content(String title, String description) {
        this.title = title;
        this.description = description;
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

    public abstract double calculateXp();
}