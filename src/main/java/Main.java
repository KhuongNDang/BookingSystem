import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class Main {

    public static void main (String[] args) {


        User user1 = new User("David");
        User user2 = new User("Hugo");


        BookingSystem bookingSystem = new BookingSystem();

        Room room1 = new Room(1, 10);
        Room room2 = new Room(2, 10);
        Room room3 = new Room(3, 20);
        Room room4 = new Room(4, 20);
        Room room5 = new Room(5, 30);
        Room room6 = new Room(6, 30);
        Room room7 = new Room(7, 40);
        Room room8 = new Room(8, 40);
        Room room9 = new Room(9, 50);
        Room room10 = new Room(10, 50);

        bookingSystem.allRooms.add(room1);
        bookingSystem.allRooms.add(room2);
        bookingSystem.allRooms.add(room3);
        bookingSystem.allRooms.add(room4);
        bookingSystem.allRooms.add(room5);
        bookingSystem.allRooms.add(room6);
        bookingSystem.allRooms.add(room7);
        bookingSystem.allRooms.add(room8);
        bookingSystem.allRooms.add(room9);
        bookingSystem.allRooms.add(room10);


        Booking booking1 = bookingSystem.bookRoom(room5,LocalDate.of(2024,12,12),user1);
        Booking booking2 = bookingSystem.bookRoom(room5,LocalDate.of(2024,12,13),user1);
        Booking booking3 = bookingSystem.bookRoom(room5,LocalDate.of(2024,12,14),user1);
        Booking booking4 = bookingSystem.bookRoom(room5,LocalDate.of(2024,12,15),user1);

        System.out.println();

        bookingSystem.cancelRoom(booking1);

        System.out.println();

        bookingSystem.isAvailable(room5,LocalDate.of(2024,12,12));

        System.out.println();

        bookingSystem.findAvailable(25, LocalDate.of(2024,12,14));
        bookingSystem.findAvailable(25, LocalDate.of(2024,12,15));
        bookingSystem.findAvailable(25, LocalDate.of(2024,12,16));
        bookingSystem.findAvailable(25, LocalDate.of(2024,12,17));
        bookingSystem.findAvailable(25, LocalDate.of(2024,12,18));

        System.out.println();

        bookingSystem.bookRoom(room5,LocalDate.of(2024,12,15),user2);
        bookingSystem.bookRoom(room5,LocalDate.of(2024,12,16),user2);
        bookingSystem.bookRoom(room5,LocalDate.of(2024,12,17),user2);
        bookingSystem.bookRoom(room5,LocalDate.of(2024,12,18),user2);

        System.out.println();

        bookingSystem.findAvailable(25, LocalDate.of(2024,12,18));
        bookingSystem.findAvailable(25, LocalDate.of(2024,12,19));
        bookingSystem.findAvailable(25, LocalDate.of(2024,12,20));

        System.out.println();


    }
}
