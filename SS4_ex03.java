//T* Bài 3: Sắp xếp mảng giảm dần bằng thuật toán sắp xếp nổi bọt Bubbke Soft
package ra.ex;

import java.util.Arrays;
import java.util.Scanner;

public class SS4_ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // B1: Cho người dùng nhập kích thước của mảng
        System.out.println("Nhập kích thước của mảng:");
        int m = sc.nextInt();
        int[] arr = new int[m];
        // B2: Cho người dùng nhập từng giá trị
        for(int i = 0; i < m; i++){
            System.out.println("Giá trị phần tử " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        bubbleSoft(arr);
        System.out.println("Mảng khi sắp xếp theo thứ tự giảm dần :" + Arrays.toString(arr));
    }

    //T* Tạo hàm bubble soft
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
}
