import model.*;
import static model.constants.Colour.RED;
import static model.constants.Colour.GREEN;
import service.ShoppingCart;
public class Main {
    public static void main (String[] args){
        Meat meat = new Meat(5,100);
        Apple appleRed = new Apple(10,50, RED);
        Apple appleGreen = new Apple(8,60, GREEN);

        Food[] list = new Food[]{meat, appleRed, appleGreen};
        ShoppingCart shoppingCart = new ShoppingCart(list);

        System.out.println("Общая цена: "+ shoppingCart.getSumPrice());
        System.out.println("Общая цена со скидкой: "+ shoppingCart.getDiscountedSumPrice());
        System.out.println("Общая цена вегетарианских продуктов: "+ shoppingCart.getVegetarianSumPrice());
    }
}
