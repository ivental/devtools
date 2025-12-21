package ru.mentee.power.devtools.student;

public record Student(String name, int age, String city) {
    public String getStudentInfo() {
        return "Student: " + name + ", Age: " + age + ", City: " + city +
                " - This is a very long string that exceeds 100 characters";
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public static final int MAX_STUDENTS = 100; /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void validateStudentData(String unused_param) {
        int x = 5;
        int y = 10;
        System.out.println(x + y);
    }
}