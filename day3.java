class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int i=0,j=0,k=0;
        boolean b=true;
        char[] rn=ransomNote.toCharArray();
        char[] mag=magazine.toCharArray();
        Arrays.sort(rn);
        Arrays.sort(mag);
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        for(i=0;i<mag.length;i++){
            if(!hm.containsKey(mag[i])){
                hm.put(mag[i],1);
            }
            else{
                j=hm.get(mag[i]);
                hm.put(mag[i],j+1);
            }
        }
        for(i=0;i<rn.length;i++){
            if(!hm.containsKey(rn[i])){
                b=false;
                break;
            }
            else{
                j=hm.get(rn[i]);
                if(j<=0){
                    b=false;
                    break;
                }
                hm.put(rn[i],j-1);
            }
            b=true;
        }
        
        return b;
    }
}