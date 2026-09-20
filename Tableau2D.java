public class Tableau2D {
    public static void afficher(double[][] t){
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                System.out.print(t[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static boolean regulier(double[][] t){
        if(t.length==0){
            return true;
        }
        int Ref=t[0].length;
        for(int i=0;i<t.length;i++){
            if(t[i].length!=Ref){
                return false;
            }
        }
    return true;
    }
    public static double[] sommeLignes(double[][] t){
        double[] resultat=new double[t.length];
        for(int i=0;i<=t.length-1;i++){
            double S=0;
            for(int j=0;j<=t[i].length-1;j++){
                S=S+ t[i][j];
                resultat[i]=S;
            }
        }
        return resultat;
    }
    public static double[][] somme(double[][] t1,double[][] t2){
        if(regulier(t1)!=true || regulier(t2)!=true){
            return null;
        }
        if(t1.length!=t2.length){
            return null;
        }
        for(int i=0;i<t1.length;i++){
            if(t1[i].length!=t2[i].length){
                return null;
            }
        }
        double[][] res = new double[t1.length][];   // juste le nombre de lignes, sans préciser la taille de chaque ligne
        for(int i=0;i<=t1.length-1;i++){
            res[i] = new double[t1[i].length];
            for(int j=0;j<=t1[i].length-1;j++){
                res[i][j]=t1[i][j]+t2[i][j];
            }
        }
    return res;
    }    
    public static void main(String[] args){
        double[][] t3 = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0}
        };
        double[] sommes = sommeLignes(t3);
            for (double s : sommes) {
            System.out.println(s);
            }
        double[][] a = {{1.0, 2.0}, {3.0, 4.0}};
        double[][] b = {{5.0, 6.0}, {7.0, 8.0}};
        double[][] resultatSomme = somme(a, b);
        afficher(resultatSomme);
    }
    
}
