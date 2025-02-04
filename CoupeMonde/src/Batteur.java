

public class Batteur extends Joueur {

    public Batteur(String prenom) {
        super(prenom);
    }

    @Override
    public void monAction() {
        if (hasSouafle()) {
            System.out.println(getPrenom() + " Batteur No." + getNumero() + ", je transmets le ballon.");
        } else {
            System.out.println(getPrenom() + " Batteur No." + getNumero() + " n'a pas le ballon.");
        }
    }
}