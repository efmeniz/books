package com.util.data;

import java.util.List;

public class CustomPage<T> {
    private int page;
    private int limit;
    private int totalElements;
    private int totalPages;
    private List<T> allData;

    public CustomPage(List<T> allData, int page, int limit) {
        this.page = page;
        this.limit = limit;
        this.totalElements = allData.size();
        this.totalPages = (int) Math.ceil((double) totalElements / limit);
        this.allData = allData;
    }

    public int getTotalElements() {
        return totalElements;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public List<T> getData() {

        int firstIndex = (page - 1) * limit;
        int lastIndex = firstIndex + limit;
        if (lastIndex > allData.size()) {
            lastIndex = allData.size();
        }
        if(firstIndex > lastIndex) {
            firstIndex=lastIndex;
        }

        return allData.subList(firstIndex, lastIndex);
    }
}
