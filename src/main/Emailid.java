package main;
import java.util.*;

import static java.lang.Math.*;

public class Emailid {
    private String name;
    private String company;
    private int age;
     String password;
    int sum=0;
    Emailid(String name, String company, int age) {
        this.name = name;
        this.company = company;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public  String  createpassword() {
        for (int i = 0; i <4; i++) {
            int a = (int) (random() * 10);

            sum = (sum * 10) + a;
        }
            password=sum+name.substring(0,4);
            return password;

    }



        @Override
        public String toString()
        {   String z=createpassword();
            return String.format("%s_%d@%s.com\nPassword: %s", name, age, company, z);
        }
    }
