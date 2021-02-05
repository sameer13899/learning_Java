public class Test22 {
    public static int findPosition(int[] a, int x, int s, int e) {
        if (s > e)
            return -1;
        int mid = (s + e) / 2;
        if (a[mid] == x)
            return mid;
        if (a[mid] > x)
            e = mid - 1;
        if (a[mid] < x)
            s = mid + 1;
        return findPosition(a, x, s, e);
    }

    public static void main(String[] args) {
        int a[] = { 11, 22, 33, 44, 55 };
        System.out.println(findPosition(a, 111, 0, 4));
    }
}
