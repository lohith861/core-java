class Grap {

public static double search(String itemName){
double price = 0.0;

if(itemName == "Fried Chicken Bucket"){
    price = 299;
    return price;
}
else if(itemName == "Chicken Popcorn"){
    price = 150;
    return price;
}
else if(itemName == "Zinger Burger"){
    price = 180;
    return price;
}
else if(itemName == "Peri Peri Fries"){
    price = 120;
    return price;
}
else if(itemName == "Loaded Fries"){
    price = 140;
    return price;
}
else if(itemName == "Cheese Balls"){
    price = 130;
    return price;
}
else if(itemName == "Garlic Breadsticks"){
    price = 110;
    return price;
}
else if(itemName == "Stuffed Garlic Bread"){
    price = 160;
    return price;
}
else if(itemName == "Paneer Sandwich"){
    price = 150;
    return price;
}
else if(itemName == "Chicken Sandwich"){
    price = 170;
    return price;
}

else if(itemName == "Veg Momos"){
    price = 90;
    return price;
}
else if(itemName == "Chicken Momos"){
    price = 120;
    return price;
}
else if(itemName == "Fried Momos"){
    price = 130;
    return price;
}
else if(itemName == "Steam Momos"){
    price = 100;
    return price;
}
else if(itemName == "Paneer Momos"){
    price = 140;
    return price;
}
else if(itemName == "Spring Rolls"){
    price = 110;
    return price;
}
else if(itemName == "Veg Manchow Soup"){
    price = 100;
    return price;
}
else if(itemName == "Chicken Manchow Soup"){
    price = 130;
    return price;
}
else if(itemName == "Sweet Corn Soup"){
    price = 90;
    return price;
}
else if(itemName == "Hot and Sour Soup"){
    price = 110;
    return price;
}

else if(itemName == "Veg Fried Noodles"){
    price = 130;
    return price;
}
else if(itemName == "Chicken Fried Noodles"){
    price = 160;
    return price;
}
else if(itemName == "Egg Fried Noodles"){
    price = 140;
    return price;
}
else if(itemName == "Veg Hakka Noodles"){
    price = 150;
    return price;
}
else if(itemName == "Chicken Hakka Noodles"){
    price = 180;
    return price;
}
else if(itemName == "Egg Hakka Noodles"){
    price = 160;
    return price;
}
else if(itemName == "Veg Schezwan Noodles"){
    price = 150;
    return price;
}
else if(itemName == "Chicken Schezwan Noodles"){
    price = 180;
    return price;
}
else if(itemName == "Egg Schezwan Noodles"){
    price = 170;
    return price;
}
else if(itemName == "Triple Schezwan Rice"){
    price = 200;
    return price;
}

else if(itemName == "Veg Fried Rice"){
    price = 140;
    return price;
}
else if(itemName == "Chicken Fried Rice"){
    price = 170;
    return price;
}
else if(itemName == "Egg Fried Rice"){
    price = 150;
    return price;
}
else if(itemName == "Veg Schezwan Rice"){
    price = 150;
    return price;
}
else if(itemName == "Chicken Schezwan Rice"){
    price = 180;
    return price;
}
else if(itemName == "Egg Schezwan Rice"){
    price = 160;
    return price;
}
else if(itemName == "Paneer Fried Rice"){
    price = 170;
    return price;
}
else if(itemName == "Mushroom Fried Rice"){
    price = 160;
    return price;
}
else if(itemName == "Mixed Fried Rice"){
    price = 190;
    return price;
}
else if(itemName == "Veg Pulav"){
    price = 140;
    return price;
}

else if(itemName == "Jeera Rice"){
    price = 120;
    return price;
}
else if(itemName == "Curd Rice Special"){
    price = 110;
    return price;
}
else if(itemName == "Lemon Rice"){
    price = 100;
    return price;
}
else if(itemName == "Tomato Rice"){
    price = 110;
    return price;
}
else if(itemName == "Paneer Pulav"){
    price = 170;
    return price;
}
else if(itemName == "Mushroom Pulav"){
    price = 160;
    return price;
}
else if(itemName == "Veg Khichdi"){
    price = 120;
    return price;
}
else if(itemName == "Masala Khichdi"){
    price = 140;
    return price;
}
else if(itemName == "Dal Khichdi"){
    price = 130;
    return price;
}
else if(itemName == "Plain Rice"){
    price = 80;
    return price;
}

else if(itemName == "Buttermilk"){
    price = 40;
    return price;
}
else if(itemName == "Lassi"){
    price = 60;
    return price;
}
else if(itemName == "Sweet Lassi"){
    price = 70;
    return price;
}
else if(itemName == "Salt Lassi"){
    price = 60;
    return price;
}
else if(itemName == "Rose Milk"){
    price = 80;
    return price;
}
else if(itemName == "Badam Milk"){
    price = 100;
    return price;
}
else if(itemName == "Chocolate Milk"){
    price = 90;
    return price;
}
else if(itemName == "Strawberry Milk"){
    price = 90;
    return price;
}
else if(itemName == "Vanilla Milk"){
    price = 85;
    return price;
}

return price;
}
public static double search(String itemName, int quantity){
double price = 0.0;

if(itemName == "Fried Chicken Bucket"){
    price = 299 * quantity;
    return price;
}
else if(itemName == "Chicken Popcorn"){
    price = 150 * quantity;
    return price;
}
else if(itemName == "Zinger Burger"){
    price = 180 * quantity;
    return price;
}
else if(itemName == "Peri Peri Fries"){
    price = 120 * quantity;
    return price;
}
else if(itemName == "Loaded Fries"){
    price = 140 * quantity;
    return price;
}
else if(itemName == "Cheese Balls"){
    price = 130 * quantity;
    return price;
}
else if(itemName == "Garlic Breadsticks"){
    price = 110 * quantity;
    return price;
}
else if(itemName == "Stuffed Garlic Bread"){
    price = 160 * quantity;
    return price;
}
else if(itemName == "Paneer Sandwich"){
    price = 150 * quantity;
    return price;
}
else if(itemName == "Chicken Sandwich"){
    price = 170 * quantity;
    return price;
}

else if(itemName == "Veg Momos"){
    price = 90 * quantity;
    return price;
}
else if(itemName == "Chicken Momos"){
    price = 120 * quantity;
    return price;
}
else if(itemName == "Fried Momos"){
    price = 130 * quantity;
    return price;
}
else if(itemName == "Steam Momos"){
    price = 100 * quantity;
    return price;
}
else if(itemName == "Paneer Momos"){
    price = 140 * quantity;
    return price;
}
else if(itemName == "Spring Rolls"){
    price = 110 * quantity;
    return price;
}
else if(itemName == "Veg Manchow Soup"){
    price = 100 * quantity;
    return price;
}
else if(itemName == "Chicken Manchow Soup"){
    price = 130 * quantity;
    return price;
}
else if(itemName == "Sweet Corn Soup"){
    price = 90 * quantity;
    return price;
}
else if(itemName == "Hot and Sour Soup"){
    price = 110 * quantity;
    return price;
}

else if(itemName == "Veg Fried Noodles"){
    price = 130 * quantity;
    return price;
}
else if(itemName == "Chicken Fried Noodles"){
    price = 160 * quantity;
    return price;
}
else if(itemName == "Egg Fried Noodles"){
    price = 140 * quantity;
    return price;
}
else if(itemName == "Veg Hakka Noodles"){
    price = 150 * quantity;
    return price;
}
else if(itemName == "Chicken Hakka Noodles"){
    price = 180 * quantity;
    return price;
}
else if(itemName == "Egg Hakka Noodles"){
    price = 160 * quantity;
    return price;
}
else if(itemName == "Veg Schezwan Noodles"){
    price = 150 * quantity;
    return price;
}
else if(itemName == "Chicken Schezwan Noodles"){
    price = 180 * quantity;
    return price;
}
else if(itemName == "Egg Schezwan Noodles"){
    price = 170 * quantity;
    return price;
}
else if(itemName == "Triple Schezwan Rice"){
    price = 200 * quantity;
    return price;
}

else if(itemName == "Veg Fried Rice"){
    price = 140 * quantity;
    return price;
}
else if(itemName == "Chicken Fried Rice"){
    price = 170 * quantity;
    return price;
}
else if(itemName == "Egg Fried Rice"){
    price = 150 * quantity;
    return price;
}
else if(itemName == "Veg Schezwan Rice"){
    price = 150 * quantity;
    return price;
}
else if(itemName == "Chicken Schezwan Rice"){
    price = 180 * quantity;
    return price;
}
else if(itemName == "Egg Schezwan Rice"){
    price = 160 * quantity;
    return price;
}
else if(itemName == "Paneer Fried Rice"){
    price = 170 * quantity;
    return price;
}
else if(itemName == "Mushroom Fried Rice"){
    price = 160 * quantity;
    return price;
}
else if(itemName == "Mixed Fried Rice"){
    price = 190 * quantity;
    return price;
}
else if(itemName == "Veg Pulav"){
    price = 140 * quantity;
    return price;
}

else if(itemName == "Jeera Rice"){
    price = 120 * quantity;
    return price;
}
else if(itemName == "Curd Rice Special"){
    price = 110 * quantity;
    return price;
}
else if(itemName == "Lemon Rice"){
    price = 100 * quantity;
    return price;
}
else if(itemName == "Tomato Rice"){
    price = 110 * quantity;
    return price;
}
else if(itemName == "Paneer Pulav"){
    price = 170 * quantity;
    return price;
}
else if(itemName == "Mushroom Pulav"){
    price = 160 * quantity;
    return price;
}
else if(itemName == "Veg Khichdi"){
    price = 120 * quantity;
    return price;
}
else if(itemName == "Masala Khichdi"){
    price = 140 * quantity;
    return price;
}
else if(itemName == "Dal Khichdi"){
    price = 130 * quantity;
    return price;
}
else if(itemName == "Plain Rice"){
    price = 80 * quantity;
    return price;
}

else if(itemName == "Buttermilk"){
    price = 40 * quantity;
    return price;
}
else if(itemName == "Lassi"){
    price = 60 * quantity;
    return price;
}
else if(itemName == "Sweet Lassi"){
    price = 70 * quantity;
    return price;
}
else if(itemName == "Salt Lassi"){
    price = 60 * quantity;
    return price;
}
else if(itemName == "Rose Milk"){
    price = 80 * quantity;
    return price;
}
else if(itemName == "Badam Milk"){
    price = 100 * quantity;
    return price;
}
else if(itemName == "Chocolate Milk"){
    price = 90 * quantity;
    return price;
}
else if(itemName == "Strawberry Milk"){
    price = 90 * quantity;
    return price;
}
else if(itemName == "Vanilla Milk"){
    price = 85 * quantity;
    return price;
}

else{
    System.out.println("Item not Found");
}

return price;
}
}