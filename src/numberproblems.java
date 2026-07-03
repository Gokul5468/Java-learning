/* // Palindrone number..
import java.util.*;
public class numberproblems {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Enter the number to check palindrome number or not: " + number);
        int temp = number;
        int digit = 0;
        if(number < 9 )
            System.out.println("Invalid number");
        else {
            while (number != 0) {
                int rem = number % 10;
                digit = digit * 10 + rem;
                number /= 10;

            }
            if (digit == temp)
                System.out.println("Palindrome Number");
            else
                System.out.println("Not a palindrome number");
        }

    }
}


//another way..
import java.util.*;
public class numberproblems{
    public String palidrone(int num){
        int digit = num;
        int revnum = 0;
        while(num >0){
            int temp = num % 10;
            revnum = revnum * 10 +temp;
            num /= 10;
        }
        if(revnum == digit){
            return "Palidrone";
        }else{
            return "Not a palidfone number";
        }

    }
    public static void main(String[] args){
        numberproblems np = new numberproblems();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String result = np.palidrone(num);
        System.out.println(result);

    }
}



// find plaindrone number in range or not..
import java.util.*;
public class numberproblems{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number:" );
        int min = sc.nextInt();
        System.out.print("Enter the ending number:" );
        int max = sc.nextInt();
        for(int i = min;i<max;i++) {
            int revnum = 0;
            int temp = i;
            int num = i;
            while (num != 0){
                int digit = num % 10;
                revnum = revnum * 10 + digit;
                num /= 10;
            }
            if (temp == revnum)
                System.out.println(revnum);

            }
        }
    }



//number is prime or not..

import java.util.*;
public class numberproblems{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check prime or not:" );
        int num = sc.nextInt();
        if(num <= 1){
            System.out.println("Invalid number");
        }
        if(num == 2){
            System.out.println("Prime number");
        }
        for(int i = 2;i<num;i++){
            if(num % i ==0){
                System.out.println("False");
                break;
            }else{
                System.out.println("True");
                break;
            }
        }

    }
}



// optimised..

import java.util.*;
public class numberproblems{
    public boolean isprime(int num){
        int cnt = 0;
        for(int i = 1;i<=Math.sqrt(num);i++){
            if(num % i == 0){
                cnt++;
                if(num /i != i){
                    cnt++;
                }
            }
        }
        return cnt == 2;
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number to prime or not :" );
        int num = sc.nextInt();
        numberproblems obj = new numberproblems();
        if(obj.isprime(num)){
            System.out.println(num + "is prime" );
        }else{
            System.out.println("not prime.");
        }
    }

}



// prime number in range..

import java.util.Scanner;

public class numberproblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number from: ");
        int min = sc.nextInt();
        System.out.print("Enter to number: ");
        int max = sc.nextInt();
        for (int num = min; num <=max; num++) {
            int cnt = 0;
            for (int i = 1; i <=Math.sqrt(num); i++) {
                if (num % i == 0) {
                    cnt++;
                    if (num / i != i) {
                        cnt++;

                    }

                }
            }
            if (cnt == 2) {
                System.out.println(num);
            }
        }

    }
}

 */

//Armstrong number.

/*
import java.util.*;
public class numberproblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check Armstrong number: ");
        int num = sc.nextInt();
        int temp = num;
        int cnt = 0;
        int sum = 0;
        int digit = num;
        while(digit != 0) {
            cnt++;
            digit /= 10;
        }

        while (num != 0) {
            int arm = num % 10;
            double n = Math.pow(arm, cnt);
            sum += n;
            num /= 10;
        }

        if (temp == sum) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}



//number is perfect number or not.
import java.util.*;
public class numberproblems{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number to check perfect number or not:");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1;i<num;i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if(sum == num){
            System.out.println("it is perfect number.");
        }else{
            System.out.println("it is not.");
        }
    }
}



import java.util.*;
public class numberproblems{
    public static boolean isperfect(int n){
        int sum = 0;
        for(int i = 1;i*i <= n;i++){
            if(n % i == 0){
                if(i*i==n||i ==1){
                    sum += i;
                }else{
                    sum += i + n/i;
                }
            }
        }
        return sum == n;
    }
    public static void main(String[] args){
        boolean ex1 = isperfect(28);
        if(ex1){
            System.out.println("It is perfect number.");
        }else{
            System.out.println("it is not.");
        }
    }
}



// even or odd;
import java.util.*;
public class numberproblems{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0)
            System.out.println("it is even number");
        else
            System.out.println("it is not even number.");
    }
}


import java.util.*;
public class numberproblems{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n & 1) == 0)
            System.out.println("it is even number");
        else
            System.out.println("it is not even number.");
    }
}



// sum of n natural number..
//recursion

import java.util.Scanner;
class numberproblems{
    public int sumofnaturalnum(int n){
        if(n ==1){
            return 1;
        }
        return n+sumofnaturalnum(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        numberproblems result  = new numberproblems();
        int res = result.sumofnaturalnum(5);
        System.out.println(res);

    }
    }



public class numberproblems{
        public static void main(String[] args) {
            double num1 = 1, num2 = 3, num3 = 5;
            double maxNum = Math.max(num1, Math.max(num2, num3));
            System.out.println("The maximum of the three numbers is " + maxNum);  //Print max of the three numbers
        }
    }


import java.util.*;
public class numberproblems{
    public static boolean leapyear(int n){
        if(n % 400 == 0 ) return true;
        if(n % 4 == 0) return true;
        if(n % 100 == 0) return false;
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(leapyear(num)) {
            System.out.println("Yes it is leap year.");
        }
            else{
                System.out.println("not a leap year");
            }
        }

    }

 */

