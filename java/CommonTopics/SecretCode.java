package CommonTopics;

import java.util.Scanner;

public class SecretCode {

    static String decode(int count, String target) {
        String codes = "";

        for (int i = 0; i < count; i++) {
            String tempStr = target.substring(0, 7).replace('#', '1').replace('*', '0');
            int number = Integer.parseInt(tempStr, 2);
            codes += (char) number;
            target = target.substring(7);
        }

        return codes;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int count = Integer.parseInt(stdIn.nextLine());
        String secretCode = stdIn.nextLine();
        String result = decode(count, secretCode);

        System.out.println(result);
    }
}
