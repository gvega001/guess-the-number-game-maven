package online.dev4you;

public class GameImpl implements Game{

    @Override
    public int getNumber() {
        return 0;
    }

    @Override
    public int getGuess() {
        return 0;
    }

    @Override
    public void setGuess(int guess) {

    }

    @Override
    public int getSmallest() {
        return 0;
    }

    @Override
    public int getBiggest() {
        return 0;
    }

    @Override
    public int getRemainGuesses() {
        return 0;
    }

    @Override
    public void reset() {

    }

    @Override
    public void check() {

    }

    @Override
    public boolean isValidNumber() {
        return false;
    }

    @Override
    public boolean isGameWon() {
        return false;
    }

    @Override
    public boolean isGameLost() {
        return false;
    }
}
