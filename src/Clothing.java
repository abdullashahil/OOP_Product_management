class Clothing extends Product {
    private String size;
    private String fabric;

    public Clothing(String name, double price, int quantity, String size, String fabric) {
        super(name, price, quantity);
        this.size = size;
        this.fabric = fabric;
    }

    // Implementation of the abstract method
    // 20% Discount     
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.2; 
    }

    public void displayProductDetails(){
        displayDetails();
        System.out.println("Size: " + size);
        System.out.println("Fabric: " + fabric);
    }
}
