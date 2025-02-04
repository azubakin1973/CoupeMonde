import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private List<Joueur> joueurs;
    private int nbJoueurs;
    private Ecole ecole;

    public Equipe(Ecole ecole) {
        this.joueurs = new ArrayList<>();
        this.nbJoueurs = 0;
        this.ecole = ecole;
    }

    public void ajouterJoueur(Joueur joueur) {
        if (nbJoueurs < 7) {
            joueurs.add(joueur);
            nbJoueurs++;
        } else {
            System.out.println("L'équipe est pleine.");
        }
    }

    public List<Joueur> getJoueurs() {
        return joueurs;
    }

    public static String genererNomAleatoire() {
        String[] noms = {"Alexei", "Peter", "Arthur", "Johny", "Rafa", "Felipe", "Bela"};
        return noms[(int) (Math.random() * noms.length)];
    }
}



