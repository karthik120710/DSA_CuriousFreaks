package ProblemSet4;

public class ArrayProblems {
    public static void main(String[] args) {
        int arr[]={1,4,6,7,9,0};
        System.out.println(minVal(arr));
    }

    public static int minVal(int[] arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min)
                min=arr[i];
        }
        return min;
    }
}
