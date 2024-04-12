public class Main {
    public static void main(String[] args){

        // θα δημιουργηθούν 3 πιάτα και 3 ποτά
        OrderManagement manageOrders=new OrderManagement();

        manageOrders.plates[0] =new Plate(1,"Fried Eggs",6);
        manageOrders.plates[1] =new Plate(2,"Stuffed Tomatoes",7);
        manageOrders.plates[2] =new Plate(3,"Fish",12.5);

        manageOrders.drinks[0] =new Drink(5,"Red Wine",7.5);
        manageOrders.drinks[1] =new Drink(8,"White Wine",8);
        manageOrders.drinks[2] =new Drink(13,"Beer",5.5);

        manageOrders.orderOptions();

    }
}
