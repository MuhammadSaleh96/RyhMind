# Rhymind 🗓️📌

Rhymind is a personal **event/reminder scheduler** built with **Kotlin** for Android. It integrates with **Firebase Database** to store and manage events efficiently. The app features a **custom calendar**, **Google Maps SDK integration** for location-based scheduling, **user group management** for sharing reminders, and an **Alarm Manager/Receiver Service** for notifications.

## Features:
✅ **Event Scheduling** – Create, update, and delete reminders effortlessly.  
✅ **Firebase Integration** – Secure real-time data storage and synchronization.  
✅ **Custom Calendar** – Easily view and manage events in an interactive calendar.  
✅ **Google Maps SDK** – Set event locations and calculate traffic-based distances.  
✅ **User Group Management** – Share events and reminders with selected groups.  
✅ **Smart Notifications** – Uses **Alarm Manager/Receiver Service** for timely alerts.

## Installation:

1. Clone this repository:
   ```bash
   git clone https://github.com/MuhammadSaleh96/RhyMind.git


2. Navigate to the project directory:
   ```bash
   cd RhyMind

API key setup:
To enable Google Maps SDK integration, you need to provide your Google Maps API Key.
### Option 1: Use `secrets.properties`
1. Create a `secrets.properties` file in the project’s root directory.
2. Add the following line to the `secrets.properties` file:
   ```properties
   MAPS_API_KEY="YOUR-API-KEY"

### Option 2: Use the assets Folder
1. Create an assets folder inside src/main (if it doesn't exist).
2. Add a secrets.properties file inside the assets folder with the following content:
   ```properties
   MAPS_API_KEY="YOUR-API-KEY"

## Running the Project:
Open the project in Android Studio.
Build and run the project on your emulator or physical device.
## Contributing:
We welcome contributions! Feel free to fork the project, submit issues, and create pull requests.






