package edu.marmara.nlp;

import edu.marmara.nlp.model.CaseObject;
import edu.marmara.nlp.service.JsonService;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        JsonService jsonService = new JsonService();
        Map<String, CaseObject> stringCaseObjectMap = jsonService.readDataset();
        System.out.println(stringCaseObjectMap.get("1").getIctihat());
        Set<String> keys = stringCaseObjectMap.keySet();

        for (String key : keys) {
            CaseObject currentCaseObject = stringCaseObjectMap.get(key);
            String ictihat = currentCaseObject.getIctihat();
            // Tokenize et
            // NGramları bul bu case object için
        }
    }
}
