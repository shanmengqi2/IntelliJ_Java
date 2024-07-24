package APIs;

import java.util.Random;
import java.util.Scanner;

public class StringValidationCode {
    public static void main(String[] args) {
        System.out.println("多少位验证码？");
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        System.out.println("生成的验证码为：");
        System.out.println(generateVlidationCode(number));
    }


    public static String generateVlidationCode(int length) {

        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String code = "";
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            code += data.charAt(random.nextInt(62));
        }
        return code;
    }
}
