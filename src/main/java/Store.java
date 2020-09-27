import java.util.ArrayList;

public class Store {
    private String name;
    private String owner_name;
    private ArrayList<Necklace> product;

    public Store(String name, String owner_name, ArrayList<Necklace> product) {
        this.name = name;
        this.owner_name = owner_name;
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public ArrayList<Necklace> getProduct() {
        return product;
    }

    public void setProduct(ArrayList product) {
        this.product = product;
    }
    public void sell(double itemId){
       /* for ( Necklace currentNecklace : product) //pulling the currentNecklace out of product(list)
        { if(currentNecklace.getItem_id() == itemId){ //comparing the itemId
        product.remove(currentNecklace); //the name of the LIST comes before the .add / .remove
            System.out.println(currentNecklace.getName() + " has been sold!");
        }*/

        for(int index = 0; index< product.size(); index++){ //index is the location where the current necklace
            if(product.get(index).getItem_id() == itemId){
                product.remove(product.get(index));
                System.out.println(product.get(index).getName() + " has been sold!");
            }
        }
    }
    public void restock(){
        while(product.size() < 20){ //while the SIZE(length of arraylist) is less than 20 print ....
           Necklace newNecklace = new Necklace(25.0,"New Necklace", Math.random(),30);
            product.add(newNecklace);//adding new necklace to the list
        }
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", owner_name='" + owner_name + '\'' +
                ", product=" + product +
                '}';
    }
}
