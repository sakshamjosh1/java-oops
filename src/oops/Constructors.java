package oops;

class Car{
    int year;
    String model;
    int price;

    Car(int y, String m, int p){
        year = y;
        model = m;
        price = p;
    }
    void displayInfo(){
        System.out.println("Year:" + year);
        System.out.println("Model:" + model);
        System.out.println("Price:" + price);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Car car1 = new Car(2024, "Audi", 5000000);
        car1.displayInfo();

        Car car2 = new Car(2022, "BMW", 4200000);
        car2.displayInfo();
    }
}
