/**
 * Created by lan2720 on 15/11/11.
 */
public class BinarySearch {
    public static int search_1(int[] A, int v, int p, int r) {
        /**
         * 二分查找的递归实现
         */
        if(p > r)
            return -1;
        int q = (p + r)/2;
        if (v == A[q])
            return q;
        else if(v < A[q])
            return search_1(A, v, p, q - 1);
        else
            return search_1(A, v, q + 1, r);
    }
    public static int search_2(int[] A, int v) {
        /**
         *  二分查找的迭代实现
         */
        int p = 0;
        int r = A.length;
        while(p <= r) {
            int q = (p + r) / 2;
            if (v == A[q])
                return q;
            else if(v < A[q])
                r = q - 1;
            else
                p = q + 1;
        }
        return -1;
    }
    public static void main(String args[]){
        int[] a= {2,3,5,7,8,20,56};
        System.out.println(search_2(a, 20));
    }
}
