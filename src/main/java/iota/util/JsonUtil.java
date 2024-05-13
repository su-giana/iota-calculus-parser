package iota.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class JsonUtil {
    final static private ObjectMapper objectMapper = new ObjectMapper();

    public static List<String> processJsonList(String jsonContext) {
        List<String> elementsAsString = new ArrayList<>();
        try {
            JsonNode rootNode = objectMapper.readTree(jsonContext);

            if (rootNode.isArray()) {
                for (JsonNode elementNode : rootNode) {
                    elementsAsString.add(elementNode.toString());
                }
            }
        } catch (JsonMappingException e) {
            System.out.println("[ERROR] JsonUtil : Json 매핑 실패");
        } catch (JsonProcessingException e) {
            System.out.println("[ERROR] JsonUtil : Json 프로세싱 실패");
        }
        return elementsAsString;
    }

    public static String bodyFromJsonByKey(String jsonContext, String key) {
        try {
            JsonNode rootNode = objectMapper.readTree(jsonContext);

            if (rootNode.has(key)) {
                JsonNode keyNodes = rootNode.path(key);
                return keyNodes.toString();
            }
            throw new RuntimeException("[ERROR] 찾는 키의 값 " + key + "가 없습니다.");
        } catch (JsonMappingException e) {
            System.out.println("[ERROR] JsonUtil : Json 매핑 실패");
        } catch (JsonProcessingException e) {
            System.out.println("[ERROR] JsonUtil : Json 프로세싱 실패");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        return "";
    }

    public static boolean hasKey(String jsonContext, String key) {
        try {
            JsonNode rootNode = objectMapper.readTree(jsonContext);
            return rootNode.has(key);
        } catch (JsonMappingException e) {
            System.out.println("[ERROR] JsonUtil : Json 매핑 실패");
        } catch (JsonProcessingException e) {
            System.out.println("[ERROR] JsonUtil : Json 프로세싱 실패");
        }
        return false;
    }
}
