package home;

import java.util.List;

public class TestFoodFactory {
    
    public static void main(String[] args){

        Food my_breakfast= FoodFactory.getFood("breakfast");

        List<String> dhaba_menu=my_breakfast.getMenu();

        int count=0;
        MyUtils.log("TEST FOOD FACTORY", "showing breakfast list");
        for(String food_item:dhaba_menu){
            System.out.println("food item "+count+" "+food_item);
            count++;
        }
        count=0;
        Food fast_food=FoodFactory.getFood("fastfood");
        List<String> food_items=fast_food.getMenu();

        MyUtils.log("TEST FOOD FACTORY", "showing fastfood list");

        for(String food_item:food_items){
         
            System.out.println("food item "+count+" "+food_item);
            count++;
        }

    }
    
}
