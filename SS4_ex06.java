//T* Bài 6 : Sắp xếp mảng giảm dần và tìm số
package ra.ex;

import java.util.Arrays;
import java.util.Scanner;

public class SS4_ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // B1 : Cho người dùng nhập kích thước mảng
        System.out.println("Nhập kích thước mảng ");
        int m = sc.nextInt();
        int[] arr = new int[m];
        // B2 : Cho người dùng nhập phần từ trong mảng
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập giá trị phần tử " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        // B3: Dùng hàm để sắp xếp mảng theo thứ tự giảm dần
        bubbleSoft(arr);
        System.out.println("Mảng sau khi sắp xếp theo thứ tự giảm dần :" + Arrays.toString(arr));
        // B4: Cho người dùng nhập số cần tìm
        System.out.println("Nhập số cần tìm ");
        int seachNumber = sc.nextInt();
        int result1 = linearSearch(arr, seachNumber);
        System.out.printf("Tìm kiếm tuyến tính : Phần tử %d tìm thấy tại chỉ số : %d\n", seachNumber,result1 );
        int result2 = binarySearch(arr, seachNumber);
        System.out.printf("Tìm kiếm nhị phân : Phần tử %d tìm thấy tại chỉ số : %d", seachNumber,result2 );

    }

    public static void bubbleSoft(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] < x)
                right = mid - 1;
            else
                left = mid + 1;

        }
        return -1;
    }
}
