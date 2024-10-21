class Electronics extends Product {
    private int warrantyPeriod;

    public Electronics(String name, double price, int quantity, int warrantyPeriod){
        super(name, price, quantity);
        this.warrantyPeriod = warrantyPeriod;
    }

    // Implementation of the abstract method
    // 10% Discount 
    @Override
    public double calculateDiscount(){
        return getPrice() * 0.1;
    }

    public void displayProductDetails(){
        displayDetails();
        System.out.println("Warranty Periods: " + warrantyPeriod + " years");
    }
    
}
