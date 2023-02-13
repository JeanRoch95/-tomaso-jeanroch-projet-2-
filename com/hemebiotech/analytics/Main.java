package com.hemebiotech.analytics;


public class Main {

  /**
  * Call method from AnalyticsCounter.
  * { @link AnalyticsCounter }
  */
  public static void main(String[] args) {
    ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
    ISymptomWriter writer = new WriteSymptomDataToFile("result.out");
    AnalyticsCounter analyticsCounter = new AnalyticsCounter(reader, writer);
    writer.writeSymptoms(
        analyticsCounter.sortSymptoms(
            analyticsCounter.countSymptoms(
                analyticsCounter.getSymptoms()
                )));
  }
}