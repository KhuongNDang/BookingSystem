import java.time.LocalDate;

public class Room {
    int number;
    int size;

    // Constructor for Room
    public Room(int number, int size) {
        this.number = number;
        this.size = size;
    }


    public int getSize() {
        return size;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString(){
        return "Room: " + number + ", size: " + size;
    }
}
