import java.time.LocalDate;

public class Booking {
    private final Room room;
    private final LocalDate day;
    private final User user;

    public Booking(Room room, LocalDate day, User user) {
        this.room = room;
        this.day = day;
        this.user = user;
    }

    public Room getRoom() {
        return room;
    }

    public LocalDate getDay() {
        return day;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Guest: " + user + ", " + room + ", Day: " + day;
    }

    public Object getSize() {
        return room.getSize();
    }
}
