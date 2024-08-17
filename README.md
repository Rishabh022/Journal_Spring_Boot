# 📓 Journal App

Welcome to the **Journal App**! This is a backend-only project built with Java Spring Boot, designed as a learning project. It uses MongoDB for data storage and JWT for authentication.

## 🚀 Features

- **User Management**: Create and manage user accounts.
- **Journal Entries**: Add, update, and view personal journal entries.
- **Sentiment Analysis**: Track the sentiment of journal entries.
- **Security**: Secure endpoints with JWT authentication.

## 🛠️ Technologies Used

- **Spring Boot**: Framework for building the backend.
- **MongoDB**: NoSQL database for storing user data and journal entries.
- **JWT**: For secure authentication.
- **Lombok**: Reduces boilerplate code.

## 📂 Project Structure

- **`src/main/java/com/rishabh/journalApp/entity/`**: Contains entity classes:
  - **`User`**: Represents a user with fields for `id`, `userName`, `email`, `sentimentAnalysis`, `password`, `journalEntries`, and `roles`.
  - **`JournalEntry`**: Represents a journal entry with fields for `id`, `title`, `content`, `data`, and `sentiment`.
