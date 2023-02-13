package com.hemebiotech.analytics;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.List;
import java.util.HashMap;

public class WriteSymptomDataToFile implements ISymptomWriter {
    @Override
    public void writeSymptoms(Map<String, Integer> symptoms) {
        try {
                FileWriter write = new FileWriter("result.out");
                    for (Map.Entry<String, Integer> ent : symptoms.entrySet()) {
                        write.write(ent.getKey() + ": " + ent.getValue() + "\n");
                    }
                write.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
