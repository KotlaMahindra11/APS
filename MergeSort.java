import java.util.Scanner;

public class MergeSort {

    public static void mergesort(int a[], int n) {

        if (n < 2) {
            return;
        }

        int mid = n / 2;

        
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }

        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }

        mergesort(l, mid);
        mergesort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(int a[], int l[], int r[], int left, int right) {

        int i = 0;  
        int j = 0;  
        int k = 0;  

        while (i < left && j < right) {

            if (l[i] <= r[j]) {
                a[k] = l[i];
                i++;
            } else {
                a[k] = r[j];
                j++;
            }

            k++;
        }
        
        while (i < left) {
            a[k] = l[i];
            i++;
            k++;
        }

        while (j < right) {
            a[k] = r[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        mergesort(a, n);

        System.out.println("Sorted array:");

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}
