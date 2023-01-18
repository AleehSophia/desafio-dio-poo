package org.dio.desafio.domain;


import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {

    private String name;
    private Set<Content> subscribedContents = new LinkedHashSet<>();
    private Set<Content> finishedContents =  new LinkedHashSet<>();

    public Dev() {}

    public Dev(String name, Set<Content> subscribedContents, Set<Content> finishedContents) {
        this.name = name;
        this.subscribedContents = subscribedContents;
        this.finishedContents = finishedContents;
    }

    public void subscribeBootcamp(Bootcamp bootcamp) {}

    public void progress() {}

    public void calculateXp() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscribedContents() {
        return subscribedContents;
    }

    public void setSubscribedContents(Set<Content> subscribedContents) {
        this.subscribedContents = subscribedContents;
    }

    public Set<Content> getFinishedContents() {
        return finishedContents;
    }

    public void setFinishedContents(Set<Content> finishedContents) {
        this.finishedContents = finishedContents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(subscribedContents, dev.subscribedContents) && Objects.equals(finishedContents, dev.finishedContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContents, finishedContents);
    }
}