package service;

import model.Food;

public class ShoppingCart {
    private final Food[] list;
    public ShoppingCart(Food[] list){
        this.list = list;
    }
    public double getSumPrice(){
        double sumPrice = 0;
        for (Food food : list) {
            sumPrice += food.getPrice() * food.getAmount();
        }
        return sumPrice;
    }

    public double getDiscountedSumPrice(){
        double sumPrice = 0;
        for (Food food: list){
            sumPrice += (food.getPrice() - food.getDiscount()/100 * food.getPrice()) * food.getAmount();
        }
        return sumPrice;
    }

    public double getVegetarianSumPrice(){
        double sumPrice = 0;
        for (Food food: list){
            if(food.isVegetarian()){
            sumPrice += food.getPrice()* food.getAmount();
            }
        }
        return sumPrice;
    }
}
