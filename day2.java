class Solution {
    public int numJewelsInStones(String J, String S) {
        int i=0,j=0,k=0,cnt=0;
        char[] je=J.toCharArray();
        char[] st=S.toCharArray();
        Arrays.sort(je);
        Arrays.sort(st);
        for(i=0;i<je.length;i++){
            for(j=0;j<st.length;j++){
                if(je[i]==st[j]){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}