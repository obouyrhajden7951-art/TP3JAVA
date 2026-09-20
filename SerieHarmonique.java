import java.util.Scanner;
public class SerieHarmonique{
    public static double ConstruireSomme(int n){
        double somme=0;

        for(double i=1;i<=n;i++){
            somme = somme + (1.0 / i);
        }
        return somme;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int v;
        System.out.print("Entrer un entier : ");
        v=sc.nextInt();
        System.out.println("la somme des " + v + "premier terme est :" +ConstruireSomme(v));
        sc.close();   // ← ferme le Scanner, une fois qu'on n'en a plus besoin
    }
}