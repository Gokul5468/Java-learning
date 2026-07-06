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


