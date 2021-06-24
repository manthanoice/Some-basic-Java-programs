package Array;

public class SelectionSort3 {
    public static void main(String[] args) {
        int a[] =  {2,4,-4,6,7,-3,4,5,1};
        int n = a.length;
        for (int i=0; i<n-1; i++){
            int min = i;
            for (int j=i; j<n; j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            a[i]=a[i]+a[min];
            a[min]=a[i]-a[min];
            a[i]=a[i]-a[min];
        }
        for (int answer: a){
            System.out.print(answer+" ");
        }
    }
}
