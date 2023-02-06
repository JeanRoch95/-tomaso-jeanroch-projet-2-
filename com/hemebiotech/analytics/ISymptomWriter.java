package com.hemebiotech.analytics;

import java.util.Map;


/**
 * Anything the will write symptom data on a valid data output format
 *
 */
public interface ISymptomWriter {
    writeSymptoms(Map<String, Integer> symptoms);
}
