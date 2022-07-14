package mainPackage.Classes;

public class Client extends Personne {

    private Compte compte ;

   // write constructor here
    public Client(Integer ID, String nom, String prenom, Compte compte) {
        super(ID, nom, prenom);
        this.compte = compte;

    }

    public void afficherClient(){
        super.afficherPersonne();
        compte.AffichageSolde();
    }

    public void AjoutMontnat(String type , float montant){
        compte.AjoutMontnat(type, montant);
    }

    public void afficherSolde(){
        compte.AffichageSolde();
    }
}
