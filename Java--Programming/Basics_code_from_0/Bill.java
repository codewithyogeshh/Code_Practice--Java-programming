class Main {
    public static void main(String[] args) {
        double price = 250.0;
        int quantity = 3;
        double amountPaid = 1000.0;

        double totalBill = price * quantity;
        double change = amountPaid - totalBill;

        System.out.println("Product price: Rs. " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total bill: Rs. " + totalBill);
        System.out.println("Amount paid: Rs. " + amountPaid);
        System.out.println("Change: Rs. " + change);
    }
}
