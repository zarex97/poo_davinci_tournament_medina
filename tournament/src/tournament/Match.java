package tournament;

import java.util.Date;

public class Match {
    private String location;
    private Date date;
    private  Team localTeam;
    private Team visitantTeam;
    private int localGoalCounter;
    private int visitantGoalCounter;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Team getLocalTeam() {
        return localTeam;
    }

    public void setLocalTeam(Team localTeam) {
        this.localTeam = localTeam;
    }

    public Team getVisitantTeam() {
        return visitantTeam;
    }

    public void setVisitantTeam(Team visitantTeam) {
        this.visitantTeam = visitantTeam;
    }

    public int getLocalGoalCounter() {
        return localGoalCounter;
    }

    public void setLocalGoalCounter(int localGoalCounter) {
        this.localGoalCounter = localGoalCounter;
    }

    public int getVisitantGoalCounter() {
        return visitantGoalCounter;
    }

    public void setVisitantGoalCounter(int visitantGoalCounter) {
        this.visitantGoalCounter = visitantGoalCounter;
    }

    public void makeLocalGoal(){
        localGoalCounter++;
    }
}
