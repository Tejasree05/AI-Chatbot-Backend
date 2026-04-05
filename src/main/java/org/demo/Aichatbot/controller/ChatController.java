package org.demo.Aichatbot.controller;

import org.demo.Aichatbot.servicelayer.AIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
    @RequestMapping("/api/chat/v1")
    public class ChatController {

        @Autowired
        public AIService aiService;

        @GetMapping
        public String test() {
            return "API is working";
        }

      //  @PostMapping
      //  public String chat(@RequestBody String message) {
      //      return "Received: " + message;
       // }

        @PostMapping
        private String chat1(@RequestBody String message) {
            return aiService.processMessage(message);
        }
    }





