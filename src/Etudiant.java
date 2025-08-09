public class Etudiant {
    private String nom;
    private double note1,note2,note3;
    public Etudiant(String nom, double note1, double note2, double note3) {
        this.nom = nom;
        this.note1 = note1;
        this.note2 = note2;
        this.note3 = note3;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getNote1() {
        return note1;
    }

    public void setNote1(double note1) {
        this.note1 = note1;
    }

    public double getNote2() {
        return note2;
    }

    public void setNote2(double note2) {
        this.note2 = note2;
    }

    public double getNote3() {
        return note3;
    }

    public void setNote3(double note3) {
        this.note3 = note3;
    }

    public double calculerMoyenne(){
      return (note1+note2+note3)/3;
    }
    public String  toString(){

        return "Nom : " +nom+ " Moyenne : "+calculerMoyenne();
    }
}
