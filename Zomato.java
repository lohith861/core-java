class Zomato {

public static double search(String itemName){
double price = 0.0;

if(itemName == "Biryani"){
    price = 180;
    return price;
}
else if(itemName == "Pizza"){
    price = 250;
    return price;
}
else if(itemName == "Burger"){
    price = 120;
    return price;
}
else if(itemName == "Fried Rice"){
    price = 150;
    return price;
}
else if(itemName == "Noodles"){
    price = 130;
    return price;
}
else if(itemName == "Dosa"){
    price = 60;
    return price;
}
else if(itemName == "Idli"){
    price = 40;
    return price;
}
else if(itemName == "Meals"){
    price = 150;
    return price;
}
else if(itemName == "Chicken Curry"){
    price = 240;
    return price;
}
else if(itemName == "Paneer Butter Masala"){
    price = 220;
    return price;
}

else if(itemName == "Chapati"){
    price = 30;
    return price;
}
else if(itemName == "Parotta"){
    price = 35;
    return price;
}
else if(itemName == "Mutton Biryani"){
    price = 280;
    return price;
}
else if(itemName == "Veg Biryani"){
    price = 160;
    return price;
}
else if(itemName == "Chicken 65"){
    price = 200;
    return price;
}
else if(itemName == "Gobi Manchurian"){
    price = 140;
    return price;
}
else if(itemName == "Paneer Tikka"){
    price = 210;
    return price;
}
else if(itemName == "Ice Cream"){
    price = 90;
    return price;
}
else if(itemName == "Falooda"){
    price = 120;
    return price;
}
else if(itemName == "Juice"){
    price = 70;
    return price;
}

else if(itemName == "Pasta"){
    price = 160;
    return price;
}
else if(itemName == "Sandwich"){
    price = 100;
    return price;
}
else if(itemName == "Roll"){
    price = 110;
    return price;
}
else if(itemName == "Momos"){
    price = 80;
    return price;
}
else if(itemName == "Soup"){
    price = 70;
    return price;
}
else if(itemName == "Shawarma"){
    price = 130;
    return price;
}
else if(itemName == "Tandoori Chicken"){
    price = 300;
    return price;
}
else if(itemName == "Fish Fry"){
    price = 220;
    return price;
}
else if(itemName == "Prawns Fry"){
    price = 260;
    return price;
}
else if(itemName == "Paneer Fried Rice"){
    price = 170;
    return price;
}

else if(itemName == "Chicken Fried Rice"){
    price = 190;
    return price;
}
else if(itemName == "Egg Fried Rice"){
    price = 160;
    return price;
}
else if(itemName == "Veg Noodles"){
    price = 120;
    return price;
}
else if(itemName == "Chicken Noodles"){
    price = 150;
    return price;
}
else if(itemName == "Egg Noodles"){
    price = 140;
    return price;
}
else if(itemName == "French Fries"){
    price = 90;
    return price;
}
else if(itemName == "Garlic Bread"){
    price = 110;
    return price;
}
else if(itemName == "Cheese Balls"){
    price = 130;
    return price;
}
else if(itemName == "Spring Rolls"){
    price = 120;
    return price;
}
else if(itemName == "Samosa"){
    price = 20;
    return price;
}

else if(itemName == "Pani Puri"){
    price = 30;
    return price;
}
else if(itemName == "Bhel Puri"){
    price = 40;
    return price;
}
else if(itemName == "Sev Puri"){
    price = 50;
    return price;
}
else if(itemName == "Vada Pav"){
    price = 25;
    return price;
}
else if(itemName == "Pav Bhaji"){
    price = 120;
    return price;
}
else if(itemName == "Masala Dosa"){
    price = 80;
    return price;
}
else if(itemName == "Rava Dosa"){
    price = 90;
    return price;
}
else if(itemName == "Onion Dosa"){
    price = 85;
    return price;
}
else if(itemName == "Set Dosa"){
    price = 70;
    return price;
}
else if(itemName == "Upma"){
    price = 50;
    return price;
}

else if(itemName == "Kesari Bath"){
    price = 60;
    return price;
}
else if(itemName == "Tea"){
    price = 15;
    return price;
}
else if(itemName == "Coffee"){
    price = 20;
    return price;
}
else if(itemName == "Cold Coffee"){
    price = 90;
    return price;
}
else if(itemName == "Milkshake"){
    price = 120;
    return price;
}
else if(itemName == "Lassi"){
    price = 80;
    return price;
}
else if(itemName == "Buttermilk"){
    price = 30;
    return price;
}
else if(itemName == "Mineral Water"){
    price = 20;
    return price;
}

return price;
}
public static double search(String itemName, int quantity){
    double price = 0.0;

    if(itemName == "Biryani"){
        price = 180 * quantity;
        return price;
    }
    else if(itemName == "Pizza"){
        price = 250 * quantity;
        return price;
    }
    else if(itemName == "Burger"){
        price = 120 * quantity;
        return price;
    }
    else if(itemName == "Fried Rice"){
        price = 150 * quantity;
        return price;
    }
    else if(itemName == "Noodles"){
        price = 130 * quantity;
        return price;
    }
    else if(itemName == "Dosa"){
        price = 60 * quantity;
        return price;
    }
    else if(itemName == "Idli"){
        price = 40 * quantity;
        return price;
    }
    else if(itemName == "Meals"){
        price = 150 * quantity;
        return price;
    }
    else if(itemName == "Chicken Curry"){
        price = 240 * quantity;
        return price;
    }
    else if(itemName == "Paneer Butter Masala"){
        price = 220 * quantity;
        return price;
    }

    else if(itemName == "Chapati"){
        price = 30 * quantity;
        return price;
    }
    else if(itemName == "Parotta"){
        price = 35 * quantity;
        return price;
    }
    else if(itemName == "Mutton Biryani"){
        price = 280 * quantity;
        return price;
    }
    else if(itemName == "Veg Biryani"){
        price = 160 * quantity;
        return price;
    }
    else if(itemName == "Chicken 65"){
        price = 200 * quantity;
        return price;
    }
    else if(itemName == "Gobi Manchurian"){
        price = 140 * quantity;
        return price;
    }
    else if(itemName == "Paneer Tikka"){
        price = 210 * quantity;
        return price;
    }
    else if(itemName == "Ice Cream"){
        price = 90 * quantity;
        return price;
    }
    else if(itemName == "Falooda"){
        price = 120 * quantity;
        return price;
    }
    else if(itemName == "Juice"){
        price = 70 * quantity;
        return price;
    }

    else if(itemName == "Pasta"){
        price = 160 * quantity;
        return price;
    }
    else if(itemName == "Sandwich"){
        price = 100 * quantity;
        return price;
    }
    else if(itemName == "Roll"){
        price = 110 * quantity;
        return price;
    }
    else if(itemName == "Momos"){
        price = 80 * quantity;
        return price;
    }
    else if(itemName == "Soup"){
        price = 70 * quantity;
        return price;
    }
    else if(itemName == "Shawarma"){
        price = 130 * quantity;
        return price;
    }
    else if(itemName == "Tandoori Chicken"){
        price = 300 * quantity;
        return price;
    }
    else if(itemName == "Fish Fry"){
        price = 220 * quantity;
        return price;
    }
    else if(itemName == "Prawns Fry"){
        price = 260 * quantity;
        return price;
    }
    else if(itemName == "Paneer Fried Rice"){
        price = 170 * quantity;
        return price;
    }

    else if(itemName == "Chicken Fried Rice"){
        price = 190 * quantity;
        return price;
    }
    else if(itemName == "Egg Fried Rice"){
        price = 160 * quantity;
        return price;
    }
    else if(itemName == "Veg Noodles"){
        price = 120 * quantity;
        return price;
    }
    else if(itemName == "Chicken Noodles"){
        price = 150 * quantity;
        return price;
    }
    else if(itemName == "Egg Noodles"){
        price = 140 * quantity;
        return price;
    }
    else if(itemName == "French Fries"){
        price = 90 * quantity;
        return price;
    }
    else if(itemName == "Garlic Bread"){
        price = 110 * quantity;
        return price;
    }
    else if(itemName == "Cheese Balls"){
        price = 130 * quantity;
        return price;
    }
    else if(itemName == "Spring Rolls"){
        price = 120 * quantity;
        return price;
    }
    else if(itemName == "Samosa"){
        price = 20 * quantity;
        return price;
    }

    else if(itemName == "Pani Puri"){
        price = 30 * quantity;
        return price;
    }
    else if(itemName == "Bhel Puri"){
        price = 40 * quantity;
        return price;
    }
    else if(itemName == "Sev Puri"){
        price = 50 * quantity;
        return price;
    }
    else if(itemName == "Vada Pav"){
        price = 25 * quantity;
        return price;
    }
    else if(itemName == "Pav Bhaji"){
        price = 120 * quantity;
        return price;
    }
    else if(itemName == "Masala Dosa"){
        price = 80 * quantity;
        return price;
    }
    else if(itemName == "Rava Dosa"){
        price = 90 * quantity;
        return price;
    }
    else if(itemName == "Onion Dosa"){
        price = 85 * quantity;
        return price;
    }
    else if(itemName == "Set Dosa"){
        price = 70 * quantity;
        return price;
    }
    else if(itemName == "Upma"){
        price = 50 * quantity;
        return price;
    }

    else if(itemName == "Kesari Bath"){
        price = 60 * quantity;
        return price;
    }
    else if(itemName == "Tea"){
        price = 15 * quantity;
        return price;
    }
    else if(itemName == "Coffee"){
        price = 20 * quantity;
        return price;
    }
    else if(itemName == "Cold Coffee"){
        price = 90 * quantity;
        return price;
    }
    else if(itemName == "Milkshake"){
        price = 120 * quantity;
        return price;
    }
    else if(itemName == "Lassi"){
        price = 80 * quantity;
        return price;
    }
    else if(itemName == "Buttermilk"){
        price = 30 * quantity;
        return price;
    }
    else if(itemName == "Mineral Water"){
        price = 20 * quantity;
        return price;
    }
    else{
        System.out.println("Item not Found");
    }

    return price;
}
}