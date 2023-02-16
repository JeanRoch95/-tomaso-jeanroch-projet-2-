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
  * This method count all symptoms since the List and create a Map
  *
  * @return a list Key => Value and count the symptoms from the list
  *     If no data is available, return an empty List
  *
  * @param List<String>
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

  /**
  * This method sort all symptoms since the HashMap and create a TreeMap
  *
  * @return a TreeMap that is sorted alphabetically
  *
  * @param Map<String, Integer>
  */
  public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) { 
    return new TreeMap<>(symptoms);
  }

  public void writeSymptoms(Map<String, Integer> symptoms) {
    writer.writeSymptoms(symptoms);
  }
}
