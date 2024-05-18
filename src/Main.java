// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Refrigerator iceBox = new Refrigerator(true);

        DishWasher dishWasher = new DishWasher(true);

        CoffeeMaker brewMaster = new CoffeeMaker(true);

        SmartKitchen sk = new SmartKitchen(false,iceBox,dishWasher,brewMaster);

        sk.doKitchenWork();



        /*
        sk.getRefrigerator().orderFood(true);
        sk.getDishWasher().doDishes(true);
        sk.getCoffeeMaker().brewCoffee(true);
         */

    }
}