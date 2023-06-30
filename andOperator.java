
public class andOperator{
    static int checkAnd(int n){
        int count=0;
        for(int x=0;x<=5;x++){
            if((n&x)==x)count++;
        }
        return count;
    }
    public static void main(String[] args) {
       int n = 5;
      System.out.println( checkAnd(n)); 
    }
}