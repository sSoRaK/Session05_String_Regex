import java.util.Scanner;

public class Bai_1_CheckReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // nhập 2 chuỗi
        System.out.print("Nhập chuỗi str1: ");
        String str1 = scanner.nextLine();
        System.out.print("Nhập chuỗi str2: ");
        String str2 = new String(scanner.nextLine());
        // kiểm tra chuỗi đảo ngược
        boolean isCheck = false;
        if (str1.length() == str2.length()) {
            isCheck = str1.equals(new StringBuilder(str2).reverse().toString());
        }
        if (isCheck) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
