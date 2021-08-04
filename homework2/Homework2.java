package homework2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        // Tạo đối tượng input
        Scanner input = new Scanner(System.in);

        // Xuất ra thông báo cho người dùng nhập dữ liệu
        System.out.print("Nhập vào một số a: ");

        // Lấy dữ liệu người dùng vừa nhập
        // Gán vào biến soNguyen
        int a = input.nextInt();

        System.out.print("Nhập vào một số b: ");

        int b = input.nextInt();
        // In dữ liệu vừa lấy được ra màn hình
        System.out.println("Số bạn vừa nhập là: " +a*b);
    }
}
 