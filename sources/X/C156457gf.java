package X;

import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXParameters;
import java.util.Set;

/* renamed from: X.7gf  reason: invalid class name and case insensitive filesystem */
public class C156457gf {
    public int A00 = 5;
    public Set A01 = AnonymousClass002.A0K();
    public final AnonymousClass8N7 A02;

    public C156457gf(PKIXBuilderParameters pKIXBuilderParameters) {
        this.A02 = new AnonymousClass8N7(new C157017ha((PKIXParameters) pKIXBuilderParameters));
        this.A00 = pKIXBuilderParameters.getMaxPathLength();
    }

    public C156457gf(AnonymousClass8N7 r2) {
        this.A02 = r2;
    }
}
