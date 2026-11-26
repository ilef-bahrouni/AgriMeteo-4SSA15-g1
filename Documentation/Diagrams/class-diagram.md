
# Notification Service - Class Diagram

## Description

The Notification Service manages weather alerts and irrigation recommendations sent to farmers.

## Class Diagram

```mermaid
classDiagram

class Notification {
    Long id
    Long userId
    String title
    String message
    NotificationType type
    NotificationStatus status
    LocalDateTime createdAt
    markAsRead()
}

class NotificationPreference {
    Long id
    Long userId
    Boolean weatherAlerts
    Boolean irrigationAlerts
    String channel
}

class NotificationService {
    createNotification()
    getNotificationsByUser()
    markAsRead()
    deleteNotification()
    checkPreferences()
}

class NotificationController {
    createNotification()
    getNotificationsByUser()
    markAsRead()
    deleteNotification()
    getPreferences()
    updatePreferences()
}

class NotificationRepository {
    save()
    findById()
    findByUserId()
    delete()
}

class NotificationPreferenceRepository {
    save()
    findByUserId()
}

class NotificationType {
    WEATHER_ALERT
    IRRIGATION_RECOMMENDATION
}

class NotificationStatus {
    UNREAD
    READ
}

NotificationController --> NotificationService
NotificationService --> NotificationRepository
NotificationService --> NotificationPreferenceRepository
NotificationService --> NotificationPreference
NotificationRepository --> Notification
Notification --> NotificationType
Notification --> NotificationStatus
```

## Explanation

- **Notification:** Represents an alert or recommendation sent to a farmer.
- **NotificationPreference:** Stores the farmer's notification preferences.
- **NotificationController:** Exposes REST API endpoints.
- **NotificationService:** Contains the business logic.
- **NotificationRepository:** Handles database operations using Spring Data JPA.

## Technologies

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
