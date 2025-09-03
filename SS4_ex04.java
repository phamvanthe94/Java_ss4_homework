// Bài 4: Đảo ngược mảng
//Nhập dữ liệu mảng:
//Nhập kích thước của mảng từ người dùng
//Nhập giá trị cho từng phần tử của mảng từ bàn phím
//Xử lý:
//Nếu mảng có kích thước rỗng thì thông báo “Kích thước rỗng”
//Thực hiện đảo ngược mảng bằng cách sử dụng vòng lặp và hoán đổi các phần tử ở đầu
// và cuối mảng (tức là phần tử arr[i] với arr[n-i-1], trong đó n là độ dài mảng)
//Chỉ sử dụng một mảng duy nhất, không dùng mảng phụ
//Đầu ra:
//Hiển thị mảng ban đầu và mảng sau khi đảo ngược
package ra.ex;

import java.util.Arrays;
import java.util.Scanner;

public class SS4_ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // B1 : Cho người dùng nhập kích thước mảng
        System.out.println("Nhập kích thước mảng :");
        int m = sc.nextInt();
        int[] arr = new int[m];
        // B1.1 : Nếu n == 0 thì in ra mảng có kích thước rỗng
        if (m == 0 ) {
            System.err.println("Kích thước rỗng");
        }
        // B2: Cho người dùng nhập giá trị phần tử mảng
        for (int i = 0; i < m; i++) {
            System.out.println("Nhập giá trị thứ " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        // B3: Đảo  ngược mảng bằng cách hoán các phần tử đối xứng
        int n = arr.length; // tạo biến n = độ dài mảng
        for(int i = 0; i < n/2; i++){ // cho i chạy vòng lặp đến n/2 là đủ vì đã đảo các phần tử đối xứng với nhau
            int temp = arr[i]; // gắn biến tạm temp = giá trị i
            arr[i] = arr[n-i-1]; // cho phần tử i trong mảng = thằng đối xứng với nó
            arr[n-i-1] = temp; // cho thằng đối xứng về vị trí biến tạm đang đứng , tức là vị trí i ban đầu
        }
        System.out.println("Mảng sau khi đảo ngược :" + Arrays.toString(arr));

    }
}
