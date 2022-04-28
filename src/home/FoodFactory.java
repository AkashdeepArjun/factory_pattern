package home;

public class FoodFactory {

    public static Food  getFood(String type){
        
        if(type.equalsIgnoreCase("fastfood")) return new FastFood();
        else if(type.equalsIgnoreCase("breakfast")) return new BreakFast();
        else {
            return null;
        }
    }


}
