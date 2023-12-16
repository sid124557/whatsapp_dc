package X;

import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertificateExpiredException;
import java.security.cert.X509Certificate;

/* renamed from: X.3Ma  reason: invalid class name and case insensitive filesystem */
public class C66593Ma implements AnonymousClass4EK {
    public final /* synthetic */ C58842vu A00;
    public final /* synthetic */ C50912iy A01;
    public final /* synthetic */ AnonymousClass4EL A02;
    public final /* synthetic */ C59532x4 A03;

    public C66593Ma(C58842vu r1, C50912iy r2, AnonymousClass4EL r3, C59532x4 r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void BQr(Exception exc) {
        PublicKey publicKey;
        C58842vu r5 = this.A00;
        AnonymousClass4EL r4 = this.A02;
        if (r5 != null) {
            try {
                X509Certificate x509Certificate = r5.A04;
                X509Certificate x509Certificate2 = r5.A05;
                String str = r5.A03;
                if (str == null) {
                    publicKey = null;
                } else {
                    publicKey = AnonymousClass341.A05(str);
                }
                r4.BdT(r5.A02, publicKey, x509Certificate, x509Certificate2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        r4.BQr(exc);
    }

    public void BSB(Exception exc) {
        PublicKey publicKey;
        C58842vu r5 = this.A00;
        AnonymousClass4EL r4 = this.A02;
        if (r5 != null) {
            try {
                X509Certificate x509Certificate = r5.A04;
                X509Certificate x509Certificate2 = r5.A05;
                String str = r5.A03;
                if (str == null) {
                    publicKey = null;
                } else {
                    publicKey = AnonymousClass341.A05(str);
                }
                r4.BdT(r5.A02, publicKey, x509Certificate, x509Certificate2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        r4.BSB(exc);
    }

    public void BdU(Integer num, String str, String str2, String str3, String str4, String str5) {
        try {
            C59532x4.A00(this.A01, this.A02, this.A03, num, str2, str3, str4, str5);
        } catch (CertificateExpiredException unused) {
            C59532x4 r2 = this.A03;
            C53182mg r0 = r2.A02;
            C50912iy r1 = this.A01;
            r0.A01(r1);
            ((C52922mG) ((AnonymousClass4C1) C18320x8.A0Z(((AnonymousClass2GO) r2.A03.get()).A00, r1)).get()).A00(new AnonymousClass3MZ(this));
        }
    }
}
