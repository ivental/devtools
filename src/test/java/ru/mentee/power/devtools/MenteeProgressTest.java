package ru.mentee.power.devtools;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MenteeProgressTest {
    @Test
    void shouldFormatSummary_whenProgressCreated() {
        MenteeProgress progress = new MenteeProgress("Ilia", 2, 6);
        String result = progress.summary();
        assertThat(result).isEqualTo("Sprint 2 → Ilia: planned 6 h");
    }

    @Test
    void shouldDetectReadiness_whenHoursAboveThreshold() {
        MenteeProgress progress = new MenteeProgress("Ilia", 2, 6);
        assertThat(progress.readyForSprint()).isTrue();
    }

    @Test
    void shouldDetectLackOfReadiness_whenHoursBelowThreshold() {
        MenteeProgress progress = new MenteeProgress("Afanasy", 1, 4);
        assertThat(progress.readyForSprint()).isFalse();
    }
}

