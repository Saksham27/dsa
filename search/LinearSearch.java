import java.util.*;

class LinearSearch{

    static int[] arr = {1,4,23,54,45,553,2,234,665,55};

    public static void main(String[] args){
        System.out.println("Array : " + Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.print("What you want to search : ");
        int input = sc.nextInt();
        System.out.println("Found At : " + linearSearch(arr,input));
    }

    // LINEAR SEARCH
    // >>> Return the index if item found
    //     otherwise return -1

    static int  linearSearch(int[] arr,int n){
        if(arr.length == 0)
            return -1;

        for(int i =0; i<arr.length;i++){
            if( n == arr[i])
                return i;
        }
        return -1;
    }
}