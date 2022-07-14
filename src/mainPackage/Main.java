package mainPackage;

import mainPackage.Classes.Client;
import mainPackage.Classes.Compte;

public class Main {

    public static void main(String[] args) {
        Compte compte1 = new Compte(123456789, 0);
        Compte compte2 = new Compte(123456789, 0);
        Client client1 = new Client(123456789, "Dupont", "Jean", compte1);
        Client client2 = new Client(326471, "bellagha", "sami", compte2);
        client1.afficherSolde();
        client1.AjoutMontnat("+", 100);
        client1.afficherSolde();
        System.out.println("----------------------------------------------------");
        client2.afficherSolde();
        client2.AjoutMontnat("+", 350);
        client2.afficherSolde();

    }
}
