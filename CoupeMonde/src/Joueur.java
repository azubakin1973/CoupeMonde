public class Joueur {
    private String prenom;
    private int numero;
    private boolean aSouafle;

    private static int compteurJoueur = 1;
    private String Raphael;

    public Joueur(String prenom) {
        this.prenom = prenom;
        this.numero = compteurJoueur++;
        this.aSouafle = false;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getNumero() {
        return numero;
    }

    public boolean hasSouafle() {
        return aSouafle;
    }

    public void setSouafle(boolean aSouafle) {
        this.aSouafle = aSouafle;
    }

    public void monAction() {
       
    }
}
