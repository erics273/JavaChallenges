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

        Scanner theScanner = new Scanner(System.in);

        //ask the user for number1
        System.out.print("Enter your the first number to add: ");
        int potato =  theScanner.nextInt();

        //ask the user for number2
        System.out.print("Enter your the second number to add: ");
        int potato2 =  theScanner.nextInt();


        //return the sum of number1 and number 2 together

        return potato + potato2;

    }

    public int subtractTwoNumbers(){

        Scanner theScanner = new Scanner(System.in);

        //ask the user for number1
        System.out.print("Enter your the first number to subtract: ");
        int potato =  theScanner.nextInt();

        //ask the user for number2
        System.out.print("Enter your the second number to subtract: ");
        int potato2 =  theScanner.nextInt();


        //return the sum of number1 and number 2 together

        return potato - potato2;

    }

    public int multiplyTwoNumbers(){

        Scanner theScanner = new Scanner(System.in);

        //ask the user for number1
        System.out.print("Enter your the first number to multiply: ");
        int potato =  theScanner.nextInt();

        //ask the user for number2
        System.out.print("Enter your the second number to multiply: ");
        int potato2 =  theScanner.nextInt();


        //return the sum of number1 and number 2 together

        return potato * potato2;

    }

    public int interactiveCalculator(){

        //fire up scanner so we can use it
        Scanner theScanner = new Scanner(System.in);

        //displays some set of choices to the user
        System.out.println("Welcome to the calculator!");
        System.out.println("Press 1 to add numbers");
        System.out.println("Press 2 to subtract numbers");
        System.out.println("Press 3 to multiply numbers");
        System.out.print("Enter your selection and press ENTER: ");

        //this sits and waits for the user to give (1,2,3). when they hit enter
        //their selection is stored in userSelection
        int userSelection =  theScanner.nextInt();

        //creatinga  variable to store the rusult of the math
        int result;

        //figure out what to do based on user selection
        switch (userSelection){
            case 1:
                result = this.addTwoNumbers();
                break;
            case 2:
                result = this.subtractTwoNumbers();
                break;
            case 3:
                result = this.multiplyTwoNumbers();
                break;
            default:
                System.out.println("the user chose nonsense (didn't exist as a choice)");
                result = 0;
        }

        //hand back the result of the above math from whichever scenario the user chose
        return result;

    }

    public String coinFlip(){

        //attempt to flip a coin.
        //return heads or tails

        //this is where we flip the coin
        if(Math.random() > .5){
            //here is where we return heads if the number generated was > .5
            return "heads";
        }else{
            //here is where we return if the number generated was less than .5
            return "tales";
        }


    }

    public String findTheBiggestNumber(){

        //this is the scanner that lets us take input from the user
        Scanner theScanner = new Scanner(System.in);

        //this is where we ask the user for input
        System.out.print("give me the first number please: ");
        //this is where we capture that input and store it in a variable called firstNumber
        int firstNumber = theScanner.nextInt();

        //this is where we ask the user for input
        System.out.print("give me the second number please: ");
        //this is where we capture that input and store it in a variable called firstNumber
        int secondNumber = theScanner.nextInt();

        int theBiggestNumber = Math.max(firstNumber, secondNumber);

        return "The biggest number between " + firstNumber + " and " + secondNumber + " is: " + theBiggestNumber;

    }

//    public String findSmallestNumber(){
//
//        //referecne the above method to make one that finds the smaller of the two numbers
//
//    }
//
//    public int findTheDifferenceBetweenTwoNumbers(){
//
//        //Math.abs()
//
//    }

      public String convertToUppercase(){

          //this is the scanner that lets us take input from the user
          Scanner theScanner = new Scanner(System.in);

          System.out.print("Provide a word to convert to all UPPERCASE: ");
          String theWord = theScanner.nextLine();

          return "You provided, " + theWord + " and we converted to: " + theWord.toUpperCase();


      }

      //convertToLowercase - work like convertToUppercase and return some text that show us the word is converted


      //lengthOfWord - return something that lets us know how long the word provided was/is

}
