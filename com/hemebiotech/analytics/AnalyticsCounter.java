package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {
  private ISymptomReader reader;
  private ISymptomWriter writer;

  
  public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
    this.reader = reader;
    this.writer = writer;
  }

  public List<String> getSymptoms() {
    return reader.getSymptoms();
  }

  /**
  * If no data is available, return an empty List. 
  *
  * @return a list Key => Value and count the symptoms from the list
  */
  public Map<String,Integer> countSymptoms(List<String> symptoms) {
    Map<String, Integer> countSymptoms = new HashMap<>();
    for (String listSymptoms : symptoms) {
      if (countSymptoms.containsKey(listSymptoms)) {
        countSymptoms.put(listSymptoms, countSymptoms.get(listSymptoms) + 1);
      } else {
        countSymptoms.put(listSymptoms, 1);
      }
    }
    return countSymptoms;
  }

  public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) { 
    return new TreeMap<>(symptoms);
  }

  public void writeSymptoms(Map<String, Integer> symptoms) {
    writer.writeSymptoms(sortSymptoms(countSymptoms(getSymptoms())));
  }
}
