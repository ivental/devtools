package ru.mentee.power.devtools.progress;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MenteeTest {

    @Test
    void testMenteeCreation() {
        Mentee mentee = new Mentee("Иван", "Москва", "Backend", 5, 12);

        assertThat(mentee.name()).isEqualTo("Иван");
        assertThat(mentee.city()).isEqualTo("Москва");
        assertThat(mentee.goal()).isEqualTo("Backend");
        assertThat(mentee.completedLessons()).isEqualTo(5);
        assertThat(mentee.totalLessons()).isEqualTo(12);
    }

    @Test
    void testMenteeRecordEquality() {
        Mentee mentee1 = new Mentee("Иван", "Москва", "Backend", 5, 12);
        Mentee mentee2 = new Mentee("Иван", "Москва", "Backend", 5, 12);
        Mentee mentee3 = new Mentee("Мария", "Москва", "Backend", 5, 12);

        assertThat(mentee1).isEqualTo(mentee2);
        assertThat(mentee1.hashCode()).isEqualTo(mentee2.hashCode());
        assertThat(mentee1).isNotEqualTo(mentee3);
    }

    @Test
    void testMenteeToString() {
        Mentee mentee = new Mentee("Иван", "Москва", "Backend", 5, 12);
        String toString = mentee.toString();

        assertThat(toString).contains("Иван");
        assertThat(toString).contains("Москва");
        assertThat(toString).contains("Backend");
        assertThat(toString).contains("5");
        assertThat(toString).contains("12");
    }

    @ParameterizedTest
    @CsvSource({
            "-1, 10",
            "5, 0",
            "5, -5",
            "11, 10"
    })
    void testMenteeInvalidArguments(int completed, int total) {
        assertThrows(IllegalArgumentException.class, () -> {
            new Mentee("Иван", "Москва", "Backend", completed, total);
        });
    }

    @Test
    void testMenteeBoundaryValues() {
        Mentee mentee1 = new Mentee("Иван", "Москва", "Backend", 0, 10);
        assertThat(mentee1.completedLessons()).isEqualTo(0);

        Mentee mentee2 = new Mentee("Иван", "Москва", "Backend", 10, 10);
        assertThat(mentee2.completedLessons()).isEqualTo(10);
    }

    @Test
    void testMenteeWithEmptyStrings() {
        Mentee mentee = new Mentee("", "", "", 0, 1);
        assertThat(mentee.name()).isEmpty();
        assertThat(mentee.city()).isEmpty();
        assertThat(mentee.goal()).isEmpty();
    }
}