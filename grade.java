package HW4;

import java.util.Scanner;

public class grade {

    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);

        System.out.println("please enter the score");
        int score=input.nextInt();

        if(score>=90){
            System.out.println("A");
        }else if (score>=70 && score<90){
            System.out.println("B");
        }else if(score>=50 && score<70){
            System.out.println("C");
        }else {
            System.out.println("F");}






    }
}
