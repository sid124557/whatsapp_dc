package X;

import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRLException;
import java.security.cert.X509CRLEntry;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.8Sl  reason: invalid class name and case insensitive filesystem */
public class C173968Sl extends X509CRLEntry {
    public C176618dI A00;
    public C176248ch A01;
    public volatile int A02;
    public volatile boolean A03;

    public Set getCriticalExtensionOIDs() {
        return A00(true);
    }

    public Set getNonCriticalExtensionOIDs() {
        return A00(false);
    }

    public final Set A00(boolean z) {
        C176288cl A0N = this.A01.A0N();
        if (A0N == null) {
            return null;
        }
        HashSet A0K = AnonymousClass002.A0K();
        Enumeration elements = A0N.A01.elements();
        while (elements.hasMoreElements()) {
            C176768dX r1 = (C176768dX) elements.nextElement();
            if (z == C176288cl.A0A(r1, A0N).A02) {
                A0K.add(r1.A01);
            }
        }
        return A0K;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C173968Sl)) {
            return super.equals(this);
        }
        C173968Sl r3 = (C173968Sl) obj;
        if (!this.A03 || !r3.A03 || this.A02 == r3.A02) {
            return this.A01.equals(r3.A01);
        }
        return false;
    }

    public X500Principal getCertificateIssuer() {
        C176618dI r0 = this.A00;
        if (r0 == null) {
            return null;
        }
        try {
            return new X500Principal(r0.A0L());
        } catch (IOException unused) {
            return null;
        }
    }

    public byte[] getEncoded() {
        try {
            return this.A01.A0M("DER");
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    public Date getRevocationDate() {
        return C176598dG.A0A(C176958dq.A0B(this.A01.A00)).A0O();
    }

    public BigInteger getSerialNumber() {
        return new BigInteger(C176748dV.A0A(C176958dq.A0A(this.A01.A00)).A01);
    }

    public boolean hasExtensions() {
        return AnonymousClass000.A1W(this.A01.A0N());
    }

    public int hashCode() {
        if (!this.A03) {
            this.A02 = super.hashCode();
            this.A03 = true;
        }
        return this.A02;
    }

    public String toString() {
        Object obj;
        StringBuffer A0X = AnonymousClass6CA.A0X();
        String str = C162077rB.A00;
        A0X.append("      userCertificate: ");
        A0X.append(getSerialNumber());
        A0X.append(str);
        A0X.append("       revocationDate: ");
        A0X.append(getRevocationDate());
        A0X.append(str);
        A0X.append("       certificateIssuer: ");
        A0X.append(getCertificateIssuer());
        A0X.append(str);
        C176288cl A0N = this.A01.A0N();
        if (A0N != null) {
            Enumeration elements = A0N.A01.elements();
            if (elements.hasMoreElements()) {
                String str2 = "   crlEntryExtensions:";
                loop0:
                while (true) {
                    A0X.append(str2);
                    while (true) {
                        A0X.append(str);
                        while (true) {
                            if (!elements.hasMoreElements()) {
                                break loop0;
                            }
                            C176768dX r6 = (C176768dX) elements.nextElement();
                            C176548dB A0A = C176288cl.A0A(r6, A0N);
                            C176778dY r0 = A0A.A01;
                            if (r0 != null) {
                                C140356tb A032 = C140356tb.A03(A0X, r0, A0A);
                                try {
                                    if (r6.A0T(C176548dB.A0T)) {
                                        obj = C176488d5.A0A(C176728dT.A0A(A032.A06()));
                                    } else if (r6.A0T(C176548dB.A0A)) {
                                        A0X.append("Certificate issuer: ");
                                        C177088e3 A06 = A032.A06();
                                        if (A06 != null) {
                                            obj = new C176518d8(C176958dq.A0C(A06));
                                        } else {
                                            obj = null;
                                        }
                                    } else {
                                        A0X.append(r6.A01);
                                        A0X.append(" value = ");
                                        A0X.append(C154577dO.A00(A032.A06()));
                                        A0X.append(str);
                                    }
                                    A0X.append(obj);
                                    A0X.append(str);
                                } catch (Exception unused) {
                                    A0X.append(r6.A01);
                                    A0X.append(" value = ");
                                    str2 = "*****";
                                }
                            }
                        }
                    }
                }
            }
        }
        return A0X.toString();
    }

    public C173968Sl(C176618dI r6, C176248ch r7, boolean z) {
        C176548dB A0A;
        this.A01 = r7;
        C176618dI r4 = null;
        if (z) {
            C176768dX r1 = C176548dB.A0A;
            C176288cl A0N = r7.A0N();
            if (A0N == null || (A0A = C176288cl.A0A(r1, A0N)) == null) {
                r4 = r6;
            } else {
                try {
                    C176608dH[] A0A2 = C176518d8.A0A(C176548dB.A0A(A0A));
                    int i = 0;
                    while (true) {
                        if (i >= A0A2.length) {
                            break;
                        } else if (A0A2[i].A00 == 4) {
                            r4 = C176618dI.A0B(A0A2[i].A01);
                            break;
                        } else {
                            i++;
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        this.A00 = r4;
    }

    public byte[] getExtensionValue(String str) {
        C176548dB r0;
        C176768dX A0B = C176768dX.A0B(str);
        C176288cl A0N = this.A01.A0N();
        if (A0N != null) {
            r0 = C176288cl.A0A(A0B, A0N);
        } else {
            r0 = null;
        }
        if (r0 == null) {
            return null;
        }
        try {
            return r0.A01.A0L();
        } catch (Exception e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            C18270x1.A1H(A0o, "Exception encoding: ", e);
            throw AnonymousClass001.A0e(A0o.toString());
        }
    }

    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null || criticalExtensionOIDs.isEmpty()) {
            return false;
        }
        return true;
    }
}
