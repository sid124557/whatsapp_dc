package X;

import java.security.cert.CertificateExpiredException;

/* renamed from: X.3MZ  reason: invalid class name */
public class AnonymousClass3MZ implements AnonymousClass4EK {
    public final /* synthetic */ C66593Ma A00;

    public AnonymousClass3MZ(C66593Ma r1) {
        this.A00 = r1;
    }

    public void BQr(Exception exc) {
        this.A00.A02.BSB(exc);
    }

    public void BSB(Exception exc) {
        this.A00.A02.BSB(exc);
    }

    public void BdU(Integer num, String str, String str2, String str3, String str4, String str5) {
        try {
            C66593Ma r0 = this.A00;
            C59532x4.A00(r0.A01, r0.A02, r0.A03, num, str2, str3, str4, str5);
        } catch (CertificateExpiredException e) {
            this.A00.A02.BSB(e);
        }
    }
}
