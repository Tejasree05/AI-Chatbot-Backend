package org.demo.Aichatbot.model;


import jakarta.persistence.*;

    @Entity
    public class ChatMessage {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String userMessage;
        private String aiResponse;

        // getters & setters
    }
