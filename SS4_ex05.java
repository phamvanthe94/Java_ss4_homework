// Bài 5: Viết chương trình Java cho phép
// người dùng nhập một mảng 2 chiều số nguyên và
// tính tổng các số chẵn và tổng các số lẻ trong mảng.
package ra.ex;

import java.util.Scanner;

public class SS4_ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // B1 :  Cho người dùng nhập kích thước của mảng ( số hàng , số cột )
        System.out.println("Nhập số hàng :");
        int rows = sc.nextInt();
        System.out.println("Nhập số cột : ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        int evenSum = 0;
        int oddSum = 0;
        // B2: Cho người dùng nhập giá trị cho mảng
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.printf("Giá trị phần tử ở vị trí [%d][%d]:\n", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if (arr[i][j] % 2 == 0) {
                    evenSum += arr[i][j];
                }else  {
                    oddSum += arr[i][j];
                }
            }
        }
        System.out.println("Tổng các số chẵn là : " + evenSum);
        System.out.println("Tổng các số lẻ là : " + oddSum);

    }
}
