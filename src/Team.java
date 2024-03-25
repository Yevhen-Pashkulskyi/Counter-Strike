public class Team {
    private String teamName;
    private String playerName;
    private int onePlayerFrag;
    private int secondPlayerFrag;
    private int thirdPlayerFrag;
    private int fourthPlayerFrag;
    private int fifthPlayerFrag;

    public String getTeamName() {
        return teamName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public double sumFrag(int onePlayerFrag, int secondPlayerFrag,
                          int thirdPlayerFrag, int fourthPlayerFrag,
                          int fifthPlayerFrag) {
        int[] sumFrag = {onePlayerFrag, secondPlayerFrag, thirdPlayerFrag,
                fourthPlayerFrag, fifthPlayerFrag};
        int sum = 0;
        for (int i = 0; i < sumFrag.length; i++) {
            sum += sumFrag[i];
        }
        double averageSum = sum / sumFrag.length;
        return averageSum;
    }

    @Override
    public String toString() {
        return teamName + " " + playerName ;
    }
}
