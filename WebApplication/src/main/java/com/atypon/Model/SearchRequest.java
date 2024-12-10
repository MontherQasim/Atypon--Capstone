package com.atypon.Model;

public class SearchRequest {
    private String searchQuery;

    public String getSearchQuery() {
        return searchQuery;
    }

    public void setSearchQuery(String searchQuery) {
        this.searchQuery = searchQuery;
    }

    @Override
    public String toString() {
        return "SearchRequest{" +
                "searchQuery='" + searchQuery + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchRequest that = (SearchRequest) o;
        return searchQuery.equals(that.searchQuery);
    }

    @Override
    public int hashCode() {
        return searchQuery.hashCode();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object o = super.clone();
        SearchRequest cloned = new SearchRequest();
        cloned.setSearchQuery(this.searchQuery);
        return cloned;
    }
}