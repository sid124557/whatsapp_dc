package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.4HD  reason: invalid class name */
public class AnonymousClass4HD extends C66603Mb {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4HD(C60272yH r1, AnonymousClass4EI r2, AnonymousClass4EI r3, AnonymousClass30P r4, C54662p5 r5, int i) {
        super(r2);
        this.A04 = i;
        this.A00 = r4;
        this.A03 = r1;
        this.A01 = r3;
        this.A02 = r5;
    }

    public void BdT(Integer num, PublicKey publicKey, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        int i = this.A04;
        AnonymousClass30P r1 = (AnonymousClass30P) this.A00;
        C60272yH r6 = (C60272yH) this.A03;
        C50912iy r3 = r6.A01;
        AnonymousClass4F6 r5 = (AnonymousClass4F6) ((AnonymousClass4C1) C18320x8.A0Z(((AnonymousClass2WK) r1.A01.get()).A00, r3)).get();
        AnonymousClass3MR r7 = new AnonymousClass3MR((AnonymousClass4EI) this.A01, r3, r1.A02, r1.A00);
        C54662p5 r8 = (C54662p5) this.A02;
        Integer num2 = num;
        PublicKey publicKey2 = publicKey;
        X509Certificate x509Certificate3 = x509Certificate;
        if (i != 0) {
            if (r8 == null) {
                r8 = C54662p5.A00();
            }
            r5.Bgq(r6, r7, r8, num2, publicKey2, x509Certificate3);
            return;
        }
        if (r8 == null) {
            r8 = C54662p5.A00();
        }
        r5.Bgr(r6, r7, r8, num2, publicKey2, x509Certificate3);
    }
}
