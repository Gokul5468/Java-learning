/*
public class Main{
    public static void main(String[] args){
        /*
        System.out.println("Hello world");
        System.out.println(2+5);
        int num = 3;
        int num1 = 8;
        int num2 = 9;
        System.out.println(num + 4);
        int result = num + num1;
        System.out.println(num + num1);
        System.out.println(result);

        float marks = 6.5f; // if we did not mention by get error without f by default it is double.
        System.out.println(marks);

        double d = 5.8;  //  9 and 6.5f all are literals
        System.out.println(d);

        short sh = 32020;
        System.out.println(sh);

        char ch  = 'a';
        System.out.println(ch);

        boolean  b = true;
        System.out.println(b);

        // byte a = 129; // out of range
        //System.out.println(a);

        //literals

        int binary = 0b101; // to repersent a number in binary format.
        System.out.println(binary);

        int hexdeciaml = 0x7E; // hex deciaml
        System.out.println(hexdeciaml);
         int oct = 0143;
         System.out.println(oct);
         System.out.printf("%o \n",99); //(Note: printf does not automatically move to a new line, so you add \n at the end to create a line break).

        int age  = 21;
        String name   = "Gokul";
        System.out.printf("My name is %s and my age is  %d. \n",name,age);

        //round of 2 decimal places..
        double PI = 3.14159265;
        System.out.printf("Pi to 2 decimal places %.3f \n",PI);

        double num4 = 12e10; //e10 is 10 power 10
        System.out.println(num4);

        // type casting->

        byte by= 2;
        int c = 456;
        c = by ;
        System.out.println(c);
        int g = (int) by;  // implicity conversion.
        System.out.println(g);

        byte Byte = 127;
        int a = 257;
        Byte = (byte)a;  // explicity conversion. or narrow conversion.
        System.out.println(Byte);

        float  f = 6.6f;
        int t = (int)f;
        System.out.println(t);

        // type promotion..
        byte r = 10;
        byte h = 20;
        int res = r*h;
        System.out.println(res);

        // Operators..
        // 1. Arthimetic operators.
        int num8 = 7;
        int num9 = 8;
        num8 = num8 + 2; //9;
        //num8 += 2;
        num9 -= 2; // 6
        int m = num9--; // 6
        System.out.println(num9);
        System.out.println(m); // 6 ; // incremeant.
        System.out.println(num9); //  5
        ++num9; // 6 first increases..
        System.out.println(num9); //9
        System.out.println(num8);

        //2.Relational operator.
        int x =8;
        int y = 9;
        boolean result1 = x>y;
//        boolean result1 = x<y;
//        boolean result1 = x!=y;
//        boolean result1 = x==y;
        System.out.println(result1);

        int  x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        boolean result = x>y && a>b;
        boolean result1 = x>y ||  a>b;
        int res = y & a;
       // int res = 0 & a; o/p = 0
        System.out.println(res);
        System.out.println(result);
        System.out.println(result1);

        boolean re = a>b;
        System.out.println(!re); // not operator.



        // if else if..

        int x = 8;
        int y = 7;
        int z = 9;

        if(x>y && x>z)  // false..
            System.out.println(x);
        else if(y<x && y<z) // or else if(y>z)
            System.out.println(y);
        else
            System.out.println(z);



        //ternary operator..


        int n = 2;
        int result = 0;
        String output;
        output  = n%2 == result  ? "Yes is divisible": "No it is wroung number.";
        System.out.println(output);


         int n = 5;
         if(n ==1)
             System.out.println("Sunday");
         else if (n == 2)
             System.out.println("Monday");
         else if (n == 3)
             System.out.println("Tuesday");
         else if (n == 4)
             System.out.println("Wednesday");
         else if (n == 5)
             System.out.println("Thursday");
         else if (n == 6)
             System.out.println("Firday");
         else
             System.out.println("Saturday");


        int n=50;
        switch(n) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Firday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default :
                System.out.println("Not a day");
        }


        //Need for Loops
        // repeat statement
        // loop - while , do while , for

        //While loop..
        int i =1;
        while(i<=5)
        {
            System.out.println("Hi " + i);
            int j = 1;
            while(j<=3) { // inner while loop
                System.out.println("Hello");
                j++;
            }
            i++; //outter while loop.
        }
        System.out.println("Bye " + i);



        // do while loop..
        int i = 5;
        do
        {
            System.out.println("Welcome");
            i++;
        }while(i<=4);




        //for loopp...

        for(int i = 1;i<=5;i++){
            System.out.println("Gokul");
        }
//        int j=0;
//        for(;j<5;j++){
//            System.out.println("Sarayu");
//        }
//        for(int i = 1;i<6;i++){
//            System.out.println("Day:" + i);
//            for(int j = 1;j<=9;j++){
//                System.out.println((j+8) +"Am" + " - " + (j+9)+"pm");
//            }
//        }
        for(int i = 1;i<6;){
            System.out.println("Day:" + i);
            i++;
        }


        //jumps statement ->
        //continue..
        for(int i = 0;i<=5;i++) {
            if (i == 3)
                continue;
            System.out.println(i);
        }



        int i = 0;
        while(i<=5){
            if(i == 3){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }


        Java continue statement is used for all types of loops but it is generally used in for, while, and do-while loops.
                In the case of a for loop, the continue keyword forces control to jump immediately to the update statement.
                Whereas in the case of a while loop or do-while loop, control immediately jumps to the Boolean expression.




        }
    }

         */

//Number guessing game..
/*
import java.util.*;
public class Main {
    public static void main(String[] args) {

        int random = (int) (Math.random() * 100);
        //System.out.println(random);
        int k = 5;
        System.out.println("Hey buddy! I have choosen the number between 1 to 100 guess the number ?");
        System.out.printf("you will have %d chances to guess \n", k);
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= k; i++) {
            System.out.print("Enter your guess:" );
            int my_num = sc.nextInt();
            if (my_num > 100 && my_num < 0) {
                System.out.println("Invalid number");
            }
                if (my_num == random) {
                    System.out.println("Congarulation.");
                } else if (my_num < random) {
                    System.out.print("Guess the higher number: ");
                    System.out.println(my_num);
                } else
                    System.out.print("Guess the lower number: ");
                    System.out.println(my_num);
            }
        System.out.print("You have used all the chances the correct number is:" + random);
        sc.close();
        }
    }



// Now game with attempts..

import java.util.*;
public class Main{
    public static void main(String[] args){
        System.out.println("I have choosen a number between 1 to 100 guess the number");
        int my_guess = (int)(Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        boolean playagain = true;
        while(playagain){
            int k = 5;
            int attempts = 0;
            boolean won = false;
        for(int i = 0;i<k;i++) {
            System.out.print("Enter your guess: ");
            int my_num = sc.nextInt();
            attempts++;
            if (my_num == my_guess) {

                System.out.println("Congarulation. we have guessed in " + attempts);
                won = true;
                break;
            } else if (my_num > my_guess) {
                System.out.println("The number higher: " + my_num);
            } else {
                System.out.println("The number is lower" + my_num);
            }
        }
            if(!won){
                System.out.println("You've used all " + k + " attempts. The correct number was " + my_guess);
            }
            System.out.print("Game do you want to continue: (yes/no):");
            String ans = sc.next();
            if(ans.equalsIgnoreCase("yes")) {
                System.out.println("GAME OVER ! the correct answer is " + my_guess);
            }
            }
        }
    }


 */

