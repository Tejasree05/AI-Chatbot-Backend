User → API → AI → Save to DB → Return response

ai-chatbot-backend/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── org.demo.Aichatbot/
│   │   │       ├── AIChatbotBackend.java  ← main entry point
│   │   │       ├── controller/            ← handles HTTP requests
│   │   │       ├── service/               ← business logic
│   │   │       ├── repository/            ← database access
│   │   │       └── model/                 ← data structures
│   │   └── resources/
│   │       └── application.properties     ← config file
│   └── test/                              ← your tests go here
├── pom.xml                                ← dependencies list

Simple analogy:
controller  = receptionist (takes requests)
service     = manager (does the thinking)
repository  = filing clerk (talks to database)
model       = the actual files/documents
