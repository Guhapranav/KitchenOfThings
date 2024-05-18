public class KitchenApp {
    
    private boolean hasWorkToDo;
    
    public KitchenApp(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void addWater(){
        hasWorkToDo = true;
    }

    public void pourMilk(){
        hasWorkToDo = true;
    }

    public void loadDishwasher(){
        hasWorkToDo = true;
    }
}

class Refrigerator extends KitchenApp{
    public Refrigerator(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }
    public void orderFood(boolean hasWorkToDo){
        if (hasWorkToDo){
            System.out.println("Food ordered");
        }

    }
}

class DishWasher extends KitchenApp{
    public DishWasher(boolean hasWorkToDo){
        super(hasWorkToDo);
    }
    public void doDishes(boolean hasWorkToDo){
        if(hasWorkToDo){
            System.out.println("Do dishes");
        }

    }
}

class CoffeeMaker extends KitchenApp{
    public CoffeeMaker(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }
    public void brewCoffee(boolean hasWorkToDo){
        if(hasWorkToDo){
            System.out.println("Coffee ready!");
        }
    }
}

