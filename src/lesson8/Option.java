package lesson8;

public class Option {
    private String option;
    private boolean isCorrect = false;
    private double point = 0;

    public Option() {
    }

    public Option(String option, double point) {
        this.option = option;
        this.point = point;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }


}
