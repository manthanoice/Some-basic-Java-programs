/*
    The swapping logic I used here, goes like:
    a=a+b;
    b=a-b;
    a=a-b;

    Example:
    a=5,b=4
    a=5+4 ---> a=9;
    b=a-b ---> b=9-4=5 ---> b=5;
    a=a-b ---> a=9-5=4 ---> a=4;

    So this is how the above swap logic works, hope this helps xD
 */

package Array;

import java.util.Scanner;

public class BubbleSortByMe {
    public static void main(String[] args) {
        int[]a={69,420,33,22,45,6,-9,37,895};
        int n = a.length;
        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-1; j++){
                if(a[j+1]<a[j]){
                    a[j+1]=a[j+1]+a[j];
                    a[j]=a[j+1]-a[j];
                    a[j+1]=a[j+1]-a[j];
                }
            }
        }
        for (int answer: a){
            System.out.print(answer+" ");
        }
    }
}
