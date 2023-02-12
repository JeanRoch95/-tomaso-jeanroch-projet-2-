package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class SortSymptoms implements ISymptomsSorting {

    public TreeMap<String, Integer> sortingSymptoms(List<String> symtomList)
    {

        TreeMap<String, Integer> symptomSort = new TreeMap<>();
        for (String listSymptoms : symtomList) {
            if (symptomSort.containsKey(listSymptoms)) {
                symptomSort.put(listSymptoms, symptomSort.get(listSymptoms) + 1);
            } else {
                symptomSort.put(listSymptoms, 1);
            }
        }
        return symptomSort;
    }
}
