public class missingnumberarray{
    public static void main(String[] args){
        int[] arr={0,1,3};
        int n =arr.length;
        int xor1=0;
        int xor2=0;
        for(int i=1;i<=n;i++){
            xor1=xor1^i;
        }
        for(int i=0;i<n;i++){
            xor2= xor2^arr[i];
        }
        int missingnumber=xor1^xor2;
        System.out.println("missing number is"+missingnumber);

    }
}