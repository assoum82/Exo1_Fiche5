import java.util.Scanner;

/**
 * Created by H on 30/10/2016.
 */
public class test {
    public static void main(String[] args) {
         Employe exemple[] =new Employe[3];
        exemple [0]=new Employe("Salim","PDG");
        exemple[0].setSalaire(100000);
        exemple[0].chequePaie();
        exemple [1]=new EmployerTempPartiel("Halima","Secrétaire");
        exemple[1].setSalaire(20000);
        exemple[1].chequePaie();
        exemple [2]=new EmployeTempPlein("AbdeHalim","Agent de sécurité");
        exemple[2].setSalaire(15000);
        exemple[2].chequePaie();
          System.out.println("------------------------------------------");
        System.out.println("|  Nom      |  Job      |   Salaire    |");
        for(int i=0;i<3;i++){
            System.out.println("-----------------------------------------");
            System.out.println("| "  + exemple[i].getNom()+       " | "  + exemple[i].getJob()+ " | "+exemple[i].getSalaire()+  " |");
        }
        System.out.println("------------------------------------------");
      /*  Scanner clavier=new Scanner(System.in);
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
        emploe2.chequePaie();*/
        
        // peux tu refaire le main avec un tableau de type employé
    }

}
