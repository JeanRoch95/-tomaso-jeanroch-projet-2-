package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public interface ISymptomsSorting {
    public TreeMap<String, Integer> sortingSymptoms(List<String> symtomList);
}
