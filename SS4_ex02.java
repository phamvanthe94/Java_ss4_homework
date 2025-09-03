// B2: Tính tổng các phần tử trong mảng
package ra.ex;

import java.util.Scanner;

public class SS4_ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        // B1 :  Cho người dùng nhập kích thước của mảng
        System.out.println("Nhập kích thước mảng : ");
        int n  = sc.nextInt();
        int[] arr = new int[n];
        // B2: Cho người dùng nhập giá trị cho từng số nguyên
        for(int i = 0; i < n; i++){
            System.out.println("Nhập giá trị phần tử " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        // B3:  Lặp các phần tử trong mảng bằng foreach rồi tính tổng
        for (int element : arr) {
            sum += element;
        }
        // B4: In ra giá trị tổng của các phần tử trong mảng
        System.out.println("Tổng giá trị của các phần tử trong mảng là :" + sum);
    }

}
