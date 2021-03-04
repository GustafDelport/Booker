# Booker
This is a joint project between team mates for a fictional business "Delicious-Catering". In this system called "Booker" we aim to make a simple online booking system for her clients.


## Layout
### BusinessLogicLayer
- AccountHandler
- Notification Handler
- Booking
    - BookingsHandler
        - bookWedding
        - bookBirthday
        - bookYearEnd
        - bookParty
        - bookBaptism

### DataAccessLayer
- AccountDataHandler
    - user
    - bookings
- BookingDataHandler
    - bookings
    - user
- LogisticsDataHandler
    - Menu
    - Decorations

![detailed UML design](https://github.com/GustafDelport/Booker/blob/Master/Old/Booker%20UML%20Design.jpg)