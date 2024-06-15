class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        
        int low = 1; int high = Arrays.stream(piles).max().getAsInt();

        while(low<=high){
            int mid = (low+high)/2;

            if(calculatehours(piles,mid)>h){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low;
    }

    public int calculatehours(int [] piles, int h){

        int sum =0;
        for(int i =0; i< piles.length;i++){
            sum+= (Math.ceil((double)piles[i]/(double)h));
        }
        return sum;
    }
}