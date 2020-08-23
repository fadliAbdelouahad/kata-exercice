public class Game {
    private int currentRoll = 0;
    private int[] rolls = new int[21];


    public void roll(int pinsDown) {
        rolls[currentRoll ++] = pinsDown;
    }

    public int score() {
        int score = 0;
        int counter = 0;
        for(int frame = 0; frame < 10; frame++){
            if(isaBoolean(counter)){
                score += 10 + rolls[counter + 1] + rolls[counter + 2];
                counter += 1;
            }else if(isSpare(counter)){
                score += 10 + rolls[counter + 2];
                counter += 2;
            }else {
                score += rolls[counter] + rolls[counter + 1];
                counter += 2;
            }
        }
        return score;
    }

    private boolean isaBoolean(int counter) {
        return rolls[counter] == 10;
    }

    private boolean isSpare(int counter) {
        return rolls[counter] + rolls[counter + 1] == 10;
    }

    public void roll(int ... pinsDown) {
        for(int pin : pinsDown){
            roll(pin);
        }
    }
}
