import java.util.Random;
import java.util.Scanner;
public class NombreAleatoire {
    public static void main(String[] args){
        Random  ins= new Random();
        Scanner input = new Scanner(System.in);
        int essai = 0;
        int nombreAleatoire = ins.nextInt(100)+1;
        boolean trouve =false;
        System.out.println("Bienvenue dans votre jeux de devinette");
        for(int i=0;i<5;i++){
            System.out.println("veuillez faire votre " +(i+1)+ " essai entre 1 et 100 ");
            essai=input.nextInt();
            if(nombreAleatoire==essai){
                trouve =true;
                System.out.println("Bravo vous avez trouvé le bon nombre " +essai);
                break;
            }
            else if(nombreAleatoire<essai){
                System.out.println("le nombre aleatoire est plus petit que " +essai);

            }
            else{
                System.out.println("Le nombre aleatoire est plus grand que " +essai);

            }
        }
        if(!trouve) {
            System.out.println("Vous avez épuisé vos 5 tour !!");
            System.out.println("Le nombre aeatoire est " + nombreAleatoire);
        }
    }
}