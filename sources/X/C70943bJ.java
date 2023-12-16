package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.List;

/* renamed from: X.3bJ  reason: invalid class name and case insensitive filesystem */
public class C70943bJ implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public String A06;
    public final int A07;

    public C70943bJ(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, int i) {
        this.A07 = i;
        this.A05 = obj;
        this.A01 = obj2;
        this.A04 = obj3;
        this.A03 = obj4;
        this.A00 = obj5;
        this.A02 = obj6;
        this.A06 = str;
    }

    public void run() {
        if (this.A07 != 0) {
            C108895dj r3 = (C108895dj) this.A01;
            C46242bJ r4 = (C46242bJ) this.A03;
            C72393de r5 = (C72393de) this.A04;
            C54662p5 r2 = (C54662p5) this.A05;
            C162457s7.A0J(r3, 1);
            C162457s7.A0J(r2, 6);
            ((C46252bK) this.A00).A00(r2, r3, r4, r5, this.A06, (List) this.A02);
            return;
        }
        C60272yH r7 = new C60272yH(AnonymousClass3MY.A0B, 0L, "", "", (String) null, 0, 0);
        Integer num = (Integer) this.A03;
        String str = this.A06;
        PublicKey publicKey = (PublicKey) this.A04;
        ((AnonymousClass3MY) this.A05).Bgp(r7, (AnonymousClass4EJ) this.A00, (C54662p5) this.A02, num, str, publicKey, (X509Certificate) this.A01);
    }
}
