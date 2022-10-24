package hu.nagyistvan;

public class SolutionLetter {

    private final String value;
    private boolean isHit;


    public SolutionLetter(String value, boolean isHit) {
        this.value = value;
        this.isHit = isHit;
    }

    public SolutionLetter(String value) {
        this.value = value;
        this.isHit = false;
    }

    public String getValue() {
        return value;
    }

    public boolean isHit() {
        return isHit;
    }

    public void setHit(boolean hit) {
        isHit = hit;
    }
}
