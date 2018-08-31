package com.company.main;

import lombok.Data;

@Data
public class Settings {
    private int baselineLengthInMinutes;
    private int learningLengthInMinutes;
    private int trainedLengthInMinutes;
    private int selectedLearningMode;
}
