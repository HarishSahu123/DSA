package org.practice.dsa.Recursion;

public class PPowerQ {
    public static  void main(String []args){
        int p=2;
        int q=4;
        System.out.println( PpowerQmethod(p,q));
    }

    private static Long PpowerQmethod(int p, int q) {
        Long ans=1L;
        if(q==0){
            return 1L;
        }
        ans=PpowerQmethod(p,q-1)*p;
        return ans;
    }
}
