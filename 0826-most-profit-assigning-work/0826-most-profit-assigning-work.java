class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int maxDifficulty =0;

        for(int d : difficulty) {
            maxDifficulty = Math.max(maxDifficulty,d);
        }

        int[] maxProfitupToDifficulty = new int[maxDifficulty +1];
        for(int i=0; i< difficulty.length;i++){
            maxProfitupToDifficulty[difficulty[i]] = Math.max(maxProfitupToDifficulty[difficulty[i]],profit[i]);
        }

        for(int i=1;i<= maxDifficulty;i++){
            maxProfitupToDifficulty[i] = Math.max(maxProfitupToDifficulty[i], maxProfitupToDifficulty[i-1]);
        }

        int totalProfit =0;
        for(int ability : worker){
            if(ability > maxDifficulty){
                totalProfit += maxProfitupToDifficulty[maxDifficulty];
            }else{
                totalProfit += maxProfitupToDifficulty[ability];
            }
        }
        return totalProfit;
    }
}