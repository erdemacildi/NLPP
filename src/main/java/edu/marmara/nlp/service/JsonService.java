package edu.marmara.nlp.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.marmara.nlp.model.CaseObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class JsonService {

    private static final int START = 1;
    private static final int END = 27842;

    public Map<String, CaseObject> readDataset() throws IOException {
        return readJsonFiles();
    }

    private Map<String, CaseObject> readJsonFiles() {
        Map<String, CaseObject> target = new HashMap<String, CaseObject>();
        for (int i = START; i <= END; i++) {
            try {
                target.put(String.valueOf(i), readFile("dataset/" + i + ".json"));
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        return target;
    }

    private CaseObject readFile(String fileName) throws IOException {
        InputStream is = getClass().getClassLoader().getResourceAsStream(fileName);
        if (is == null) {
            throw new RuntimeException("Unable to find file " + fileName);
        }
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(is, CaseObject.class);
    }
}
