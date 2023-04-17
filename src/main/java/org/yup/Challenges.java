package org.yup;

import java.util.Scanner;

public class Challenges {

    public String greeting(String name, int age){

        //let folks into the party if they are 21 amd up
        //politely tell them they cant enter under age
        if(age >= 21){
            return "Hello " + name + ", welcome to the the party!";
        }else{
            //this is what happens if the condition is false
            return "Hello " + name + ", I am sorry but we cannot let you into the party";
        }


    }

    public String greetingWithUserInput(){

        Scanner theScanner = new Scanner(System.in);

        //we need ask the user what their name is
        System.out.print("Enter your name: ");
        String name = theScanner.nextLine();

        //we need to ask the user what their age
        System.out.print("Enter your age: ");
        int age = theScanner.nextInt();

        //let folks into the party if they are 21 amd up
        //politely tell them they cant enter under age
        if(age >= 21){
            return "Hello " + name + ", welcome to the the party!";
        }else{
            //this is what happens if the condition is false
            return "Hello " + name + ", I am sorry but we cannot let you into the party";
        }

    }

    public int addTwoNumbers(){

        //ask the user for number1


        //ask the user for number2


        //return the sum of number1 and number 2 together

        return 0;

    }

    //create a method like the above for subractTwoNumbers multiplyTwo numbers


}
