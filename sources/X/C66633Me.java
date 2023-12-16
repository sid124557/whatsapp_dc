package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.3Me  reason: invalid class name and case insensitive filesystem */
public final class C66633Me implements AnonymousClass4EL {
    public final /* synthetic */ C60272yH A00;
    public final /* synthetic */ C84964Ek A01;
    public final /* synthetic */ C43342Rt A02;

    public void BdT(Integer num, PublicKey publicKey, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        C162457s7.A0J(x509Certificate, 0);
        C43342Rt r0 = this.A02;
        C60272yH r1 = this.A00;
        C60942zQ r4 = r0.A02;
        AnonymousClass1Uz r5 = r0.A03;
        int i = r0.A00;
        Object obj = r0.A04;
        new C46882cM(r0.A01, r4, r5, obj, x509Certificate, i).A00(r1, C54662p5.A00());
    }

    public C66633Me(C60272yH r1, C84964Ek r2, C43342Rt r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BQr(Exception exc) {
        this.A01.BQp();
    }

    public void BSB(Exception exc) {
        this.A01.BSC(exc, (Integer) null);
    }
}
