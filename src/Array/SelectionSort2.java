package Array;

public class SelectionSort2 {
    public static void main(String[] args) {
        int []a = {98,3,2,11,2,4,556,77};
        int n = a.length;
        for (int i=0; i<n-1; i++){
            int min = 1;
            for (int j=i; j<n-1; j++){
                if(a[j]>a[min]){
                    min=j;
                }
            }
            int temp = a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        for (int answer:a)
            System.out.print(answer+" ");
    }
}
