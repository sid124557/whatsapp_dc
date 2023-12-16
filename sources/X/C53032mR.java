package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.2mR  reason: invalid class name and case insensitive filesystem */
public final class C53032mR {
    public final Integer A00;
    public final PublicKey A01;
    public final X509Certificate A02;
    public final X509Certificate A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53032mR) {
                C53032mR r5 = (C53032mR) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass000.A08(this.A03, C18300x5.A04(this.A02)) + AnonymousClass000.A07(this.A01)) * 31) + C18310x6.A07(this.A00);
    }

    public C53032mR(Integer num, PublicKey publicKey, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        this.A02 = x509Certificate;
        this.A03 = x509Certificate2;
        this.A01 = publicKey;
        this.A00 = num;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AvatarCertificate(encryptionCertificate=");
        A0o.append(this.A02);
        A0o.append(", signature=");
        A0o.append(this.A03);
        A0o.append(", passwordPublicKey=");
        A0o.append(this.A01);
        A0o.append(", passwordKeyId=");
        return C18260x0.A04(this.A00, A0o);
    }
}
