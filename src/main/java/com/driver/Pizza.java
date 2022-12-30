package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int chessePrice;
    private int toppingsPrice;
    private int takeawayPrice;

    Boolean isCheeseAdded;
    Boolean isToppingsAdded;
    Boolean isTakeawayAdded;
    Boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.chessePrice =80;
        this.takeawayPrice =20;
        if(isVeg==true){
            this.price =300;
            this.toppingsPrice =70;
        }
        else{
            this.price=400;
            this.toppingsPrice =120;
        }
        this.isCheeseAdded =false;
        this.isTakeawayAdded =false;
        this.isToppingsAdded =false;
        this.bill ="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false){
            this.price = this.price+this.chessePrice;
            isCheeseAdded =true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded==false){
            this.price = this.price+this.toppingsPrice;
            isToppingsAdded =true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeawayAdded==false){
            this.price = this.price+this.takeawayPrice;
            isTakeawayAdded =true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated==false){
            if(isCheeseAdded==true){
                this.bill ="Extra Cheese Added: " + this.chessePrice + "\n";
            }
            if(isToppingsAdded==true){
                this.bill ="Extra Toppings Added: " + this.toppingsPrice + "\n";
            }
            if(isTakeawayAdded==true){
                this.bill ="Paperbag Added: " + this.takeawayPrice + "\n";
            }
            this.bill = "Total Price: " + this.price + "\n";
        }
        return this.bill;
    }
}
