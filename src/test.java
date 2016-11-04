import java.util.Scanner;

/**
 * Created by H on 30/10/2016.
 */
public class test {
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        System.out.print("entrer le nom d'employe : ");
        String name1=clavier.nextLine();
        System.out.print("entrer sa fonction : ");
        String fonction1=clavier.nextLine();
        EmployerTempPartiel employe1=new EmployerTempPartiel(name1,fonction1);
        System.out.print("entrer le montant d'heur : ");
        employe1.setMontant_heur(clavier.nextDouble());
        employe1.calculPaie();
        employe1.chequePaie();
        System.out.print("entrer le nom d'employe : ");
        String name2=clavier.nextLine();
        clavier.nextLine();
        System.out.print("entrer sa fonction : ");
        String fonction2=clavier.nextLine();
        EmployeTempPlein emploe2=new EmployeTempPlein(name2,fonction2);
        System.out.print("entrer la prime : ");
        emploe2.setPrime(clavier.nextDouble());
        System.out.print("entrer le montant de semaine : ");
        emploe2.setMontant_semaine(clavier.nextDouble());
        emploe2.calculPaie();
        emploe2.chequePaie();
        
        // peux tu refaire le main avec un tableau de type employé
    }

}
