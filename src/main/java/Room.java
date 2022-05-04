public class Room {
   private float width;
   private float lenght;
   private float height;
   private int numberOfRooms;

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLenght() {
        return lenght;
    }

    public void setLenght(float lenght) {
        this.lenght = lenght;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public Room(float width, float lenght, float height, int numberOfRooms) {
        this.width = width;
        this.lenght = lenght;
        this.height = height;
        this.numberOfRooms = numberOfRooms;
    }

    @Override
    public String toString() {
        return "Room{" +
                "width=" + width +
                ", lenght=" + lenght +
                ", height=" + height +
                ", numberOfRooms=" + numberOfRooms +
                '}';
    }
}
