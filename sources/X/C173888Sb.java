package X;

import java.security.InvalidParameterException;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathChecker;
import java.security.cert.CertPathParameters;
import java.security.cert.CertificateParsingException;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXCertPathBuilderResult;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.spongycastle.jcajce.provider.asymmetric.x509.CertificateFactory;

/* renamed from: X.8Sb  reason: invalid class name and case insensitive filesystem */
public class C173888Sb extends CertPathBuilderSpi {
    public Exception A00;
    public final C180128kX A01;
    public final boolean A02;

    public CertPathBuilderResult engineBuild(CertPathParameters certPathParameters) {
        AnonymousClass8N6 r5;
        C156457gf r2;
        if (certPathParameters instanceof PKIXBuilderParameters) {
            PKIXBuilderParameters pKIXBuilderParameters = (PKIXBuilderParameters) certPathParameters;
            C157017ha r3 = new C157017ha((PKIXParameters) pKIXBuilderParameters);
            if (certPathParameters instanceof C173938Si) {
                C177498fy r52 = (C177498fy) certPathParameters;
                Iterator it = Collections.unmodifiableList(r52.A01).iterator();
                while (it.hasNext()) {
                    it.next();
                    r3.A02.add((Object) null);
                }
                r2 = new C156457gf(new AnonymousClass8N7(r3));
                r2.A01.addAll(Collections.unmodifiableSet(r52.A01));
                int i = r52.A00;
                if (i >= -1) {
                    r2.A00 = i;
                } else {
                    throw new InvalidParameterException("The maximum path length parameter can not be less than -1.");
                }
            } else {
                r2 = new C156457gf(pKIXBuilderParameters);
            }
            r5 = new AnonymousClass8N6(r2);
        } else if (certPathParameters instanceof AnonymousClass8N6) {
            r5 = (AnonymousClass8N6) certPathParameters;
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Parameters must be an instance of ");
            AnonymousClass6C9.A0y(PKIXBuilderParameters.class, A0o);
            A0o.append(" or ");
            AnonymousClass6C9.A0y(AnonymousClass8N6.class, A0o);
            throw AnonymousClass6CA.A0Z(AnonymousClass000.A0X(".", A0o));
        }
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it2 = C162357rn.A03(r5).iterator();
        CertPathBuilderResult certPathBuilderResult = null;
        while (true) {
            if (it2.hasNext()) {
                if (certPathBuilderResult != null) {
                    break;
                }
                certPathBuilderResult = A00((X509Certificate) it2.next(), A0s, r5);
            } else if (certPathBuilderResult == null) {
                Exception exc = this.A00;
                if (exc == null) {
                    throw new CertPathBuilderException("Unable to find certificate chain.");
                } else if (exc instanceof C143596zA) {
                    throw new CertPathBuilderException(exc.getMessage(), this.A00.getCause());
                } else {
                    throw new CertPathBuilderException("Possible certificate chain could not be validated.", exc);
                }
            }
        }
        return certPathBuilderResult;
    }

    public /* bridge */ /* synthetic */ CertPathChecker engineGetRevocationChecker() {
        return new C173948Sj(this.A01);
    }

    public C173888Sb(boolean z) {
        this.A01 = new C173558Qq();
        this.A02 = z;
    }

    public CertPathBuilderResult A00(X509Certificate x509Certificate, List list, AnonymousClass8N6 r11) {
        int i;
        Throwable th;
        C143596zA r0;
        Collection A0s;
        HashSet A0K;
        CertPath engineGenerateCertPath;
        CertPathBuilderResult certPathBuilderResult = null;
        if (!list.contains(x509Certificate) && !r11.A01.contains(x509Certificate) && ((i = r11.A00) == -1 || AnonymousClass002.A03(list) <= i)) {
            list.add(x509Certificate);
            try {
                CertificateFactory certificateFactory = new CertificateFactory();
                C173918Sf r6 = new C173918Sf(this.A02);
                try {
                    AnonymousClass8N7 r4 = r11.A02;
                    Set set = r4.A08;
                    PKIXParameters pKIXParameters = r4.A01;
                    boolean z = false;
                    try {
                        if (C162357rn.A01(pKIXParameters.getSigProvider(), x509Certificate, set) != null) {
                            z = true;
                        }
                    } catch (Exception unused) {
                    }
                    if (z) {
                        try {
                            engineGenerateCertPath = certificateFactory.engineGenerateCertPath(list);
                        } catch (Exception e) {
                            r0 = C143596zA.A01("Certification path could not be constructed from certificate list.", e);
                            throw r0;
                        }
                        try {
                            PKIXCertPathValidatorResult pKIXCertPathValidatorResult = (PKIXCertPathValidatorResult) r6.engineValidate(engineGenerateCertPath, r11);
                            return new PKIXCertPathBuilderResult(engineGenerateCertPath, pKIXCertPathValidatorResult.getTrustAnchor(), pKIXCertPathValidatorResult.getPolicyTree(), pKIXCertPathValidatorResult.getPublicKey());
                        } catch (Exception e2) {
                            r0 = C143596zA.A01("Certification path could not be validated.", e2);
                            throw r0;
                        }
                    } else {
                        ArrayList A0s2 = AnonymousClass001.A0s();
                        A0s2.addAll(r4.A05);
                        try {
                            byte[] extensionValue = x509Certificate.getExtensionValue(C176548dB.A0J.A01);
                            Map map = r4.A07;
                            if (extensionValue == null) {
                                A0s = Collections.EMPTY_LIST;
                            } else {
                                C176608dH[] A0A = C176518d8.A0A(C176778dY.A0C(extensionValue));
                                A0s = AnonymousClass001.A0s();
                                for (int i2 = 0; i2 != A0A.length; i2++) {
                                    map.get(A0A[i2]);
                                }
                            }
                            A0s2.addAll(A0s);
                            A0K = AnonymousClass002.A0K();
                        } catch (CertificateParsingException e3) {
                            r0 = C143596zA.A01("No additional X.509 stores can be added from certificate locations.", e3);
                            throw r0;
                        }
                        try {
                            A0K.addAll(C162357rn.A02(x509Certificate, pKIXParameters.getCertStores(), A0s2));
                            if (!A0K.isEmpty()) {
                                Iterator it = A0K.iterator();
                                while (it.hasNext() && certPathBuilderResult == null) {
                                    certPathBuilderResult = A00((X509Certificate) it.next(), list, r11);
                                }
                                if (certPathBuilderResult == null) {
                                    list.remove(x509Certificate);
                                    return certPathBuilderResult;
                                }
                            } else {
                                th = C143596zA.A01("No issuer certificate for certificate in certification path found.", (Throwable) null);
                                throw th;
                            }
                        } catch (C143596zA e4) {
                            r0 = C143596zA.A01("Cannot find issuer certificate for certificate in certification path.", e4);
                            throw r0;
                        }
                    }
                } catch (C143596zA e5) {
                    this.A00 = e5;
                }
            } catch (Exception unused2) {
                th = AnonymousClass002.A0E("Exception creating support classes.");
            }
        }
        return certPathBuilderResult;
    }

    public C173888Sb() {
        this(false);
    }
}
