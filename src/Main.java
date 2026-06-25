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
             */

        int n = 2;
        switch(n = 2) {
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

        }
    }