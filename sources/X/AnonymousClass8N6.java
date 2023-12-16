package X;

import java.security.cert.CertPathParameters;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.8N6  reason: invalid class name */
public class AnonymousClass8N6 implements CertPathParameters {
    public final int A00;
    public final Set A01;
    public final AnonymousClass8N7 A02;

    public Object clone() {
        return this;
    }

    public AnonymousClass8N6(C156457gf r2) {
        this.A02 = r2.A02;
        this.A01 = Collections.unmodifiableSet(r2.A01);
        this.A00 = r2.A00;
    }
}
