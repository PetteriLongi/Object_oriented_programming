package T2_2;


import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    /* I realized late that it would be probably better to have
       GroceryItem.java as a separate class so I can move to using
       just one Map instead of 3 and get the data to stay together.
       But the assignments talk about Manager always
       so ask the teacher about this.
     */
    private Map<String, Double> groceryList = new HashMap<>();
    private Map<String, String> categories = new HashMap<>();
    private Map<String, Integer> quantities = new HashMap<>();

    public static void main(String[] args) {
        GroceryListManager list = new GroceryListManager();

        list.addItem("Apples", 0.40, "Fruits", 5);
        list.addItem("Bananas", 0.20, "Fruits", 2);
        list.addItem("Milk", 1.79, "Dairy", 1);
        list.addItem("Bread", 2.50, "Bakery", 1);
        list.addItem("Eggs", 4.76, "Dairy", 0);

        System.out.println("Grocery list: ");
        list.displayList();

        System.out.printf("Total cost: %.2f%n", list.calculateTotalCost());

        System.out.println("Fruits:");
        list.displayByCategory("Fruits");

        System.out.println("Available items:");
        list.displayAvailableItems();

        System.out.println("Updating Egg quantity...");
        list.updateQuantity("Eggs", 3);

        System.out.println("Available items after egg update:");
        list.displayAvailableItems();

        System.out.println("Is \"Milk\" in the grocery list? " + list.checkItem("Milk"));

        System.out.println("Removing \"Milk\" from the list...");
        list.removeItem("Milk");

        System.out.println("Updated Grocery List:");
        list.displayList();
        System.out.printf("Total cost: %.2f%n", list.calculateTotalCost());
    }

    public void addItem(String item, double cost, String category, int quantity) {
        if (item == null || item.isBlank()) {
            System.out.println("Error: item cant be empty");
        } else if (cost < 0) {
            System.out.println("Error: Cost cant be negative you sillygoose.");
        } else if (groceryList.containsKey(item)) {
            System.out.println("Error: Item already in list.");
        } else if (category == null || category.isBlank()) {
            System.out.println("Error: Category cant be empty");
        } else if (quantity < 0) {
            System.out.println("Error: quantity cant be negative");
        } else {
            groceryList.put(item, cost);
            categories.put(item, category);
            quantities.put(item, quantity);
        }
    }

    public void removeItem(String item) {
        if (groceryList.containsKey(item)) {
            groceryList.remove(item);
            categories.remove(item);
            quantities.remove(item);
            System.out.println(item + "was removed.");
        } else {
            System.out.println("Error: item not on the list");
        }
    }

    public void displayList() {
        if (groceryList.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            int i = 1;

            for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
                String item = entry.getKey();
                double cost = entry.getValue();

                System.out.println(i + " " + item + " : " + cost + "€ "
                        + "Quantity:" + quantities.get(item));
                i++;
            }
        }
    }
    public void displayByCategory(String category) {
        int i = 1;

        for (Map.Entry<String, String> entry : categories.entrySet()) {
            String item = entry.getKey();
            String itemCategory = entry.getValue();

            if (itemCategory.equalsIgnoreCase(category)) {
                System.out.println(i + item + " : " + groceryList.get(item));
                i++;
            }
        }

        if (i == 1) {
            System.out.println("No items found in this category.");
        }
    }

    public void displayAvailableItems(){
        int i = 1;
        for (Map.Entry<String, Integer> entry : quantities.entrySet()) {
            String item = entry.getKey();
            int quantity = entry.getValue();

            if (quantity > 0) {
                System.out.println(i + ". " + item + " - Quantity: " + quantity);
                i++;
            }
        }

        if (i == 1) {
            System.out.println("No available items.");
        }
    }

    public boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }

    public double calculateTotalCost() {
        double total = 0;

        for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
            String item = entry.getKey();
            double cost = entry.getValue();
            int quantity = quantities.get(item);

            total += cost * quantity;
        }

        return total;
    }

    public void updateQuantity(String item, int newQuantity) {
        if (groceryList.containsKey(item)) {
            if (newQuantity < 0) {
                System.out.println("Error: quantity cant be negative");
            } else {
                quantities.put(item, newQuantity);
            }
        } else {
            System.out.println("Error: item not on the list");
        }
    }
}
