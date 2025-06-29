package model;
import static model.constants.Colour.*;
import static model.constants.Discount.greenAppleDiscount;
import static model.constants.Discount.redAppleDiscount;

public class Apple extends Food{
    private final String colour;
    public Apple(int amount, double price, String colour){
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;
    }

    @Override
    public double getDiscount() {
        if(colour.equals(RED)){
            return redAppleDiscount;
        }
        if (colour.equals(GREEN)){
            return greenAppleDiscount;
        }
        return 0;
    }
}
