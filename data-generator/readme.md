# Data Generator

---

## Overview

The Data Generator module provides various services for generating different types of sample/mock data, including
complete data, missing data, error data, and more for various purposes.

Below are some examples of data types.

---

## Data

### Employee attendance records

Biometric fingerprint logs

| employee_id | timestamp | event_type | device_id | location | verify_status | raw_fingerprint_data | error_code | error_message | retry_attempts | resolution_suggested | extra_data |
|-------------|-----------|------------|-----------|----------|---------------|----------------------|------------|---------------|----------------|----------------------|------------|

- Employee ID: A unique identifier for each employee. (nullable)
- Timestamp: The exact time of the check-in or check-out event.
- Event Type: Whether the event is a check-in or a check-out.
- Device ID: The identifier for the fingerprint scanner device.
- Location: The location where the fingerprint data was captured (if multiple locations are involved).
- Verification Status: Indicates whether the fingerprint match was successful.
- Raw Fingerprint Data: If necessary, the actual fingerprint data
  (though typically, only metadata is used for processing).
- Error Specification:
    - Error Code
    - Error Message
    - Retry Attempts
    - Resolutions Suggested
- Extra Data

###### A sample record

```json
{
  "employee_id": "TL-0175",
  "timestamp": "2024-08-22T08:30:00Z",
  "event_type": "check-in",
  "device_id": "FPScanner01",
  "location": "HCM Office - Mitalab - Main Entrance",
  "verification_status": "success",
  "raw_fingerprint_data": "49AFB1C...",
  "error_code": "FINGERPRINT_MISMATCH",
  "error_message": "Fingerprint did not match any stored templates.",
  "retry_attempts": 2,
  "resolution_suggested": "Please try again or contact the administrator.",
  "extra_data": {}
}
```

### Network access of employees

| employee_id | timestamp | access_types | ip_address | mac_address | device | location | resource_types | data_transfer_volume | access_duration | status | session_id | extra_data |
|-------------|-----------|--------------|------------|-------------|--------|----------|----------------|----------------------|-----------------|--------|------------|------------|

- Employee ID: Unique identifier for the employee.
- Timestamp: Date and time of the network access event.
- Access Types: List of types of network access (e.g., login, logout, file download, VPN connection, etc.).
- IP Address: The IP address of the device used for network access.
- MAC Address: The MAC address of the device.
- Device: The name or identifier of the device used for access.
- Location: Geographic location or network segment from which the access was made.
- Resource Types: List of resources accessed (e.g., servers, databases, applications).
- Data Transfer Volume: Amount of data uploaded/downloaded during the session.
- Access Duration: The length of time the network access was active.
- Status: Whether the network access was successful or if there were failed attempts.
- Session ID: Unique identifier for the network access session.
- Error or Security Specification:
    - Error Code
    - Error Message
    - Retry Attempts
    - Security Alerts
    - Resolution Suggested
- Extra Data

###### A sample record

```json
{
  "employee_id": "TL-0175",
  "timestamp": "2024-08-22T09:15:00Z",
  "access_types": [
    "vpn_connection",
    "login"
  ],
  "ip_address": "10.0.1.101",
  "mac_address": "00:1A:2B:3C:4D:5E",
  "device_name": "Laptop-0175",
  "location": "HCM Office - Mitalab - Engineer Department",
  "resource_types": [
    "vpn",
    "database"
  ],
  "data_transfer_volume": "20MB",
  "access_duration": "24 minutes",
  "status": "failed",
  "session_id": [],
  "error_code": "INVALID_CREDENTIALS",
  "error_message": "The username or password provided is incorrect.",
  "retry_attempts": 7,
  "security_alerts": [
    {
      "alert_type": "BRUTE_FORCE_DETECTED",
      "description": "Multiple failed login attempts detected."
    }
  ],
  "resolution_suggested": "Please verify your credentials and try again or reset your password.",
  "extra_data": {}
}
```

---

## Mock/Simulate Error Data Approaches

### Validation Errors

- Wrong data type
- Missing require fields

###### Other mock errors belong to the data_sync module

- [Data Synchronization's documentation](../data-sync/readme.md)

---

## Output Approaches

My expectation of the output is two ways

- **Static Data:** csv files, which are stored inside a specified directory.
- **Dynamic Data:** a data stream provided by one or several running services (instances of this service).
