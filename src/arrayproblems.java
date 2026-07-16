import java.util.ArrayList;
import java.util.List;

/*

//swapping elements.
import java.util.Arrays;
class arrayproblems {

    static void reversearray(int[] array){
        int start = 0;
        int end= array.length-1;
           while(start<end){
               int temp = array[start];
               array[start] = array[end];
               array[end] = temp;
               //swap(array,start,end); //above 3 lines we can use swap methode..
                start++;
                end--;
            }
        System.out.println(Arrays.toString(array));

    }
    static int[] swap(int[] arr,int index1,int index2){
        int  temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        return arr;
//        for(int i = 0;i<arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,8};
        int[] res = arrayproblems.swap(arr,1,2);
        for(int i =0;i<arr.length;i++) {
            System.out.println(res[i] + " ");
        }
        reversearray(res);

    }
}



//union of 2 sorrted array.

import java.util.HashSet;
import java.util.Set;

class arrayproblems{
    public static void main(String[] args){
        int[] arr = {1,1,2,3,4,5};
        int[] arr1 = {2,3,4,4,5};
        union_arr(arr,arr1);
    }

    private static void union_arr(int[] arr, int[] arr1) {
        Set<Integer> st = new HashSet<>();
        for(int i = 0;i<arr.length;i++) {
            st.add(arr[i]);
        }
        for(int j = 0;j<arr1.length;j++){
            st.add(arr1[j]);
        }
        for(int union: st){
            System.out.println(union);
        }
    }
}


 // optimal.
class arrayproblems{
    public static void main(String[] args){
        int[] arr = {1,1,2,3,4,5};
        int[] arr1 = {2,3,4,4,5};
        List<Integer>ans = union_arr(arr,arr1);
        System.out.println(ans);
    }

    private static List<Integer> union_arr(int[] arr, int[] arr1) {
        List<Integer> union = new ArrayList<>();
        int n  = arr.length;
        int m  =arr1.length;
        int i = 0;
        int j = 0;
        while(i<n && j <m) {
            if (arr[i] < arr1[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr[i]) {
                    union.add(arr[i]);
                }
                i++;
            }
            else if (arr1[j] < arr[i]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[j]) {
                    union.add(arr1[j]);
                }
                j++;
            }
            else {
                if (union.isEmpty() || union.get(union.size() - 1) != arr[i]) {
                    union.add(arr[i]);
                }
                    i++;
                    j++;
            }
        }
                while(i<n){
                    if(union.isEmpty() || union.get(union.size()-1) != arr[i]){
                        union.add(arr[i]);
                    }
                    i++;
                }
                while(j<m){
                    if(union.isEmpty() || union.get(union.size()-1) != arr1[j]){
                        union.add(arr1[j]);

                    }
                    j++;
                }
        return union;


    }
    }



//insertion of 2 sortted array..
//optimised.
class arrayproblems {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4, 5, 6, 7};
        int[] arr1 = {1,2, 3, 3, 5, 6, 6, 7};
        int n = arr.length;
        int m = arr1.length;
        insert_arr(arr, arr1, n, m);
    }

    private static void insert_arr(int[] arr, int[] arr1, int n, int m) {
        List<Integer> insert = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (arr[i] < arr1[j]) {
                i++;
            } else if (arr1[j] < arr[i]) {
                j++;

            }else {
                insert.add(arr[i]);
                i++;
                j++;
            }
        }
        for (int num : insert) {
            System.out.println(num);
        }
    }
}

 */

class arrayproblems{
    public static void main(String[] args){
        int[] arr = {1,2,4,5};
        int n = arr.length;
        int res = missing_num(arr,n);
        System.out.println(res);
    }

    private static int missing_num(int[] arr,int n) {
        for (int i = 1; i <= n; i++) {
            int flag = 0;
            for (int j = 0; i < n-1; j++) {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                return i;
        }
        return -1;
    }

}