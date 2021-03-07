package esilv.sdp.java;

import up.mi.jgm.maths.Rationnel;

public class exo {
	public static Rationnel puissance(Rationnel r,int n){
        return (new Rationnel((int)Math.pow(r.numerateur, n),
                (int)Math.pow(r.denominateur, n))).toCanonique();
        
    }
	

}
