package org.example;

import java.util.*;

public class StudentSorter {
    public static void sortStudentsByAgeDescending(List<Student> students) {
        //code here
        // Use Comparator<Student>
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 25));
        students.add(new Student("Charlie", 22));

        sortStudentsByAgeDescending(students);

        for(Student s:students){
            System.out.println(s.getName()+" "+s.getAge());
        }
    }
}
