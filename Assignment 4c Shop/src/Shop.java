public class Shop {

    public static void main(String[] args) {
        Product product1 = new Product("Trouser", 61);
        Product product2 = new Product("Shirt", 30.5);

        Customer cust = new Customer(327, new ShoppingCart());

        //αγοράσετε το 1ο προιόν
        cust.shoppingOptions("add", product1);
        //αφαιρέστε το 1ο προιόν
        cust.shoppingOptions("remove", product1);
        //προσθέστε το 1ο προιον
        cust.shoppingOptions("add", product1);

        //μετα το 2ο προιον.εδώ δεν γίνεται η πρόσθεση του 2ου προιοντος γιατι από εκφώνηση η addProduct
        //δέχεται ενα product και ελέγχει αν είναι διαθέσιμο το προιόν και αν το καλάθι δεν εχει προιόν.
        //Αν ναι και στα δυο τότε το προσθέτει. Εδω το καλάθι δεν είναι άδειο γιατί υπάρχει το
        //product1.
        cust.shoppingOptions("add", product2);
        //αφαιρέσετε το 2ο προιόν. Το 2ο προιον δεν προστεθηκε στο προηγουμενο βημα αρα δεν αφαιρειται.
        cust.shoppingOptions("remove", product2);
        //checkout
        cust.checkout();

    }

}
