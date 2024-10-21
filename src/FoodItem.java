class FoodItem extends Product {
    private String expiryDate;

    public FoodItem(String name, double price, int quantity, String expiryDate) {
        super(name, price, quantity);
        this.expiryDate = expiryDate;
    }

    // Implementation of the abstract method
    // 5% Discount     
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }

    public void displayProductDetails(){
        displayDetails();
        System.out.println("Expiry Date: " + expiryDate);
    }
}
