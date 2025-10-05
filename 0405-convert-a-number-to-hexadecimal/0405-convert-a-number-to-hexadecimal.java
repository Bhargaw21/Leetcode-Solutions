class Solution {
    public String toHex(int num) {
         if (num == 0) return "0"; 
        char[] hex = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

        StringBuilder sb = new StringBuilder();

       
        while (num != 0) {
            int value = num & 0xf;       
            sb.append(hex[value]);       
            num >>>= 4;                 
        }
        return sb.reverse().toString();
    }
}