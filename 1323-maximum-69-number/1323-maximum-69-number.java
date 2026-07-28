class Solution {
    public int maximum69Number (int num) {
        int t = num;
        int s = -1;
        int c = 0;

        while(t > 0){
            if(t % 10 == 6){
                s = c;
            }
            t /= 10;
            c++;
        }

        if(s != c){
            num += 3 * Math.pow(10,s);
        }

        return num;
    }
}