package ru.mentee.power.devtools.student;

import java.util.List;
import java.util.ArrayList;

public class StudentList {
    private List<Student> studentList;

    public StudentList() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (student != null) {
            studentList.add(student);
        }
    }

    public List<Student> getStudentsFromSpecific(String city) {
        return studentList.stream().filter(s -> s.city().equals(city)).toList();
    }

    public int countStudents() {
        return studentList.size();
    }

    public List<Student> findStudentsByAge(int targetAge) {
        List<Student> result = new ArrayList<>();
        for (Student student : studentList) {
            if (student.age() == targetAge) {
                result.add(student);
            }
        }
        return result;
    }

    public void printAllStudents() {
        System.out.println("Printing all students with their details");
    }

    public double calculateAverageAge() {
        if (studentList.isEmpty()) {
            return 0.0;
        }
        int total = 0;
        for (Student s : studentList) {
            total += s.age();
        }
        return (double) total / studentList.size();
    }
}