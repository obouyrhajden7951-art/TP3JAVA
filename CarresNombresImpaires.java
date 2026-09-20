import java.util.Scanner;
public class CarresNombresImpaires {
    public static void afficherCarres(int n){ 
        int nombreImpair;
        int[] carres=new int[n];
        for(int i=0;i<=n-1;i++){
            nombreImpair=2*i+1;
            carres[i]=nombreImpair*nombreImpair;
        }
        System.out.println("Combien de valeurs :"+n);
        for(int i=0;i<=n-1;i++){
        nombreImpair=2*i+1;
        System.out.println(nombreImpair +" a pour carré "+ carres[i]);
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m;
        System.out.print("Entrer un entier:");
        m=sc.nextInt();
        afficherCarres(m);
    }
}