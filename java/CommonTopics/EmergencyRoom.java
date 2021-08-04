package CommonTopics;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EmergencyRoom {

    static class Patient {
        int index;
        int priority;

        public Patient(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }

    static int findOrder(int count, int targetOrder, int[] patients) {
        Queue<Patient> patientsQueue = new LinkedList<>();

        for (int i = 0; i < count; i++) {
            patientsQueue.offer(new Patient(i, patients[i]));
        }

        int order = 1;

        while (true) {
            Patient current = patientsQueue.poll();

            boolean hasHigher = false;

             for (Patient patient : patientsQueue) {
                 if (patient.priority > current.priority) {
                     patientsQueue.offer(current);
                     hasHigher = true;
                     break;
                 }
             }

             if (!hasHigher) {
                 if (current.index == targetOrder) {
                     break;
                 }
                 order += 1;
             }
        }

        return order;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int count = stdIn.nextInt();
        int[] patients = new int[count];

        int targetOrder = stdIn.nextInt();

        for (int i = 0; i < count; i++) {
            patients[i] = stdIn.nextInt();
        }

        System.out.println(findOrder(count, targetOrder, patients));
    }
}
