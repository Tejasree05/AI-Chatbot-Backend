package org.demo.Aichatbot.servicelayer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

@Service
public class AIService {

   // public String getAIResponse(String message) {
        // Call OpenAI API here
    //    return "AI response for: " + message;
    //}


       @Value("${openai.api.key}")
       private String apiKey;

       public String processMessage(String message) {
           return callAI(message);
       }

       private String callAI(String message) {
           RestTemplate restTemplate = new RestTemplate();

           String url = "https://api.openai.com/v1/chat/completions";

           HttpHeaders headers = new HttpHeaders();
           headers.setBearerAuth(apiKey);
           headers.setContentType(MediaType.APPLICATION_JSON);

           String body = "{\n" +
                   "  \"model\": \"gpt-4o-mini\",\n" +
                   "  \"messages\": [\n" +
                   "    {\"role\": \"user\", \"content\": \"" + message + "\"}\n" +
                   "  ]\n" +
                   "}";

           HttpEntity<String> request = new HttpEntity<>(body, headers);

           return restTemplate.postForObject(url, request, String.class);
       }
   }
