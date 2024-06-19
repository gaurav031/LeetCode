class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int start =0,end =0;
        
        for(int day : bloomDay){
            end = Math.max(end, day);
        }
        int minDays = -1;
        while(start <= end){
            int mid = (start + end)/2;
            
            if(numBouquets(bloomDay,mid,k) >= m){
                minDays = mid;
                end = mid -1;
            }else{
                start = mid+1;
            }
        }
        return minDays;
    }
    private int numBouquets(int[] bloomDay, int mid, int k){
        int numOfBouquets =0;
        int count =0;
        for(int i=0;i< bloomDay.length;i++){
            if(bloomDay[i] <= mid){
                count++;
            }else{
                count =0;
            }
            if(count ==k){
                numOfBouquets++;
                count =0;
            }
        }
        return numOfBouquets;
    }
}