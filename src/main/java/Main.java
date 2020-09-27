import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Necklace> necklaces = new ArrayList<Necklace>(); //make necklace first

        Necklace purpleNecklace = new Necklace(400,"yas", 345.0, 25); //create necklaces
        Necklace blueNecklace = new Necklace(490, "dean", 876.0, 10);

        necklaces.add(purpleNecklace); //adding it to the lists
        necklaces.add(blueNecklace);

    Store run = new Store("Lamb", "Martha", necklaces);
        run.restock();
        System.out.println(run);
        System.out.println(run);
        run.sell(345);
        run.restock();




    }
}
