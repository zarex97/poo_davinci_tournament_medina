package tournament;

public class MatchResult {
  
    public boolean localWin(){
        if (localGoalCounter>visitantGoalCounter){
            return true;
        } else {
            return false;
        }
    }

    public boolean tie(){
        if (localGoalCounter==visitantGoalCounter){
            return true;
        } else {
            return false;
        }
    }

    public String getWinner (){
        if (localWin()==true){
            return localTeam;
        } else if (tie()==true){
            return "Empate";
        } else {
            return visitantTeam;
        }

    private int localGoalCounter;
    private int visitantGoalCounter;

    public MatchResult() {

    }

    public int getLocalGoalCounter() {
        return localGoalCounter;
    }

    public void setLocalGoalCounter(int localGoalCounter) {
        this.localGoalCounter = localGoalCounter;
    }

    public int getVisitantGoalCounter() {return visitantGoalCounter;
    }

    public void setVisitantGoalCounter(int visitantGoalCounter) {
        this.visitantGoalCounter = visitantGoalCounter;
    }
}
