package X;

import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.PKIXRevocationChecker;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.8Sj  reason: invalid class name and case insensitive filesystem */
public class C173948Sj extends PKIXRevocationChecker implements C184658sJ {
    public static final Map A04;
    public C149967Op A00;
    public final C180128kX A01;
    public final C173518Qm A02;
    public final C173528Qn A03;

    public void check(Certificate certificate, Collection collection) {
        X509Certificate x509Certificate = (X509Certificate) certificate;
        if (!getOptions().contains(PKIXRevocationChecker.Option.ONLY_END_ENTITY) || x509Certificate.getBasicConstraints() == -1) {
            if (getOptions().contains(PKIXRevocationChecker.Option.PREFER_CRLS)) {
                try {
                    this.A02.check(certificate);
                } catch (C173898Sc e) {
                    e = e;
                    if (!getOptions().contains(PKIXRevocationChecker.Option.NO_FALLBACK)) {
                        this.A03.check(certificate);
                        return;
                    }
                    throw e;
                }
            } else {
                try {
                    this.A03.check(certificate);
                } catch (C173898Sc e2) {
                    e = e2;
                    if (!getOptions().contains(PKIXRevocationChecker.Option.NO_FALLBACK)) {
                        this.A02.check(certificate);
                        return;
                    }
                    throw e;
                }
            }
        }
    }

    public void init(boolean z) {
        this.A00 = null;
        C173518Qm r1 = this.A02;
        if (!z) {
            r1.A01 = null;
            r1.A00 = new Date();
            C173528Qn r12 = this.A03;
            r12.A01 = null;
            r12.A02 = C159797mT.A01("ocsp.enable");
            r12.A00 = C159797mT.A00("ocsp.responderURL");
            return;
        }
        throw new CertPathValidatorException("forward checking not supported");
    }

    public void BGC(C149967Op r2) {
        this.A00 = r2;
        this.A02.BGC(r2);
        this.A03.BGC(r2);
    }

    public List getSoftFailExceptions() {
        return null;
    }

    public Set getSupportedExtensions() {
        return null;
    }

    public boolean isForwardCheckingSupported() {
        return false;
    }

    static {
        HashMap A0t = AnonymousClass001.A0t();
        A04 = A0t;
        A0t.put(C176768dX.A0B("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        A0t.put(C186938wB.A2D, "SHA224WITHRSA");
        A0t.put(C186938wB.A2E, "SHA256WITHRSA");
        AnonymousClass6C7.A1C(C186938wB.A2F, A0t);
        AnonymousClass8Q0.A05(C186838w1.A0G, A0t);
    }

    public C173948Sj(C180128kX r2) {
        this.A01 = r2;
        this.A02 = new C173518Qm(r2);
        this.A03 = new C173528Qn(r2, this);
    }
}
