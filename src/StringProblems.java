//reverse a  String

/*
import java.util.*;
public class StringProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String reversed = reversed(str);
        System.out.println(reversed);
    }

    private static String reversed(String str) {
        char[] arr = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {

                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;

            }
            return new String(arr);
    }
}




//plaindrome or not in string.
import java.util.*;
public class StringProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(isPalindrome(str))
        System.out.println("Yes it is palindrome.");
        else
            System.out.println("Not palindrome.");
    }

    private static boolean isPalindrome(String str) {
        char[] arr = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if(arr[start] != arr[end])
                return false;
            start++;
            end--;

        }
        return true;
    }
}



//better solu
import java.util.*;
public class StringProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(isPalindrome(str))
            System.out.println("Yes it is palindrome.");
        else
            System.out.println("Not palindrome.");
    }

    private static boolean isPalindrome(String str) {
        if(str.length() == 0 || str == null)
            return true;
        str = str.toLowerCase();
        for(int i = 0;i<= str.length()/2;i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length() -1-i);
            if(start != end)
                return false;


        }
        return true;
    }
}


 */
//optimised.

import java.util.*;
public class StringProblems {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isPalindrome(str) ? "Palindrome" : "Not Palindrome");
    }

    private static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
