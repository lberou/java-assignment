public class ShoppingCart {
    public static void main(String[] args) {
        //1
        String custName = "Alex";
        //2
        String itemDesc = "πουκάμισα";
        //3,4
        String message = "Ο " + custName + " θέλει να αγοράσει " + itemDesc + ".";
        //5
        System.out.println(message);

        double price = 35.7;
        double tax = 0.20;
        int quantity = 2;

        double totalPrice = (price + (price * tax)) * quantity;

        String messageNew = "Ο " + custName + " θέλει να αγοράσει " + quantity + " " + itemDesc + ".";
        System.out.println(messageNew);
        System.out.println("Συνολικό κόστος με φόρο: " + totalPrice);
    }
}
