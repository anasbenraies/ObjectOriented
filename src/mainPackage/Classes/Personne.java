package mainPackage.Classes;

public class Personne {
    private Integer ID ;
    private String nom ;
    private String prenom ;


    public Personne(Integer ID, String nom, String prenom) {
        this.ID = ID;
        this.nom = nom;
        this.prenom = prenom;
    }

    public void afficherPersonne(){
        System.out.println("ID :"+ID);
        System.out.println("Nom :"+nom);
        System.out.println("Prenom :"+prenom);
    }
    //write getters
    public Integer getID() {
        return ID;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }


    //write setters
    public void setID(Integer ID) {
        this.ID = ID;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }










}
