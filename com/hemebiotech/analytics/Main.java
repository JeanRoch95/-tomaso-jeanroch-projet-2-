package com.hemebiotech.analytics;

import java.util.Map;
import java.util.List;

public class Main {

  /**
  * Call method from AnalyticsCounter.
  * { @link AnalyticsCounter }
  */
  public static void main(String[] args) {
    ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
    ISymptomWriter writer = new WriteSymptomDataToFile("result.out");
    AnalyticsCounter analyticsCounter = new AnalyticsCounter(reader, writer);
    List<String> symptomsList = analyticsCounter.getSymptoms();
    Map<String, Integer> countSymptoms = analyticsCounter.countSymptoms(symptomsList);
    Map<String, Integer> sortSymptoms = analyticsCounter.sortSymptoms(countSymptoms);

    analyticsCounter.writeSymptoms(sortSymptoms);
  }
}