# Notification Service

## 1. Overview

The Notification Service is a backend microservice of the AgriMeteo platform. Its main responsibility is to manage and send meteorological alerts and irrigation recommendations to farmers.

## 2. Responsibilities

- Receive weather alerts from Weather Service.
- Receive irrigation recommendations from Irrigation Service.
- Create and manage notifications.
- Store notification history.
- Manage notification preferences.
- Allow users to consult and mark notifications as read.

## 3. Technologies

- Programming Language: Java
- Framework: Spring Boot
- Database: PostgreSQL
- ORM: Spring Data JPA / Hibernate
- API: REST
- Communication: REST and asynchronous messaging (proposed).

## 4. Main Components

- Notification
- NotificationPreference
- NotificationController
- NotificationService
- NotificationRepository

## 5. API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| POST | /api/notifications | Create notification |
| GET | /api/notifications/user/{userId} | Get user notifications |
| GET | /api/notifications/{id} | Get notification details |
| PATCH | /api/notifications/{id}/read | Mark as read |
| DELETE | /api/notifications/{id} | Delete notification |
| GET | /api/notifications/preferences/{userId} | Get preferences |
| PUT | /api/notifications/preferences/{userId} | Update preferences |

## 6. Inter-Service Communication

### Asynchronous communication
- Weather Service → Notification Service: WeatherAlertDetected
- Irrigation Service → Notification Service: IrrigationRecommendationCreated

### Synchronous communication
- Notification Service → User Service: Retrieve user information and preferences (if required).

## 7. Database

PostgreSQL is used to store:
- Notifications
- Notification preferences

## 8. Development Status

Current phase: Architecture and design.

Implementation: Pending.