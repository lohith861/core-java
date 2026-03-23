class FoodPanda {

public static double search(String itemName){
double price = 0.0;

if(itemName == "Shawarma"){
    price = 120;
    return price;
}
else if(itemName == "Chicken Shawarma"){
    price = 150;
    return price;
}
else if(itemName == "Paneer Shawarma"){
    price = 140;
    return price;
}
else if(itemName == "Falooda Special"){
    price = 130;
    return price;
}
else if(itemName == "Kulcha Chole Combo"){
    price = 180;
    return price;
}
else if(itemName == "Amritsari Kulcha"){
    price = 120;
    return price;
}
else if(itemName == "Stuffed Paratha"){
    price = 100;
    return price;
}
else if(itemName == "Aloo Paratha"){
    price = 90;
    return price;
}
else if(itemName == "Gobi Paratha"){
    price = 95;
    return price;
}
else if(itemName == "Paneer Paratha"){
    price = 110;
    return price;
}

else if(itemName == "Chicken Paratha"){
    price = 130;
    return price;
}
else if(itemName == "Egg Paratha"){
    price = 120;
    return price;
}
else if(itemName == "Veg Roll"){
    price = 100;
    return price;
}
else if(itemName == "Chicken Roll Special"){
    price = 140;
    return price;
}
else if(itemName == "Paneer Roll Special"){
    price = 130;
    return price;
}
else if(itemName == "Double Egg Roll"){
    price = 150;
    return price;
}
else if(itemName == "Kathi Roll"){
    price = 140;
    return price;
}
else if(itemName == "Frankie Roll"){
    price = 120;
    return price;
}
else if(itemName == "Veg Frankie"){
    price = 110;
    return price;
}
else if(itemName == "Chicken Frankie"){
    price = 140;
    return price;
}

else if(itemName == "Samosa Plate"){
    price = 60;
    return price;
}
else if(itemName == "Kachori"){
    price = 70;
    return price;
}
else if(itemName == "Pav Bhaji"){
    price = 120;
    return price;
}
else if(itemName == "Masala Pav"){
    price = 90;
    return price;
}
else if(itemName == "Vada Pav"){
    price = 50;
    return price;
}
else if(itemName == "Cheese Vada Pav"){
    price = 70;
    return price;
}
else if(itemName == "Dabeli"){
    price = 60;
    return price;
}
else if(itemName == "Sev Puri"){
    price = 80;
    return price;
}
else if(itemName == "Bhel Puri"){
    price = 70;
    return price;
}
else if(itemName == "Pani Puri"){
    price = 60;
    return price;
}

else if(itemName == "Ragda Pattice"){
    price = 90;
    return price;
}
else if(itemName == "Misal Pav"){
    price = 110;
    return price;
}
else if(itemName == "Poha"){
    price = 80;
    return price;
}
else if(itemName == "Upma Special"){
    price = 90;
    return price;
}
else if(itemName == "Sabudana Khichdi"){
    price = 100;
    return price;
}
else if(itemName == "Khakhra"){
    price = 70;
    return price;
}
else if(itemName == "Thepla"){
    price = 80;
    return price;
}
else if(itemName == "Gujarati Thali"){
    price = 220;
    return price;
}
else if(itemName == "Rajasthani Thali"){
    price = 240;
    return price;
}
else if(itemName == "Mini Gujarati Thali"){
    price = 180;
    return price;
}

else if(itemName == "Dal Baati"){
    price = 200;
    return price;
}
else if(itemName == "Baati Churma"){
    price = 220;
    return price;
}
else if(itemName == "Gatte Ki Sabzi"){
    price = 180;
    return price;
}
else if(itemName == "Ker Sangri"){
    price = 190;
    return price;
}
else if(itemName == "Papdi Sabzi"){
    price = 170;
    return price;
}
else if(itemName == "Methi Thepla"){
    price = 90;
    return price;
}
else if(itemName == "Bajra Roti"){
    price = 60;
    return price;
}
else if(itemName == "Makki Roti"){
    price = 70;
    return price;
}
else if(itemName == "Sarson Saag"){
    price = 180;
    return price;
}
else if(itemName == "Litti Chokha"){
    price = 150;
    return price;
}

else if(itemName == "Chena Poda"){
    price = 140;
    return price;
}
else if(itemName == "Sandesh"){
    price = 120;
    return price;
}
else if(itemName == "Cham Cham"){
    price = 110;
    return price;
}
else if(itemName == "Mishti Doi"){
    price = 100;
    return price;
}
else if(itemName == "Peda"){
    price = 90;
    return price;
}
else if(itemName == "Milk Peda"){
    price = 100;
    return price;
}
else if(itemName == "Dry Fruit Laddu"){
    price = 130;
    return price;
}
else if(itemName == "Besan Laddu"){
    price = 110;
    return price;
}
else if(itemName == "Coconut Laddu"){
    price = 120;
    return price;
}

return price;
}
public static double search(String itemName, int quantity){
double price = 0.0;

if(itemName == "Shawarma"){
    price = 120 * quantity;
    return price;
}
else if(itemName == "Chicken Shawarma"){
    price = 150 * quantity;
    return price;
}
else if(itemName == "Paneer Shawarma"){
    price = 140 * quantity;
    return price;
}
else if(itemName == "Falooda Special"){
    price = 130 * quantity;
    return price;
}
else if(itemName == "Kulcha Chole Combo"){
    price = 180 * quantity;
    return price;
}
else if(itemName == "Amritsari Kulcha"){
    price = 120 * quantity;
    return price;
}
else if(itemName == "Stuffed Paratha"){
    price = 100 * quantity;
    return price;
}
else if(itemName == "Aloo Paratha"){
    price = 90 * quantity;
    return price;
}
else if(itemName == "Gobi Paratha"){
    price = 95 * quantity;
    return price;
}
else if(itemName == "Paneer Paratha"){
    price = 110 * quantity;
    return price;
}

else if(itemName == "Chicken Paratha"){
    price = 130 * quantity;
    return price;
}
else if(itemName == "Egg Paratha"){
    price = 120 * quantity;
    return price;
}
else if(itemName == "Veg Roll"){
    price = 100 * quantity;
    return price;
}
else if(itemName == "Chicken Roll Special"){
    price = 140 * quantity;
    return price;
}
else if(itemName == "Paneer Roll Special"){
    price = 130 * quantity;
    return price;
}
else if(itemName == "Double Egg Roll"){
    price = 150 * quantity;
    return price;
}
else if(itemName == "Kathi Roll"){
    price = 140 * quantity;
    return price;
}
else if(itemName == "Frankie Roll"){
    price = 120 * quantity;
    return price;
}
else if(itemName == "Veg Frankie"){
    price = 110 * quantity;
    return price;
}
else if(itemName == "Chicken Frankie"){
    price = 140 * quantity;
    return price;
}

else if(itemName == "Samosa Plate"){
    price = 60 * quantity;
    return price;
}
else if(itemName == "Kachori"){
    price = 70 * quantity;
    return price;
}
else if(itemName == "Pav Bhaji"){
    price = 120 * quantity;
    return price;
}
else if(itemName == "Masala Pav"){
    price = 90 * quantity;
    return price;
}
else if(itemName == "Vada Pav"){
    price = 50 * quantity;
    return price;
}
else if(itemName == "Cheese Vada Pav"){
    price = 70 * quantity;
    return price;
}
else if(itemName == "Dabeli"){
    price = 60 * quantity;
    return price;
}
else if(itemName == "Sev Puri"){
    price = 80 * quantity;
    return price;
}
else if(itemName == "Bhel Puri"){
    price = 70 * quantity;
    return price;
}
else if(itemName == "Pani Puri"){
    price = 60 * quantity;
    return price;
}

else if(itemName == "Ragda Pattice"){
    price = 90 * quantity;
    return price;
}
else if(itemName == "Misal Pav"){
    price = 110 * quantity;
    return price;
}
else if(itemName == "Poha"){
    price = 80 * quantity;
    return price;
}
else if(itemName == "Upma Special"){
    price = 90 * quantity;
    return price;
}
else if(itemName == "Sabudana Khichdi"){
    price = 100 * quantity;
    return price;
}
else if(itemName == "Khakhra"){
    price = 70 * quantity;
    return price;
}
else if(itemName == "Thepla"){
    price = 80 * quantity;
    return price;
}
else if(itemName == "Gujarati Thali"){
    price = 220 * quantity;
    return price;
}
else if(itemName == "Rajasthani Thali"){
    price = 240 * quantity;
    return price;
}
else if(itemName == "Mini Gujarati Thali"){
    price = 180 * quantity;
    return price;
}

else if(itemName == "Dal Baati"){
    price = 200 * quantity;
    return price;
}
else if(itemName == "Baati Churma"){
    price = 220 * quantity;
    return price;
}
else if(itemName == "Gatte Ki Sabzi"){
    price = 180 * quantity;
    return price;
}
else if(itemName == "Ker Sangri"){
    price = 190 * quantity;
    return price;
}
else if(itemName == "Papdi Sabzi"){
    price = 170 * quantity;
    return price;
}
else if(itemName == "Methi Thepla"){
    price = 90 * quantity;
    return price;
}
else if(itemName == "Bajra Roti"){
    price = 60 * quantity;
    return price;
}
else if(itemName == "Makki Roti"){
    price = 70 * quantity;
    return price;
}
else if(itemName == "Sarson Saag"){
    price = 180 * quantity;
    return price;
}
else if(itemName == "Litti Chokha"){
    price = 150 * quantity;
    return price;
}

else if(itemName == "Chena Poda"){
    price = 140 * quantity;
    return price;
}
else if(itemName == "Sandesh"){
    price = 120 * quantity;
    return price;
}
else if(itemName == "Cham Cham"){
    price = 110 * quantity;
    return price;
}
else if(itemName == "Mishti Doi"){
    price = 100 * quantity;
    return price;
}
else if(itemName == "Peda"){
    price = 90 * quantity;
    return price;
}
else if(itemName == "Milk Peda"){
    price = 100 * quantity;
    return price;
}
else if(itemName == "Dry Fruit Laddu"){
    price = 130 * quantity;
    return price;
}
else if(itemName == "Besan Laddu"){
    price = 110 * quantity;
    return price;
}
else if(itemName == "Coconut Laddu"){
    price = 120 * quantity;
    return price;
}

else{
    System.out.println("Item not Found");
}

return price;
}
}