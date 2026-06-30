/*
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
*/

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
