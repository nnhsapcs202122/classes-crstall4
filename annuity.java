
public class annuity{
    public static void main(String[] args){
        System.out.println(calcPresentValue(10000,0.08,20));

    }
    public static double calcPresentValue(double pmt, double i, int n){
        double top = (Math.pow(1+i,n-1)-1)/i;
        double bottom = Math.pow(1+i,n-1);
        return pmt*(top/bottom+1);
    }
}