import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter note1: ");
        int note1 = input.nextInt();
        System.out.print("Enter note2: ");
        int note2 = input.nextInt();
        System.out.print("Enter note3: ");
        int note3 = input.nextInt();
        list.add(note1);
        list.add(note2);
        list.add(note3);
        System.out.println("Les notes que vous avez saisie sont : " + list);
        double Moyenne = (note1+note2+note3)/3;
        System.out.println("Moyenne: " + Moyenne);
        if(note1>note2 && note1>note3){
            System.out.println("La meilleur note est " + note1);
        }else if(note2>note1 && note2>note3){
            System.out.println("La meilleur note est " + note2);
        }else if(note3>note1 && note3>note2){
            System.out.println("La meilleur note est " + note3);
        }else{
            System.out.println("Les notes que vous avez saisie sont égal : " + list);
        }
    }
}