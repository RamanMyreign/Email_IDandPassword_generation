package main;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to create id and password \n how many user Id  you want to create?");
        int number = s.nextInt();
        Emailid[] customer = new Emailid[number];
        s.nextLine();
        for (int i = 0; i < number; i++) {
            System.out.println("enter name");
            String name = s.next().trim();
            System.out.println("enter company name");
            String company = s.next().trim();
            System.out.println("enter your age");
            int age = s.nextInt();
            customer[i] = new Emailid(name, company, age);
        }
        for (int i = 0; i < customer.length; i++) {

            System.out.println("ID: " + customer[i]);
        }
    }

}
