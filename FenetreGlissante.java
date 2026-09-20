import java.util.Scanner;

public class FenetreGlissante {

    public static void calculerDistinctsParFenetre(int[] t, int k){
        int n = t.length;
        int MAXV = 100000;
        int[] freq = new int[MAXV+1];
        int distinct = 0;
        for(int i=0; i<k; i++){
            int x = t[i];
            if(freq[x] == 0){
                distinct = distinct + 1;
            }
            freq[x] = freq[x] + 1;
        }
        System.out.print(distinct + " ");
        for(int i=k; i<n; i++){
            int out = t[i-k];
            freq[out] = freq[out] - 1;
            if(freq[out] == 0){
                distinct = distinct - 1;
            }
            int in = t[i];
            freq[in] = freq[in] + 1;
            if(freq[in] == 1){
                distinct = distinct + 1;
            }

            System.out.print(distinct + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] t = new int[n];
        for(int i=0; i<n; i++){
            t[i] = sc.nextInt();
        }

        calculerDistinctsParFenetre(t, k);
        sc.close();
    }
}