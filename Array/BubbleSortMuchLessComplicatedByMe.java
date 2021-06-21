package Array;

public class BubbleSortMuchLessComplicatedByMe {
    public static void main(String[] args) {
        int[]a={20,69,-2,4,5,6,22,33,4,5,-99};
        int n = a.length;
        for (int i=0; i<n-1; i++){
            boolean sort = true;
            for (int j=0; j<n-1-i; j++){
                if (a[j+1]<a[j]){
                    a[j+1]=a[j+1]+a[j];
                    a[j]=a[j+1]-a[j];
                    a[j+1]=a[j+1]-a[j];
                    sort=false;
                }
            }
            if(sort)
                break;
        }
        for (int answer:a){
            System.out.print(answer+" ");
        }
    }
}
