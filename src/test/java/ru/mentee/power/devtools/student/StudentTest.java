package ru.mentee.power.devtools.student;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class StudentTest {

    @Test
    void testStudentCreation() {
        Student student = new Student("Test", 25, "City");
        assertThat(student.name()).isEqualTo("Test");
        assertThat(student.age()).isEqualTo(25);
        assertThat(student.city()).isEqualTo("City");
    }

    @Test
    void testIsAdultTrue() {
        Student student = new Student("Test", 18, "City");
        assertThat(student.isAdult()).isTrue();
    }

    @Test
    void testIsAdultFalse() {
        Student student = new Student("Test", 17, "City");
        assertThat(student.isAdult()).isFalse();
    }

    @Test
    void testGetStudentInfo() {
        Student student = new Student("Ivan", 20, "Moscow");
        String expected = "Student: Ivan, Age: 20, City: Moscow - This is a very long string that exceeds 100 characters";
        assertThat(student.getStudentInfo()).isEqualTo(expected);
    }

    @Test
    void testValidateStudentData() {
        Student student = new Student("Test", 25, "City");
        student.validateStudentData("test");
        assertThat(student).isNotNull();
    }

    @Test
    void testMaxStudentsConstant() {
        assertThat(Student.MAX_STUDENTS).isEqualTo(100);
    }

    @Test
    void testRecordEquality() {
        Student student1 = new Student("Ivan", 20, "Moscow");
        Student student2 = new Student("Ivan", 20, "Moscow");
        Student student3 = new Student("Petr", 20, "Moscow");

        assertThat(student1).isEqualTo(student2);
        assertThat(student1.hashCode()).isEqualTo(student2.hashCode());
        assertThat(student1).isNotEqualTo(student3);
    }
}