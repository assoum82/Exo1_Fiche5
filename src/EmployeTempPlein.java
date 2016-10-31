/**
 * Created by H on 30/10/2016.
 */
public class EmployeTempPlein extends Employe {
    private double montant_semaine;
    private double prime;
    public EmployeTempPlein(String nom,String job){
        super(nom,job);
    }
    public double calculPaie(){
        setSalaire(montant_semaine*4+prime);
        return getSalaire();
    }

    public void setMontant_semaine(double montant_semaine) {
        this.montant_semaine = montant_semaine;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }
}
