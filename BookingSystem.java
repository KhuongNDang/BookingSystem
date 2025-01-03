import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class BookingSystem {

    public List<Room> allRooms;
    LocalDate day;
    User user;
    Room room;
    private Booking booking;
    private List<Booking> bookings;


    public BookingSystem() {
        this.bookings = new ArrayList<>();
        this.allRooms = new ArrayList<>();
    }


    public boolean checkAvailable(Room room, LocalDate day) {
        for (Booking booking : bookings) {
            if (booking.getRoom().equals(room) && booking.getDay().equals(day)) {
                return false; // Room is not available
            }
        }
        return true; // Room is available
    }



    public void isAvailable(Room room, LocalDate day) {
        if (checkAvailable(room, day)) {
            System.out.println("Room " + room.getNumber() + ", size: " + room.getSize() + " is available on " + day);
        } else {
            System.out.println("Room " + room.getNumber() + " is already booked on " + day);
        }
    }



    public List<Room> findAvailable(int minCapacity, LocalDate day) {
        List<Room> availableRooms = new ArrayList<>();

        for (Room room : allRooms) {
            if (room.getSize() >= minCapacity && checkAvailable(room, day)) {
                availableRooms.add(room);
            }
        }
        if (availableRooms.isEmpty()) {
            System.out.println("No rooms available with minimum capacity " + minCapacity + " on " + day);
        } else {
            System.out.println("Available rooms with minimum capacity " + minCapacity + " on " + day + ": " + availableRooms);
        }

        return availableRooms;
    }


    public Booking bookRoom(Room room, LocalDate day, User user) {
        if (checkAvailable(room, day)) {
            Booking newBooking = new Booking(room, day, user);
            bookings.add(newBooking);
            System.out.println("Booking successful: " + newBooking);
            return newBooking;
        } else {
            System.out.println("Room " + room.getNumber() + " is not available on " + day);
            return null;
        }
    }


    public void cancelRoom(Booking booking) {
        boolean found = false;

        for (int i = 0; i < bookings.size(); i++) {
            Booking b = bookings.get(i);
            if (b.getRoom().equals(booking.getRoom()) && b.getDay().equals(booking.getDay())) {
                bookings.remove(i);
                System.out.println("Room " + booking.getRoom().getNumber() + ", " + "size: " + booking.getSize() + " is cancelled on " + booking.getDay());
                found = true;
                break;
            }
        }

        // If booking was not found, print a message
        if (!found) {
            System.out.println("No booking found for Room " + booking.getRoom().getNumber() + " on " + booking.getDay());
        }
    }

    @Override
    public String toString() {
        return user + " day:  " + day + " room:  " + room;
    }
}

