package tournament;

public class Player {
    private int number;
    private String name;
    private String position;
    private int goalCounter;
    private Team team;

    public String showTeam() {
      return this.getName() + " pertenece a " + this.getTeam().getName();
    }

    public Team getTeam() {
      return this.team;
    }

    public void setTeam(Team team) {
      this.team = team;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getGoalCounter() {
        return goalCounter;
    }

    public void setGoalCounter(int goalCounter) {
        this.goalCounter = goalCounter;
    }

    public Player() {
        setName("");
        setPosition("");
    }

    public Player(String name) {
        setPosition("");
        setName(name);
    }

    public Player(String name, String position) {
        setName(name);
        setPosition(position);
    }
}
