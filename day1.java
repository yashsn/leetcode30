public class Solution extends VersionControl {
    public int g=0;
    public int firstBadVersion(int n) {
        int i=0,j=0,k=0;
        g=myfn(1,n);
        return g;
    }
    public int myfn(int f, int l){
        int i=0,j=0,k=0,m=0,z=0;
        long h=(long)f+l;
        h=h/2;
        m=(int)h;
        System.out.println(m);
        if(l>=f){
            if(isBadVersion(m)){
                if(!isBadVersion(m-1)){
                    return m;
                }
                else{
                    return myfn(f,m-1);
                }
        }
            else{
                return myfn(m+1,l);
            }
        }
        return -1;
    }
}