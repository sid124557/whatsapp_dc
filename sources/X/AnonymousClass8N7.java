package X;

import java.security.cert.CertPathParameters;
import java.security.cert.PKIXParameters;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.8N7  reason: invalid class name */
public class AnonymousClass8N7 implements CertPathParameters {
    public final int A00;
    public final PKIXParameters A01;
    public final Date A02;
    public final Date A03;
    public final List A04;
    public final List A05;
    public final Map A06;
    public final Map A07;
    public final Set A08;
    public final C173618Qx A09;
    public final boolean A0A;
    public final boolean A0B;

    public Object clone() {
        return this;
    }

    public AnonymousClass8N7(C157017ha r2) {
        this.A01 = r2.A09;
        this.A03 = r2.A0B;
        this.A02 = r2.A0A;
        this.A05 = Collections.unmodifiableList(r2.A02);
        this.A07 = AnonymousClass6C9.A0l(r2.A04);
        this.A04 = Collections.unmodifiableList(r2.A01);
        this.A06 = AnonymousClass6C9.A0l(r2.A03);
        this.A09 = r2.A06;
        this.A0A = r2.A07;
        this.A0B = r2.A08;
        this.A00 = r2.A00;
        this.A08 = Collections.unmodifiableSet(r2.A05);
    }
}
