public class Poursuiveur extends Joueur {

    public Poursuiveur(String prenom) {
        super(prenom);
    }

    @Override
    public void monAction() {
        if (hasSouafle()) {
            System.out.println(getPrenom() + " Poursuiveur No." + getNumero() + ", je transmets le ballon.");
        } else {
            System.out.println(getPrenom() + " Poursuiveur No." + getNumero() + " n'a pas le ballon.");
        }
    }
}


