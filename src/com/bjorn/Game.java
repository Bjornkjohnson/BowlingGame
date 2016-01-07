package com.bjorn;

/**
 * Created by bjornjohnson on 1/7/16.
 */
public class Game {
    private int score = 0;
    private int rolls[] = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {
        score += pins;
        rolls[currentRoll++] = pins;
    }

    public int score() {
        int score = 0;
        int i = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (rolls[i] + rolls[i+1] == 10) {
                score += 10 + rolls[i + 2];
                i += 2;
            } else{
                score += rolls[i] + rolls[i + 1];
                i += 2;
            }
        }
        return score;
    }
}
