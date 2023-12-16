package X;

import java.security.cert.CertSelector;
import java.security.cert.Certificate;

/* renamed from: X.8Qx  reason: invalid class name and case insensitive filesystem */
public class C173618Qx implements C188108yK {
    public final CertSelector A00;

    public /* bridge */ /* synthetic */ boolean BKp(Object obj) {
        return this.A00.match((Certificate) obj);
    }

    public Object clone() {
        return new C173618Qx(this.A00);
    }

    public C173618Qx(CertSelector certSelector) {
        this.A00 = certSelector;
    }
}
