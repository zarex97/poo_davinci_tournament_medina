package tournament;

public class MatchResult {
    private int localGoalCounter;
    private int visitantGoalCounter;
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
