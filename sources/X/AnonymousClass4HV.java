package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.4HV  reason: invalid class name */
public class AnonymousClass4HV extends C66613Mc {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4HV(C60272yH r1, AnonymousClass4EJ r2, C54662p5 r3, AnonymousClass3MY r4, int i) {
        super(r2);
        this.A04 = i;
        this.A00 = r2;
        this.A03 = r4;
        this.A02 = r1;
        this.A01 = r3;
    }

    public void BdT(Integer num, PublicKey publicKey, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        int i = this.A04;
        X509Certificate x509Certificate3 = x509Certificate;
        C162457s7.A0J(x509Certificate3, 0);
        Integer num2 = num;
        PublicKey publicKey2 = publicKey;
        switch (i) {
            case 0:
                C60272yH r0 = (C60272yH) this.A02;
                C166557yt r3 = r0.A04;
                C162457s7.A0D(r3);
                AnonymousClass4EJ r1 = (AnonymousClass4EJ) this.A00;
                String A0b = C18280x3.A0b(r0.A05);
                int A042 = AnonymousClass0x7.A04(num2, publicKey2);
                AnonymousClass3MY.A00(r1, (C54662p5) this.A01, r3, (AnonymousClass3MY) this.A03, A0b, publicKey2, x509Certificate3, A042);
                return;
            case 1:
                ((AnonymousClass3MY) this.A03).Bgq((C60272yH) this.A02, (AnonymousClass4EJ) this.A00, (C54662p5) this.A01, num2, publicKey2, x509Certificate3);
                return;
            case 2:
            case 3:
                ((AnonymousClass3MY) this.A03).A05((C60272yH) this.A02, (AnonymousClass4EJ) this.A00, (C54662p5) this.A01, publicKey2, x509Certificate3, AnonymousClass0x7.A04(num2, publicKey2));
                return;
            default:
                ((AnonymousClass3MY) this.A03).Bgr((C60272yH) this.A02, (AnonymousClass4EJ) this.A00, (C54662p5) this.A01, num2, publicKey2, x509Certificate3);
                return;
        }
    }
}
