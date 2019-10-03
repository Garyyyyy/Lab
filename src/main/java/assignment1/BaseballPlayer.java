package assignment1;

public class BaseballPlayer extends Athlete {
    private String teamName;
    private double averageBatting;
    private Integer seasonHomeRuns;

    public BaseballPlayer(Name athletesName, Double height, Double weight, String league, String teamName, double averageBatting, Integer seasonHomeRuns) {
        super(athletesName, height, weight, league);
        this.teamName = teamName;
        this.averageBatting = averageBatting;
        this.seasonHomeRuns = seasonHomeRuns;
    }

    public BaseballPlayer(Name athletesName, Double height, Double weight, String league) {
        super(athletesName, height, weight, league);
    }

    public BaseballPlayer(Name athletesName, Double height, Double weight) {
        super(athletesName, height, weight);
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public double getAverageBatting() {
        return averageBatting;
    }

    public void setAverageBatting(double averageBatting) {
        this.averageBatting = averageBatting;
    }

    public Integer getSeasonHomeRuns() {
        return seasonHomeRuns;
    }

    public void setSeasonHomeRuns(Integer seasonHomeRuns) {
        this.seasonHomeRuns = seasonHomeRuns;
    }


}
