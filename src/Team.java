public class Team {
    private String teamName;
    private String playerName;
    private int onePlayerFrag;
    private int secondPlayerFrag;
    private int thirdPlayerFrag;
    private int fifthPlayerFrag;

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
