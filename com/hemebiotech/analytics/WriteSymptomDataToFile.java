package com.hemebiotech.analytics;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.List;
import java.util.HashMap;

public class WriteSymptomDataToFile implements ISymptomWriter {

    private String outPutFilePath;

    public WriteSymptomDataToFile(String outPutFilePath)
    {
        this.outPutFilePath = outPutFilePath;
    }

    @Override
    public void writeSymptoms(Map<String, Integer> symptoms) {
        try {
                FileWriter write = new FileWriter(outPutFilePath);
                    for (Map.Entry<String, Integer> ent : symptoms.entrySet()) {
                        write.write(ent.getKey() + " : " + ent.getValue() + "\n");
                    }
                write.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
