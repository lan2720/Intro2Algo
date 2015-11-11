/**
 * Created by lan2720 on 15/11/11.
 */
public class InsertionSort {
    public static void insert(int[] A) {
        /**
         * 用反向线性查找找到A[n]应该插入A[0]~A[n-1]的位置
         */
        for(int i = 1; i < A.length; i++) {
            int key = A[i];
            int k = i-1;
            while(k>=0 && A[k] > key){
                A[k+1] = A[k];
                k--;
            }
            A[k+1] = key;
        }
    }
    public static void insert_update(int[] A) {
        /**
         * 用二分查找找到应该插入的位置
         */
        for(int i = 1; i < A.length; i++) {
            int key = A[i];
            int idx = binarySearch(A, key, 0, i-1);
            // 依次后移一个空位，让A[n]能够插入适当的位置
            // 因此插入排序中用二分查找并不能降低时间复杂度，因为只能在查找位置时减少比较次数，
            // 之后还是需要依次将元素后移，这个时间是线性的
            for(int j = i-1; j >= idx; j--)
                A[j + 1] = A[j];
            A[idx] = key;
        }
    }
    public static int binarySearch(int[] A, int v, int p, int r) {
        /**
         * 返回v应该插入的位置
         */
        if(p > r)
            return p;
        int q = (p + r)/2;
        if(v == A[q])
            return q+1;
        else if (v < A[q])
            return binarySearch(A, v, p, q-1);
        else
            return binarySearch(A, v, q+1, r);
    }
    public static void main(String args[]) {
        int[] a = {4,6,2,5,8,-4};
        insert_update(a);
        for(int k = 0; k < a.length; k++)
            System.out.println(a[k]);
    }
}
