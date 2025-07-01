package model;
import static model.constants.Discount.MEAT_DISCOUNT;

public class Meat extends  Food{
    public Meat(int amount, double price){
        this.amount = amount;
        this.price = price;
        this.isVegetarian = false;
    }
    @Override
    public double getDiscount(){
        return MEAT_DISCOUNT;
    }
}
