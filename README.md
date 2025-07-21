In this project, I built a Hotel Booking API using Spring Boot.
It allows users to register and log in as either customers, hotel managers, or admins. Customers can view available hotels and book rooms, while managers can update hotel details and manage bookings, and admins can create and delete hotels.
For authentication, I implemented JWT token-based security to protect APIs, ensuring only authorized users can access specific actions, like booking or managing hotels.
It also handles cases like no rooms available, invalid booking dates, and role-based restrictions cleanly, returning meaningful error messages.
For the database, I used Spring Data JPA with MySQL for development and testing to store hotel, user, and booking data.
Additionally, I wrote clear test cases to validate user registration, login, booking flows, and access restrictions to ensure the API behaves correctly.
Overall, this project helped me strengthen my skills in Spring Boot REST API design, security implementation using JWT, exception handling, and unit testing.
