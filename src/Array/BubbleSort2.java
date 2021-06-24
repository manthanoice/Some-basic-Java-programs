package Array;

public class BubbleSort2 {
    public static void main(String[] args) {
        int[] a = {9,-1,3,45,67,8,9,2,4,43};
        int n = a.length;
        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-1-i; j++){
                if(a[j+1]<a[j]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j]=temp;
                }
            }
        }
        for (int answer: a){
            System.out.print(answer+" ");
        }
    }
}
