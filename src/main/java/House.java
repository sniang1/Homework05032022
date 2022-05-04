import java.sql.SQLOutput;

public class House {
    public static void main(String[] args) {


        Room guestRoom = new Room(4.3f, 5.2f, 9.1f, 2);
        Room childRoom = new Room(4.5f, 5.5f, 9.1f, 2);
        Room masterBedroom = new Room(5.5f, 6.2f, 9.1f, 4);
        Building myHouse = new Building(40, 60, 500000, "Brown");

        System.out.println(guestRoom);
        System.out.println(childRoom);
        System.out.println(masterBedroom);
        System.out.println(myHouse);
    }

}
