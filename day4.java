class Solution {
    public int findComplement(int num) {
        int i=0,j=0,k=10,n=num,b=0,zz=0,s=0,p=0;
        ArrayList<Integer> al=new ArrayList<Integer>();
        while(n>=1){
            i=n%2;
            al.add(i);
            n=n/2;
        }
        Collections.reverse(al);
        for(Integer z: al){
            System.out.print(z);
        }
        System.out.println();
        for(i=0;i<al.size();i++){
            if(al.get(i)==0)
                al.set(i,1);
            else if(al.get(i)==1)
                al.set(i,0);
        }
        for(Integer z: al){
            System.out.print(z);
        }
        for(i=al.size()-1;i>=0;i--){
            if(i==0 && al.get(i)==0)
                break;
            j=al.get(i);
            b=(int)Math.pow(2,zz);
            p=b*j;
            s+=p;
            zz++;
        }
        return s;
    }
}