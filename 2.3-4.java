/**
 * Created by lan2720 on 15/11/11.
 */
public class InsertSort {
    public static void insert(int[] A, int n) {
        if(n >= 1){
            insert(A, n-1);
            int key  = A[n];
            int i;
            for(i = n-1; i>=0 && A[i] > key; i--) {
                A[i+1] = A[i];
            }
            A[i+1] = key;
        }
    }
    public static void main(String args[]){
        int[] a = {5,2,6,9,3,1,34,-3,89,-67,24};
        insert(a, 10);
        for(int j = 0; j < a.length; j++)
            System.out.println(a[j]);
    }
}
