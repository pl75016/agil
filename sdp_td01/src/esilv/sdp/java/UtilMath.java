package esilv.sdp.java;

public class UtilMath {
	public static int somme3(int a, int b, int c) {
		return a+b+c;
	}
	public static long fact(int n) {
		int res = 1;
	    for (int i=1; i<=n; i++) {
	      res  = res*i;
	    }
	    return res;
	}
	
	public static long comb1(int n, int p) {
		return fact(n)/(fact(p)*fact(n-p));
	}
	
	public static long puissance(int n, int m) {
		return (long) Math.pow(n,m);
	}
}
