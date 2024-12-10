package com.atypon.Model;

import java.util.Objects;

public class SearchResult {
    private final String title;
    private final double score;

    public SearchResult(String title, double score) {
        this.title = title;
        this.score = score;
    }

    public String getTitle() {
        return title;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "SearchResult{" +
                "title='" + title + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchResult that = (SearchResult) o;
        return Double.compare(that.score, score) == 0 &&
                title.equals(that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, score);
    }

    @Override
    public SearchResult clone() throws CloneNotSupportedException {
        SearchResult searchResult = (SearchResult) super.clone();
        return new SearchResult(this.title, this.score);
    }
}