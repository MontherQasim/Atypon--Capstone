package com.atypon.Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class SearchResponse implements Cloneable {
    private List<SearchResult> searchResults = Collections.emptyList();

    public SearchResponse(List<SearchResult> searchResults) {
        this.searchResults = searchResults;
    }

    public List<SearchResult> getSearchResults() {
        return searchResults;
    }

    @Override
    public String toString() {
        return "SearchResponse{" +
                "searchResults=" + searchResults +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchResponse that = (SearchResponse) o;
        return Objects.equals(searchResults, that.searchResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(searchResults);
    }

    @Override
    public SearchResponse clone() {
        try {
            SearchResponse cloned = (SearchResponse) super.clone();
            cloned.searchResults = new ArrayList<>(this.searchResults.size());
            for (SearchResult result : this.searchResults) {
                cloned.searchResults.add(result.clone());
            }
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}