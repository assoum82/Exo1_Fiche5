/**
 * Created by H on 30/10/2016.
 */
public class EmployerTempPartiel extends Employe {
    private final double heurs=35;
    private double montant_heur;
    public EmployerTempPartiel(String nom,String job){
        super(nom,job);
    }
    public double calculPaie(){
        setSalaire(montant_heur*heurs);
        return getSalaire();
    }
    public void setMontant_heur(double montant_heur){this.montant_heur=montant_heur;}
}
