package X;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.security.NoSuchProviderException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.8SY  reason: invalid class name */
public class AnonymousClass8SY extends CertPath {
    public static final List A00;
    public List certificates;
    public final C180128kX helper;

    public AnonymousClass8SY(InputStream inputStream, String str) {
        super("X.509");
        CertificateException certificateException;
        C173558Qq r5 = new C173558Qq();
        this.helper = r5;
        try {
            if (str.equalsIgnoreCase("PkiPath")) {
                C177088e3 A06 = new C140356tb(inputStream).A06();
                if (A06 instanceof C176958dq) {
                    Enumeration A0V = ((C176958dq) A06).A0V();
                    this.certificates = AnonymousClass001.A0s();
                    CertificateFactory instance = CertificateFactory.getInstance("X.509", r5.A00);
                    while (A0V.hasMoreElements()) {
                        this.certificates.add(0, instance.generateCertificate(AnonymousClass0x9.A0d(AnonymousClass8Q0.A09((C183618qL) A0V.nextElement()))));
                    }
                    this.certificates = A00(this.certificates);
                    return;
                }
                certificateException = new CertificateException("input stream does not contain a ASN1 SEQUENCE while reading PkiPath encoded data to load CertPath");
            } else if (str.equalsIgnoreCase("PKCS7") || str.equalsIgnoreCase("PEM")) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                this.certificates = AnonymousClass001.A0s();
                CertificateFactory instance2 = CertificateFactory.getInstance("X.509", r5.A00);
                while (true) {
                    Certificate generateCertificate = instance2.generateCertificate(bufferedInputStream);
                    if (generateCertificate == null) {
                        break;
                    }
                    this.certificates.add(generateCertificate);
                }
                this.certificates = A00(this.certificates);
                return;
            } else {
                certificateException = new CertificateException(AnonymousClass000.A0V("unsupported encoding: ", str, AnonymousClass001.A0o()));
            }
            throw certificateException;
        } catch (IOException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            C18270x1.A1H(A0o, "IOException throw while decoding CertPath:\n", e);
            throw new CertificateException(A0o.toString());
        } catch (NoSuchProviderException e2) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            C18270x1.A1H(A0o2, "SpongyCastle provider not found while trying to get a CertificateFactory:\n", e2);
            throw new CertificateException(A0o2.toString());
        }
    }

    public List getCertificates() {
        return Collections.unmodifiableList(AnonymousClass002.A0J(this.certificates));
    }

    public byte[] getEncoded(String str) {
        C183618qL r1;
        Throwable r12;
        char[] cArr;
        int length;
        int i;
        if (str.equalsIgnoreCase("PkiPath")) {
            C161377pW r2 = new C161377pW();
            List list = this.certificates;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r2.A03(A01((X509Certificate) listIterator.previous()));
            }
            r1 = new C176948dp(r2);
        } else {
            int i2 = 0;
            if (str.equalsIgnoreCase("PKCS7")) {
                C176628dJ r8 = new C176628dJ((C183618qL) null, C186938wB.A07);
                C161377pW r22 = new C161377pW();
                while (i2 != this.certificates.size()) {
                    r22.A03(A01((X509Certificate) this.certificates.get(i2)));
                    i2++;
                }
                r1 = new C176628dJ(new C176638dK(new C176748dV(1), new C176988dt(), new C176988dt(r22), new C176988dt(), r8), C186938wB.A2K);
            } else if (str.equalsIgnoreCase("PEM")) {
                ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
                C140216tL r82 = new C140216tL(new OutputStreamWriter(A0e));
                while (i2 != this.certificates.size()) {
                    try {
                        C156267gL r23 = new C156267gL(((X509Certificate) this.certificates.get(i2)).getEncoded());
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("-----BEGIN ");
                        A0o.append("CERTIFICATE");
                        r82.write(AnonymousClass000.A0X("-----", A0o));
                        r82.newLine();
                        List list2 = r23.A00;
                        if (!list2.isEmpty()) {
                            Iterator it = list2.iterator();
                            if (it.hasNext()) {
                                it.next();
                                r12 = AnonymousClass001.A0g("getName");
                                throw r12;
                            }
                            r82.newLine();
                        }
                        byte[] bArr = r23.A01;
                        int length2 = bArr.length;
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((length2 + 2) / 3) * 4);
                        try {
                            C39302Bl.A00.B2P(byteArrayOutputStream, bArr, 0, length2);
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            int i3 = 0;
                            while (true) {
                                int length3 = byteArray.length;
                                if (i3 >= length3) {
                                    break;
                                }
                                int i4 = 0;
                                while (true) {
                                    cArr = r82.A00;
                                    length = cArr.length;
                                    if (i4 == length || (i = i3 + i4) >= length3) {
                                        r82.write(cArr, 0, i4);
                                        r82.newLine();
                                        i3 += length;
                                    } else {
                                        cArr[i4] = (char) byteArray[i];
                                        i4++;
                                    }
                                }
                                r82.write(cArr, 0, i4);
                                r82.newLine();
                                i3 += length;
                            }
                            r82.write(AnonymousClass000.A0U("-----END ", "CERTIFICATE", "-----", AnonymousClass001.A0o()));
                            r82.newLine();
                            i2++;
                        } catch (Exception e) {
                            r12 = new C378024b(AnonymousClass000.A0a("exception encoding base64 string: ", AnonymousClass001.A0o(), e), e);
                        }
                    } catch (Exception unused) {
                        throw new CertificateEncodingException("can't encode certificate for PEM encoded path");
                    }
                }
                r82.close();
                return A0e.toByteArray();
            } else {
                throw new CertificateEncodingException(AnonymousClass000.A0V("unsupported encoding: ", str, AnonymousClass001.A0o()));
            }
        }
        try {
            return AnonymousClass8Q0.A09(r1);
        } catch (IOException e2) {
            throw new CertificateEncodingException(AnonymousClass000.A0P(e2, "Exception thrown: ", AnonymousClass001.A0o()));
        }
    }

    public Iterator getEncodings() {
        return A00.iterator();
    }

    static {
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add("PkiPath");
        A0s.add("PEM");
        A0s.add("PKCS7");
        A00 = Collections.unmodifiableList(A0s);
    }

    public static final List A00(List list) {
        if (list.size() >= 2) {
            X500Principal issuerX500Principal = ((X509Certificate) C18290x4.A0k(list)).getIssuerX500Principal();
            int i = 1;
            while (i != list.size()) {
                if (issuerX500Principal.equals(((X509Certificate) list.get(i)).getSubjectX500Principal())) {
                    issuerX500Principal = ((X509Certificate) list.get(i)).getIssuerX500Principal();
                    i++;
                } else {
                    ArrayList A0p = AnonymousClass000.A0p(list);
                    ArrayList A0J = AnonymousClass002.A0J(list);
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        X509Certificate x509Certificate = (X509Certificate) list.get(i2);
                        X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
                        int i3 = 0;
                        while (true) {
                            if (i3 != list.size()) {
                                if (((X509Certificate) list.get(i3)).getIssuerX500Principal().equals(subjectX500Principal)) {
                                    break;
                                }
                                i3++;
                            } else {
                                A0p.add(x509Certificate);
                                list.remove(i2);
                                break;
                            }
                        }
                    }
                    if (A0p.size() <= 1) {
                        for (int i4 = 0; i4 != A0p.size(); i4++) {
                            X500Principal issuerX500Principal2 = ((X509Certificate) A0p.get(i4)).getIssuerX500Principal();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= list.size()) {
                                    break;
                                }
                                X509Certificate x509Certificate2 = (X509Certificate) list.get(i5);
                                if (issuerX500Principal2.equals(x509Certificate2.getSubjectX500Principal())) {
                                    A0p.add(x509Certificate2);
                                    list.remove(i5);
                                    break;
                                }
                                i5++;
                            }
                        }
                        if (list.size() <= 0) {
                            return A0p;
                        }
                    }
                    return A0J;
                }
            }
        }
        return list;
    }

    public static final C177088e3 A01(X509Certificate x509Certificate) {
        try {
            return new C140356tb(x509Certificate.getEncoded()).A06();
        } catch (Exception e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            C18270x1.A1H(A0o, "Exception while encoding certificate: ", e);
            throw new CertificateEncodingException(A0o.toString());
        }
    }

    public AnonymousClass8SY(List list) {
        super("X.509");
        this.helper = new C173558Qq();
        this.certificates = A00(AnonymousClass002.A0J(list));
    }

    public byte[] getEncoded() {
        Iterator it = A00.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (next instanceof String) {
            return getEncoded((String) next);
        }
        return null;
    }
}
