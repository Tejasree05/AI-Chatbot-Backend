package org.demo.Aichatbot.Repo;


import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository<ChatMessage> extends JpaRepository<ChatMessage, Long>{

}
