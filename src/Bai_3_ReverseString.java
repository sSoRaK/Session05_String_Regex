import java.util.Scanner;

public class Bai_3_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một chuỗi: ");
        String str = scanner.nextLine();
        System.out.println("Chuỗi vừa nhập: " + str);
        // đảo ngược chuỗi
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.printf("%s", str.charAt(i));
        }
    }
}
