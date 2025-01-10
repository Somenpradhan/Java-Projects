public class Jacket {
    private String brand;
    private String color;
    private String size;
    private float price;

    public Jacket(String brand, String color, String size, float price) {
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Color: " + color + ", Size: " + size + ", Price: " + price;
    }

    public static void displayCheaperJacket(Jacket jacket1, Jacket jacket2) {
        if (jacket1.getPrice() < 2000 && jacket2.getPrice() < 2000) {
            if (jacket1.getPrice() < jacket2.getPrice()) {
                System.out.println("Cheaper Jacket: " + jacket1);
            } else {
                System.out.println("Cheaper Jacket: " + jacket2);
            }
        } else {
            System.out.println("No jackets are under 2000.");
        }
    }

    public static void main(String[] args) {
        Jacket jacket1 = new Jacket("Nike", "Black", "S", 1500);
        Jacket jacket2 = new Jacket("Wrogn", "Grey", "M", 1600);

        displayCheaperJacket(jacket1, jacket2);
    }
}
