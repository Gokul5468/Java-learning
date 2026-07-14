import java.util.ArrayList;
import java.util.Arrays;

public class strings {
    public static void main(String[] args) {
//        String a = "Gokul"; // creted a obj.
//        System.out.println(a);
//        a = "Sarayu"; // in this we created new obj not changing the old value .
//        System.out.println(a); // old object garbge collector..is done.
//        System.out.println(a==a);// true
//        System.out.println(a.equals(a)); // true
/*
        String a = "Gokul";
        String b = "Gokul";
        System.out.println(a==b); //true
        System.out.println(a.equals(b)); //true

        String c = new String("Sarayu");
        String d = new String("Sarayu");
        System.out.println(c==d); //false
        System.out.println(c.equals(d)); //true. to check values..

        //to get each value in index we use charAt()

        System.out.println(d.charAt(1)); // accessing.

        System.out.println(56);
        System.out.println("Venkata");

        System.out.println(new int[]{2,3,4,5}); // it uses bydefault toString() methode.
        System.out.println(Arrays.toString(new int[]{2,3,4,5}));

        String n = null;
        System.out.println(n);

        //formatting the string..

        float  num1= 3.4556f;
        System.out.printf("the round number is %.2f\n",num1);

        System.out.printf("the round pi  is %.2f\n",Math.PI);

        System.out.printf("My name is %s and i am %s\n" ,"Gokul","cool");

        %c - Character
                %d - Decimal number (base 10)
                %e - Exponential floating-point number
                %f - Floating-point number
                %i - Integer (base 10)
                %o - Octal number (base 8)
                %s - String
                %u - Unsigned decimal (integer) number
                %x - Hexadecimal number (base 16)
                %t - Date/time
                %n - Newline


        System.out.println('a'+'b'); //ASCII Values.
        System.out.println("a"+"b"); //concatation
        System.out.println('a'+3); // 100
        System.out.println((char)('a'+3));
        System.out.println("a"+3); // a3 because integer converted to Interger that will call toString();
        System.out.println("Gokul"+new ArrayList<>());
        System.out.println("GOKUL" + Integer.valueOf(56));


//           */

//        String series = "";
//        for(int i = 0;i<26;i++){
//            char ch = (char)('a' + i);
//            series = series +ch;
//        }
//        System.out.println(series); // hear we are creating extra object for each storing of new letter like a,ab,abc,......abcdef...y upto this waste of memory. so we need something like to modifty string so we got StringBulider.


        //String Methodes.
/*
        String str = "GreekforGeeks";
        System.out.println(str.substring(2,6)); //eekf

        System.out.println(str.charAt(3));

        System.out.println(str.substring(5));

        System.out.println(str.substring(5,8));

        System.out.println(str.concat("!!"));

        System.out.println(str.indexOf("e"));

        System.out.println(str.indexOf("e",4));

        System.out.println(str.lastIndexOf("e"));

        System.out.println(str.equals("GreekforGeeks")); //boolean equals(Object otherObj) Method ->This method compares this string to the specified object.

        System.out.println(str.equalsIgnoreCase("greekforGeeks"));

        System.out.println(str.equalsIgnoreCase("greekGeeks"));

        System.out.println(str.compareTo("GreeksforGeeks"));//This method compares two string lexicographically.

        System.out.println(str.compareToIgnoreCase("greeksforgeeks")); //This method compares two string lexicographically, ignoring case considerations.

        String str1 = "    Hello,   world   ";
        System.out.println(str1.trim()); // remove only spces at both end on in the string.

        System.out.println(str1.replace("l" ,"h"));

        System.out.println(str1.contains("hh")); //This method returns true if string contains the given string.
        //above gives false becz str1 is immutable.

        char[] ch = str.toCharArray();
        for(char c :ch)
            System.out.print(c + " ");
        */


        //StringBulider-->

    StringBuilder builder = new StringBuilder();
    for(int i = 0;i<26;i++){
        builder.append((char)('a'+i));
    }
    System.out.println(builder.toString());

    //StringBulider methodes.

        StringBuilder sb = new StringBuilder("GeeksforGeeks");
        System.out.println("Initial: " + sb);

        sb.append(" is awesome!");
        System.out.println("After append: " + sb);

        sb.insert(13, " Java");
        System.out.println("After insert: " + sb);

        sb.replace(0, 5, "Welcome to");
        System.out.println("After replace: " + sb);

        sb.delete(8, 14);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Length: " + sb.length());

        char c = sb.charAt(5);
        System.out.println("Character at index 5: " + c);

        sb.setCharAt(5, 'X');
        System.out.println("After setCharAt: " + sb);

        String sub = sb.substring(5, 10);
        System.out.println("Substring (5–10): " + sub);

        sb.reverse(); // Revert for search
        System.out.println("Index of 'Geeks': " + sb.indexOf("Geeks"));

        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb);

        String result = sb.toString();
        System.out.println("Final String: " + result);

    }

}
