
# Notification Service - API Contracts

## Base URL
http://localhost:8085/api/notifications

## 1. Create Notification

**Method:** POST

**Endpoint:** `/api/notifications`

**Description:** Creates a new notification.

**Request Body:**
```json
{
  "userId": 12,
  "title": "Weather Alert",
  "message": "High temperatures are expected tomorrow.",
  "type": "WEATHER_ALERT"
}
```

**Success Response: 201 Created**
```json
{
  "id": 1,
  "userId": 12,
  "title": "Weather Alert",
  "message": "High temperatures are expected tomorrow.",
  "type": "WEATHER_ALERT",
  "status": "UNREAD",
  "createdAt": "2026-11-12T12:00:00"
}
```

## 2. Get User Notifications

**Method:** GET

**Endpoint:** `/api/notifications/user/{userId}`

**Description:** Retrieves all notifications belonging to a user.

**Success Response: 200 OK**

Returns a list of notifications.

## 3. Get Notification By ID

**Method:** GET

**Endpoint:** `/api/notifications/{id}`

**Description:** Retrieves a specific notification.

**Success Response: 200 OK**

Returns notification details.

## 4. Mark Notification As Read

**Method:** PATCH

**Endpoint:** `/api/notifications/{id}/read`

**Description:** Changes notification status to READ.

**Success Response: 200 OK**

```json
{
  "id": 1,
  "status": "READ"
}
```

## 5. Delete Notification

**Method:** DELETE

**Endpoint:** `/api/notifications/{id}`

**Description:** Deletes a notification.

**Success Response: 204 No Content**

## 6. Get Notification Preferences

**Method:** GET

**Endpoint:** `/api/notifications/preferences/{userId}`

**Description:** Retrieves notification preferences for a user.

**Success Response: 200 OK**

```json
{
  "userId": 12,
  "weatherAlerts": true,
  "irrigationAlerts": true,
  "channel": "IN_APP"
}
```

## 7. Update Notification Preferences

**Method:** PUT

**Endpoint:** `/api/notifications/preferences/{userId}`

**Description:** Updates notification preferences.

**Request Body:**
```json
{
  "weatherAlerts": true,
  "irrigationAlerts": false,
  "channel": "IN_APP"
}
```

**Success Response: 200 OK**

Returns the updated preferences.

---

## HTTP Response Codes

| Code | Meaning |
|------|---------|
| 200 | OK - Request successful |
| 201 | Created - Resource created |
| 204 | No Content - Resource deleted |
| 400 | Bad Request - Invalid request |
| 401 | Unauthorized - Authentication required |
| 403 | Forbidden - Access denied |
| 404 | Not Found - Resource not found |
| 500 | Internal Server Error |

## Technologies
- Spring Boot REST API
- Java
- PostgreSQL
- Spring Data JPA
