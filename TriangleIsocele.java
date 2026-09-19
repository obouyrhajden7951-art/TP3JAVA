import java.util.Scanner;
public class TriangleIsocele {
    public static void afficherTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }                                    
            for(int k=1;k<= (2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();              
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m;
        System.out.print("Entrer la hauteur du triangle:");
        m=sc.nextInt();
        afficherTriangle(m);
    }
}