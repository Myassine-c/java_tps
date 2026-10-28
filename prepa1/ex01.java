import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ex01 {
    
    public static int compterNombreEntiers(String nomFichier) throws Exception
    {
        File f = new File(nomFichier);
        Scanner sc  = new Scanner(f);
        int compteur = 0;        
        // while(sc.hasNextLine())
        // {
            while (sc.hasNext()) {
                if(sc.hasNextInt())
                {
                    int nombre = sc.nextInt();
                    compteur++;
                }
                else
                    sc.next();
            }
        // }
        sc.close();
        return compteur;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(compterNombreEntiers("file.txt"));
    }
}
    // public static void main(String[] argc)
    // {
    //     Scanner sc = new Scanner(System.in);
    //     String nom  = sc.next();
    //     double note1 = sc.nextDouble();
    //     double note2 = sc.nextDouble();

    //     float moyen = (float) (note1 + note2) / 2;
    //     System.out.println("Étudiant : " + nom + "| Moyenne : " + moyen);
    // }
