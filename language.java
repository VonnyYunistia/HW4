package HW4;

import java.util.Scanner;

public class language {

    public static void main(String[] args) {

        Scanner input= new Scanner((System.in));

        System.out.println("Please enter your country (start with uppercase");

        String country= input.next();

    if (country.equals("Indonesia")){
        System.out.println("Indonesian");
    } else if (country.equals("USA")){
        System.out.println("English");
    } else {
        System.out.println("their own language");
    }







    }
}
