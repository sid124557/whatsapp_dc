package X;

import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.8fy  reason: invalid class name and case insensitive filesystem */
public class C177498fy extends C173938Si {
    public int A00 = 5;
    public Set A01 = Collections.EMPTY_SET;

    public C177498fy(Set set, C188108yK r3) {
        super(set);
        C188108yK r0;
        if (r3 != null) {
            r0 = (C188108yK) r3.clone();
        } else {
            r0 = null;
        }
        this.A07 = r0;
    }

    public void A00(PKIXParameters pKIXParameters) {
        super.A00(pKIXParameters);
        if (pKIXParameters instanceof C177498fy) {
            C177498fy r1 = (C177498fy) pKIXParameters;
            this.A00 = r1.A00;
            this.A01 = AnonymousClass0x9.A15(r1.A01);
        }
        if (pKIXParameters instanceof PKIXBuilderParameters) {
            this.A00 = ((PKIXBuilderParameters) pKIXParameters).getMaxPathLength();
        }
    }

    public Object clone() {
        C188108yK r1;
        try {
            Set<TrustAnchor> trustAnchors = getTrustAnchors();
            C188108yK r0 = this.A07;
            if (r0 != null) {
                r1 = (C188108yK) r0.clone();
            } else {
                r1 = null;
            }
            C177498fy r02 = new C177498fy(trustAnchors, r1);
            r02.A00(this);
            return r02;
        } catch (Exception e) {
            throw AnonymousClass002.A0E(e.getMessage());
        }
    }
}
