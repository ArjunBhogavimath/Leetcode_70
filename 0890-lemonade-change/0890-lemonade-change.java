class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n = bills.length;
        int fives = 0; // 3 2 4 3 2
        int tens = 0;  // 0 1 1 2 1
        for(int i =0;i<n;i++){
            if(bills[i] == 5) fives++;
            else if(bills[i] == 10){
                if(fives > 0){
                    fives--;
                }else{
                    return false;
                }
                tens++;
            }
            else{
                if(tens > 0){
                    tens--;
                    if(fives > 0){
                        fives--;
                        //break;
                    }else{
                        return false;
                    }
                }
                else if(fives >= 3){
                    fives -= 3;
                    //break;
                }
                else{
                    return false;
                }
            }

        }
        return true;
    }
}