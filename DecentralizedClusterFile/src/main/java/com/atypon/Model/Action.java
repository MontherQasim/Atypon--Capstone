package com.atypon.Model;

import java.io.Serializable;
import java.util.List;

public record Action(List<String> searchTerms,
                     List<String> documents) implements Serializable, Comparable<Action>, Cloneable {

    @Override
    public String toString() {
        return "Action{" +
                "searchTerms=" + searchTerms +
                ", documents=" + documents +
                '}';
    }

    @Override
    public int compareTo(Action other) {
        return Integer.compare(this.searchTerms.size(), other.searchTerms.size());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object o = super.clone();
        return new Action(this.searchTerms, this.documents);
    }
}