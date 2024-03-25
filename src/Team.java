public class Team {
    private String teamName;
    private String playerName;
    private int frag;

    public String getTeamName() {
        return teamName;
    }

    public String getPlayerName() {
        return playerName;
    }

    @Override
    public String toString() {
        return teamName + " " + playerName;
    }

}
