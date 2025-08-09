import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> nom = new ArrayList<>();
        nom.add("Insa");
        nom.add("Fallou");
        nom.add("Abou");
        String prenom;
        System.out.println("===Menu===");
        System.out.println("1 Ajouter un prenom ");
        System.out.println("2 Supprimé un prénom");
        System.out.println("3 Recherché un prénom");
        System.out.println("4 Afficher tous les prénoms");
        System.out.print("Veuillez choisir le numéro de service que vous voulez ");
        int choix = input.nextInt();
        input.nextLine();
        switch (choix) {
            case 1:
                System.out.println("Veuillez ajouter un prénom : ");
                prenom = input.nextLine();
                nom.add(prenom);
                    System.out.println("Le prénom " + prenom + " a été ajouté dans la liste ");

                break;
            case 2:
                System.out.println("Veuillez supprimé un prénom : ");
                prenom = input.nextLine();
        if (nom.contains(prenom)) {
                nom.remove(prenom);
                System.out.println("le prénom " + prenom + " a été supprimé suite a votre demande ");
        }else{
            System.out.println("Le nom que vous voulez supprimé est introuvable dans la liste ");
        }
                break;
            case 3:
                System.out.println("Veuillez entre le nom que vous voulez recherché sur la liste : ");
                prenom = input.nextLine();
                if (nom.contains(prenom)) {
                    System.out.println("Le nom est bien présent dans la liste ");
                } else {
                    System.out.println("Le nom est introuvable sur la liste ");
                }
                break;
            case 4:
                    System.out.println("Voici la liste des prénoms : " + nom);
                    break;
        }
    }
}
