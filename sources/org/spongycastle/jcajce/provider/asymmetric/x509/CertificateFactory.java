package org.spongycastle.jcajce.provider.asymmetric.x509;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass8SY;
import X.C140356tb;
import X.C1454475x;
import X.C157197hu;
import X.C173558Qq;
import X.C173928Sg;
import X.C176268cj;
import X.C176368ct;
import X.C176638dK;
import X.C176768dX;
import X.C176908dl;
import X.C176958dq;
import X.C176998du;
import X.C177438ec;
import X.C177458ee;
import X.C180128kX;
import X.C18270x1;
import X.C183618qL;
import X.C186938wB;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactorySpi;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CertificateFactory extends CertificateFactorySpi {
    public static final C157197hu A07 = new C157197hu("CERTIFICATE");
    public static final C157197hu A08 = new C157197hu("CRL");
    public static final C157197hu A09 = new C157197hu("PKCS7");
    public int A00 = 0;
    public int A01 = 0;
    public InputStream A02 = null;
    public InputStream A03 = null;
    public C176998du A04 = null;
    public C176998du A05 = null;
    public final C180128kX A06 = new C173558Qq();

    public final CRL A00() {
        C176268cj r1;
        C176998du r0 = this.A04;
        if (r0 == null) {
            return null;
        }
        int i = this.A00;
        C183618qL[] r12 = r0.A01;
        if (i >= r12.length) {
            return null;
        }
        this.A00 = i + 1;
        C183618qL r13 = r12[i];
        if (r13 instanceof C176268cj) {
            r1 = (C176268cj) r13;
        } else if (r13 != null) {
            r1 = new C176268cj(C176958dq.A0C(r13));
        } else {
            r1 = null;
        }
        return new C177438ec(r1, this.A06);
    }

    public final CRL A01(C176958dq r4) {
        C176638dK r0;
        if (r4 == null) {
            return null;
        }
        if (r4.A0U() <= 1 || !(r4.A0W(0) instanceof C176768dX) || !r4.A0W(0).equals(C186938wB.A2K)) {
            return new C177438ec(new C176268cj(C176958dq.A0C(r4)), this.A06);
        }
        C176958dq A0D = C176958dq.A0D((C176908dl) r4.A0W(1), true);
        if (A0D != null) {
            r0 = new C176638dK(C176958dq.A0C(A0D));
        } else {
            r0 = null;
        }
        this.A04 = r0.A02;
        return A00();
    }

    public final Certificate A02() {
        C183618qL r1;
        C176998du r3 = this.A05;
        if (r3 == null) {
            return null;
        }
        do {
            int i = this.A01;
            C183618qL[] r12 = r3.A01;
            if (i >= r12.length) {
                return null;
            }
            this.A01 = i + 1;
            r1 = r12[i];
        } while (!(r1 instanceof C176958dq));
        return new C177458ee(C176368ct.A0A(r1), this.A06);
    }

    public final Certificate A03(C176958dq r4) {
        C176638dK r0;
        if (r4 == null) {
            return null;
        }
        if (r4.A0U() <= 1 || !(r4.A0W(0) instanceof C176768dX) || !r4.A0W(0).equals(C186938wB.A2K)) {
            return new C177458ee(C176368ct.A0A(r4), this.A06);
        }
        C176958dq A0D = C176958dq.A0D((C176908dl) r4.A0W(1), true);
        if (A0D != null) {
            r0 = new C176638dK(C176958dq.A0C(A0D));
        } else {
            r0 = null;
        }
        this.A05 = r0.A01;
        return A02();
    }

    public CRL engineGenerateCRL(InputStream inputStream) {
        InputStream inputStream2 = this.A02;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.A02 = inputStream;
            this.A04 = null;
            this.A00 = 0;
        }
        try {
            C176998du r0 = this.A04;
            if (r0 == null) {
                if (!inputStream.markSupported()) {
                    inputStream = AnonymousClass0x9.A0d(C1454475x.A00(inputStream));
                }
                inputStream.mark(1);
                int read = inputStream.read();
                if (read == -1) {
                    return null;
                }
                inputStream.reset();
                if (read != 48) {
                    return A01(A08.A01(inputStream));
                }
                return A01(C176958dq.A0C(new C140356tb(inputStream, true).A06()));
            } else if (this.A00 != r0.A01.length) {
                return A00();
            } else {
                this.A04 = null;
                this.A00 = 0;
                return null;
            }
        } catch (CRLException e) {
            throw e;
        } catch (Exception e2) {
            throw new CRLException(e2.toString());
        }
    }

    public CertPath engineGenerateCertPath(InputStream inputStream, String str) {
        return new AnonymousClass8SY(inputStream, str);
    }

    public Certificate engineGenerateCertificate(InputStream inputStream) {
        InputStream inputStream2 = this.A03;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.A03 = inputStream;
            this.A05 = null;
            this.A01 = 0;
        }
        try {
            C176998du r0 = this.A05;
            if (r0 == null) {
                if (!inputStream.markSupported()) {
                    inputStream = AnonymousClass0x9.A0d(C1454475x.A00(inputStream));
                }
                inputStream.mark(1);
                int read = inputStream.read();
                if (read == -1) {
                    return null;
                }
                inputStream.reset();
                if (read != 48) {
                    return A03(A07.A01(inputStream));
                }
                return A03(C176958dq.A0C(new C140356tb(inputStream).A06()));
            } else if (this.A01 != r0.A01.length) {
                return A02();
            } else {
                this.A05 = null;
                this.A01 = 0;
                return null;
            }
        } catch (Exception e) {
            throw new C173928Sg(AnonymousClass000.A0a("parsing issue: ", AnonymousClass001.A0o(), e), e, this);
        }
    }

    public Collection engineGenerateCertificates(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ArrayList A0s = AnonymousClass001.A0s();
        while (true) {
            Certificate engineGenerateCertificate = engineGenerateCertificate(bufferedInputStream);
            if (engineGenerateCertificate == null) {
                return A0s;
            }
            A0s.add(engineGenerateCertificate);
        }
    }

    public Iterator engineGetCertPathEncodings() {
        return AnonymousClass8SY.A00.iterator();
    }

    public Collection engineGenerateCRLs(InputStream inputStream) {
        ArrayList A0s = AnonymousClass001.A0s();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        while (true) {
            CRL engineGenerateCRL = engineGenerateCRL(bufferedInputStream);
            if (engineGenerateCRL == null) {
                return A0s;
            }
            A0s.add(engineGenerateCRL);
        }
    }

    public CertPath engineGenerateCertPath(List list) {
        for (Object next : list) {
            if (next != null && !(next instanceof X509Certificate)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                C18270x1.A1H(A0o, "list contains non X509Certificate object while creating CertPath\n", next);
                throw new CertificateException(A0o.toString());
            }
        }
        return new AnonymousClass8SY(list);
    }

    public CertPath engineGenerateCertPath(InputStream inputStream) {
        return new AnonymousClass8SY(inputStream, "PkiPath");
    }
}
