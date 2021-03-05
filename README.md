# Booker
This is a joint project between team mates for a fictional business "Delicious-Catering". In this system called "Booker" we aim to make a simple online booking system for her clients.


## Layout
### BusinessLogicLayer
- Booking
    - bookBaptism
    - bookBirthDay
    - bookParty
    - bookWedding
    - bookYearEnd
- Handlers  
    - AccountHandler
    - BookingContext
    - BookingHandler
    - BookingInterface
    - NotificationHandler
    - StorageHandler

### DataAccessLayer
- DataObjects
    - Admin
    - bookings
    - Decorations
    - Menu
    - user
- Handlers
    - LogisticsHandler
- Serialisation
    - Deserialiser
    - Serialiser
- TextFiles
    - Decorations.txt
    - Food.txt

### PresentationLayer
- Displays

### SerialisedObjects
- Adminfiles
    - Stores all the notifications
- BookingData
    - Stores all booking data made by users
- ClientData
    - Stores all user data

## Logins
The **Admin** login will allow certain actions and tasks that would've otherwise not possible, for example; The admin user can approve bookings and update the "pending" status of user bookings.

### Login
**Username:** Admin<br>
**Password:** 123

## UML Design
![detailed UML design](https://github.com/GustafDelport/Booker/blob/Master/Documentation/Booker%20UML%20Design.jpg)