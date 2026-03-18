class DoorDash {

public static double search(String itemName){
double price = 0.0;

if(itemName == "Tacos"){
    price = 150;
    return price;
}
else if(itemName == "Burrito"){
    price = 180;
    return price;
}
else if(itemName == "Quesadilla"){
    price = 170;
    return price;
}
else if(itemName == "Churros"){
    price = 90;
    return price;
}
else if(itemName == "Fajitas"){
    price = 220;
    return price;
}
else if(itemName == "Enchiladas"){
    price = 210;
    return price;
}
else if(itemName == "Nacho Cheese Fries"){
    price = 140;
    return price;
}
else if(itemName == "BBQ Wings"){
    price = 200;
    return price;
}
else if(itemName == "Grilled Chicken"){
    price = 230;
    return price;
}
else if(itemName == "Steak"){
    price = 300;
    return price;
}

else if(itemName == "Mashed Potatoes"){
    price = 120;
    return price;
}
else if(itemName == "Caesar Salad"){
    price = 160;
    return price;
}
else if(itemName == "Greek Salad"){
    price = 170;
    return price;
}
else if(itemName == "Mac and Cheese"){
    price = 180;
    return price;
}
else if(itemName == "Onion Rings"){
    price = 110;
    return price;
}
else if(itemName == "Mozzarella Sticks"){
    price = 150;
    return price;
}
else if(itemName == "Chicken Nuggets"){
    price = 140;
    return price;
}
else if(itemName == "Hash Browns"){
    price = 100;
    return price;
}
else if(itemName == "Bagel"){
    price = 80;
    return price;
}
else if(itemName == "Croissant"){
    price = 90;
    return price;
}

else if(itemName == "Blueberry Muffin"){
    price = 100;
    return price;
}
else if(itemName == "Chocolate Muffin"){
    price = 110;
    return price;
}
else if(itemName == "Cinnamon Roll"){
    price = 120;
    return price;
}
else if(itemName == "Pretzel"){
    price = 90;
    return price;
}
else if(itemName == "Cheesecake"){
    price = 150;
    return price;
}
else if(itemName == "Apple Pie"){
    price = 140;
    return price;
}
else if(itemName == "Pumpkin Pie"){
    price = 160;
    return price;
}
else if(itemName == "Brown Sugar Latte"){
    price = 130;
    return price;
}
else if(itemName == "Caramel Latte"){
    price = 140;
    return price;
}
else if(itemName == "Mocha Latte"){
    price = 150;
    return price;
}

else if(itemName == "Espresso"){
    price = 90;
    return price;
}
else if(itemName == "Americano"){
    price = 100;
    return price;
}
else if(itemName == "Cappuccino"){
    price = 120;
    return price;
}
else if(itemName == "Frappuccino"){
    price = 160;
    return price;
}
else if(itemName == "Smoothie"){
    price = 140;
    return price;
}
else if(itemName == "Protein Shake"){
    price = 180;
    return price;
}
else if(itemName == "Iced Latte"){
    price = 130;
    return price;
}
else if(itemName == "Iced Mocha"){
    price = 140;
    return price;
}
else if(itemName == "Iced Americano"){
    price = 110;
    return price;
}
else if(itemName == "Sparkling Water"){
    price = 60;
    return price;
}

else if(itemName == "Sushi"){
    price = 250;
    return price;
}
else if(itemName == "Ramen"){
    price = 200;
    return price;
}
else if(itemName == "Tempura"){
    price = 220;
    return price;
}
else if(itemName == "Udon"){
    price = 180;
    return price;
}
else if(itemName == "Sashimi"){
    price = 260;
    return price;
}
else if(itemName == "Kimchi"){
    price = 100;
    return price;
}
else if(itemName == "Bibimbap"){
    price = 210;
    return price;
}
else if(itemName == "Tofu Stir Fry"){
    price = 170;
    return price;
}
else if(itemName == "Veg Sushi"){
    price = 220;
    return price;
}
else if(itemName == "Teriyaki Chicken"){
    price = 230;
    return price;
}

return price;
}
public static double search(String itemName, int quantity){
double price = 0.0;

if(itemName == "Tacos"){
    price = 150 * quantity;
    return price;
}
else if(itemName == "Burrito"){
    price = 180 * quantity;
    return price;
}
else if(itemName == "Quesadilla"){
    price = 170 * quantity;
    return price;
}
else if(itemName == "Churros"){
    price = 90 * quantity;
    return price;
}
else if(itemName == "Fajitas"){
    price = 220 * quantity;
    return price;
}
else if(itemName == "Enchiladas"){
    price = 210 * quantity;
    return price;
}
else if(itemName == "Nacho Cheese Fries"){
    price = 140 * quantity;
    return price;
}
else if(itemName == "BBQ Wings"){
    price = 200 * quantity;
    return price;
}
else if(itemName == "Grilled Chicken"){
    price = 230 * quantity;
    return price;
}
else if(itemName == "Steak"){
    price = 300 * quantity;
    return price;
}

else if(itemName == "Mashed Potatoes"){
    price = 120 * quantity;
    return price;
}
else if(itemName == "Caesar Salad"){
    price = 160 * quantity;
    return price;
}
else if(itemName == "Greek Salad"){
    price = 170 * quantity;
    return price;
}
else if(itemName == "Mac and Cheese"){
    price = 180 * quantity;
    return price;
}
else if(itemName == "Onion Rings"){
    price = 110 * quantity;
    return price;
}
else if(itemName == "Mozzarella Sticks"){
    price = 150 * quantity;
    return price;
}
else if(itemName == "Chicken Nuggets"){
    price = 140 * quantity;
    return price;
}
else if(itemName == "Hash Browns"){
    price = 100 * quantity;
    return price;
}
else if(itemName == "Bagel"){
    price = 80 * quantity;
    return price;
}
else if(itemName == "Croissant"){
    price = 90 * quantity;
    return price;
}

else if(itemName == "Blueberry Muffin"){
    price = 100 * quantity;
    return price;
}
else if(itemName == "Chocolate Muffin"){
    price = 110 * quantity;
    return price;
}
else if(itemName == "Cinnamon Roll"){
    price = 120 * quantity;
    return price;
}
else if(itemName == "Pretzel"){
    price = 90 * quantity;
    return price;
}
else if(itemName == "Cheesecake"){
    price = 150 * quantity;
    return price;
}
else if(itemName == "Apple Pie"){
    price = 140 * quantity;
    return price;
}
else if(itemName == "Pumpkin Pie"){
    price = 160 * quantity;
    return price;
}
else if(itemName == "Brown Sugar Latte"){
    price = 130 * quantity;
    return price;
}
else if(itemName == "Caramel Latte"){
    price = 140 * quantity;
    return price;
}
else if(itemName == "Mocha Latte"){
    price = 150 * quantity;
    return price;
}

else if(itemName == "Espresso"){
    price = 90 * quantity;
    return price;
}
else if(itemName == "Americano"){
    price = 100 * quantity;
    return price;
}
else if(itemName == "Cappuccino"){
    price = 120 * quantity;
    return price;
}
else if(itemName == "Frappuccino"){
    price = 160 * quantity;
    return price;
}
else if(itemName == "Smoothie"){
    price = 140 * quantity;
    return price;
}
else if(itemName == "Protein Shake"){
    price = 180 * quantity;
    return price;
}
else if(itemName == "Iced Latte"){
    price = 130 * quantity;
    return price;
}
else if(itemName == "Iced Mocha"){
    price = 140 * quantity;
    return price;
}
else if(itemName == "Iced Americano"){
    price = 110 * quantity;
    return price;
}
else if(itemName == "Sparkling Water"){
    price = 60 * quantity;
    return price;
}

else if(itemName == "Sushi"){
    price = 250 * quantity;
    return price;
}
else if(itemName == "Ramen"){
    price = 200 * quantity;
    return price;
}
else if(itemName == "Tempura"){
    price = 220 * quantity;
    return price;
}
else if(itemName == "Udon"){
    price = 180 * quantity;
    return price;
}
else if(itemName == "Sashimi"){
    price = 260 * quantity;
    return price;
}
else if(itemName == "Kimchi"){
    price = 100 * quantity;
    return price;
}
else if(itemName == "Bibimbap"){
    price = 210 * quantity;
    return price;
}
else if(itemName == "Tofu Stir Fry"){
    price = 170 * quantity;
    return price;
}
else if(itemName == "Veg Sushi"){
    price = 220 * quantity;
    return price;
}
else if(itemName == "Teriyaki Chicken"){
    price = 230 * quantity;
    return price;
}

else{
    System.out.println("Item not Found");
}

return price;
}
}