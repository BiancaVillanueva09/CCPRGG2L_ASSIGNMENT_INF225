public class Cashier {
    public void CheckOut(GroceryItem Item) {
        System.out.println("You have bought " + Item.name + ".");
        System.out.println("This item is " + Item.price + " pesos.");
    }
}
