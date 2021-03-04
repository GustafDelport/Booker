package DataAccessLayer;

import java.util.Collections;
import java.util.List;

public class Menu {
    private int foodItem;
    private String foodName;
    private String foodType;
    private String foodDescription;

    public Menu(){}

    public Menu(int foodItem, String foodName, String foodType, String foodDescription) {
        this.foodItem = foodItem;
        this.foodName = foodName;
        this.foodType = foodType;
        this.foodDescription = foodDescription;
    }

    public List<Menu> getMenus(){

        // Temporary - used instead of "null"
        return Collections.emptyList();
    }

    public int getFoodItem() {
        return foodItem;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getFoodType() {
        return foodType;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

}
