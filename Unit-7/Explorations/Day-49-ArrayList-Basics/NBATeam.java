class NBATeam {

    private static int numTeams = 0;

    private String teamName;
    private String city;
    private String conference;

    public NBATeam(String city, String teamName, String conference) {
        this.teamName = teamName;
        this.city = city;
        this.conference = conference;

        numTeams++;
    }

    public void setCity(String newCity) {
        this.city = newCity;
    }

    public String getCity() {
        return this.city;
    }

    public String getConference() {
        return this.conference;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public static int getNumTeams() {
        return numTeams;
    }

    public String toString() {
        return this.city + " " + this.teamName + ": " + this.conference + "ern conference";
    }
}
