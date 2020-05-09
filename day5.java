class Solution {
    public int firstUniqChar(String s) {
        int i=0,j=0,k=0,pp=0;
        HashMap<Character,Integer> hm= new HashMap<Character,Integer>();
        for(i=0;i<s.length();i++){
            if(!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),1);
            }
            else{
                j=hm.get(s.charAt(i));
                j++;
                hm.put(s.charAt(i),j);
            }
        }
        for(i=0;i<s.length();i++){
            j=hm.get(s.charAt(i));
            if(j==1){
                k=s.indexOf(s.charAt(i));
                j=k;
                pp=1;
                break;
            }
        }
        if(pp==0)
            j=-1;
        return j;
    }
}