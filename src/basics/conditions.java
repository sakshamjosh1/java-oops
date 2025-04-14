package basics;
import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Salary : ");
        int salary = input.nextInt();
        if (salary>25000){
            salary = salary + 2000;
        }
        else {
            salary = salary + 1500;
        }
        System.out.println("The final salary is "+salary);
    }
}

