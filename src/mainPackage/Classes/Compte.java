package mainPackage.Classes;

public class Compte {
    private Integer RIB ;
    private float solde ;


    //write constructor here
    public Compte(Integer RIB, float solde) {
        this.RIB = RIB;
        this.solde = solde;
    }

    protected void AffichageSolde(){
        System.out.println("Votre solde est :"+solde);
    }


    protected void AjoutMontnat(String type , float montant){
        if ("+".equals(type)) {
            (solde) += montant;
        }
        else{
            solde-=montant ;
        }
    }


}
