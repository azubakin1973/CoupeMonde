import java.util.Random;

public class Match {
    private Equipe equipe1;
    private Equipe equipe2;
    private Random random;
    

    public Match(Ecole ecole1, Ecole ecole2) {
        this.equipe1 = new Equipe(ecole1);
        this.equipe2 = new Equipe(ecole2);
        this.random = new Random();

        
        
        
        for (int i = 0; i < 4; i++) {
            equipe1.ajouterJoueur(new Poursuiveur(Equipe.genererNomAleatoire()));
            equipe2.ajouterJoueur(new Poursuiveur(Equipe.genererNomAleatoire()));
        }
        for (int i = 0; i < 3; i++) {
            equipe1.ajouterJoueur(new Batteur(Equipe.genererNomAleatoire()));
            equipe2.ajouterJoueur(new Batteur(Equipe.genererNomAleatoire()));
        }

        
        equipe1.getJoueurs().get(0).setSouafle(true);
    }

    
    
    public void simulerMatch() {
        for (int i = 0; i < 50; i++) {
            Equipe equipe = random.nextBoolean() ? equipe1 : equipe2;
            Joueur joueur = equipe.getJoueurs().get(random.nextInt(7));

            for (Joueur j : equipe1.getJoueurs()) {
                j.setSouafle(false);
            }
            for (Joueur j : equipe2.getJoueurs()) {
                j.setSouafle(false);
            }

            joueur.setSouafle(true);
            joueur.monAction(); 
        }
    }
}
