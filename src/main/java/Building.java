public class Building {
    private float width;
    private float height;
    private double price;
    private String Color;

    public Building(float width, float height, double price, String color) {
        this.width = width;
        this.height = height;
        this.price = price;
        Color = color;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return Color;
    }

    @Override
    public String toString() {
        return "Building{" +
                "width=" + width +
                ", height=" + height +
                ", price=" + price +
                ", Color='" + Color + '\'' +
                '}';
    }
}
