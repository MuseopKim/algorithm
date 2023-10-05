package CommonTopics;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DesignEducationCurriculum {

    static String solution(String essentials, String curriculum) {
        Queue<Character> essentialsQueue = new LinkedList<>();

        for (char subject : essentials.toCharArray()) {
            essentialsQueue.offer(subject);
        }

        for (char subject : curriculum.toCharArray()) {
            if (essentialsQueue.contains(subject)) {
                if (essentialsQueue.peek() == subject) {
                    essentialsQueue.poll();
                    continue;
                }

                return "NO";
            }
        }

        if (essentialsQueue.isEmpty()) {
            return "YES";
        }

        return "NO";
    }

    static String isValidCurriculum(String essentials, String curriculum) {
        Queue<Character> curriculumQueue = new LinkedList<>();
        Queue<Character> essentialsQueue = new LinkedList<>();

        for (char subject : curriculum.toCharArray()) {
            curriculumQueue.offer(subject);
        }

       for (char subject : essentials.toCharArray()) {
           essentialsQueue.add(subject);
       }

        for (char subject : curriculum.toCharArray()) {
            if (essentialsQueue.contains(subject)) {
                curriculumQueue.offer(curriculumQueue.poll());
                continue;
            }

            curriculumQueue.poll();
        }

        if (curriculumQueue.equals(essentialsQueue)) {
            return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String essentials = stdIn.next();
        String curriculum = stdIn.next();

        System.out.println(isValidCurriculum(essentials, curriculum));
    }
}
