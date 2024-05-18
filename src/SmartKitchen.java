public class SmartKitchen extends KitchenApp{

    private boolean hasWorkToDo;

    private Refrigerator refrigerator;
    private DishWasher dishWasher;
    private CoffeeMaker coffeeMaker;


    public SmartKitchen(boolean hasWorkToDo, Refrigerator refrigerator, DishWasher dishWasher, CoffeeMaker coffeeMaker) {
        super(hasWorkToDo);
        this.refrigerator = refrigerator;
        this.dishWasher = dishWasher;
        this.coffeeMaker = coffeeMaker;
    }

    /*

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }
    */

    public void setKitchenState(boolean hasWorkToDo){

    }

    public void doKitchenWork(){
        refrigerator.orderFood(false);
        dishWasher.doDishes(true);
        coffeeMaker.brewCoffee(true);


    }

}
