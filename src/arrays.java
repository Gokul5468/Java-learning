/*
public class arrays {
    public static void main(String[] args){
        int[] array = new int[6]; // size declartion.
        int arrays[] = {1,2,13,10,8,7}; //intilaztion of array.
        for(int i = 0;i<arrays.length;i++){
            System.out.println(arrays[i]+" ");
        }
        String[] names ={"Gokul","Sarayu","voona","Sai"};
        for(int j = 0;j<names.length;j++){
            System.out.println(names[j] + " ");
        }




    }
}

 */

/*
import java.util.*;
class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
            System.out.println(Arrays.toString(arr));
    }
}


import java.util.Arrays;

//Passing in function
public class arrays{
    public static void main(String[] args){
    int num[]= {23,4,5,3,3};
    change(num);
    System.out.println(Arrays.toString(num));
    }
    static void change(int arr[]){
        arr[0] = 22;
    }
}

 */

/*
// Array with objects..
import java.util.*;
class arrays{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String str[]  = new String[4];
for(int i = 0;i<str.length;i++){
    str[i] = sc.next();
}
System.out.println(Arrays.toString(str));
}
}



    //
//Arrays of Object in java.

import java.util.*;

class Students{
    public int roll_no =56;
    public String name ="Veera";

    Students(int roll_no,String name){
        this.roll_no = roll_no;
        this.name=name;
    }
}
public class arrays{
    public static void main(String[] args){
        Students[] arr = new Students[5];
        arr[0] = new Students(1,"name");
        arr[1] = new Students(21,"Sarayu");
        arr[2] = new Students(22,"Voona");
        arr[3] = new Students(23,"Sai");
        arr[4] = new Students(24,"Bodangi");

        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i].roll_no + " " +arr[i].name);
        }
    }
}



import java.util.*;
public class arrays{
    public static int sum(int arr[]){
        int cnt = 0;
        for(int i = 0;i<arr.length;i++) {
            cnt += arr[i];
        }
        return cnt;
    }
    public static void main(String[] args){
        int a[] = {1,2,3,4};
        int res = sum(a);
        System.out.println(res);

    }
}



class arrays {
    // Driver method
    public static void main(String args[])
    {
        int arr[] = m1();

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static int[] m1()
    {
        // returning  array
        return new int[] { 1, 2, 3 };
    }
}



//Multiple dem array->
// 2d

class arrays{
    public static void main(String[] args){
        int arr[][] = new int[3][2];

        int num = 1;
        for(int i = 0;i< arr.length;i++){
            for(int j = 0;j< arr[i].length;j++){
                arr[i][j] = num;
                num++;
            }
        }
         for(int i = 0;i<3;i++){
             for(int j = 0;j<2;j++){
                 System.out.print(arr[i][j] + " ");

             }
             System.out.println();
         }
    }
}



import java.io.*;
class arrays{
    public static void main(String[] args){
        int arr[][] ={{1,2,3},{5,7,6}};
        System.out.println(arr[1][2]);
    }
}



//3d array-->

import java.io.*;

class arrays
{
    public static void main(String[] args){

        // Array Created and Initialized
        int[][][] arr = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };

        // Defining the x,y,z in Multi-dimensional Array
        int n = arr.length;
        int m = arr[0].length;
        int o = arr[0][0].length;

        // Printing the Array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < o; k++) {
                    System.out.println("arr[" + i + "][" + j + "][" + k + "] = " + arr[i][j][k]);
                }
            }
        }
    }
}




import java.io.*;

class arrays {
    public static void main(String[] args){

        int[][][] arr = new int[2][2][2];

        // Three Dimensional x,y,z dimension
        int n=arr.length;
        int m=arr[0].length;
        int o=arr[0][0].length;

        int it=1;

        // Assigning the values to array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for(int k=0; k < o; k++){
                    arr[i][j][k] = it;
                    it++;
                }
            }
        }

        // Printing the Array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++){
                for(int k=0; k < o; k++)
                    System.out.print(arr[i][j][k] + " ");
                System.out.println();
            }
            System.out.println();
        }
    }
}



// Taking a input from user of multidimensional array (Runtime) and print the count of even and odd number given by user.

import java.util.*;

public class arrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns:");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i = 0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();

            }
        }


        for(int i =0;i<n;i++){
            for(int j = 0;j<m;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int odd = 0;int even = 0;
        for(int i =0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
            System.out.println("Even:" + even);
            System.out.println("od:" + odd);
    }
}



//multi deminsional array..

import java.util.*;
class arrays{
    public static void main(String[] args){
//        int[][] arr = new int[3][];
//
//        int[][] arr2D = {
//                {1,2,3}, //0th index
//                {4,5,6},  //1st
//                {7,8,9} // 2nd arr2D[2] == {7,8,9}
//        };

        //input;;
        int[][] arr = new int[3][2];
        Scanner sc = new Scanner(System.in);
        for(int row  = 0;row<arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){
                arr[row][col] = sc.nextInt();
            }
        }

//        for(int row  = 0;row<arr.length;row++){
//            for(int col = 0;col<arr[row].length;col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
            // output..
//        for(int row = 0;row<arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

        //enchanceed for loop
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }


    }
}

 */

//ArrayList..
/*
import java.util.*;
class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(23);
        list.add(34); // we can add many as we want.

        System.out.println(list);
        System.out.println( list.contains(32));

        System.out.print("Enter the size of arraylist:" );
        int n = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list1.add(sc.nextInt());
            }
            for (int i = 0; i < list1.size(); i++) {
                System.out.print(list1.get(i) + " ");
            }
        }
    }

*/

//multi dimensional by arraylist.
import java.util.*;
class arrays{
public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

   //initialisation.
    for(int i = 0;i<3;i++){
        list.add(new ArrayList<>());
    }

    //add elements
    for(int i = 0;i<3;i++){
        for(int j = 0;j<3;j++){
            list.get(j).add(sc.nextInt());
        }
    }
    System.out.println(list);
}
}


