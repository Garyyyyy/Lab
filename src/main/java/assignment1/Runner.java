package assignment1;

public class Runner extends Athlete {
    private double score5K;
    private double scoreHalfMarathon;
    private String favEvent;

    public Runner(Name athletesName, Double height, Double weight, String league, double score5K, double scoreHalfMarathon, String favEvent) {
        super(athletesName, height, weight, league);
        this.score5K = score5K;
        this.scoreHalfMarathon =scoreHalfMarathon;
        this.favEvent = favEvent;
    }

    public Runner(Name athletesName, Double height, Double weight, String league) {
        super(athletesName, height, weight, league);
    }

    public Runner(Name athletesName, Double height, Double weight) {
        super(athletesName, height, weight);
    }

    public double getScore5K() {
        return score5K;
    }

    public void setScore5K(double score5K) {
        this.score5K = score5K;
    }

    public double getScoreHalfMarathon() {
        return scoreHalfMarathon;
    }

    public void setScoreHalfMarathon(double scoreHalfMarathon) {
        this.scoreHalfMarathon = scoreHalfMarathon;
    }

    public String getFavEvent() {
        return favEvent;
    }

    public void setFavEvent(String favEvent) {
        this.favEvent = favEvent;
    }
}
