package oops;

class Cars{
    int year;
    String model;
    int price;

    void displayInfo(){
        System.out.println("Year:" + year);
        System.out.println("Model:" + model);
        System.out.println("Price:" + price);
    }
}

public class oops1 {
    public static void main(String[] args) {
        Cars car1 = new Cars();
        car1.year = 2024;
        car1.model = "Audi";
        car1.price = 5000000;
        car1.displayInfo();
    }
}