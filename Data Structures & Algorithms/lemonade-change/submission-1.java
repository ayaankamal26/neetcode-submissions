class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int tens = 0;
        for (int i = 0; i < bills.length; i++){
            if(bills[i]==5){
                fives ++;
                continue;
            }
            else if(bills[i]==10){
                tens ++;
                if(fives > 0){
                    fives--;
                }
                else{
                    return false;
                }
            }
            else{
                if(tens>0){
                    tens--;
                    fives--;
                }
                else{
                    fives-=3;
                }
                if(fives < 0){
                    return false;
                }
            }
        }
        return true;
    }
}