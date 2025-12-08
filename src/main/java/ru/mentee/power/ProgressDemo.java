package ru.mentee.power;

public class ProgressDemo {
    public static void main(String[] args) {
        MenteeProgress student = new MenteeProgress("Ilia", 2, 6);
        var progress = student;

        System.out.println(progress.summary());
        if (progress.readyForSprint()) {
            System.out.println("Status: sprint ready");
        } else {
            System.out.println("Status: backlog first");
        }
        System.out.println("feature/DVT-3");
    }
}

