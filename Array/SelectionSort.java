package Array;

public class SelectionSort {
    public static void main(String[] args) {
        int a[] = {2,3,1,-3,4,9,20,21};
        int n = a.length;
        for (int i=0; i<n-1; i++){
            int min = i;
            for (int j=i; j<n-1; j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp = a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        for (int x:a){
            System.out.print(x+" ");
        }
    }
}
