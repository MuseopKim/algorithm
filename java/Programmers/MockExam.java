package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockExam {

    static class Queue {
        private int front;
        private int rear;
        private int[] array;

        public Queue(int[] array) {
            front = 0;
            rear = array.length - 1;
            this.array = array;
        }

        public void enqueue(int data) {
            if (nextIndex(rear) == front) {
                throw new RuntimeException("Full");
            }

            rear = nextIndex(rear);
            array[rear] = data;
        }

        public int dequeue() {
            if (isEmpty()) {
                throw new RuntimeException("Empty");
            }

            int data = array[front];
            front = nextIndex(front);

            return data;
        }

        public boolean isEmpty() {
            return front == rear;
        }

        private int nextIndex(int index) {
            if (index >= array.length - 1) {
                return 0;
            }

            return index + 1;
        }
    }

    static class Person implements Comparable<Person> {
        private int id;
        private int count;

        public Person(int id) {
            this.id = id;
            this.count = 0;
        }

        public int getId() {
            return this.id;
        }

        public int getCount() {
            return this.count;
        }

        public void addCount() {
            this.count += 1;
        }

        @Override
        public int compareTo(Person person) {
            if (this.count < person.getCount()) {
                return 1;
            }

            if (this.count > person.getCount()) {
                return -1;
            }

            return 0;
        }
    }

    static int[] solution(int[] answers) {
        Queue person1Answers = new Queue(new int[] { 1, 2, 3, 4, 5 });
        Queue person2Answers = new Queue(new int[] { 2, 1, 2, 3, 2, 4, 2, 5 });
        Queue person3Answers = new Queue(new int[] { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 });

        Person[] person = new Person[] { new Person(1), new Person(2), new Person(3) };

        for (int i = 0; i < answers.length; i++) {
            int person1 = person1Answers.dequeue();
            int person2 = person2Answers.dequeue();
            int person3 = person3Answers.dequeue();

            if (answers[i] == person1) {
                person[0].addCount();
            }

            if (answers[i] == person2) {
                person[1].addCount();
            }

            if (answers[i] == person3) {
                person[2].addCount();
            }

            person1Answers.enqueue(person1);
            person2Answers.enqueue(person2);
            person3Answers.enqueue(person3);
        }

        Arrays.sort(person);

        List<Integer> result = new ArrayList<>();
        result.add(person[0].getId());

        int maxCount = person[0].getCount();

        if (person[1].getCount() == maxCount) {
            result.add(person[1].getId());
        }

        if (person[2].getCount() == maxCount) {
            result.add(person[2].getId());
        }

        return result.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5 }));
    }
}
