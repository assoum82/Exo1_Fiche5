

/**
 * Created by H on 30/10/2016.
 */
public class Employe {
    private String nom;
    private String job;
    private double salaire;
    public Employe(String nom,String job){
        this.nom=nom;
        this.job=job;
    }
    public void setSalaire(double salaire){
        this.salaire=salaire;
    }
    public String getNom(){
        return nom;
    }
    public String getJob(){
        return job;
    }
    public double getSalaire(){
        return salaire;
    }
    public double calculPaie(){
        return salaire;
    }
    public void chequePaie(){
        System.out.println("le nom est " + nom + " son fonction est " + job + " son salaire est " + salaire );
    }
}
