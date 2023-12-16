package X;

import java.security.cert.CertSelector;
import java.security.cert.PKIXParameters;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7ha  reason: invalid class name and case insensitive filesystem */
public class C157017ha {
    public int A00;
    public List A01;
    public List A02;
    public Map A03;
    public Map A04;
    public Set A05;
    public C173618Qx A06;
    public boolean A07;
    public boolean A08;
    public final PKIXParameters A09;
    public final Date A0A;
    public final Date A0B;

    public static void A00(C157017ha r1) {
        r1.A02 = new ArrayList();
        r1.A04 = new HashMap();
        r1.A01 = new ArrayList();
        r1.A03 = new HashMap();
        r1.A00 = 0;
        r1.A08 = false;
    }

    public C157017ha(AnonymousClass8N7 r3) {
        A00(this);
        this.A09 = r3.A01;
        this.A0B = r3.A03;
        this.A0A = r3.A02;
        this.A06 = r3.A09;
        this.A02 = AnonymousClass002.A0J(r3.A05);
        this.A04 = new HashMap(r3.A07);
        this.A01 = AnonymousClass002.A0J(r3.A04);
        this.A03 = new HashMap(r3.A06);
        this.A08 = r3.A0B;
        this.A00 = r3.A00;
        this.A07 = r3.A0A;
        this.A05 = r3.A08;
    }

    public C157017ha(PKIXParameters pKIXParameters) {
        A00(this);
        this.A09 = (PKIXParameters) pKIXParameters.clone();
        CertSelector targetCertConstraints = pKIXParameters.getTargetCertConstraints();
        if (targetCertConstraints != null) {
            this.A06 = new C173618Qx((CertSelector) targetCertConstraints.clone());
        }
        Date date = pKIXParameters.getDate();
        this.A0B = date;
        this.A0A = date == null ? new Date() : date;
        this.A07 = pKIXParameters.isRevocationEnabled();
        this.A05 = pKIXParameters.getTrustAnchors();
    }
}
