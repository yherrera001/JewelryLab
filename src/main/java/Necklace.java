public class Necklace {
    private double price;
    private String name;
    private double item_id;
    private int date_created;

    //constructor

    public Necklace(double price, String name, double item_id, int date_created) {
        this.price = price;
        this.name = name;
        this.item_id = item_id;
        this.date_created = date_created;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public int getDate_created() {
        return date_created;
    }

    public void setDate_created(int date_created) {
        this.date_created = date_created;
    }

    @Override
    public String toString() {
        return "\n" + "Necklace{" +
                "price = " + price +
                ", name = '" + name + '\'' +
                ", item_id = " + item_id +
                ", date_created = " + date_created +
                '}';
    }
}

