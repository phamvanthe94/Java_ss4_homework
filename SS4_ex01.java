//T* Bài 1: Tìm phần tử lớn nhất trong mảng

package ra.ex;

import java.util.Arrays;
import java.util.Scanner;

//T* Phân tích :

// B2 : cho người dùng nhập kích thước của mảng
// B3 : Cho người dùng nhập từng giá trị cho mảng số nguyên
// B4 : Tìm phần tử lớn nhất trong mảng
public class SS4_ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // B1: cho người dùng nhập kích thước mảng

        System.out.println("Nhập kích thước mảng ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        // B2: Cho người dùng nhập các phần tử cho mảng
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
        System.out.println("Mảng sau khi sắp xếp theo thứ tự giảm dần :"+ Arrays.toString(arr));
        System.out.printf("Phần tử lớn nhất trong mảng là :%d\n", arr[0]);


    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int max = arr[i];
            int maxIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                int temp = arr[maxIndex];
                arr[maxIndex] = arr[i];
                arr[i] = temp;
            }
        }

    }
}
