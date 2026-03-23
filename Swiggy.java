class Swiggy {

public static double search(String itemName){
double price = 0.0;

if(itemName == "Brownie"){
    price = 80;
    return price;
}
else if(itemName == "Donut"){
    price = 70;
    return price;
}
else if(itemName == "Cupcake"){
    price = 60;
    return price;
}
else if(itemName == "Waffles"){
    price = 120;
    return price;
}
else if(itemName == "Pancakes"){
    price = 140;
    return price;
}
else if(itemName == "Nachos"){
    price = 110;
    return price;
}
else if(itemName == "Popcorn"){
    price = 90;
    return price;
}
else if(itemName == "Hot Dog"){
    price = 100;
    return price;
}
else if(itemName == "Corn Pizza"){
    price = 180;
    return price;
}
else if(itemName == "Veg Wrap"){
    price = 130;
    return price;
}

else if(itemName == "Chicken Wrap"){
    price = 150;
    return price;
}
else if(itemName == "Cheese Sandwich"){
    price = 140;
    return price;
}
else if(itemName == "Grilled Sandwich"){
    price = 150;
    return price;
}
else if(itemName == "Veg Salad"){
    price = 100;
    return price;
}
else if(itemName == "Chicken Salad"){
    price = 160;
    return price;
}
else if(itemName == "Fruit Salad"){
    price = 120;
    return price;
}
else if(itemName == "Chocolate Shake"){
    price = 140;
    return price;
}
else if(itemName == "Strawberry Shake"){
    price = 130;
    return price;
}
else if(itemName == "Vanilla Shake"){
    price = 120;
    return price;
}
else if(itemName == "Mango Shake"){
    price = 110;
    return price;
}

else if(itemName == "Lemon Juice"){
    price = 40;
    return price;
}
else if(itemName == "Orange Juice"){
    price = 60;
    return price;
}
else if(itemName == "Apple Juice"){
    price = 70;
    return price;
}
else if(itemName == "Grape Juice"){
    price = 65;
    return price;
}
else if(itemName == "Energy Drink"){
    price = 120;
    return price;
}
else if(itemName == "Black Coffee"){
    price = 50;
    return price;
}
else if(itemName == "Green Tea"){
    price = 45;
    return price;
}
else if(itemName == "Herbal Tea"){
    price = 55;
    return price;
}
else if(itemName == "Ice Tea"){
    price = 80;
    return price;
}
else if(itemName == "Cold Drink"){
    price = 40;
    return price;
}

else if(itemName == "Milk Cake"){
    price = 150;
    return price;
}
else if(itemName == "Rasgulla"){
    price = 120;
    return price;
}
else if(itemName == "Kaju Katli"){
    price = 200;
    return price;
}
else if(itemName == "Gulab Jamun"){
    price = 100;
    return price;
}
else if(itemName == "Jalebi"){
    price = 90;
    return price;
}
else if(itemName == "Laddu"){
    price = 110;
    return price;
}
else if(itemName == "Barfi"){
    price = 130;
    return price;
}
else if(itemName == "Halwa"){
    price = 140;
    return price;
}
else if(itemName == "Mysore Pak"){
    price = 160;
    return price;
}
else if(itemName == "Soan Papdi"){
    price = 150;
    return price;
}

else if(itemName == "Veg Cutlet"){
    price = 60;
    return price;
}
else if(itemName == "Paneer Roll"){
    price = 140;
    return price;
}
else if(itemName == "Chicken Roll"){
    price = 160;
    return price;
}
else if(itemName == "Egg Roll"){
    price = 120;
    return price;
}
else if(itemName == "Cheese Maggi"){
    price = 90;
    return price;
}
else if(itemName == "Butter Maggi"){
    price = 80;
    return price;
}
else if(itemName == "Veg Pizza"){
    price = 200;
    return price;
}
else if(itemName == "Chicken Pizza"){
    price = 260;
    return price;
}
else if(itemName == "Cheese Burger"){
    price = 150;
    return price;
}
else if(itemName == "Chicken Burger"){
    price = 180;
    return price;
}

else if(itemName == "Paneer Burger"){
    price = 160;
    return price;
}
else if(itemName == "Veg Pasta"){
    price = 140;
    return price;
}
else if(itemName == "Chicken Pasta"){
    price = 180;
    return price;
}
else if(itemName == "White Sauce Pasta"){
    price = 170;
    return price;
}
else if(itemName == "Red Sauce Pasta"){
    price = 160;
    return price;
}
else if(itemName == "Cheese Pasta"){
    price = 190;
    return price;
}
else if(itemName == "Cold Coffee Special"){
    price = 120;
    return price;
}
else if(itemName == "Chocolate Donut"){
    price = 90;
    return price;
}
else if(itemName == "Strawberry Donut"){
    price = 95;
    return price;
}

return price;
}
public static double search(String itemName, int quantity){
double price = 0.0;

if(itemName == "Brownie"){
    price = 80 * quantity;
    return price;
}
else if(itemName == "Donut"){
    price = 70 * quantity;
    return price;
}
else if(itemName == "Cupcake"){
    price = 60 * quantity;
    return price;
}
else if(itemName == "Waffles"){
    price = 120 * quantity;
    return price;
}
else if(itemName == "Pancakes"){
    price = 140 * quantity;
    return price;
}
else if(itemName == "Nachos"){
    price = 110 * quantity;
    return price;
}
else if(itemName == "Popcorn"){
    price = 90 * quantity;
    return price;
}
else if(itemName == "Hot Dog"){
    price = 100 * quantity;
    return price;
}
else if(itemName == "Corn Pizza"){
    price = 180 * quantity;
    return price;
}
else if(itemName == "Veg Wrap"){
    price = 130 * quantity;
    return price;
}

else if(itemName == "Chicken Wrap"){
    price = 150 * quantity;
    return price;
}
else if(itemName == "Cheese Sandwich"){
    price = 140 * quantity;
    return price;
}
else if(itemName == "Grilled Sandwich"){
    price = 150 * quantity;
    return price;
}
else if(itemName == "Veg Salad"){
    price = 100 * quantity;
    return price;
}
else if(itemName == "Chicken Salad"){
    price = 160 * quantity;
    return price;
}
else if(itemName == "Fruit Salad"){
    price = 120 * quantity;
    return price;
}
else if(itemName == "Chocolate Shake"){
    price = 140 * quantity;
    return price;
}
else if(itemName == "Strawberry Shake"){
    price = 130 * quantity;
    return price;
}
else if(itemName == "Vanilla Shake"){
    price = 120 * quantity;
    return price;
}
else if(itemName == "Mango Shake"){
    price = 110 * quantity;
    return price;
}

else if(itemName == "Lemon Juice"){
    price = 40 * quantity;
    return price;
}
else if(itemName == "Orange Juice"){
    price = 60 * quantity;
    return price;
}
else if(itemName == "Apple Juice"){
    price = 70 * quantity;
    return price;
}
else if(itemName == "Grape Juice"){
    price = 65 * quantity;
    return price;
}
else if(itemName == "Energy Drink"){
    price = 120 * quantity;
    return price;
}
else if(itemName == "Black Coffee"){
    price = 50 * quantity;
    return price;
}
else if(itemName == "Green Tea"){
    price = 45 * quantity;
    return price;
}
else if(itemName == "Herbal Tea"){
    price = 55 * quantity;
    return price;
}
else if(itemName == "Ice Tea"){
    price = 80 * quantity;
    return price;
}
else if(itemName == "Cold Drink"){
    price = 40 * quantity;
    return price;
}

else if(itemName == "Milk Cake"){
    price = 150 * quantity;
    return price;
}
else if(itemName == "Rasgulla"){
    price = 120 * quantity;
    return price;
}
else if(itemName == "Kaju Katli"){
    price = 200 * quantity;
    return price;
}
else if(itemName == "Gulab Jamun"){
    price = 100 * quantity;
    return price;
}
else if(itemName == "Jalebi"){
    price = 90 * quantity;
    return price;
}
else if(itemName == "Laddu"){
    price = 110 * quantity;
    return price;
}
else if(itemName == "Barfi"){
    price = 130 * quantity;
    return price;
}
else if(itemName == "Halwa"){
    price = 140 * quantity;
    return price;
}
else if(itemName == "Mysore Pak"){
    price = 160 * quantity;
    return price;
}
else if(itemName == "Soan Papdi"){
    price = 150 * quantity;
    return price;
}

else if(itemName == "Veg Cutlet"){
    price = 60 * quantity;
    return price;
}
else if(itemName == "Paneer Roll"){
    price = 140 * quantity;
    return price;
}
else if(itemName == "Chicken Roll"){
    price = 160 * quantity;
    return price;
}
else if(itemName == "Egg Roll"){
    price = 120 * quantity;
    return price;
}
else if(itemName == "Cheese Maggi"){
    price = 90 * quantity;
    return price;
}
else if(itemName == "Butter Maggi"){
    price = 80 * quantity;
    return price;
}
else if(itemName == "Veg Pizza"){
    price = 200 * quantity;
    return price;
}
else if(itemName == "Chicken Pizza"){
    price = 260 * quantity;
    return price;
}
else if(itemName == "Cheese Burger"){
    price = 150 * quantity;
    return price;
}
else if(itemName == "Chicken Burger"){
    price = 180 * quantity;
    return price;
}

else if(itemName == "Paneer Burger"){
    price = 160 * quantity;
    return price;
}
else if(itemName == "Veg Pasta"){
    price = 140 * quantity;
    return price;
}
else if(itemName == "Chicken Pasta"){
    price = 180 * quantity;
    return price;
}
else if(itemName == "White Sauce Pasta"){
    price = 170 * quantity;
    return price;
}
else if(itemName == "Red Sauce Pasta"){
    price = 160 * quantity;
    return price;
}
else if(itemName == "Cheese Pasta"){
    price = 190 * quantity;
    return price;
}
else if(itemName == "Cold Coffee Special"){
    price = 120 * quantity;
    return price;
}
else if(itemName == "Chocolate Donut"){
    price = 90 * quantity;
    return price;
}
else if(itemName == "Strawberry Donut"){
    price = 95 * quantity;
    return price;
}

else{
    System.out.println("Item not Found");
}

return price;
}
}