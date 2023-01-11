package org.launchcode.java.chapterexercises.ch3controlflowandcollections;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class HashMapPrac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, String> students = new HashMap<>();
        String student;
        Integer idNum;

        System.out.println("Please enter the student name: ");

        do {
            student = input.nextLine();
            if (!student.equals("")) {
                System.out.println("Please enter the ID for this student: ");
                idNum = input.nextInt();
                students.put(idNum, student);

                System.out.println("Please enter the next student, or press return.");
                input.nextLine();
            }
        } while (!student.equals(""));

        for (Map.Entry<Integer, String> id : students.entrySet()) {
            System.out.println("Student: " + id.getValue() + ", ID: " + id.getKey());
        }


    }
}
