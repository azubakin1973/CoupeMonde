
public class Main {
    public static void main(String[] args) {
        Ecole gryffondor = new Ecole("Gryffondor");
        Ecole serpentard = new Ecole("Serpentard");

        Match match = new Match(gryffondor, serpentard);
        match.simulerMatch();
    }
}

