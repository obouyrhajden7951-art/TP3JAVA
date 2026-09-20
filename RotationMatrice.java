//METHODE 1
public class RotationMatrice {
    public static int[][] Rotation(int[][] t){
        int N=t.length;
       //transposition :
        for(int i=0;i<=N-1;i++){
            for(int j=i+1;j<=N-1;j++){
                int tmp=t[i][j];
                t[i][j]=t[j][i];
                t[j][i]=tmp;
            }
        }
        //Renverser chaque ligne :
        for(int i=0;i<=N-1;i++){
            int left=0;
            int right=N-1;
            while(left<right){
                int tmp=t[i][left];
                t[i][left]=t[i][right];
                t[i][right]=tmp;

                left=left+1;
                right=right-1;
            }
        }
        return t;
    }
    public static void afficher(int[][] t){
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                System.out.print(t[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[][] M={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
       Rotation(M);
       afficher(M);
    }
}
