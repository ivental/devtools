package ru.mentee.power.devtools.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class StudentListTest {
    private StudentList studentList;

    @BeforeEach
    void setUp() {
        studentList = new StudentList();
    }

    @Test
    void testAddStudent() {
        Student student = new Student("Ануфрий Джонс", 25, "Лос-Анджелес");
        studentList.addStudent(student);
        assertThat(studentList.countStudents()).isEqualTo(1);
    }

    @Test
    void testAddNullStudent() {
        studentList.addStudent(null);
        assertThat(studentList.countStudents()).isZero();
    }

    @Test
    void testGetStudentsFromSpecific() {
        Student student1 = new Student("Алиса", 22, "Москва");
        Student student2 = new Student("Боб", 23, "СПб");
        Student student3 = new Student("Чарли", 21, "Москва");
        studentList.addStudent(student1);
        studentList.addStudent(student2);
        studentList.addStudent(student3);

        List<Student> moscowStudents = studentList.getStudentsFromSpecific("Москва");
        assertThat(moscowStudents).hasSize(2);
        assertThat(moscowStudents).extracting(Student::name)
                .containsExactlyInAnyOrder("Алиса", "Чарли");
    }

    @Test
    void testFindStudentsByAge() {
        Student student1 = new Student("Алиса", 20, "Москва");
        Student student2 = new Student("Боб", 20, "СПб");
        Student student3 = new Student("Чарли", 21, "Москва");
        studentList.addStudent(student1);
        studentList.addStudent(student2);
        studentList.addStudent(student3);
        List<Student> studentsAge20 = studentList.findStudentsByAge(20);
        assertThat(studentsAge20).hasSize(2);
        assertThat(studentsAge20).extracting(Student::name)
                .containsExactlyInAnyOrder("Алиса", "Боб");
    }

    @Test
    void testCalculateAverageAge() {
        studentList.addStudent(new Student("Алиса", 20, "Москва"));
        studentList.addStudent(new Student("Боб", 30, "СПб"));
        studentList.addStudent(new Student("Чарли", 25, "Москва"));
        double averageAge = studentList.calculateAverageAge();
        assertThat(averageAge).isEqualTo(25.0);
    }

    @Test
    void testCalculateAverageAgeEmptyList() {
        double averageAge = studentList.calculateAverageAge();
        assertThat(averageAge).isEqualTo(0.0);
    }

    @Test
    void testPrintAllStudents() {
        studentList.addStudent(new Student("Тест", 20, "Город"));
        studentList.printAllStudents();
        assertThat(studentList.countStudents()).isEqualTo(1);
    }
}




