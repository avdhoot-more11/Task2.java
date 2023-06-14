# Task2.java

package Strings.oasistask;

import java.util.Scanner;

public class task2{
       
    public static void main(String[] args) {
        int number = (int)(100*Math.random());

        Scanner sc = new Scanner(System.in);
    for(int i=10;i>=1;i--){
       System.out.println("you are allow to answer" + i + "times only"); 
       System.out.println("Enter your guessing numbers");
        int yourNumber = sc.nextInt();
        if(yourNumber<number ){
            System.out.println("your number is lagging ");
        }
        else if(yourNumber>number){
           System.out.println("your number is exeeding");
        }
        else if(yourNumber==number){
            System.out.println("congratulations your guessing is correct");
        }
    }
    System.out.println("that number was"+number);
    }
}
