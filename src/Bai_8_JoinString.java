import java.util.Scanner;

public class Bai_8_JoinString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi thứ nhất: ");
        String str1 = scanner.nextLine();
        System.out.print("Nhập chuỗi thứ hai: ");
        String str2 = scanner.nextLine();
        String outputString = "";
        // nối chuỗi khi độ dài 2 chuỗi bằng nhau
        if (str1.length() == str2.length()) {
            outputString = str1.concat(str2);
        }
        // tìm độ dài chuỗi lớn hơn và cắt bỏ sau đó nối lại
        int maxLength = Math.max(str1.length(), str2.length());
        if (maxLength == str1.length()) {
            int cutLength = str1.length() - str2.length();
            outputString = str1.substring(cutLength).concat(str2);
        } else {
            int cutLength = str2.length() - str1.length();
            outputString = str2.substring(cutLength).concat(str1);
        }
        System.out.println("Chuỗi sau khi nối: " + outputString);
    }
}
