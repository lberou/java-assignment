public class ShoppingCart {
    Product product;
    public static String productName;

    public String printInformation(String choice) {
        if (choice.equals("add")) {
            return "Το όνομα του προιόντος που μπήκε στο καλάθι είναι: " + productName;
        } else if (choice.equals("remove")) {
            return "Tο όνομα του προιόντος αφαιρέθηκε απο το καλάθι είναι: " + productName;
        } return "κάτι πήγε λάθος";
    }


    public void addProduct(Product product) {
        if (product.quantity != 0 && this.product == null) {
            this.product = product;
            product.quantity = 0;
            productName = product.getName();
            String printInfo = printInformation("add");
            System.out.println(printInfo);

        } printInformation("λάθος");
    }

    public void removeProduct(Product product) {
        if (product.getName().equals(this.product.name)) {
            productName = product.getName();
            String printInfo2 = printInformation("remove");
            System.out.println(printInfo2);
            product.quantity = 1;
            this.product = null;

        } printInformation("λάθος");

    }

    public void printCheckout() {
        if (product != null) {
            System.out.println("Η τιμή του προιοντος που είναι στο καλάθι είναι: " + product.price);
        } System.out.println("Το καλάθι είναι άδειο");

    }

}
