package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.1VB  reason: invalid class name */
public class AnonymousClass1VB extends C66603Mb {
    public final /* synthetic */ AnonymousClass4EI A00;
    public final /* synthetic */ AnonymousClass30P A01;
    public final /* synthetic */ C50912iy A02;
    public final /* synthetic */ C54662p5 A03;
    public final /* synthetic */ Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1VB(AnonymousClass4EI r1, AnonymousClass4EI r2, AnonymousClass30P r3, C50912iy r4, C54662p5 r5, Object obj) {
        super(r1);
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = obj;
        this.A00 = r2;
        this.A03 = r5;
    }

    public void BdT(Integer num, PublicKey publicKey, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        AnonymousClass30P r1 = this.A01;
        C50912iy r3 = this.A02;
        AnonymousClass4F6 r4 = (AnonymousClass4F6) ((AnonymousClass4C1) C18320x8.A0Z(((AnonymousClass2WK) r1.A01.get()).A00, r3)).get();
        Object obj = this.A04;
        AnonymousClass3MR r5 = new AnonymousClass3MR(this.A00, r3, r1.A02, r1.A00);
        C54662p5 r6 = this.A03;
        if (r6 == null) {
            r6 = C54662p5.A00();
        }
        r4.Bgn(r5, r6, num, obj, publicKey, x509Certificate);
    }
}
