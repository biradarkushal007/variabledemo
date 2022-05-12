package com.mule;

public class FruitPriceService {
	public static String sayHello(String name, String city) {
        return "This is " + name + " Fruit shop located in " + city;
    }
 
    public String getFruitPrice(String fruitName) {
        if (fruitName.equalsIgnoreCase("Apple")) {
            return "100/Kg";
        } else if (fruitName.equalsIgnoreCase("Banana")) {
            return "30/Kg";
        } else {
            return "Fruit not available";
        }
    }
}
