package Programmers;

public class CaesarCipher {

    static String solution(String s, int n) {
        StringBuilder strBuilder = new StringBuilder();

        for (char cipher : s.toCharArray()) {
            int a = 97;
            int z = 122;
            int A = 65;
            int Z = 90;

            if (cipher >= A && cipher <= Z) {
                cipher += n;

                if (cipher > Z) {
                    int distance = cipher - Z - 1;
                    cipher = (char) (A + distance);
                }
            }

            if (cipher >= a && cipher <= z) {
                cipher += n;

                if (cipher > z) {
                    int distance = cipher - z - 1;
                    cipher = (char) (a + distance);
                }
            }

            strBuilder.append(cipher);
        }

        return strBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("ABC", 3));
    }
}
