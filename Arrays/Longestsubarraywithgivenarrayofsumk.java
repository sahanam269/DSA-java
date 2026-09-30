public class Longestsubarraywithgivenarrayofsumk {
    public static void main (String [] args){
        int [] arr ={1,2,1,1,1,3};
        int k =5;
        int sum =0,left=0,len =0;
        for(int right =0;right<arr.length;right++){
            sum = sum +arr[right];
            while(sum>k){
                sum =sum - arr[left];
                left++;
            }
            if(sum==k){
                len = Math.max(len,right-left+1);
            }
        }
        System.out.println("Longest subarray length"+len);
    }
    
}
