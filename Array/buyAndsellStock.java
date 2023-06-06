class buyAndsellStock {
    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE; //least so far
        int op = 0; //overall profit
        int pist = 0; //profit if i sell today

        for (int i = 0 ; i<prices.length ; i++){
            if(prices[i] < lsf ){
                lsf = prices[i];  // traversing & updating the prices to its least
            }
            pist = prices[i] - lsf; // hence calculating the particular profit 
            if(op < pist){
                op = pist; //comparing the profits & updating
            }
        }
        return op;
    }
}