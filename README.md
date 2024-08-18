# 📓 Journal App

Welcome to the **Journal App**! This is a backend-only project built with Java Spring Boot, designed as a learning project. It uses MongoDB for data storage and JWT for authentication.

## 🚀 Features

- **User Management**: Create and manage user accounts.
- **Journal Entries**: Add, update, and view personal journal entries.
- **Mail Services**: Integrated email notifications.
- **Security**: Secure endpoints with JWT authentication.
- **Log Book**: Track user activity with a log book feature.

## 🛠️ Technologies Used

- **Spring Boot**: Framework for building the backend.
- **MongoDB**: NoSQL database for storing user data and journal entries.
- **JWT**: For secure authentication.
- **Lombok**: Reduces boilerplate code.

## 📸 Screenshots

- ![Screenshot 1082](https://github.com/Rishabh022/Journal_Spring_Boot/blob/main/Screenshot%20(1082).png)
- ![Screenshot 1081](https://github.com/Rishabh022/Journal_Spring_Boot/blob/main/Screenshot%20(1081).png)

## 📂 Project Structure

- **`src/main/java/com/rishabh/journalApp/`**: Main project package.
  - **`JournalApplication.java`**: Entry point of the application.
  - **`config/`**: Contains configuration files.
    - **`SpringSecurity.java`**: Configures security settings.
  - **`controller/`**: Contains REST controllers.
    - **`AdminController.java`**: Manages admin operations.
    - **`JournalEntryController.java`**: Manages journal entries.
    - **`PublicController.java`**: Handles public API endpoints.
    - **`UserController.java`**: Manages user-related operations.
  - **`entity/`**: Contains entity classes.
    - **`User.java`**: Represents a user.
    - **`JournalEntry.java`**: Represents a journal entry.
  - **`enums/`**: Contains enums.
    - **`Sentiment.java`**: Enum for sentiment types.
  - **`filter/`**: Contains filter classes.
    - **`JwtFilter.java`**: Filters requests based on JWT.
  - **`model/`**: Contains model classes.
    - **`SentimentData.java`**: Holds sentiment analysis data.
  - **`repository/`**: Contains repository interfaces.
    - **`JournalEntryRepository.java`**: Handles journal entry persistence.
    - **`UserRepository.java`**: Manages user data.
    - **`UserRepositoryImpl.java`**: Custom implementation for user repository.
  - **`scheduler/`**: Contains scheduled tasks.
    - **`UserScheduler.java`**: Handles user-related scheduled tasks.
  - **`service/`**: Contains service classes.
    - **`EmailService.java`**: Manages email notifications.
    - **`JournalEntryService.java`**: Manages journal entry operations.
    - **`UserDetailsServiceImpl.java`**: Loads user details for authentication.
    - **`UserService.java`**: Manages user-related business logic.
  - **`utilis/`**: Contains utility classes.
    - **`JwtUtil.java`**: Utility class for JWT operations.

