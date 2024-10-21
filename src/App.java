import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Create sample products
        List<Product> products = new ArrayList<>();
        products.add(new Electronics("Smartphone", 29000.00, 1, 1));
        products.add(new Electronics("Laptop", 85000.00, 1, 2));
        products.add(new Clothing("T-Shirt", 799.00, 1, "M", "Cotton"));
        products.add(new Clothing("Jeans pant", 1099.00, 1, "34", "Linen"));
        products.add(new FoodItem("Snack Pack", 65.00, 1, "25-01-2025"));

        // Display the list of products
        System.out.println("Available Products:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ". " + products.get(i).getName());
        }

        System.out.print("Please select a product by entering the corresponding number: ");
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= products.size()) {
            System.out.println("You selected:");
            System.out.println("-----------------------------");
            
            if (products.get(choice - 1) instanceof Electronics) {
                ((Electronics) products.get(choice - 1)).displayProductDetails();
            } else if (products.get(choice - 1) instanceof Clothing) {
                ((Clothing) products.get(choice - 1)).displayProductDetails();
            } else if (products.get(choice - 1) instanceof FoodItem) {
                ((FoodItem) products.get(choice - 1)).displayProductDetails();
            }
        } else {
            System.out.println("Invalid selection. Please select a number between 1 and " + products.size() + ".");
        }

        scanner.close();
    }
}
