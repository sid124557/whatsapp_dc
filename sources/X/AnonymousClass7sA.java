package X;

import java.math.BigInteger;
import java.security.cert.CRLSelector;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.7sA  reason: invalid class name */
public class AnonymousClass7sA {
    public static final Class A00 = C1454375w.A00("java.security.cert.PKIXRevocationChecker", AnonymousClass7sA.class);
    public static final String A01 = C176548dB.A05.A01;
    public static final String A02 = C176548dB.A06.A01;
    public static final String A03 = C176548dB.A0B.A01;
    public static final String A04 = C176548dB.A08.A01;
    public static final String A05 = C176548dB.A0C.A01;
    public static final String A06 = C176548dB.A0G.A01;
    public static final String A07 = C176548dB.A0K.A01;
    public static final String A08 = C176548dB.A0L.A01;
    public static final String A09 = C176548dB.A0N.A01;
    public static final String A0A = C176548dB.A0P.A01;
    public static final String A0B = C176548dB.A0Q.A01;
    public static final String A0C = C176548dB.A0U.A01;
    public static final String[] A0D = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0A(java.security.PublicKey r10, java.security.cert.CertPath r11, java.security.cert.X509Certificate r12, java.util.Date r13, X.C176618dI r14, X.C184658sJ r15, X.AnonymousClass8N7 r16, int r17, boolean r18) {
        /*
            r9 = r13
            java.lang.String r2 = "Could not validate certificate: "
            r7 = r11
            r11 = r17
            java.security.cert.X509Certificate r4 = X.AnonymousClass6C7.A0t(r7, r11)
            r6 = r10
            r10 = r16
            if (r18 != 0) goto L_0x0027
            java.security.cert.PKIXParameters r0 = r10.A01     // Catch:{ GeneralSecurityException -> 0x001f }
            java.lang.String r0 = r0.getSigProvider()     // Catch:{ GeneralSecurityException -> 0x001f }
            if (r0 != 0) goto L_0x001b
            r4.verify(r6)     // Catch:{ GeneralSecurityException -> 0x001f }
            goto L_0x0027
        L_0x001b:
            r4.verify(r6, r0)     // Catch:{ GeneralSecurityException -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r1 = move-exception
            java.lang.String r0 = "Could not validate certificate signature."
            X.8Sd r0 = X.C173908Sd.A00(r0, r1, r7, r11)
            throw r0
        L_0x0027:
            int r1 = r10.A00     // Catch:{ 6zA -> 0x00ca }
            java.lang.String r5 = "Date of cert gen extension could not be read."
            r0 = 1
            if (r0 != r1) goto L_0x0071
            if (r17 <= 0) goto L_0x0071
            java.util.List r1 = r7.getCertificates()     // Catch:{ 6zA -> 0x00ca }
            int r0 = r17 - r0
            java.lang.Object r3 = r1.get(r0)     // Catch:{ 6zA -> 0x00ca }
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3     // Catch:{ 6zA -> 0x00ca }
            if (r0 != 0) goto L_0x006d
            java.security.cert.X509Certificate r1 = X.AnonymousClass6C7.A0t(r7, r0)     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005b }
            X.8dX r0 = X.C186808vy.A07     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005b }
            java.lang.String r0 = r0.A01     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005b }
            byte[] r0 = r1.getExtensionValue(r0)     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005b }
            if (r0 == 0) goto L_0x006d
            X.8e3 r0 = X.C177088e3.A0I(r0)     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005b }
            X.8dW r0 = X.C176758dW.A0C(r0)     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005b }
            if (r0 == 0) goto L_0x006d
            java.util.Date r9 = r0.A0W()     // Catch:{ ParseException -> 0x0065 }
            goto L_0x0071
        L_0x005b:
            X.6zA r0 = X.C143596zA.A00(r5)     // Catch:{ 6zA -> 0x00ca }
            goto L_0x006c
        L_0x0060:
            X.6zA r0 = X.C143596zA.A00(r5)     // Catch:{ 6zA -> 0x00ca }
            goto L_0x006c
        L_0x0065:
            r1 = move-exception
            java.lang.String r0 = "Date from date of cert gen extension could not be parsed."
            X.6zA r0 = X.C143596zA.A01(r0, r1)     // Catch:{ 6zA -> 0x00ca }
        L_0x006c:
            throw r0     // Catch:{ 6zA -> 0x00ca }
        L_0x006d:
            java.util.Date r9 = r3.getNotBefore()     // Catch:{ 6zA -> 0x00ca }
        L_0x0071:
            r4.checkValidity(r9)     // Catch:{ CertificateExpiredException -> 0x0083, CertificateNotYetValidException -> 0x0075 }
            goto L_0x0091
        L_0x0075:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            java.lang.String r0 = X.AnonymousClass000.A0a(r2, r0, r1)
            X.8Sd r0 = X.C173908Sd.A00(r0, r1, r7, r11)
            throw r0
        L_0x0083:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            java.lang.String r0 = X.AnonymousClass000.A0a(r2, r0, r1)
            X.8Sd r0 = X.C173908Sd.A00(r0, r1, r7, r11)
            throw r0
        L_0x0091:
            if (r15 == 0) goto L_0x009f
            X.7Op r5 = new X.7Op
            r8 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r15.BGC(r5)
            r15.check(r4)
        L_0x009f:
            X.8dI r2 = X.C160997on.A01(r4)
            boolean r0 = r2.equals(r14)
            if (r0 == 0) goto L_0x00aa
            return
        L_0x00aa:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "IssuerName("
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ") does not match SubjectName("
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = ") of signing certificate."
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            r0 = 0
            X.8Sd r0 = X.C173908Sd.A00(r1, r0, r7, r11)
            throw r0
        L_0x00ca:
            r1 = move-exception
            java.lang.String r0 = "Could not validate time of certificate."
            X.8Sd r0 = X.C173908Sd.A00(r0, r1, r7, r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7sA.A0A(java.security.PublicKey, java.security.cert.CertPath, java.security.cert.X509Certificate, java.util.Date, X.8dI, X.8sJ, X.8N7, int, boolean):void");
    }

    public static AnonymousClass8N8 A07(CertPath certPath, Set set, AnonymousClass8N8 r27, List[] listArr, int i, int i2, boolean z) {
        List[] listArr2;
        C176238cg r5;
        String str;
        C176238cg r52;
        CertPath certPath2 = certPath;
        AnonymousClass8N8 r4 = r27;
        List<? extends Certificate> certificates = certPath2.getCertificates();
        int i3 = i;
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i3);
        int size = certificates.size();
        int i4 = size - i;
        try {
            String str2 = A03;
            C176958dq A0C2 = C176958dq.A0C(C162357rn.A05(str2, x509Certificate));
            if (A0C2 == null || r27 == null) {
                return null;
            }
            Enumeration A0V = A0C2.A0V();
            HashSet A0K = AnonymousClass002.A0K();
            while (true) {
                listArr2 = listArr;
                if (!A0V.hasMoreElements()) {
                    break;
                }
                Object nextElement = A0V.nextElement();
                if (nextElement == null || (nextElement instanceof C176238cg)) {
                    r52 = (C176238cg) nextElement;
                } else {
                    r52 = new C176238cg(C176958dq.A0C(nextElement));
                }
                String str3 = r52.A00.A01;
                A0K.add(str3);
                if (!"2.5.29.32.0".equals(str3)) {
                    try {
                        Set A042 = C162357rn.A04(r52.A01);
                        int i5 = i4 - 1;
                        List list = listArr[i5];
                        int i6 = 0;
                        while (true) {
                            if (i6 >= list.size()) {
                                List list2 = listArr[i5];
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= list2.size()) {
                                        break;
                                    }
                                    AnonymousClass8N8 r53 = (AnonymousClass8N8) list2.get(i7);
                                    if ("2.5.29.32.0".equals(r53.getValidPolicy())) {
                                        HashSet A0K2 = AnonymousClass002.A0K();
                                        A0K2.add(str3);
                                        AnonymousClass8N8 r18 = new AnonymousClass8N8(str3, r53, AnonymousClass001.A0s(), A0K2, A042, i4, false);
                                        r53.A03.add(r18);
                                        r18.A02 = r53;
                                        listArr[i4].add(r18);
                                        break;
                                    }
                                    i7++;
                                }
                            } else {
                                AnonymousClass8N8 r54 = (AnonymousClass8N8) list.get(i6);
                                if (r54.getExpectedPolicies().contains(str3)) {
                                    HashSet A0K3 = AnonymousClass002.A0K();
                                    A0K3.add(str3);
                                    AnonymousClass8N8 r182 = new AnonymousClass8N8(str3, r54, AnonymousClass001.A0s(), A0K3, A042, i4, false);
                                    r54.A03.add(r182);
                                    r182.A02 = r54;
                                    listArr[i4].add(r182);
                                    break;
                                }
                                i6++;
                            }
                        }
                    } catch (CertPathValidatorException e) {
                        throw C173908Sd.A00("Policy qualifier info set could not be build.", e, certPath2, i3);
                    }
                }
            }
            Set set2 = set;
            if (set2.isEmpty() || set2.contains("2.5.29.32.0")) {
                set2.clear();
                set2.addAll(A0K);
            } else {
                HashSet A0K4 = AnonymousClass002.A0K();
                for (Object next : set2) {
                    if (A0K.contains(next)) {
                        A0K4.add(next);
                    }
                }
                set2.clear();
                set2.addAll(A0K4);
            }
            if (i2 > 0 || ((i4 < size || z) && AnonymousClass6C9.A1R(x509Certificate))) {
                Enumeration A0V2 = A0C2.A0V();
                while (true) {
                    if (!A0V2.hasMoreElements()) {
                        break;
                    }
                    Object nextElement2 = A0V2.nextElement();
                    if (nextElement2 == null || (nextElement2 instanceof C176238cg)) {
                        r5 = (C176238cg) nextElement2;
                    } else {
                        r5 = new C176238cg(C176958dq.A0C(nextElement2));
                    }
                    if ("2.5.29.32.0".equals(r5.A00.A01)) {
                        Set A043 = C162357rn.A04(r5.A01);
                        List list3 = listArr[i4 - 1];
                        for (int i8 = 0; i8 < list3.size(); i8++) {
                            AnonymousClass8N8 r55 = (AnonymousClass8N8) list3.get(i8);
                            for (Object next2 : r55.getExpectedPolicies()) {
                                if (next2 instanceof String) {
                                    str = (String) next2;
                                } else if (next2 instanceof C176768dX) {
                                    str = ((C176768dX) next2).A01;
                                }
                                Iterator children = r55.getChildren();
                                boolean z2 = false;
                                while (children.hasNext()) {
                                    if (str.equals(((AnonymousClass8N8) children.next()).getValidPolicy())) {
                                        z2 = true;
                                    }
                                }
                                if (!z2) {
                                    HashSet A0K5 = AnonymousClass002.A0K();
                                    A0K5.add(str);
                                    AnonymousClass8N8 r14 = new AnonymousClass8N8(str, r55, AnonymousClass001.A0s(), A0K5, A043, i4, false);
                                    r55.A03.add(r14);
                                    r14.A02 = r55;
                                    listArr[i4].add(r14);
                                }
                            }
                        }
                    }
                }
            }
            for (int i9 = i4 - 1; i9 >= 0; i9--) {
                List list4 = listArr[i9];
                for (int i10 = 0; i10 < list4.size(); i10++) {
                    AnonymousClass8N8 r56 = (AnonymousClass8N8) list4.get(i10);
                    if (!(!r56.A03.isEmpty()) && (r4 = C162357rn.A06(r4, r56, listArr2)) == null) {
                        break;
                    }
                }
            }
            Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
            if (criticalExtensionOIDs == null) {
                return r4;
            }
            boolean contains = criticalExtensionOIDs.contains(str2);
            List list5 = listArr[i4];
            for (int i11 = 0; i11 < list5.size(); i11++) {
                ((AnonymousClass8N8) list5.get(i11)).A06 = contains;
            }
            return r4;
        } catch (C143596zA e2) {
            throw C173908Sd.A00("Could not read certificate policies extension from certificate.", e2, certPath2, i3);
        }
    }

    public static AnonymousClass8N8 A09(CertPath certPath, AnonymousClass8N8 r20, List[] listArr, int i, int i2) {
        Set set;
        boolean z;
        C176238cg r10;
        CertPath certPath2 = certPath;
        AnonymousClass8N8 r6 = r20;
        List<? extends Certificate> certificates = certPath2.getCertificates();
        int i3 = i;
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i3);
        int A042 = AnonymousClass002.A04(certificates, i3);
        try {
            C176958dq A0C2 = C176958dq.A0C(C162357rn.A05(A0B, x509Certificate));
            if (A0C2 != null) {
                HashMap A0t = AnonymousClass001.A0t();
                HashSet A0K = AnonymousClass002.A0K();
                for (int i4 = 0; i4 < A0C2.A0U(); i4++) {
                    C176958dq r5 = (C176958dq) A0C2.A0W(i4);
                    String str = ((C176768dX) r5.A0W(0)).A01;
                    String str2 = ((C176768dX) r5.A0W(1)).A01;
                    if (!A0t.containsKey(str)) {
                        HashSet A0K2 = AnonymousClass002.A0K();
                        A0K2.add(str2);
                        A0t.put(str, A0K2);
                        A0K.add(str);
                    } else {
                        ((Set) A0t.get(str)).add(str2);
                    }
                }
                Iterator it = A0K.iterator();
                while (it.hasNext()) {
                    String A0m = AnonymousClass001.A0m(it);
                    List[] listArr2 = listArr;
                    Iterator it2 = listArr[A042].iterator();
                    if (i2 > 0) {
                        while (true) {
                            if (!it2.hasNext()) {
                                Iterator it3 = listArr[A042].iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    AnonymousClass8N8 r8 = (AnonymousClass8N8) it3.next();
                                    if ("2.5.29.32.0".equals(r8.getValidPolicy())) {
                                        try {
                                            String str3 = A03;
                                            Enumeration A0V = ((C176958dq) C162357rn.A05(str3, x509Certificate)).A0V();
                                            while (true) {
                                                if (!A0V.hasMoreElements()) {
                                                    set = null;
                                                    break;
                                                }
                                                try {
                                                    Object nextElement = A0V.nextElement();
                                                    if (nextElement == null || (nextElement instanceof C176238cg)) {
                                                        r10 = (C176238cg) nextElement;
                                                    } else {
                                                        r10 = new C176238cg(C176958dq.A0C(nextElement));
                                                    }
                                                    if ("2.5.29.32.0".equals(r10.A00.A01)) {
                                                        try {
                                                            set = C162357rn.A04(r10.A01);
                                                            break;
                                                        } catch (CertPathValidatorException e) {
                                                            throw C173908Sd.A00("Policy qualifier info set could not be decoded.", e, certPath2, i3);
                                                        }
                                                    }
                                                } catch (Exception e2) {
                                                    throw new CertPathValidatorException("Policy information could not be decoded.", e2, certPath2, i3);
                                                }
                                            }
                                            if (x509Certificate.getCriticalExtensionOIDs() != null) {
                                                z = x509Certificate.getCriticalExtensionOIDs().contains(str3);
                                            } else {
                                                z = false;
                                            }
                                            AnonymousClass8N8 r15 = (AnonymousClass8N8) r8.getParent();
                                            if ("2.5.29.32.0".equals(r15.getValidPolicy())) {
                                                AnonymousClass8N8 r13 = new AnonymousClass8N8(A0m, r15, AnonymousClass001.A0s(), (Set) A0t.get(A0m), set, A042, z);
                                                r15.A03.add(r13);
                                                r13.A02 = r15;
                                                listArr[A042].add(r13);
                                            }
                                        } catch (C143596zA e3) {
                                            throw C173908Sd.A00("Certificate policies extension could not be decoded.", e3, certPath2, i3);
                                        }
                                    }
                                }
                            } else {
                                AnonymousClass8N8 r7 = (AnonymousClass8N8) it2.next();
                                if (r7.getValidPolicy().equals(A0m)) {
                                    r7.A04 = (Set) A0t.get(A0m);
                                    break;
                                }
                            }
                        }
                    } else {
                        while (it2.hasNext()) {
                            AnonymousClass8N8 r72 = (AnonymousClass8N8) it2.next();
                            if (r72.getValidPolicy().equals(A0m)) {
                                ((AnonymousClass8N8) r72.getParent()).A03.remove(r72);
                                it2.remove();
                                for (int i5 = A042 - 1; i5 >= 0; i5--) {
                                    List list = listArr[i5];
                                    for (int i6 = 0; i6 < list.size(); i6++) {
                                        AnonymousClass8N8 r73 = (AnonymousClass8N8) list.get(i6);
                                        if (!(!r73.A03.isEmpty()) && (r6 = C162357rn.A06(r6, r73, listArr2)) == null) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return r6;
        } catch (C143596zA e4) {
            throw C173908Sd.A00("Policy mappings extension could not be decoded.", e4, certPath2, i3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x017d, code lost:
        if (java.util.Arrays.equals(r13, r8) != false) goto L_0x017f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x024c A[Catch:{ Exception -> 0x0426 }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x03a9 A[Catch:{ Exception -> 0x0426 }] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x052d A[Catch:{ Exception -> 0x0691 }] */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x065d A[Catch:{ Exception -> 0x0691 }] */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x01eb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x0348 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0H(java.security.cert.CertPath r24, X.C153217as r25, int r26) {
        /*
            r3 = r24
            r2 = r26
            java.security.cert.X509Certificate r1 = X.AnonymousClass6C7.A0t(r3, r2)
            java.lang.String r0 = A09     // Catch:{ Exception -> 0x069a }
            X.8e3 r0 = X.C162357rn.A05(r0, r1)     // Catch:{ Exception -> 0x069a }
            X.8dq r0 = X.C176958dq.A0C(r0)     // Catch:{ Exception -> 0x069a }
            if (r0 == 0) goto L_0x0699
            X.8dq r0 = X.C176958dq.A0C(r0)     // Catch:{ Exception -> 0x069a }
            X.8cm r5 = new X.8cm     // Catch:{ Exception -> 0x069a }
            r5.<init>(r0)     // Catch:{ Exception -> 0x069a }
            X.8cq[] r1 = r5.A01
            r26 = r25
            if (r1 == 0) goto L_0x042e
            int r10 = r1.length
            X.8cq[] r9 = new X.C176338cq[r10]
            r0 = 0
            java.lang.System.arraycopy(r1, r0, r9, r0, r10)
            r0 = r26
            X.7r7 r6 = r0.A00     // Catch:{ Exception -> 0x0426 }
            java.util.HashMap r8 = X.AnonymousClass001.A0t()     // Catch:{ Exception -> 0x0426 }
            r7 = 0
        L_0x0033:
            if (r7 == r10) goto L_0x0058
            r4 = r9[r7]     // Catch:{ Exception -> 0x0426 }
            X.8dH r0 = r4.A02     // Catch:{ Exception -> 0x0426 }
            int r0 = r0.A00     // Catch:{ Exception -> 0x0426 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0426 }
            java.lang.Object r0 = r8.get(r1)     // Catch:{ Exception -> 0x0426 }
            if (r0 != 0) goto L_0x004c
            java.util.HashSet r0 = X.AnonymousClass002.A0K()     // Catch:{ Exception -> 0x0426 }
            r8.put(r1, r0)     // Catch:{ Exception -> 0x0426 }
        L_0x004c:
            java.lang.Object r0 = r8.get(r1)     // Catch:{ Exception -> 0x0426 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x0426 }
            r0.add(r4)     // Catch:{ Exception -> 0x0426 }
            int r7 = r7 + 1
            goto L_0x0033
        L_0x0058:
            java.util.Iterator r25 = X.AnonymousClass001.A0u(r8)     // Catch:{ Exception -> 0x0426 }
        L_0x005c:
            boolean r0 = r25.hasNext()     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x042e
            java.util.Map$Entry r1 = X.AnonymousClass001.A0w(r25)     // Catch:{ Exception -> 0x0426 }
            java.lang.Object r0 = r1.getKey()     // Catch:{ Exception -> 0x0426 }
            int r4 = X.AnonymousClass0x7.A05(r0)     // Catch:{ Exception -> 0x0426 }
            if (r4 == 0) goto L_0x03cf
            r0 = 1
            if (r4 == r0) goto L_0x031a
            r0 = 2
            if (r4 == r0) goto L_0x02ca
            r0 = 4
            if (r4 == r0) goto L_0x0272
            r0 = 6
            if (r4 == r0) goto L_0x01bd
            r0 = 7
            if (r4 != r0) goto L_0x041b
            java.util.Set r0 = r6.A09     // Catch:{ Exception -> 0x0426 }
            r24 = r0
            java.lang.Object r0 = r1.getValue()     // Catch:{ Exception -> 0x0426 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x0426 }
            java.util.HashSet r12 = X.AnonymousClass002.A0K()     // Catch:{ Exception -> 0x0426 }
            java.util.Iterator r23 = r0.iterator()     // Catch:{ Exception -> 0x0426 }
        L_0x0091:
            boolean r0 = r23.hasNext()     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x01b9
            java.lang.Object r0 = r23.next()     // Catch:{ Exception -> 0x0426 }
            X.8cq r0 = (X.C176338cq) r0     // Catch:{ Exception -> 0x0426 }
            X.8dH r0 = r0.A02     // Catch:{ Exception -> 0x0426 }
            X.8qL r0 = r0.A01     // Catch:{ Exception -> 0x0426 }
            byte[] r11 = X.C176778dY.A0C(r0)     // Catch:{ Exception -> 0x0426 }
            if (r24 != 0) goto L_0x00ad
            if (r11 == 0) goto L_0x0091
            r12.add(r11)     // Catch:{ Exception -> 0x0426 }
            goto L_0x0091
        L_0x00ad:
            java.util.Iterator r22 = r24.iterator()     // Catch:{ Exception -> 0x0426 }
        L_0x00b1:
            boolean r0 = r22.hasNext()     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x0091
            java.lang.Object r4 = r22.next()     // Catch:{ Exception -> 0x0426 }
            byte[] r4 = (byte[]) r4     // Catch:{ Exception -> 0x0426 }
            int r1 = r4.length     // Catch:{ Exception -> 0x0426 }
            int r0 = r11.length     // Catch:{ Exception -> 0x0426 }
            if (r1 != r0) goto L_0x017f
            r15 = 2
            int r1 = r1 / r15
            byte[] r10 = new byte[r1]     // Catch:{ Exception -> 0x0426 }
            byte[] r9 = new byte[r1]     // Catch:{ Exception -> 0x0426 }
            r8 = 0
            java.lang.System.arraycopy(r4, r8, r10, r8, r1)     // Catch:{ Exception -> 0x0426 }
            java.lang.System.arraycopy(r4, r1, r9, r8, r1)     // Catch:{ Exception -> 0x0426 }
            byte[] r7 = new byte[r1]     // Catch:{ Exception -> 0x0426 }
            byte[] r4 = new byte[r1]     // Catch:{ Exception -> 0x0426 }
            java.lang.System.arraycopy(r11, r8, r7, r8, r1)     // Catch:{ Exception -> 0x0426 }
            java.lang.System.arraycopy(r11, r1, r4, r8, r1)     // Catch:{ Exception -> 0x0426 }
            r0 = 4
            byte[][] r1 = new byte[r0][]     // Catch:{ Exception -> 0x0426 }
            X.C18280x3.A19(r10, r9, r1)     // Catch:{ Exception -> 0x0426 }
            r1[r15] = r7     // Catch:{ Exception -> 0x0426 }
            r0 = 3
            r1[r0] = r4     // Catch:{ Exception -> 0x0426 }
            r10 = 0
            r13 = r1[r8]     // Catch:{ Exception -> 0x0426 }
            r21 = 1
            r14 = r1[r21]     // Catch:{ Exception -> 0x0426 }
            r20 = 2
            r19 = r1[r15]     // Catch:{ Exception -> 0x0426 }
            r18 = 3
            r17 = r1[r0]     // Catch:{ Exception -> 0x0426 }
            int r9 = r13.length     // Catch:{ Exception -> 0x0426 }
            byte[] r0 = new byte[r9]     // Catch:{ Exception -> 0x0426 }
            r16 = r0
            byte[] r8 = new byte[r9]     // Catch:{ Exception -> 0x0426 }
            byte[] r7 = new byte[r9]     // Catch:{ Exception -> 0x0426 }
            byte[] r4 = new byte[r9]     // Catch:{ Exception -> 0x0426 }
            r15 = 0
        L_0x00fe:
            if (r15 >= r9) goto L_0x0125
            byte r1 = r13[r15]     // Catch:{ Exception -> 0x0426 }
            byte r0 = r14[r15]     // Catch:{ Exception -> 0x0426 }
            r1 = r1 & r0
            byte r0 = (byte) r1     // Catch:{ Exception -> 0x0426 }
            r16[r15] = r0     // Catch:{ Exception -> 0x0426 }
            byte r1 = r13[r15]     // Catch:{ Exception -> 0x0426 }
            byte r0 = r14[r15]     // Catch:{ Exception -> 0x0426 }
            r1 = r1 & r0
            int r0 = ~r0     // Catch:{ Exception -> 0x0426 }
            X.AnonymousClass6C8.A0u(r1, r8, r0, r15)     // Catch:{ Exception -> 0x0426 }
            byte r1 = r19[r15]     // Catch:{ Exception -> 0x0426 }
            byte r0 = r17[r15]     // Catch:{ Exception -> 0x0426 }
            r1 = r1 & r0
            byte r0 = (byte) r1     // Catch:{ Exception -> 0x0426 }
            r7[r15] = r0     // Catch:{ Exception -> 0x0426 }
            byte r1 = r19[r15]     // Catch:{ Exception -> 0x0426 }
            byte r0 = r17[r15]     // Catch:{ Exception -> 0x0426 }
            r1 = r1 & r0
            int r0 = ~r0     // Catch:{ Exception -> 0x0426 }
            X.AnonymousClass6C8.A0u(r1, r4, r0, r15)     // Catch:{ Exception -> 0x0426 }
            int r15 = r15 + 1
            goto L_0x00fe
        L_0x0125:
            r0 = 4
            byte[][] r9 = new byte[r0][]     // Catch:{ Exception -> 0x0426 }
            r9[r10] = r16     // Catch:{ Exception -> 0x0426 }
            r9[r21] = r8     // Catch:{ Exception -> 0x0426 }
            r9[r20] = r7     // Catch:{ Exception -> 0x0426 }
            r9[r18] = r4     // Catch:{ Exception -> 0x0426 }
            r13 = r9[r21]     // Catch:{ Exception -> 0x0426 }
            r8 = r9[r18]     // Catch:{ Exception -> 0x0426 }
            r7 = 0
        L_0x0135:
            int r0 = r13.length     // Catch:{ Exception -> 0x0426 }
            if (r7 >= r0) goto L_0x0146
            byte r4 = r13[r7]     // Catch:{ Exception -> 0x0426 }
            r1 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r1
            byte r0 = r8[r7]     // Catch:{ Exception -> 0x0426 }
            r1 = r1 & r0
            if (r4 < r1) goto L_0x0147
            int r7 = r7 + 1
            goto L_0x0135
        L_0x0146:
            r13 = r8
        L_0x0147:
            r15 = r9[r10]     // Catch:{ Exception -> 0x0426 }
            r8 = r9[r20]     // Catch:{ Exception -> 0x0426 }
            r7 = 0
        L_0x014c:
            int r0 = r15.length     // Catch:{ Exception -> 0x0426 }
            if (r7 >= r0) goto L_0x015f
            byte r4 = r15[r7]     // Catch:{ Exception -> 0x0426 }
            r1 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r1
            byte r0 = r8[r7]     // Catch:{ Exception -> 0x0426 }
            r1 = r1 & r0
            if (r4 <= r1) goto L_0x015b
            goto L_0x015e
        L_0x015b:
            int r7 = r7 + 1
            goto L_0x014c
        L_0x015e:
            r8 = r15
        L_0x015f:
            boolean r0 = java.util.Arrays.equals(r8, r13)     // Catch:{ Exception -> 0x0426 }
            if (r0 != 0) goto L_0x0186
            r7 = 0
        L_0x0166:
            int r0 = r8.length     // Catch:{ Exception -> 0x0426 }
            if (r7 >= r0) goto L_0x0179
            byte r4 = r8[r7]     // Catch:{ Exception -> 0x0426 }
            r1 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r1
            byte r0 = r13[r7]     // Catch:{ Exception -> 0x0426 }
            r1 = r1 & r0
            if (r4 <= r1) goto L_0x0175
            goto L_0x0178
        L_0x0175:
            int r7 = r7 + 1
            goto L_0x0166
        L_0x0178:
            r13 = r8
        L_0x0179:
            boolean r0 = java.util.Arrays.equals(r13, r8)     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x0186
        L_0x017f:
            java.util.Set r0 = java.util.Collections.EMPTY_SET     // Catch:{ Exception -> 0x0426 }
        L_0x0181:
            r12.addAll(r0)     // Catch:{ Exception -> 0x0426 }
            goto L_0x00b1
        L_0x0186:
            r8 = r9[r10]     // Catch:{ Exception -> 0x0426 }
            r7 = r9[r20]     // Catch:{ Exception -> 0x0426 }
            int r13 = r8.length     // Catch:{ Exception -> 0x0426 }
            byte[] r9 = new byte[r13]     // Catch:{ Exception -> 0x0426 }
            r4 = 0
        L_0x018e:
            if (r4 >= r13) goto L_0x019a
            byte r1 = r8[r4]     // Catch:{ Exception -> 0x0426 }
            byte r0 = r7[r4]     // Catch:{ Exception -> 0x0426 }
            X.AnonymousClass6C8.A0u(r1, r9, r0, r4)     // Catch:{ Exception -> 0x0426 }
            int r4 = r4 + 1
            goto L_0x018e
        L_0x019a:
            int r8 = r14.length     // Catch:{ Exception -> 0x0426 }
            byte[] r7 = new byte[r8]     // Catch:{ Exception -> 0x0426 }
            r4 = 0
        L_0x019e:
            if (r4 >= r8) goto L_0x01aa
            byte r1 = r14[r4]     // Catch:{ Exception -> 0x0426 }
            byte r0 = r17[r4]     // Catch:{ Exception -> 0x0426 }
            X.AnonymousClass6C8.A0u(r1, r7, r0, r4)     // Catch:{ Exception -> 0x0426 }
            int r4 = r4 + 1
            goto L_0x019e
        L_0x01aa:
            int r0 = r13 * 2
            byte[] r0 = new byte[r0]     // Catch:{ Exception -> 0x0426 }
            java.lang.System.arraycopy(r9, r10, r0, r10, r13)     // Catch:{ Exception -> 0x0426 }
            java.lang.System.arraycopy(r7, r10, r0, r13, r13)     // Catch:{ Exception -> 0x0426 }
            java.util.Set r0 = java.util.Collections.singleton(r0)     // Catch:{ Exception -> 0x0426 }
            goto L_0x0181
        L_0x01b9:
            r6.A09 = r12     // Catch:{ Exception -> 0x0426 }
            goto L_0x005c
        L_0x01bd:
            java.util.Set r7 = r6.A0B     // Catch:{ Exception -> 0x0426 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ Exception -> 0x0426 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x0426 }
            java.util.HashSet r4 = X.AnonymousClass002.A0K()     // Catch:{ Exception -> 0x0426 }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ Exception -> 0x0426 }
        L_0x01cd:
            boolean r0 = r14.hasNext()     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x026e
            java.lang.Object r0 = r14.next()     // Catch:{ Exception -> 0x0426 }
            X.8cq r0 = (X.C176338cq) r0     // Catch:{ Exception -> 0x0426 }
            X.8dH r0 = r0.A02     // Catch:{ Exception -> 0x0426 }
            java.lang.String r1 = X.AnonymousClass8Q0.A02(r0)     // Catch:{ Exception -> 0x0426 }
            if (r7 != 0) goto L_0x01e7
            if (r1 == 0) goto L_0x01cd
            r4.add(r1)     // Catch:{ Exception -> 0x0426 }
            goto L_0x01cd
        L_0x01e7:
            java.util.Iterator r13 = r7.iterator()     // Catch:{ Exception -> 0x0426 }
        L_0x01eb:
            boolean r0 = r13.hasNext()     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x01cd
            java.lang.String r8 = X.AnonymousClass001.A0m(r13)     // Catch:{ Exception -> 0x0426 }
            r12 = 64
            int r0 = r8.indexOf(r12)     // Catch:{ Exception -> 0x0426 }
            java.lang.String r11 = "."
            r10 = -1
            if (r0 == r10) goto L_0x021a
            java.lang.String r9 = X.AnonymousClass6C9.A0c(r0, r8)     // Catch:{ Exception -> 0x0426 }
            int r0 = r1.indexOf(r12)     // Catch:{ Exception -> 0x0426 }
            if (r0 != r10) goto L_0x0246
            boolean r0 = r1.startsWith(r11)     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x0215
            boolean r0 = X.C162037r7.A03(r9, r1)     // Catch:{ Exception -> 0x0426 }
            goto L_0x024a
        L_0x0215:
            boolean r0 = r9.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0426 }
            goto L_0x024a
        L_0x021a:
            boolean r9 = r8.startsWith(r11)     // Catch:{ Exception -> 0x0426 }
            int r0 = r1.indexOf(r12)     // Catch:{ Exception -> 0x0426 }
            if (r9 == 0) goto L_0x0230
            if (r0 == r10) goto L_0x024d
            r0 = 0
            java.lang.String r0 = r1.substring(r0)     // Catch:{ Exception -> 0x0426 }
            boolean r0 = X.C162037r7.A03(r0, r8)     // Catch:{ Exception -> 0x0426 }
            goto L_0x0267
        L_0x0230:
            if (r0 == r10) goto L_0x023b
            java.lang.String r0 = X.AnonymousClass6C9.A0c(r0, r1)     // Catch:{ Exception -> 0x0426 }
            boolean r0 = r0.equalsIgnoreCase(r8)     // Catch:{ Exception -> 0x0426 }
            goto L_0x0267
        L_0x023b:
            boolean r0 = r1.startsWith(r11)     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x0246
            boolean r0 = X.C162037r7.A03(r8, r1)     // Catch:{ Exception -> 0x0426 }
            goto L_0x024a
        L_0x0246:
            boolean r0 = r8.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0426 }
        L_0x024a:
            if (r0 == 0) goto L_0x01eb
            goto L_0x025f
        L_0x024d:
            boolean r0 = r1.startsWith(r11)     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x0263
            boolean r0 = X.C162037r7.A03(r8, r1)     // Catch:{ Exception -> 0x0426 }
            if (r0 != 0) goto L_0x025f
            boolean r0 = r8.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x0263
        L_0x025f:
            r4.add(r8)     // Catch:{ Exception -> 0x0426 }
            goto L_0x01eb
        L_0x0263:
            boolean r0 = X.C162037r7.A03(r1, r8)     // Catch:{ Exception -> 0x0426 }
        L_0x0267:
            if (r0 == 0) goto L_0x01eb
            r4.add(r1)     // Catch:{ Exception -> 0x0426 }
            goto L_0x01eb
        L_0x026e:
            r6.A0B = r4     // Catch:{ Exception -> 0x0426 }
            goto L_0x005c
        L_0x0272:
            java.util.Set r9 = r6.A06     // Catch:{ Exception -> 0x0426 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ Exception -> 0x0426 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x0426 }
            java.util.HashSet r8 = X.AnonymousClass002.A0K()     // Catch:{ Exception -> 0x0426 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ Exception -> 0x0426 }
        L_0x0282:
            boolean r0 = r10.hasNext()     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x02c6
            java.lang.Object r0 = r10.next()     // Catch:{ Exception -> 0x0426 }
            X.8cq r0 = (X.C176338cq) r0     // Catch:{ Exception -> 0x0426 }
            X.8dH r0 = r0.A02     // Catch:{ Exception -> 0x0426 }
            X.8qL r0 = r0.A01     // Catch:{ Exception -> 0x0426 }
            X.8e3 r0 = r0.Bqk()     // Catch:{ Exception -> 0x0426 }
            X.8dq r7 = X.C176958dq.A0C(r0)     // Catch:{ Exception -> 0x0426 }
            if (r9 != 0) goto L_0x02a2
            if (r7 == 0) goto L_0x0282
            r8.add(r7)     // Catch:{ Exception -> 0x0426 }
            goto L_0x0282
        L_0x02a2:
            java.util.Iterator r4 = r9.iterator()     // Catch:{ Exception -> 0x0426 }
        L_0x02a6:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x0282
            java.lang.Object r1 = r4.next()     // Catch:{ Exception -> 0x0426 }
            X.8dq r1 = (X.C176958dq) r1     // Catch:{ Exception -> 0x0426 }
            boolean r0 = X.C162037r7.A04(r7, r1)     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x02bc
            r8.add(r7)     // Catch:{ Exception -> 0x0426 }
            goto L_0x02a6
        L_0x02bc:
            boolean r0 = X.C162037r7.A04(r1, r7)     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x02a6
            r8.add(r1)     // Catch:{ Exception -> 0x0426 }
            goto L_0x02a6
        L_0x02c6:
            r6.A06 = r8     // Catch:{ Exception -> 0x0426 }
            goto L_0x005c
        L_0x02ca:
            java.util.Set r10 = r6.A07     // Catch:{ Exception -> 0x0426 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ Exception -> 0x0426 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x0426 }
            java.util.HashSet r9 = X.AnonymousClass002.A0K()     // Catch:{ Exception -> 0x0426 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ Exception -> 0x0426 }
        L_0x02da:
            boolean r0 = r8.hasNext()     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x0316
            java.lang.Object r0 = r8.next()     // Catch:{ Exception -> 0x0426 }
            X.8cq r0 = (X.C176338cq) r0     // Catch:{ Exception -> 0x0426 }
            X.8dH r0 = r0.A02     // Catch:{ Exception -> 0x0426 }
            java.lang.String r7 = X.AnonymousClass8Q0.A02(r0)     // Catch:{ Exception -> 0x0426 }
            if (r10 != 0) goto L_0x02f4
            if (r7 == 0) goto L_0x02da
            r9.add(r7)     // Catch:{ Exception -> 0x0426 }
            goto L_0x02da
        L_0x02f4:
            java.util.Iterator r4 = r10.iterator()     // Catch:{ Exception -> 0x0426 }
        L_0x02f8:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x02da
            java.lang.String r1 = X.AnonymousClass001.A0m(r4)     // Catch:{ Exception -> 0x0426 }
            boolean r0 = X.C162037r7.A03(r1, r7)     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x030c
            r9.add(r1)     // Catch:{ Exception -> 0x0426 }
            goto L_0x02f8
        L_0x030c:
            boolean r0 = X.C162037r7.A03(r7, r1)     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x02f8
            r9.add(r7)     // Catch:{ Exception -> 0x0426 }
            goto L_0x02f8
        L_0x0316:
            r6.A07 = r9     // Catch:{ Exception -> 0x0426 }
            goto L_0x005c
        L_0x031a:
            java.util.Set r8 = r6.A08     // Catch:{ Exception -> 0x0426 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ Exception -> 0x0426 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x0426 }
            java.util.HashSet r7 = X.AnonymousClass002.A0K()     // Catch:{ Exception -> 0x0426 }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ Exception -> 0x0426 }
        L_0x032a:
            boolean r0 = r14.hasNext()     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x03cb
            java.lang.Object r0 = r14.next()     // Catch:{ Exception -> 0x0426 }
            X.8cq r0 = (X.C176338cq) r0     // Catch:{ Exception -> 0x0426 }
            X.8dH r0 = r0.A02     // Catch:{ Exception -> 0x0426 }
            java.lang.String r4 = X.AnonymousClass8Q0.A02(r0)     // Catch:{ Exception -> 0x0426 }
            if (r8 != 0) goto L_0x0344
            if (r4 == 0) goto L_0x032a
            r7.add(r4)     // Catch:{ Exception -> 0x0426 }
            goto L_0x032a
        L_0x0344:
            java.util.Iterator r13 = r8.iterator()     // Catch:{ Exception -> 0x0426 }
        L_0x0348:
            boolean r0 = r13.hasNext()     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x032a
            java.lang.String r1 = X.AnonymousClass001.A0m(r13)     // Catch:{ Exception -> 0x0426 }
            r12 = 64
            int r0 = r4.indexOf(r12)     // Catch:{ Exception -> 0x0426 }
            java.lang.String r11 = "."
            r10 = -1
            if (r0 == r10) goto L_0x0377
            java.lang.String r9 = X.AnonymousClass6C9.A0c(r0, r4)     // Catch:{ Exception -> 0x0426 }
            int r0 = r1.indexOf(r12)     // Catch:{ Exception -> 0x0426 }
            if (r0 != r10) goto L_0x03a3
            boolean r0 = r1.startsWith(r11)     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x0372
            boolean r0 = X.C162037r7.A03(r9, r1)     // Catch:{ Exception -> 0x0426 }
            goto L_0x03a7
        L_0x0372:
            boolean r0 = r9.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0426 }
            goto L_0x03a7
        L_0x0377:
            boolean r9 = r4.startsWith(r11)     // Catch:{ Exception -> 0x0426 }
            int r0 = r1.indexOf(r12)     // Catch:{ Exception -> 0x0426 }
            if (r9 == 0) goto L_0x038d
            if (r0 == r10) goto L_0x03aa
            r0 = 0
            java.lang.String r0 = r1.substring(r0)     // Catch:{ Exception -> 0x0426 }
            boolean r0 = X.C162037r7.A03(r0, r4)     // Catch:{ Exception -> 0x0426 }
            goto L_0x03c4
        L_0x038d:
            if (r0 == r10) goto L_0x0398
            java.lang.String r0 = X.AnonymousClass6C9.A0c(r0, r1)     // Catch:{ Exception -> 0x0426 }
            boolean r0 = r0.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x0426 }
            goto L_0x03c4
        L_0x0398:
            boolean r0 = r1.startsWith(r11)     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x03a3
            boolean r0 = X.C162037r7.A03(r4, r1)     // Catch:{ Exception -> 0x0426 }
            goto L_0x03a7
        L_0x03a3:
            boolean r0 = r4.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0426 }
        L_0x03a7:
            if (r0 == 0) goto L_0x0348
            goto L_0x03bc
        L_0x03aa:
            boolean r0 = r1.startsWith(r11)     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x03c0
            boolean r0 = X.C162037r7.A03(r4, r1)     // Catch:{ Exception -> 0x0426 }
            if (r0 != 0) goto L_0x03bc
            boolean r0 = r4.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x03c0
        L_0x03bc:
            r7.add(r4)     // Catch:{ Exception -> 0x0426 }
            goto L_0x0348
        L_0x03c0:
            boolean r0 = X.C162037r7.A03(r1, r4)     // Catch:{ Exception -> 0x0426 }
        L_0x03c4:
            if (r0 == 0) goto L_0x0348
            r7.add(r1)     // Catch:{ Exception -> 0x0426 }
            goto L_0x0348
        L_0x03cb:
            r6.A08 = r7     // Catch:{ Exception -> 0x0426 }
            goto L_0x005c
        L_0x03cf:
            java.util.Set r8 = r6.A0A     // Catch:{ Exception -> 0x0426 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ Exception -> 0x0426 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x0426 }
            java.util.HashSet r7 = X.AnonymousClass002.A0K()     // Catch:{ Exception -> 0x0426 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ Exception -> 0x0426 }
        L_0x03df:
            boolean r0 = r9.hasNext()     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x0417
            java.lang.Object r0 = r9.next()     // Catch:{ Exception -> 0x0426 }
            X.8cq r0 = (X.C176338cq) r0     // Catch:{ Exception -> 0x0426 }
            X.8dH r0 = r0.A02     // Catch:{ Exception -> 0x0426 }
            X.8qL r0 = r0.A01     // Catch:{ Exception -> 0x0426 }
            X.8cn r4 = X.C176308cn.A0A(r0)     // Catch:{ Exception -> 0x0426 }
            if (r8 != 0) goto L_0x03fb
            if (r4 == 0) goto L_0x03df
            r7.add(r4)     // Catch:{ Exception -> 0x0426 }
            goto L_0x03df
        L_0x03fb:
            java.util.Iterator r1 = r8.iterator()     // Catch:{ Exception -> 0x0426 }
        L_0x03ff:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x03df
            java.lang.Object r0 = r1.next()     // Catch:{ Exception -> 0x0426 }
            X.8cn r0 = X.C176308cn.A0A(r0)     // Catch:{ Exception -> 0x0426 }
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x03ff
            r7.add(r4)     // Catch:{ Exception -> 0x0426 }
            goto L_0x03ff
        L_0x0417:
            r6.A0A = r7     // Catch:{ Exception -> 0x0426 }
            goto L_0x005c
        L_0x041b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0426 }
            java.lang.String r0 = "Unknown tag encountered: "
            java.lang.IllegalStateException r0 = X.C86604Kt.A0h(r0, r1, r4)     // Catch:{ Exception -> 0x0426 }
            throw r0     // Catch:{ Exception -> 0x0426 }
        L_0x0426:
            r1 = move-exception
            java.lang.String r0 = "Permitted subtrees cannot be build from name constraints extension."
            X.8Sd r0 = X.C173908Sd.A00(r0, r1, r3, r2)
            throw r0
        L_0x042e:
            X.8cq[] r1 = r5.A00
            if (r1 == 0) goto L_0x0699
            int r7 = r1.length
            X.8cq[] r6 = new X.C176338cq[r7]
            r0 = 0
            java.lang.System.arraycopy(r1, r0, r6, r0, r7)
            r5 = 0
        L_0x043a:
            if (r5 == r7) goto L_0x0699
            r1 = r6[r5]     // Catch:{ Exception -> 0x0691 }
            r0 = r26
            X.7r7 r8 = r0.A00     // Catch:{ Exception -> 0x0691 }
            X.8dH r9 = r1.A02     // Catch:{ Exception -> 0x0691 }
            int r4 = r9.A00     // Catch:{ Exception -> 0x0691 }
            if (r4 == 0) goto L_0x0671
            r0 = 1
            if (r4 == r0) goto L_0x05c9
            r0 = 2
            if (r4 == r0) goto L_0x058b
            r0 = 4
            if (r4 == r0) goto L_0x0542
            r0 = 6
            if (r4 == r0) goto L_0x0499
            r0 = 7
            if (r4 != r0) goto L_0x0686
            java.util.Set r1 = r8.A03     // Catch:{ Exception -> 0x0691 }
            X.8qL r0 = r9.A01     // Catch:{ Exception -> 0x0691 }
            byte[] r11 = X.C176778dY.A0C(r0)     // Catch:{ Exception -> 0x0691 }
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x0691 }
            if (r0 == 0) goto L_0x0468
            if (r11 == 0) goto L_0x0495
            goto L_0x0492
        L_0x0468:
            java.util.HashSet r10 = X.AnonymousClass002.A0K()     // Catch:{ Exception -> 0x0691 }
            java.util.Iterator r9 = r1.iterator()     // Catch:{ Exception -> 0x0691 }
        L_0x0470:
            boolean r0 = r9.hasNext()     // Catch:{ Exception -> 0x0691 }
            if (r0 == 0) goto L_0x0490
            java.lang.Object r4 = r9.next()     // Catch:{ Exception -> 0x0691 }
            byte[] r4 = (byte[]) r4     // Catch:{ Exception -> 0x0691 }
            java.util.HashSet r1 = X.AnonymousClass002.A0K()     // Catch:{ Exception -> 0x0691 }
            boolean r0 = java.util.Arrays.equals(r4, r11)     // Catch:{ Exception -> 0x0691 }
            r1.add(r4)     // Catch:{ Exception -> 0x0691 }
            if (r0 != 0) goto L_0x048c
            r1.add(r11)     // Catch:{ Exception -> 0x0691 }
        L_0x048c:
            r10.addAll(r1)     // Catch:{ Exception -> 0x0691 }
            goto L_0x0470
        L_0x0490:
            r1 = r10
            goto L_0x0495
        L_0x0492:
            r1.add(r11)     // Catch:{ Exception -> 0x0691 }
        L_0x0495:
            r8.A03 = r1     // Catch:{ Exception -> 0x0691 }
            goto L_0x0682
        L_0x0499:
            java.util.Set r1 = r8.A05     // Catch:{ Exception -> 0x0691 }
            java.lang.String r9 = X.AnonymousClass8Q0.A02(r9)     // Catch:{ Exception -> 0x0691 }
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x0691 }
            if (r0 == 0) goto L_0x04a9
            if (r9 == 0) goto L_0x053e
            goto L_0x053b
        L_0x04a9:
            java.util.HashSet r4 = X.AnonymousClass002.A0K()     // Catch:{ Exception -> 0x0691 }
            java.util.Iterator r14 = r1.iterator()     // Catch:{ Exception -> 0x0691 }
        L_0x04b1:
            boolean r0 = r14.hasNext()     // Catch:{ Exception -> 0x0691 }
            if (r0 == 0) goto L_0x0539
            java.lang.String r1 = X.AnonymousClass001.A0m(r14)     // Catch:{ Exception -> 0x0691 }
            r13 = 64
            int r0 = r1.indexOf(r13)     // Catch:{ Exception -> 0x0691 }
            java.lang.String r12 = "."
            r11 = -1
            if (r0 == r11) goto L_0x04e0
            java.lang.String r10 = X.AnonymousClass6C9.A0c(r0, r1)     // Catch:{ Exception -> 0x0691 }
            int r0 = r9.indexOf(r13)     // Catch:{ Exception -> 0x0691 }
            if (r0 != r11) goto L_0x0527
            boolean r0 = r9.startsWith(r12)     // Catch:{ Exception -> 0x0691 }
            if (r0 == 0) goto L_0x04db
            boolean r0 = X.C162037r7.A03(r10, r9)     // Catch:{ Exception -> 0x0691 }
            goto L_0x0524
        L_0x04db:
            boolean r0 = r10.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x0691 }
            goto L_0x0524
        L_0x04e0:
            boolean r10 = r1.startsWith(r12)     // Catch:{ Exception -> 0x0691 }
            int r0 = r9.indexOf(r13)     // Catch:{ Exception -> 0x0691 }
            if (r10 == 0) goto L_0x050e
            if (r0 == r11) goto L_0x04f6
            r0 = 0
            java.lang.String r0 = r9.substring(r0)     // Catch:{ Exception -> 0x0691 }
            boolean r0 = X.C162037r7.A03(r0, r1)     // Catch:{ Exception -> 0x0691 }
            goto L_0x052b
        L_0x04f6:
            boolean r0 = r9.startsWith(r12)     // Catch:{ Exception -> 0x0691 }
            if (r0 == 0) goto L_0x0509
            boolean r0 = X.C162037r7.A03(r1, r9)     // Catch:{ Exception -> 0x0691 }
            if (r0 != 0) goto L_0x0534
            boolean r0 = r1.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x0691 }
            if (r0 == 0) goto L_0x0509
            goto L_0x0534
        L_0x0509:
            boolean r0 = X.C162037r7.A03(r9, r1)     // Catch:{ Exception -> 0x0691 }
            goto L_0x052b
        L_0x050e:
            if (r0 == r11) goto L_0x051a
            r0 = 0
            java.lang.String r0 = r9.substring(r0)     // Catch:{ Exception -> 0x0691 }
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0691 }
            goto L_0x052b
        L_0x051a:
            boolean r0 = r9.startsWith(r12)     // Catch:{ Exception -> 0x0691 }
            if (r0 == 0) goto L_0x0527
            boolean r0 = X.C162037r7.A03(r1, r9)     // Catch:{ Exception -> 0x0691 }
        L_0x0524:
            if (r0 == 0) goto L_0x0531
            goto L_0x0534
        L_0x0527:
            boolean r0 = r1.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x0691 }
        L_0x052b:
            if (r0 == 0) goto L_0x0531
            r4.add(r1)     // Catch:{ Exception -> 0x0691 }
            goto L_0x04b1
        L_0x0531:
            r4.add(r1)     // Catch:{ Exception -> 0x0691 }
        L_0x0534:
            r4.add(r9)     // Catch:{ Exception -> 0x0691 }
            goto L_0x04b1
        L_0x0539:
            r1 = r4
            goto L_0x053e
        L_0x053b:
            r1.add(r9)     // Catch:{ Exception -> 0x0691 }
        L_0x053e:
            r8.A05 = r1     // Catch:{ Exception -> 0x0691 }
            goto L_0x0682
        L_0x0542:
            java.util.Set r1 = r8.A00     // Catch:{ Exception -> 0x0691 }
            X.8qL r0 = r9.A01     // Catch:{ Exception -> 0x0691 }
            X.8e3 r10 = r0.Bqk()     // Catch:{ Exception -> 0x0691 }
            X.8dq r10 = (X.C176958dq) r10     // Catch:{ Exception -> 0x0691 }
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x0691 }
            if (r0 == 0) goto L_0x0555
            if (r10 == 0) goto L_0x0587
            goto L_0x0584
        L_0x0555:
            java.util.HashSet r9 = X.AnonymousClass002.A0K()     // Catch:{ Exception -> 0x0691 }
            java.util.Iterator r4 = r1.iterator()     // Catch:{ Exception -> 0x0691 }
        L_0x055d:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x0691 }
            if (r0 == 0) goto L_0x0582
            java.lang.Object r0 = r4.next()     // Catch:{ Exception -> 0x0691 }
            X.8dq r1 = X.C176958dq.A0C(r0)     // Catch:{ Exception -> 0x0691 }
            boolean r0 = X.C162037r7.A04(r10, r1)     // Catch:{ Exception -> 0x0691 }
            if (r0 == 0) goto L_0x0575
            r9.add(r1)     // Catch:{ Exception -> 0x0691 }
            goto L_0x055d
        L_0x0575:
            boolean r0 = X.C162037r7.A04(r1, r10)     // Catch:{ Exception -> 0x0691 }
            if (r0 != 0) goto L_0x057e
            r9.add(r1)     // Catch:{ Exception -> 0x0691 }
        L_0x057e:
            r9.add(r10)     // Catch:{ Exception -> 0x0691 }
            goto L_0x055d
        L_0x0582:
            r1 = r9
            goto L_0x0587
        L_0x0584:
            r1.add(r10)     // Catch:{ Exception -> 0x0691 }
        L_0x0587:
            r8.A00 = r1     // Catch:{ Exception -> 0x0691 }
            goto L_0x0682
        L_0x058b:
            java.util.Set r1 = r8.A01     // Catch:{ Exception -> 0x0691 }
            java.lang.String r10 = X.AnonymousClass8Q0.A02(r9)     // Catch:{ Exception -> 0x0691 }
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x0691 }
            if (r0 == 0) goto L_0x059a
            if (r10 == 0) goto L_0x05c5
            goto L_0x05c2
        L_0x059a:
            java.util.HashSet r9 = X.AnonymousClass002.A0K()     // Catch:{ Exception -> 0x0691 }
            java.util.Iterator r4 = r1.iterator()     // Catch:{ Exception -> 0x0691 }
        L_0x05a2:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x0691 }
            if (r0 == 0) goto L_0x05c0
            java.lang.String r1 = X.AnonymousClass001.A0m(r4)     // Catch:{ Exception -> 0x0691 }
            boolean r0 = X.C162037r7.A03(r1, r10)     // Catch:{ Exception -> 0x0691 }
            if (r0 != 0) goto L_0x05bc
            boolean r0 = X.C162037r7.A03(r10, r1)     // Catch:{ Exception -> 0x0691 }
            r9.add(r1)     // Catch:{ Exception -> 0x0691 }
            if (r0 == 0) goto L_0x05bc
            goto L_0x05a2
        L_0x05bc:
            r9.add(r10)     // Catch:{ Exception -> 0x0691 }
            goto L_0x05a2
        L_0x05c0:
            r1 = r9
            goto L_0x05c5
        L_0x05c2:
            r1.add(r10)     // Catch:{ Exception -> 0x0691 }
        L_0x05c5:
            r8.A01 = r1     // Catch:{ Exception -> 0x0691 }
            goto L_0x0682
        L_0x05c9:
            java.util.Set r1 = r8.A02     // Catch:{ Exception -> 0x0691 }
            java.lang.String r9 = X.AnonymousClass8Q0.A02(r9)     // Catch:{ Exception -> 0x0691 }
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x0691 }
            if (r0 == 0) goto L_0x05d9
            if (r9 == 0) goto L_0x066e
            goto L_0x066b
        L_0x05d9:
            java.util.HashSet r4 = X.AnonymousClass002.A0K()     // Catch:{ Exception -> 0x0691 }
            java.util.Iterator r14 = r1.iterator()     // Catch:{ Exception -> 0x0691 }
        L_0x05e1:
            boolean r0 = r14.hasNext()     // Catch:{ Exception -> 0x0691 }
            if (r0 == 0) goto L_0x0669
            java.lang.String r1 = X.AnonymousClass001.A0m(r14)     // Catch:{ Exception -> 0x0691 }
            r13 = 64
            int r0 = r1.indexOf(r13)     // Catch:{ Exception -> 0x0691 }
            java.lang.String r12 = "."
            r11 = -1
            if (r0 == r11) goto L_0x0610
            java.lang.String r10 = X.AnonymousClass6C9.A0c(r0, r1)     // Catch:{ Exception -> 0x0691 }
            int r0 = r9.indexOf(r13)     // Catch:{ Exception -> 0x0691 }
            if (r0 != r11) goto L_0x0657
            boolean r0 = r9.startsWith(r12)     // Catch:{ Exception -> 0x0691 }
            if (r0 == 0) goto L_0x060b
            boolean r0 = X.C162037r7.A03(r10, r9)     // Catch:{ Exception -> 0x0691 }
            goto L_0x0654
        L_0x060b:
            boolean r0 = r10.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x0691 }
            goto L_0x0654
        L_0x0610:
            boolean r10 = r1.startsWith(r12)     // Catch:{ Exception -> 0x0691 }
            int r0 = r9.indexOf(r13)     // Catch:{ Exception -> 0x0691 }
            if (r10 == 0) goto L_0x063e
            if (r0 == r11) goto L_0x0626
            r0 = 0
            java.lang.String r0 = r9.substring(r0)     // Catch:{ Exception -> 0x0691 }
            boolean r0 = X.C162037r7.A03(r0, r1)     // Catch:{ Exception -> 0x0691 }
            goto L_0x065b
        L_0x0626:
            boolean r0 = r9.startsWith(r12)     // Catch:{ Exception -> 0x0691 }
            if (r0 == 0) goto L_0x0639
            boolean r0 = X.C162037r7.A03(r1, r9)     // Catch:{ Exception -> 0x0691 }
            if (r0 != 0) goto L_0x0664
            boolean r0 = r1.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x0691 }
            if (r0 == 0) goto L_0x0639
            goto L_0x0664
        L_0x0639:
            boolean r0 = X.C162037r7.A03(r9, r1)     // Catch:{ Exception -> 0x0691 }
            goto L_0x065b
        L_0x063e:
            if (r0 == r11) goto L_0x064a
            r0 = 0
            java.lang.String r0 = r9.substring(r0)     // Catch:{ Exception -> 0x0691 }
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0691 }
            goto L_0x065b
        L_0x064a:
            boolean r0 = r9.startsWith(r12)     // Catch:{ Exception -> 0x0691 }
            if (r0 == 0) goto L_0x0657
            boolean r0 = X.C162037r7.A03(r1, r9)     // Catch:{ Exception -> 0x0691 }
        L_0x0654:
            if (r0 == 0) goto L_0x0661
            goto L_0x0664
        L_0x0657:
            boolean r0 = r1.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x0691 }
        L_0x065b:
            if (r0 == 0) goto L_0x0661
            r4.add(r1)     // Catch:{ Exception -> 0x0691 }
            goto L_0x05e1
        L_0x0661:
            r4.add(r1)     // Catch:{ Exception -> 0x0691 }
        L_0x0664:
            r4.add(r9)     // Catch:{ Exception -> 0x0691 }
            goto L_0x05e1
        L_0x0669:
            r1 = r4
            goto L_0x066e
        L_0x066b:
            r1.add(r9)     // Catch:{ Exception -> 0x0691 }
        L_0x066e:
            r8.A02 = r1     // Catch:{ Exception -> 0x0691 }
            goto L_0x0682
        L_0x0671:
            java.util.Set r4 = r8.A04     // Catch:{ Exception -> 0x0691 }
            X.8qL r0 = r9.A01     // Catch:{ Exception -> 0x0691 }
            X.8cn r1 = X.C176308cn.A0A(r0)     // Catch:{ Exception -> 0x0691 }
            java.util.HashSet r0 = X.AnonymousClass0x9.A15(r4)     // Catch:{ Exception -> 0x0691 }
            r0.add(r1)     // Catch:{ Exception -> 0x0691 }
            r8.A04 = r0     // Catch:{ Exception -> 0x0691 }
        L_0x0682:
            int r5 = r5 + 1
            goto L_0x043a
        L_0x0686:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0691 }
            java.lang.String r0 = "Unknown tag encountered: "
            java.lang.IllegalStateException r0 = X.C86604Kt.A0h(r0, r1, r4)     // Catch:{ Exception -> 0x0691 }
            throw r0     // Catch:{ Exception -> 0x0691 }
        L_0x0691:
            r1 = move-exception
            java.lang.String r0 = "Excluded subtrees cannot be build from name constraints extension."
            X.8Sd r0 = X.C173908Sd.A00(r0, r1, r3, r2)
            throw r0
        L_0x0699:
            return
        L_0x069a:
            r1 = move-exception
            java.lang.String r0 = "Name constraints extension could not be decoded."
            X.8Sd r0 = X.C173908Sd.A00(r0, r1, r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7sA.A0H(java.security.cert.CertPath, X.7as, int):void");
    }

    public static int A00(CertPath certPath, int i, int i2) {
        try {
            C176958dq A0C2 = C176958dq.A0C(C162357rn.A05(A0A, AnonymousClass6C7.A0t(certPath, i)));
            if (A0C2 != null) {
                Enumeration A0V = A0C2.A0V();
                while (true) {
                    if (!A0V.hasMoreElements()) {
                        break;
                    }
                    try {
                        C176908dl A0A2 = C176908dl.A0A(A0V.nextElement());
                        if (A0A2.A00 == 0) {
                            int A0U = C176748dV.A0B(A0A2).A0U();
                            if (A0U < i2) {
                                return A0U;
                            }
                        }
                    } catch (IllegalArgumentException e) {
                        throw C173908Sd.A00("Policy constraints extension contents cannot be decoded.", e, certPath, i);
                    }
                }
            }
            return i2;
        } catch (Exception e2) {
            throw C173908Sd.A00("Policy constraints extension cannot be decoded.", e2, certPath, i);
        }
    }

    public static int A01(CertPath certPath, int i, int i2) {
        try {
            C176958dq A0C2 = C176958dq.A0C(C162357rn.A05(A0A, AnonymousClass6C7.A0t(certPath, i)));
            if (A0C2 != null) {
                Enumeration A0V = A0C2.A0V();
                while (true) {
                    if (!A0V.hasMoreElements()) {
                        break;
                    }
                    try {
                        C176908dl A0A2 = C176908dl.A0A(A0V.nextElement());
                        if (A0A2.A00 == 1) {
                            int A0U = C176748dV.A0B(A0A2).A0U();
                            if (A0U < i2) {
                                return A0U;
                            }
                        }
                    } catch (IllegalArgumentException e) {
                        throw C173908Sd.A00("Policy constraints extension contents cannot be decoded.", e, certPath, i);
                    }
                }
            }
            return i2;
        } catch (Exception e2) {
            throw C173908Sd.A00("Policy constraints extension cannot be decoded.", e2, certPath, i);
        }
    }

    public static int A02(CertPath certPath, int i, int i2) {
        int A0U;
        try {
            C176748dV A0A2 = C176748dV.A0A(C162357rn.A05(A06, AnonymousClass6C7.A0t(certPath, i)));
            if (A0A2 == null || (A0U = A0A2.A0U()) >= i2) {
                return i2;
            }
            return A0U;
        } catch (Exception e) {
            throw C173908Sd.A00("Inhibit any-policy extension cannot be decoded.", e, certPath, i);
        }
    }

    public static int A03(CertPath certPath, int i, int i2) {
        C176748dV r0;
        int intValue;
        try {
            C176398cw A0A2 = C176398cw.A0A(C162357rn.A05(A02, AnonymousClass6C7.A0t(certPath, i)));
            if (A0A2 == null || (r0 = A0A2.A01) == null || (intValue = new BigInteger(r0.A01).intValue()) >= i2) {
                return i2;
            }
            return intValue;
        } catch (Exception e) {
            throw C173908Sd.A00("Basic constraints extension cannot be decoded.", e, certPath, i);
        }
    }

    public static int A04(CertPath certPath, int i, int i2) {
        try {
            C176958dq A0C2 = C176958dq.A0C(C162357rn.A05(A0A, AnonymousClass6C7.A0t(certPath, i)));
            if (A0C2 != null) {
                Enumeration A0V = A0C2.A0V();
                while (A0V.hasMoreElements()) {
                    C176908dl r2 = (C176908dl) A0V.nextElement();
                    if (r2.A00 == 0) {
                        try {
                            if (C176748dV.A0B(r2).A0U() == 0) {
                                return 0;
                            }
                        } catch (Exception e) {
                            throw C173908Sd.A00("Policy constraints requireExplicitPolicy field could not be decoded.", e, certPath, i);
                        }
                    }
                }
            }
            return i2;
        } catch (C143596zA e2) {
            throw C173908Sd.A00("Policy constraints could not be decoded.", e2, certPath, i);
        }
    }

    public static Set A05(Date date, List list, List list2, C173628Qy r8) {
        X509Certificate x509Certificate;
        HashSet A0K = AnonymousClass002.A0K();
        try {
            A0J(A0K, list2, r8);
            A0J(A0K, list, r8);
            HashSet A0K2 = AnonymousClass002.A0K();
            Iterator it = A0K.iterator();
            while (it.hasNext()) {
                X509CRL x509crl = (X509CRL) it.next();
                if (x509crl.getNextUpdate().after(date)) {
                    CRLSelector cRLSelector = r8.A01;
                    if (cRLSelector instanceof X509CRLSelector) {
                        x509Certificate = ((X509CRLSelector) cRLSelector).getCertificateChecking();
                    } else {
                        x509Certificate = null;
                    }
                    if (x509Certificate == null || x509crl.getThisUpdate().before(x509Certificate.getNotAfter())) {
                        A0K2.add(x509crl);
                    }
                }
            }
            return A0K2;
        } catch (C143596zA e) {
            throw C143596zA.A01("Exception obtaining complete CRLs.", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r10.isEmpty() != false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0119, code lost:
        if (r13 != null) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x011b, code lost:
        r8 = r8 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x011d, code lost:
        if (r8 < 0) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x011f, code lost:
        r3 = r14[r8];
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0126, code lost:
        if (r2 >= r3.size()) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0128, code lost:
        r1 = (X.AnonymousClass8N8) r3.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0136, code lost:
        if ((!r1.A03.isEmpty()) != false) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0138, code lost:
        r13 = X.C162357rn.A06(r13, r1, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x013c, code lost:
        r2 = r2 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass8N8 A06(java.security.cert.CertPath r9, java.util.Set r10, java.util.Set r11, X.AnonymousClass8N7 r12, X.AnonymousClass8N8 r13, java.util.List[] r14, int r15) {
        /*
            java.util.List r0 = r9.getCertificates()
            int r8 = r0.size()
            java.lang.String r4 = "Explicit policy requested but none available."
            r2 = 0
            if (r13 != 0) goto L_0x001b
            java.security.cert.PKIXParameters r0 = r12.A01
            boolean r0 = r0.isExplicitPolicyRequired()
            if (r0 == 0) goto L_0x001a
            X.8Sd r0 = X.C173908Sd.A00(r4, r2, r9, r15)
            throw r0
        L_0x001a:
            return r2
        L_0x001b:
            if (r10 == 0) goto L_0x002c
            java.lang.String r0 = "2.5.29.32.0"
            boolean r0 = r10.contains(r0)
            if (r0 != 0) goto L_0x002c
            boolean r1 = r10.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x002d
        L_0x002c:
            r0 = 1
        L_0x002d:
            java.lang.String r3 = "2.5.29.32.0"
            if (r0 == 0) goto L_0x00b5
            java.security.cert.PKIXParameters r0 = r12.A01
            boolean r0 = r0.isExplicitPolicyRequired()
            if (r0 == 0) goto L_0x013f
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x00b0
            java.util.HashSet r6 = X.AnonymousClass002.A0K()
            r5 = 0
        L_0x0044:
            int r0 = r14.length
            if (r5 >= r0) goto L_0x0074
            r4 = r14[r5]
            r2 = 0
        L_0x004a:
            int r0 = r4.size()
            if (r2 >= r0) goto L_0x0071
            java.lang.Object r1 = r4.get(r2)
            X.8N8 r1 = (X.AnonymousClass8N8) r1
            java.lang.String r0 = r1.getValidPolicy()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x006e
            java.util.Iterator r1 = r1.getChildren()
        L_0x0064:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006e
            X.C18310x6.A1R(r6, r1)
            goto L_0x0064
        L_0x006e:
            int r2 = r2 + 1
            goto L_0x004a
        L_0x0071:
            int r5 = r5 + 1
            goto L_0x0044
        L_0x0074:
            java.util.Iterator r1 = r6.iterator()
        L_0x0078:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008c
            java.lang.Object r0 = r1.next()
            X.8N8 r0 = (X.AnonymousClass8N8) r0
            java.lang.String r0 = r0.getValidPolicy()
            r11.contains(r0)
            goto L_0x0078
        L_0x008c:
            int r8 = r8 + -1
            if (r8 < 0) goto L_0x013f
            r3 = r14[r8]
            r2 = 0
        L_0x0093:
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x008c
            java.lang.Object r1 = r3.get(r2)
            X.8N8 r1 = (X.AnonymousClass8N8) r1
            java.util.List r0 = r1.A03
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x00ad
            X.8N8 r13 = X.C162357rn.A06(r13, r1, r14)
        L_0x00ad:
            int r2 = r2 + 1
            goto L_0x0093
        L_0x00b0:
            X.8Sd r0 = X.C173908Sd.A00(r4, r2, r9, r15)
            throw r0
        L_0x00b5:
            java.util.HashSet r7 = X.AnonymousClass002.A0K()
            r6 = 0
        L_0x00ba:
            int r0 = r14.length
            if (r6 >= r0) goto L_0x00fa
            r5 = r14[r6]
            r4 = 0
        L_0x00c0:
            int r0 = r5.size()
            if (r4 >= r0) goto L_0x00f7
            java.lang.Object r1 = r5.get(r4)
            X.8N8 r1 = (X.AnonymousClass8N8) r1
            java.lang.String r0 = r1.getValidPolicy()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00f4
            java.util.Iterator r2 = r1.getChildren()
        L_0x00da:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00f4
            java.lang.Object r1 = r2.next()
            X.8N8 r1 = (X.AnonymousClass8N8) r1
            java.lang.String r0 = r1.getValidPolicy()
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x00da
            r7.add(r1)
            goto L_0x00da
        L_0x00f4:
            int r4 = r4 + 1
            goto L_0x00c0
        L_0x00f7:
            int r6 = r6 + 1
            goto L_0x00ba
        L_0x00fa:
            java.util.Iterator r2 = r7.iterator()
        L_0x00fe:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0119
            java.lang.Object r1 = r2.next()
            X.8N8 r1 = (X.AnonymousClass8N8) r1
            java.lang.String r0 = r1.getValidPolicy()
            boolean r0 = r10.contains(r0)
            if (r0 != 0) goto L_0x00fe
            X.8N8 r13 = X.C162357rn.A06(r13, r1, r14)
            goto L_0x00fe
        L_0x0119:
            if (r13 == 0) goto L_0x013f
        L_0x011b:
            int r8 = r8 + -1
            if (r8 < 0) goto L_0x013f
            r3 = r14[r8]
            r2 = 0
        L_0x0122:
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x011b
            java.lang.Object r1 = r3.get(r2)
            X.8N8 r1 = (X.AnonymousClass8N8) r1
            java.util.List r0 = r1.A03
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x013c
            X.8N8 r13 = X.C162357rn.A06(r13, r1, r14)
        L_0x013c:
            int r2 = r2 + 1
            goto L_0x0122
        L_0x013f:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7sA.A06(java.security.cert.CertPath, java.util.Set, java.util.Set, X.8N7, X.8N8, java.util.List[], int):X.8N8");
    }

    public static AnonymousClass8N8 A08(CertPath certPath, AnonymousClass8N8 r3, int i) {
        try {
            if (C176958dq.A0C(C162357rn.A05(A03, AnonymousClass6C7.A0t(certPath, i))) == null) {
                return null;
            }
            return r3;
        } catch (C143596zA e) {
            throw C173908Sd.A00("Could not read certificate policies extension from certificate.", e, certPath, i);
        }
    }

    public static void A0C(CertPath certPath, int i) {
        try {
            C176958dq A0C2 = C176958dq.A0C(C162357rn.A05(A0B, AnonymousClass6C7.A0t(certPath, i)));
            if (A0C2 != null) {
                int i2 = 0;
                while (i2 < A0C2.A0U()) {
                    try {
                        C176958dq A0C3 = C176958dq.A0C(A0C2.A0W(i2));
                        C176768dX A0A2 = C176768dX.A0A(A0C3.A0W(0));
                        C176768dX A0A3 = C176768dX.A0A(C176958dq.A0B(A0C3));
                        if ("2.5.29.32.0".equals(A0A2.A01)) {
                            throw new CertPathValidatorException("IssuerDomainPolicy is anyPolicy", (Throwable) null, certPath, i);
                        } else if (!"2.5.29.32.0".equals(A0A3.A01)) {
                            i2++;
                        } else {
                            throw new CertPathValidatorException("SubjectDomainPolicy is anyPolicy", (Throwable) null, certPath, i);
                        }
                    } catch (Exception e) {
                        throw C173908Sd.A00("Policy mappings extension contents could not be decoded.", e, certPath, i);
                    }
                }
            }
        } catch (C143596zA e2) {
            throw C173908Sd.A00("Policy mappings extension could not be decoded.", e2, certPath, i);
        }
    }

    public static void A0D(CertPath certPath, int i) {
        try {
            C176398cw A0A2 = C176398cw.A0A(C162357rn.A05(A02, AnonymousClass6C7.A0t(certPath, i)));
            if (A0A2 != null) {
                C176738dU r0 = A0A2.A00;
                if (r0 == null || r0.A00 == 0) {
                    throw new CertPathValidatorException("Not a CA certificate", (Throwable) null, certPath, i);
                }
                return;
            }
            throw new CertPathValidatorException("Intermediate certificate lacks BasicConstraints", (Throwable) null, certPath, i);
        } catch (Exception e) {
            throw C173908Sd.A00("Basic constraints extension cannot be decoded.", e, certPath, i);
        }
    }

    public static void A0E(CertPath certPath, int i) {
        boolean[] keyUsage = AnonymousClass6C7.A0t(certPath, i).getKeyUsage();
        if (keyUsage == null) {
            return;
        }
        if (keyUsage.length <= 5 || !keyUsage[5]) {
            throw C173908Sd.A00("Issuer certificate keyusage extension is critical and does not permit key signing.", (Throwable) null, certPath, i);
        }
    }

    public static void A0F(CertPath certPath, List list, Set set, int i) {
        Certificate certificate = (Certificate) certPath.getCertificates().get(i);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(certificate, set);
            } catch (CertPathValidatorException e) {
                throw new CertPathValidatorException(e.getMessage(), e.getCause(), certPath, i);
            }
        }
        if (!set.isEmpty()) {
            throw C173908Sd.A00(AnonymousClass000.A0P(set, "Certificate has unsupported critical extension: ", AnonymousClass001.A0o()), (Throwable) null, certPath, i);
        }
    }

    public static void A0G(CertPath certPath, List list, Set set, int i) {
        Certificate certificate = (Certificate) certPath.getCertificates().get(i);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(certificate, set);
            } catch (CertPathValidatorException e) {
                throw C173908Sd.A00(e.getMessage(), e, certPath, i);
            } catch (Exception e2) {
                throw new CertPathValidatorException("Additional certificate path checker failed.", e2, certPath, i);
            }
        }
        if (!set.isEmpty()) {
            throw C173908Sd.A00(AnonymousClass000.A0P(set, "Certificate has unsupported critical extension: ", AnonymousClass001.A0o()), (Throwable) null, certPath, i);
        }
    }

    public static void A0I(CertPath certPath, C153217as r14, int i, boolean z) {
        C143606zB r2;
        C176518d8 r6;
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i);
        int size = certificates.size();
        int i2 = size - i;
        if (!AnonymousClass6C9.A1R(x509Certificate) || (i2 >= size && !z)) {
            try {
                C176958dq A0C2 = C176958dq.A0C(C160997on.A02(x509Certificate));
                try {
                    C162037r7 r1 = r14.A00;
                    r1.A08(C176618dI.A0B(A0C2));
                    try {
                        r1.A07(C176618dI.A0B(A0C2));
                        try {
                            C177088e3 A052 = C162357rn.A05(A0C, x509Certificate);
                            if (A052 != null) {
                                r6 = new C176518d8(C176958dq.A0C(A052));
                            } else {
                                r6 = null;
                            }
                            C176618dI A0B2 = C176618dI.A0B(A0C2);
                            C176768dX r11 = C177138e8.A0F;
                            C176538dA[] r10 = A0B2.A04;
                            int length = r10.length;
                            C176538dA[] r5 = new C176538dA[length];
                            int i3 = 0;
                            for (int i4 = 0; i4 != length; i4++) {
                                C176538dA r3 = r10[i4];
                                C176998du r12 = r3.A00;
                                int length2 = r12.A01.length;
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= length2) {
                                        break;
                                    } else if (C176448d1.A0A(r12.A01[i5]).A01.A0T(r11)) {
                                        r5[i3] = r3;
                                        i3++;
                                        break;
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                            if (i3 < length) {
                                C176538dA[] r0 = new C176538dA[i3];
                                System.arraycopy(r5, 0, r0, 0, i3);
                                r5 = r0;
                            }
                            int i6 = 0;
                            int i7 = 0;
                            while (i7 != r5.length) {
                                C176608dH r02 = new C176608dH(((C183628qM) r5[i7].A0N().A00).BDM());
                                try {
                                    r14.A01(r02);
                                    r14.A00(r02);
                                    i7++;
                                } catch (C143606zB e) {
                                    throw new CertPathValidatorException("Subtree check for certificate subject alternative email failed.", e, certPath, i);
                                }
                            }
                            if (r6 != null) {
                                try {
                                    C176608dH[] r03 = r6.A00;
                                    int length3 = r03.length;
                                    C176608dH[] r13 = new C176608dH[length3];
                                    System.arraycopy(r03, 0, r13, 0, length3);
                                    while (i6 < length3) {
                                        try {
                                            r14.A01(r13[i6]);
                                            r14.A00(r13[i6]);
                                            i6++;
                                        } catch (C143606zB e2) {
                                            throw new CertPathValidatorException("Subtree check for certificate subject alternative name failed.", e2, certPath, i);
                                        }
                                    }
                                } catch (Exception e3) {
                                    throw new CertPathValidatorException("Subject alternative name contents could not be decoded.", e3, certPath, i);
                                }
                            }
                        } catch (Exception e4) {
                            throw new CertPathValidatorException("Subject alternative name extension could not be decoded.", e4, certPath, i);
                        }
                    } catch (C143406yp e5) {
                        r2 = new C143606zB(e5.getMessage(), e5);
                        throw r2;
                    }
                } catch (C143406yp e6) {
                    try {
                        r2 = new C143606zB(e6.getMessage(), e6);
                        throw r2;
                    } catch (C143606zB e7) {
                        throw new CertPathValidatorException("Subtree check for certificate subject failed.", e7, certPath, i);
                    }
                }
            } catch (Exception e8) {
                throw new CertPathValidatorException("Exception extracting subject name when checking subtrees.", e8, certPath, i);
            }
        }
    }

    public static void A0J(HashSet hashSet, List list, C173628Qy r8) {
        C143596zA r4 = null;
        boolean z = false;
        for (Object next : list) {
            if (next instanceof C183658qP) {
                try {
                    hashSet.addAll(((C183658qP) next).B9N(r8));
                } catch (AnonymousClass8R9 e) {
                    r4 = C143596zA.A01("Exception searching in X.509 CRL store.", e);
                }
            } else {
                try {
                    hashSet.addAll(((CertStore) next).getCRLs(new C173978Sm(r8)));
                } catch (CertStoreException e2) {
                    r4 = C143596zA.A01("Exception searching in X.509 CRL store.", e2);
                }
            }
            z = true;
        }
        if (!z && r4 != null) {
            throw r4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        r0 = r13.A0B;
        r22 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x028f, code lost:
        if (r0 == false) goto L_0x03cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0291, code lost:
        r2 = r25.getCertStores();
        r4 = new java.security.cert.X509CRLSelector();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
        r4.addIssuerName(X.C160997on.A03(r9.getIssuerX500Principal()).A0L());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:?, code lost:
        r0 = X.C162357rn.A05(X.C162357rn.A01, r9);
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02b0, code lost:
        if (r0 == null) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02b2, code lost:
        r1 = new java.math.BigInteger(1, X.C176748dV.A0A(r0).A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02bf, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
        r21 = r9.getExtensionValue(X.C162357rn.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02c6, code lost:
        if (r1 == null) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        r5 = r1.add(java.math.BigInteger.valueOf(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02d2, code lost:
        r4.setMinCRLNumber(r5);
        r0 = new X.AnonymousClass7OC(r4);
        r0.A03 = X.C161007oo.A02(r21);
        r0.A02 = true;
        r0.A00 = r1;
        r7 = new X.C173628Qy(r0);
        r20 = A05(r14, r2, r24, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02f4, code lost:
        if (r20.isEmpty() == false) goto L_0x0366;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02fc, code lost:
        if (X.C159797mT.A01("org.spongycastle.x509.enableCRLDP") == false) goto L_0x0366;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
        r16 = java.security.cert.CertificateFactory.getInstance("X.509", ((X.C173558Qq) r36).A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
        r5 = X.C176418cy.A0A(r21).A0N();
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0314, code lost:
        if (r4 >= r5.length) goto L_0x0366;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0316, code lost:
        r1 = r5[r4].A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x031a, code lost:
        if (r1 == null) goto L_0x0352;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x031e, code lost:
        if (r1.A00 != 0) goto L_0x0352;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0320, code lost:
        r3 = X.C176518d8.A0A(r1.A01);
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0328, code lost:
        if (r2 >= r3.length) goto L_0x0352;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x032a, code lost:
        r1 = r3[r4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x032f, code lost:
        if (r1.A00 != 6) goto L_0x034f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
        r20 = A05(r14, java.util.Collections.EMPTY_LIST, java.util.Collections.singletonList(X.C161137p4.A01(new java.net.URI(((X.C183628qM) r1.A01).BDM()), r16, r14)), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0352, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0355, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:?, code lost:
        r0 = X.C143596zA.A01(X.AnonymousClass000.A0a("cannot create certificate factory: ", X.AnonymousClass001.A0o(), r2), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0366, code lost:
        r2 = X.AnonymousClass002.A0K();
        r4 = r20.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0372, code lost:
        if (r4.hasNext() == false) goto L_0x038c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0374, code lost:
        r1 = (java.security.cert.X509CRL) r4.next();
        r3 = r1.getCriticalExtensionOIDs();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x037e, code lost:
        if (r3 == null) goto L_0x036e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0386, code lost:
        if (r3.contains(A05) == false) goto L_0x036e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0388, code lost:
        r2.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x038c, code lost:
        r3 = r2.iterator();
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03a4, code lost:
        if (r1 != null) goto L_0x03a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03a6, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:?, code lost:
        r0 = X.C143596zA.A01("Cannot verify delta CRL.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03b0, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03b1, code lost:
        r0 = X.C143596zA.A01("Issuing distribution point extension value could not be read.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03b9, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03ba, code lost:
        r0 = X.C143596zA.A01("CRL number extension could not be extracted from CRL.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03c2, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03c3, code lost:
        r0 = X.C143596zA.A01("Cannot extract issuer from CRL.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03cb, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03cf, code lost:
        if (r13.A00 == 1) goto L_0x03ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x03e3, code lost:
        if (r17.getNotAfter().getTime() >= r9.getThisUpdate().getTime()) goto L_0x03ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x03e5, code lost:
        r0 = X.C143596zA.A00("No valid CRL for current time found.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x03ed, code lost:
        r0 = X.C162357rn.A05(r8, r9);
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x03f2, code lost:
        if (r0 == null) goto L_0x03fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x03f4, code lost:
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03fb, code lost:
        if (X.C176508d7.A0A(r0).A03 != false) goto L_0x03fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x03fd, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:?, code lost:
        r3 = X.C160997on.A03(r9.getIssuerX500Principal()).A0L();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x040a, code lost:
        if (r11 == null) goto L_0x0451;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:?, code lost:
        r0 = r11.A00;
        r2 = r0.length;
        r1 = new X.C176608dH[r2];
        java.lang.System.arraycopy(r0, 0, r1, 0, r2);
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0415, code lost:
        if (r4 >= r2) goto L_0x043d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x041c, code lost:
        if (r1[r4].A00 != 4) goto L_0x0431;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x042e, code lost:
        if (java.util.Arrays.equals(r1[r4].A01.Bqk().A0L(), r3) == false) goto L_0x0431;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0430, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0431, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0434, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:?, code lost:
        r0 = X.C143596zA.A01("CRL issuer information from distribution point cannot be decoded.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x043d, code lost:
        if (r6 == false) goto L_0x0449;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x043f, code lost:
        if (r15 != false) goto L_0x046b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0441, code lost:
        r0 = X.C143596zA.A00("Distribution point contains cRLIssuer field but CRL is not indirect.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0449, code lost:
        r0 = X.C143596zA.A00("CRL issuer of CRL does not match CRL issuer of distribution point.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0461, code lost:
        if (X.C160997on.A03(r9.getIssuerX500Principal()).equals(X.C160997on.A00(r17)) != false) goto L_0x046b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0463, code lost:
        r0 = X.C143596zA.A00("Cannot find matching CRL issuer for certificate.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:?, code lost:
        r6 = X.C176508d7.A0A(X.C162357rn.A05(r8, r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0473, code lost:
        if (r6 == null) goto L_0x05d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0477, code lost:
        if (r6.A01 == null) goto L_0x058a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0479, code lost:
        r5 = X.C176508d7.A0A(r6).A01;
        r4 = X.AnonymousClass001.A0s();
        r3 = r5.A00;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0486, code lost:
        if (r3 != 0) goto L_0x049a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0488, code lost:
        r1 = X.C176518d8.A0A(r5.A01);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0490, code lost:
        if (r0 >= r1.length) goto L_0x049a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0492, code lost:
        r4.add(r1[r0]);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x049b, code lost:
        if (r3 != 1) goto L_0x04dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x049d, code lost:
        r3 = new X.C161377pW();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:?, code lost:
        r15 = X.C176958dq.A0C(X.C160997on.A03(r9.getIssuerX500Principal())).A0V();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x04b6, code lost:
        if (r15.hasMoreElements() == false) goto L_0x04cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x04b8, code lost:
        r3.A03((X.C183618qL) r15.nextElement());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x04c2, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:?, code lost:
        r0 = X.C143596zA.A01("Could not read CRL issuer.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x04cb, code lost:
        r4.add(new X.C176608dH(X.C176618dI.A0B(X.C161377pW.A00(r5.A01, r3))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x04dd, code lost:
        r3 = r26.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x04e3, code lost:
        if (r3 == null) goto L_0x0565;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x04e5, code lost:
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x04e7, code lost:
        if (r0 != 0) goto L_0x04f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x04e9, code lost:
        r1 = X.C176518d8.A0A(r3.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x04f0, code lost:
        if (r0 != 1) goto L_0x055f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x04f2, code lost:
        if (r11 == null) goto L_0x04f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x04f5, code lost:
        r1 = new X.C176608dH[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:?, code lost:
        r1[0] = new X.C176608dH(X.C160997on.A00(r17));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:?, code lost:
        r5 = r11.A00;
        r0 = r5.length;
        r1 = new X.C176608dH[r0];
        java.lang.System.arraycopy(r5, 0, r1, 0, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x050c, code lost:
        if (r2 >= r1.length) goto L_0x0547;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x050e, code lost:
        r15 = X.C176958dq.A0C(r1[r2].A01.Bqk()).A0V();
        r5 = new X.C161377pW();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0527, code lost:
        if (r15.hasMoreElements() == false) goto L_0x0533;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0529, code lost:
        r5.A03((X.C183618qL) r15.nextElement());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0533, code lost:
        r1[r2] = new X.C176608dH(X.C176618dI.A0B(X.C161377pW.A00(r3.A01, r5)));
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0547, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0549, code lost:
        if (r2 >= r1.length) goto L_0x055f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0551, code lost:
        if (r4.contains(r1[r2]) != false) goto L_0x058a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0553, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0556, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0557, code lost:
        r0 = X.C143596zA.A01("Could not read certificate issuer.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x055f, code lost:
        r0 = X.C143596zA.A00("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0565, code lost:
        if (r11 == null) goto L_0x0582;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0567, code lost:
        r0 = r11.A00;
        r3 = r0.length;
        r1 = new X.C176608dH[r3];
        java.lang.System.arraycopy(r0, 0, r1, 0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x056f, code lost:
        if (r2 >= r3) goto L_0x057c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0577, code lost:
        if (r4.contains(r1[r2]) != false) goto L_0x058a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0579, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x057c, code lost:
        r0 = X.C143596zA.A00("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0582, code lost:
        r0 = X.C143596zA.A00("Either the cRLIssuer or the distributionPoint field must be contained in DistributionPoint.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:?, code lost:
        r1 = X.C176398cw.A0A(X.C162357rn.A05(A02, r17));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0596, code lost:
        if (r28 == null) goto L_0x05bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x059a, code lost:
        if (r6.A06 == false) goto L_0x05ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x059c, code lost:
        if (r1 == null) goto L_0x05ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x059e, code lost:
        r0 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x05a0, code lost:
        if (r0 == null) goto L_0x05ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x05a4, code lost:
        if (r0.A00 == 0) goto L_0x05ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x05a6, code lost:
        r0 = X.C143596zA.A00("CA Cert CRL only contains user certificates.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x05b0, code lost:
        if (r6.A05 == false) goto L_0x05bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x05b2, code lost:
        if (r1 == null) goto L_0x05c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x05b4, code lost:
        r0 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x05b6, code lost:
        if (r0 == null) goto L_0x05c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x05ba, code lost:
        if (r0.A00 == 0) goto L_0x05c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x05be, code lost:
        if (r6.A04 == false) goto L_0x05d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x05c0, code lost:
        r0 = X.C143596zA.A00("onlyContainsAttributeCerts boolean is asserted.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x05c8, code lost:
        r0 = X.C143596zA.A00("End CRL only contains CA certificates.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x05d0, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x05d1, code lost:
        r0 = X.C143596zA.A01("Basic constraints extension could not be decoded.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x05d9, code lost:
        if (r7 == null) goto L_0x067a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x05df, code lost:
        if (r7.hasUnsupportedCriticalExtension() != false) goto L_0x0667;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:?, code lost:
        r2 = X.C176508d7.A0A(X.C162357rn.A05(r8, r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x05e9, code lost:
        if (r22 == false) goto L_0x067a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x05ff, code lost:
        if (X.C160997on.A03(r7.getIssuerX500Principal()).equals(X.C160997on.A03(r9.getIssuerX500Principal())) == false) goto L_0x0656;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:?, code lost:
        r0 = X.C176508d7.A0A(X.C162357rn.A05(r8, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0609, code lost:
        if (r2 != null) goto L_0x060e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x060b, code lost:
        if (r0 != null) goto L_0x0645;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0612, code lost:
        if (r2.equals(r0) == false) goto L_0x0645;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:?, code lost:
        r0 = A01;
        r1 = X.C162357rn.A05(r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:?, code lost:
        r0 = X.C162357rn.A05(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x061e, code lost:
        if (r1 == null) goto L_0x062b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0620, code lost:
        if (r0 == null) goto L_0x0623;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:?, code lost:
        r0 = X.C143596zA.A00("Delta CRL authority key identifier is null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x062b, code lost:
        r0 = X.C143596zA.A00("CRL authority key identifier is null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0633, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0634, code lost:
        r0 = X.C143596zA.A01("Authority key identifier extension could not be extracted from delta CRL.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x063c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x063d, code lost:
        r0 = X.C143596zA.A01("Authority key identifier extension could not be extracted from complete CRL.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0645, code lost:
        r0 = X.C143596zA.A00("Issuing distribution point extension from delta CRL and complete CRL does not match.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x064d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x064e, code lost:
        r0 = X.C143596zA.A01("Issuing distribution point extension from delta CRL could not be decoded.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0656, code lost:
        r0 = X.C143596zA.A00("Complete CRL issuer does not match delta CRL issuer.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x065e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x065f, code lost:
        r0 = X.C143596zA.A01("Issuing distribution point extension could not be decoded.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0667, code lost:
        r0 = X.C143596zA.A00("delta CRL has unsupported critical extensions");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0673, code lost:
        if (r1.A0T(r0) == false) goto L_0x06ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0675, code lost:
        X.C162357rn.A07(r17, r7, r14, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x067e, code lost:
        if (r12.A00 != 11) goto L_0x0685;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0680, code lost:
        X.C162357rn.A07(r17, r9, r14, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0689, code lost:
        if (r12.A00 != 8) goto L_0x068f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x068b, code lost:
        r12.A00 = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x068f, code lost:
        r38.A00 = r10.A00 | r38.A00;
        r0 = r9.getCriticalExtensionOIDs();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x069e, code lost:
        if (r0 == null) goto L_0x06bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x06a0, code lost:
        r1 = X.AnonymousClass0x9.A15(r0);
        r1.remove(X.C176548dB.A0K.A01);
        r1.remove(X.C176548dB.A0C.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x06b6, code lost:
        if (r1.isEmpty() != false) goto L_0x06bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x06b8, code lost:
        r0 = X.C143596zA.A00("CRL contains unsupported critical extensions.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x06bf, code lost:
        if (r7 == null) goto L_0x06e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x06c1, code lost:
        r0 = r7.getCriticalExtensionOIDs();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x06c5, code lost:
        if (r0 == null) goto L_0x06e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x06c7, code lost:
        r1 = X.AnonymousClass0x9.A15(r0);
        r1.remove(X.C176548dB.A0K.A01);
        r1.remove(X.C176548dB.A0C.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x06dd, code lost:
        if (r1.isEmpty() != false) goto L_0x06e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x06df, code lost:
        r0 = X.C143596zA.A00("Delta CRL contains unsupported critical extension.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x06e6, code lost:
        r18 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x06ea, code lost:
        r0 = X.C143596zA.A00("Delta CRL authority key identifier does not match complete CRL authority key identifier.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x06f1, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x06f2, code lost:
        r0 = X.C143596zA.A01("Issuing distribution point extension could not be decoded.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x06f9, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x06fa, code lost:
        r0 = X.C143596zA.A01(X.AnonymousClass000.A0a("Exception encoding CRL issuer: ", X.AnonymousClass001.A0o(), r2), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0735, code lost:
        r23 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x00df A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x014e A[Catch:{ 6zA -> 0x0735 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0B(java.security.PublicKey r27, java.security.cert.X509Certificate r28, java.security.cert.X509Certificate r29, java.util.Date r30, java.util.Date r31, java.util.List r32, X.C176498d6 r33, X.C149967Op r34, X.AnonymousClass8N7 r35, X.C180128kX r36, X.C148417Ih r37, X.C161267pK r38) {
        /*
            r14 = r31
            long r3 = r14.getTime()
            long r1 = r30.getTime()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0752
            java.security.cert.X509CRLSelector r2 = new java.security.cert.X509CRLSelector
            r2.<init>()
            java.util.HashSet r1 = X.AnonymousClass002.A0K()     // Catch:{ 6zA -> 0x074a }
            r17 = r28
            X.8dI r0 = X.C160997on.A00(r17)     // Catch:{ 6zA -> 0x074a }
            r1.add(r0)     // Catch:{ 6zA -> 0x074a }
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()     // Catch:{ 6zA -> 0x074a }
            r26 = r33
            r0 = r26
            X.8d8 r11 = r0.A01     // Catch:{ 6zA -> 0x074a }
            if (r11 == 0) goto L_0x0056
            X.8dH[] r4 = r11.A00     // Catch:{ 6zA -> 0x074a }
            int r1 = r4.length     // Catch:{ 6zA -> 0x074a }
            X.8dH[] r5 = new X.C176608dH[r1]     // Catch:{ 6zA -> 0x074a }
            r0 = 0
            java.lang.System.arraycopy(r4, r0, r5, r0, r1)     // Catch:{ 6zA -> 0x074a }
            r4 = 0
        L_0x0036:
            int r0 = r5.length     // Catch:{ 6zA -> 0x074a }
            if (r4 >= r0) goto L_0x0068
            r0 = r5[r4]     // Catch:{ 6zA -> 0x074a }
            int r1 = r0.A00     // Catch:{ 6zA -> 0x074a }
            r0 = 4
            if (r1 != r0) goto L_0x0053
            r0 = r5[r4]     // Catch:{ IOException -> 0x0742 }
            X.8qL r0 = r0.A01     // Catch:{ IOException -> 0x0742 }
            X.8e3 r0 = r0.Bqk()     // Catch:{ IOException -> 0x0742 }
            byte[] r0 = r0.A0L()     // Catch:{ IOException -> 0x0742 }
            X.8dI r0 = X.C176618dI.A0B(r0)     // Catch:{ IOException -> 0x0742 }
            r3.add(r0)     // Catch:{ IOException -> 0x0742 }
        L_0x0053:
            int r4 = r4 + 1
            goto L_0x0036
        L_0x0056:
            X.8dF r0 = r0.A00     // Catch:{ 6zA -> 0x074a }
            if (r0 == 0) goto L_0x073b
            java.util.Iterator r1 = r1.iterator()     // Catch:{ 6zA -> 0x074a }
        L_0x005e:
            boolean r0 = r1.hasNext()     // Catch:{ 6zA -> 0x074a }
            if (r0 == 0) goto L_0x0068
            X.C18310x6.A1R(r3, r1)     // Catch:{ 6zA -> 0x074a }
            goto L_0x005e
        L_0x0068:
            java.util.Iterator r1 = r3.iterator()     // Catch:{ 6zA -> 0x074a }
        L_0x006c:
            boolean r0 = r1.hasNext()     // Catch:{ 6zA -> 0x074a }
            if (r0 == 0) goto L_0x0089
            java.lang.Object r0 = r1.next()     // Catch:{ IOException -> 0x0080 }
            X.8Q0 r0 = (X.AnonymousClass8Q0) r0     // Catch:{ IOException -> 0x0080 }
            byte[] r0 = r0.A0L()     // Catch:{ IOException -> 0x0080 }
            r2.addIssuerName(r0)     // Catch:{ IOException -> 0x0080 }
            goto L_0x006c
        L_0x0080:
            r1 = move-exception
            java.lang.String r0 = "Cannot decode CRL issuer information."
            X.6zA r0 = X.C143596zA.A01(r0, r1)     // Catch:{ 6zA -> 0x074a }
            goto L_0x0749
        L_0x0089:
            if (r28 == 0) goto L_0x0090
            r0 = r17
            r2.setCertificateChecking(r0)
        L_0x0090:
            X.7OC r1 = new X.7OC
            r1.<init>(r2)
            r0 = 1
            r1.A01 = r0
            X.8Qy r2 = new X.8Qy
            r2.<init>(r1)
            r13 = r35
            java.security.cert.PKIXParameters r0 = r13.A01
            r25 = r0
            java.util.List r1 = r25.getCertStores()
            java.util.List r0 = r13.A04
            r24 = r0
            java.util.Set r1 = A05(r14, r1, r0, r2)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00d7
            java.lang.String r3 = "\""
            java.lang.String r0 = "No CRLs found for issuer \""
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r0)
            X.7kk r1 = X.C177118e6.A0l
            X.8dI r0 = X.C160997on.A01(r17)
            java.lang.String r0 = r1.A01(r0)
            java.lang.String r3 = X.AnonymousClass000.A0V(r0, r3, r2)
            r0 = r34
            java.security.cert.CertPath r2 = r0.A02
            int r1 = r0.A00
            X.8Sc r0 = new X.8Sc
            r0.<init>(r3, r2, r1)
            throw r0
        L_0x00d7:
            java.util.Iterator r19 = r1.iterator()
            r23 = 0
            r18 = 0
        L_0x00df:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0738
            r12 = r37
            int r1 = r12.A00
            r0 = 11
            if (r1 != r0) goto L_0x0738
            r0 = r38
            int r1 = r0.A00
            X.7pK r10 = X.C161267pK.A01
            int r0 = r10.A00
            if (r1 == r0) goto L_0x0738
            java.lang.Object r9 = r19.next()     // Catch:{ 6zA -> 0x0735 }
            java.security.cert.X509CRL r9 = (java.security.cert.X509CRL) r9     // Catch:{ 6zA -> 0x0735 }
            java.lang.String r8 = A07     // Catch:{ Exception -> 0x0725 }
            X.8e3 r0 = X.C162357rn.A05(r8, r9)     // Catch:{ Exception -> 0x0725 }
            X.8d7 r1 = X.C176508d7.A0A(r0)     // Catch:{ Exception -> 0x0725 }
            if (r1 == 0) goto L_0x010a
            goto L_0x0119
        L_0x010a:
            r0 = r26
            X.8dz r2 = r0.A02     // Catch:{ 6zA -> 0x0735 }
            if (r2 == 0) goto L_0x0144
            X.7pK r0 = new X.7pK     // Catch:{ 6zA -> 0x0735 }
            r0.<init>((X.C177048dz) r2)     // Catch:{ 6zA -> 0x0735 }
            if (r1 != 0) goto L_0x0155
            r1 = r10
            goto L_0x012d
        L_0x0119:
            X.8dz r2 = r1.A02     // Catch:{ 6zA -> 0x0735 }
            if (r2 == 0) goto L_0x010a
            r0 = r26
            X.8dz r3 = r0.A02     // Catch:{ 6zA -> 0x0735 }
            if (r3 == 0) goto L_0x0154
            X.7pK r0 = new X.7pK     // Catch:{ 6zA -> 0x0735 }
            r0.<init>((X.C177048dz) r3)     // Catch:{ 6zA -> 0x0735 }
            X.7pK r1 = new X.7pK     // Catch:{ 6zA -> 0x0735 }
            r1.<init>((X.C177048dz) r2)     // Catch:{ 6zA -> 0x0735 }
        L_0x012d:
            r2 = 0
            X.7pK r10 = new X.7pK     // Catch:{ 6zA -> 0x0735 }
            r10.<init>((int) r2)     // Catch:{ 6zA -> 0x0735 }
            int r0 = r0.A00     // Catch:{ 6zA -> 0x0735 }
            int r1 = r1.A00     // Catch:{ 6zA -> 0x0735 }
            r1 = r1 & r0
            X.7pK r0 = new X.7pK     // Catch:{ 6zA -> 0x0735 }
            r0.<init>((int) r1)     // Catch:{ 6zA -> 0x0735 }
            int r1 = r10.A00     // Catch:{ 6zA -> 0x0735 }
            int r0 = r0.A00     // Catch:{ 6zA -> 0x0735 }
            r0 = r0 | r1
            r10.A00 = r0     // Catch:{ 6zA -> 0x0735 }
        L_0x0144:
            int r1 = r10.A00     // Catch:{ 6zA -> 0x0735 }
            r0 = r38
            int r0 = r0.A00     // Catch:{ 6zA -> 0x0735 }
            r0 = r0 ^ r1
            r0 = r0 | r1
            if (r0 == 0) goto L_0x00df
            java.security.cert.X509CertSelector r1 = new java.security.cert.X509CertSelector     // Catch:{ 6zA -> 0x0735 }
            r1.<init>()     // Catch:{ 6zA -> 0x0735 }
            goto L_0x015d
        L_0x0154:
            r0 = r10
        L_0x0155:
            X.8dz r2 = r1.A02     // Catch:{ 6zA -> 0x0735 }
            X.7pK r1 = new X.7pK     // Catch:{ 6zA -> 0x0735 }
            r1.<init>((X.C177048dz) r2)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x012d
        L_0x015d:
            if (r9 == 0) goto L_0x0718
            javax.security.auth.x500.X500Principal r0 = r9.getIssuerX500Principal()     // Catch:{ IOException -> 0x071d }
            X.8dI r0 = X.C160997on.A03(r0)     // Catch:{ IOException -> 0x071d }
            byte[] r0 = r0.A0L()     // Catch:{ IOException -> 0x071d }
            r1.setSubject(r0)     // Catch:{ IOException -> 0x071d }
            java.lang.Object r0 = r1.clone()     // Catch:{ 6zA -> 0x0735 }
            java.security.cert.CertSelector r0 = (java.security.cert.CertSelector) r0     // Catch:{ 6zA -> 0x0735 }
            X.8Qx r2 = new X.8Qx     // Catch:{ 6zA -> 0x0735 }
            r2.<init>(r0)     // Catch:{ 6zA -> 0x0735 }
            java.util.LinkedHashSet r1 = X.AnonymousClass0x9.A17()     // Catch:{ 6zA -> 0x0735 }
            java.util.List r0 = r13.A05     // Catch:{ 6zA -> 0x0710 }
            X.C162357rn.A09(r1, r0, r2)     // Catch:{ 6zA -> 0x0710 }
            java.util.List r0 = r25.getCertStores()     // Catch:{ 6zA -> 0x0710 }
            X.C162357rn.A09(r1, r0, r2)     // Catch:{ 6zA -> 0x0710 }
            r0 = r29
            r1.add(r0)     // Catch:{ 6zA -> 0x0735 }
            java.util.Iterator r16 = r1.iterator()     // Catch:{ 6zA -> 0x0735 }
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()     // Catch:{ 6zA -> 0x0735 }
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()     // Catch:{ 6zA -> 0x0735 }
        L_0x019a:
            boolean r0 = r16.hasNext()     // Catch:{ 6zA -> 0x0735 }
            r5 = 0
            if (r0 == 0) goto L_0x022b
            java.lang.Object r4 = r16.next()     // Catch:{ 6zA -> 0x0735 }
            java.security.cert.X509Certificate r4 = (java.security.cert.X509Certificate) r4     // Catch:{ 6zA -> 0x0735 }
            r0 = r29
            boolean r0 = r4.equals(r0)     // Catch:{ 6zA -> 0x0735 }
            if (r0 == 0) goto L_0x01b8
            r7.add(r4)     // Catch:{ 6zA -> 0x0735 }
            r0 = r27
            r6.add(r0)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x019a
        L_0x01b8:
            java.lang.Class r0 = A00     // Catch:{ CertPathBuilderException -> 0x0222, CertPathValidatorException -> 0x072d, Exception -> 0x0217 }
            r3 = 1
            if (r0 == 0) goto L_0x0211
            X.8Sb r2 = new X.8Sb     // Catch:{ CertPathBuilderException -> 0x0222, CertPathValidatorException -> 0x072d, Exception -> 0x0217 }
            r2.<init>(r3)     // Catch:{ CertPathBuilderException -> 0x0222, CertPathValidatorException -> 0x072d, Exception -> 0x0217 }
        L_0x01c2:
            java.security.cert.X509CertSelector r0 = new java.security.cert.X509CertSelector     // Catch:{ CertPathBuilderException -> 0x0222, CertPathValidatorException -> 0x072d, Exception -> 0x0217 }
            r0.<init>()     // Catch:{ CertPathBuilderException -> 0x0222, CertPathValidatorException -> 0x072d, Exception -> 0x0217 }
            r0.setCertificate(r4)     // Catch:{ CertPathBuilderException -> 0x0222, CertPathValidatorException -> 0x072d, Exception -> 0x0217 }
            X.7ha r1 = new X.7ha     // Catch:{ CertPathBuilderException -> 0x0222, CertPathValidatorException -> 0x072d, Exception -> 0x0217 }
            r1.<init>((X.AnonymousClass8N7) r13)     // Catch:{ CertPathBuilderException -> 0x0222, CertPathValidatorException -> 0x072d, Exception -> 0x0217 }
            java.lang.Object r0 = r0.clone()     // Catch:{ CertPathBuilderException -> 0x0222, CertPathValidatorException -> 0x072d, Exception -> 0x0217 }
            java.security.cert.CertSelector r0 = (java.security.cert.CertSelector) r0     // Catch:{ CertPathBuilderException -> 0x0222, CertPathValidatorException -> 0x072d, Exception -> 0x0217 }
            X.8Qx r15 = new X.8Qx     // Catch:{ CertPathBuilderException -> 0x0222, CertPathValidatorException -> 0x072d, Exception -> 0x0217 }
            r15.<init>(r0)     // Catch:{ CertPathBuilderException -> 0x0222, CertPathValidatorException -> 0x072d, Exception -> 0x0217 }
            r1.A06 = r15     // Catch:{ CertPathBuilderException -> 0x0222, CertPathValidatorException -> 0x072d, Exception -> 0x0217 }
            r0 = r32
            boolean r0 = r0.contains(r4)     // Catch:{ CertPathBuilderException -> 0x0222, CertPathValidatorException -> 0x072d, Exception -> 0x0217 }
            if (r0 == 0) goto L_0x020e
            r1.A07 = r5     // Catch:{ CertPathBuilderException -> 0x0222, CertPathValidatorException -> 0x072d, Exception -> 0x0217 }
        L_0x01e6:
            X.8N7 r0 = new X.8N7     // Catch:{ CertPathBuilderException -> 0x0222, CertPathValidatorException -> 0x072d, Exception -> 0x0217 }
            r0.<init>(r1)     // Catch:{ CertPathBuilderException -> 0x0222, CertPathValidatorException -> 0x072d, Exception -> 0x0217 }
            X.7gf r1 = new X.7gf     // Catch:{ CertPathBuilderException -> 0x0222, CertPathValidatorException -> 0x072d, Exception -> 0x0217 }
            r1.<init>((X.AnonymousClass8N7) r0)     // Catch:{ CertPathBuilderException -> 0x0222, CertPathValidatorException -> 0x072d, Exception -> 0x0217 }
            X.8N6 r0 = new X.8N6     // Catch:{ CertPathBuilderException -> 0x0222, CertPathValidatorException -> 0x072d, Exception -> 0x0217 }
            r0.<init>(r1)     // Catch:{ CertPathBuilderException -> 0x0222, CertPathValidatorException -> 0x072d, Exception -> 0x0217 }
            java.security.cert.CertPathBuilderResult r0 = r2.engineBuild(r0)     // Catch:{ CertPathBuilderException -> 0x0222, CertPathValidatorException -> 0x072d, Exception -> 0x0217 }
            java.security.cert.CertPath r0 = r0.getCertPath()     // Catch:{ CertPathBuilderException -> 0x0222, CertPathValidatorException -> 0x072d, Exception -> 0x0217 }
            java.util.List r0 = r0.getCertificates()     // Catch:{ CertPathBuilderException -> 0x0222, CertPathValidatorException -> 0x072d, Exception -> 0x0217 }
            r7.add(r4)     // Catch:{ CertPathBuilderException -> 0x0222, CertPathValidatorException -> 0x072d, Exception -> 0x0217 }
            r1 = r36
            java.security.PublicKey r0 = X.C162357rn.A00(r0, r1, r5)     // Catch:{ CertPathBuilderException -> 0x0222, CertPathValidatorException -> 0x072d, Exception -> 0x0217 }
            r6.add(r0)     // Catch:{ CertPathBuilderException -> 0x0222, CertPathValidatorException -> 0x072d, Exception -> 0x0217 }
            goto L_0x019a
        L_0x020e:
            r1.A07 = r3     // Catch:{ CertPathBuilderException -> 0x0222, CertPathValidatorException -> 0x072d, Exception -> 0x0217 }
            goto L_0x01e6
        L_0x0211:
            X.8Sa r2 = new X.8Sa     // Catch:{ CertPathBuilderException -> 0x0222, CertPathValidatorException -> 0x072d, Exception -> 0x0217 }
            r2.<init>(r3)     // Catch:{ CertPathBuilderException -> 0x0222, CertPathValidatorException -> 0x072d, Exception -> 0x0217 }
            goto L_0x01c2
        L_0x0217:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ 6zA -> 0x0735 }
            X.6zA r0 = X.C143596zA.A00(r0)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x0222:
            r1 = move-exception
            java.lang.String r0 = "CertPath for CRL signer failed to validate."
            X.6zA r0 = X.C143596zA.A01(r0, r1)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x022b:
            java.util.HashSet r3 = X.AnonymousClass002.A0K()     // Catch:{ 6zA -> 0x0735 }
            r4 = 0
        L_0x0230:
            int r0 = r7.size()     // Catch:{ 6zA -> 0x0735 }
            if (r5 >= r0) goto L_0x025b
            java.lang.Object r0 = r7.get(r5)     // Catch:{ 6zA -> 0x0735 }
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0     // Catch:{ 6zA -> 0x0735 }
            boolean[] r2 = r0.getKeyUsage()     // Catch:{ 6zA -> 0x0735 }
            if (r2 == 0) goto L_0x0251
            int r1 = r2.length     // Catch:{ 6zA -> 0x0735 }
            r0 = 6
            if (r1 <= r0) goto L_0x024a
            boolean r0 = r2[r0]     // Catch:{ 6zA -> 0x0735 }
            if (r0 != 0) goto L_0x0251
        L_0x024a:
            java.lang.String r0 = "Issuer certificate key usage extension does not permit CRL signing."
            X.6zA r4 = X.C143596zA.A00(r0)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0258
        L_0x0251:
            java.lang.Object r0 = r6.get(r5)     // Catch:{ 6zA -> 0x0735 }
            r3.add(r0)     // Catch:{ 6zA -> 0x0735 }
        L_0x0258:
            int r5 = r5 + 1
            goto L_0x0230
        L_0x025b:
            boolean r0 = r3.isEmpty()     // Catch:{ 6zA -> 0x0735 }
            if (r0 == 0) goto L_0x026b
            if (r4 != 0) goto L_0x026b
            java.lang.String r0 = "Cannot find a valid issuer certificate."
            X.6zA r0 = X.C143596zA.A00(r0)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x026b:
            boolean r0 = r3.isEmpty()     // Catch:{ 6zA -> 0x0735 }
            if (r0 == 0) goto L_0x0274
            if (r4 == 0) goto L_0x0274
            throw r4     // Catch:{ 6zA -> 0x0735 }
        L_0x0274:
            java.util.Iterator r2 = r3.iterator()     // Catch:{ 6zA -> 0x0735 }
            r1 = 0
        L_0x0279:
            boolean r0 = r2.hasNext()     // Catch:{ 6zA -> 0x0735 }
            if (r0 == 0) goto L_0x0709
            java.lang.Object r6 = r2.next()     // Catch:{ 6zA -> 0x0735 }
            java.security.PublicKey r6 = (java.security.PublicKey) r6     // Catch:{ 6zA -> 0x0735 }
            r9.verify(r6)     // Catch:{ Exception -> 0x0289 }
            goto L_0x028b
        L_0x0289:
            r1 = move-exception
            goto L_0x0279
        L_0x028b:
            boolean r0 = r13.A0B     // Catch:{ 6zA -> 0x0735 }
            r22 = r0
            if (r0 == 0) goto L_0x03cb
            java.util.List r2 = r25.getCertStores()     // Catch:{ 6zA -> 0x0735 }
            java.security.cert.X509CRLSelector r4 = new java.security.cert.X509CRLSelector     // Catch:{ 6zA -> 0x0735 }
            r4.<init>()     // Catch:{ 6zA -> 0x0735 }
            javax.security.auth.x500.X500Principal r0 = r9.getIssuerX500Principal()     // Catch:{ IOException -> 0x03c2 }
            X.8dI r0 = X.C160997on.A03(r0)     // Catch:{ IOException -> 0x03c2 }
            byte[] r0 = r0.A0L()     // Catch:{ IOException -> 0x03c2 }
            r4.addIssuerName(r0)     // Catch:{ IOException -> 0x03c2 }
            java.lang.String r0 = X.C162357rn.A01     // Catch:{ Exception -> 0x03b9 }
            X.8e3 r0 = X.C162357rn.A05(r0, r9)     // Catch:{ Exception -> 0x03b9 }
            r5 = 0
            if (r0 == 0) goto L_0x02bf
            X.8dV r0 = X.C176748dV.A0A(r0)     // Catch:{ Exception -> 0x03b9 }
            r3 = 1
            byte[] r0 = r0.A01     // Catch:{ Exception -> 0x03b9 }
            java.math.BigInteger r1 = new java.math.BigInteger     // Catch:{ Exception -> 0x03b9 }
            r1.<init>(r3, r0)     // Catch:{ Exception -> 0x03b9 }
            goto L_0x02c0
        L_0x02bf:
            r1 = r5
        L_0x02c0:
            java.lang.String r0 = X.C162357rn.A02     // Catch:{ Exception -> 0x03b0 }
            byte[] r21 = r9.getExtensionValue(r0)     // Catch:{ Exception -> 0x03b0 }
            if (r1 == 0) goto L_0x02d2
            r15 = 1
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r15)     // Catch:{ 6zA -> 0x0735 }
            java.math.BigInteger r5 = r1.add(r0)     // Catch:{ 6zA -> 0x0735 }
        L_0x02d2:
            r4.setMinCRLNumber(r5)     // Catch:{ 6zA -> 0x0735 }
            X.7OC r0 = new X.7OC     // Catch:{ 6zA -> 0x0735 }
            r0.<init>(r4)     // Catch:{ 6zA -> 0x0735 }
            byte[] r3 = X.C161007oo.A02(r21)     // Catch:{ 6zA -> 0x0735 }
            r0.A03 = r3     // Catch:{ 6zA -> 0x0735 }
            r3 = 1
            r0.A02 = r3     // Catch:{ 6zA -> 0x0735 }
            r0.A00 = r1     // Catch:{ 6zA -> 0x0735 }
            X.8Qy r7 = new X.8Qy     // Catch:{ 6zA -> 0x0735 }
            r7.<init>(r0)     // Catch:{ 6zA -> 0x0735 }
            r0 = r24
            java.util.Set r20 = A05(r14, r2, r0, r7)     // Catch:{ 6zA -> 0x0735 }
            boolean r0 = r20.isEmpty()     // Catch:{ 6zA -> 0x0735 }
            if (r0 == 0) goto L_0x0366
            java.lang.String r0 = "org.spongycastle.x509.enableCRLDP"
            boolean r0 = X.C159797mT.A01(r0)     // Catch:{ 6zA -> 0x0735 }
            if (r0 == 0) goto L_0x0366
            java.lang.String r1 = "X.509"
            r0 = r36
            X.8Qq r0 = (X.C173558Qq) r0     // Catch:{ Exception -> 0x0355 }
            java.security.Provider r0 = r0.A00     // Catch:{ Exception -> 0x0355 }
            java.security.cert.CertificateFactory r16 = java.security.cert.CertificateFactory.getInstance(r1, r0)     // Catch:{ Exception -> 0x0355 }
            X.8cy r0 = X.C176418cy.A0A(r21)     // Catch:{ 6zA -> 0x0735 }
            X.8d6[] r5 = r0.A0N()     // Catch:{ 6zA -> 0x0735 }
            r4 = 0
        L_0x0313:
            int r0 = r5.length     // Catch:{ 6zA -> 0x0735 }
            if (r4 >= r0) goto L_0x0366
            r0 = r5[r4]     // Catch:{ 6zA -> 0x0735 }
            X.8dF r1 = r0.A00     // Catch:{ 6zA -> 0x0735 }
            if (r1 == 0) goto L_0x0352
            int r0 = r1.A00     // Catch:{ 6zA -> 0x0735 }
            if (r0 != 0) goto L_0x0352
            X.8qL r0 = r1.A01     // Catch:{ 6zA -> 0x0735 }
            X.8dH[] r3 = X.C176518d8.A0A(r0)     // Catch:{ 6zA -> 0x0735 }
            r2 = 0
        L_0x0327:
            int r0 = r3.length     // Catch:{ 6zA -> 0x0735 }
            if (r2 >= r0) goto L_0x0352
            r1 = r3[r4]     // Catch:{ 6zA -> 0x0735 }
            int r15 = r1.A00     // Catch:{ 6zA -> 0x0735 }
            r0 = 6
            if (r15 != r0) goto L_0x034f
            X.8qL r0 = r1.A01     // Catch:{ Exception -> 0x034f }
            X.8qM r0 = (X.C183628qM) r0     // Catch:{ Exception -> 0x034f }
            java.lang.String r0 = r0.BDM()     // Catch:{ Exception -> 0x034f }
            java.net.URI r1 = new java.net.URI     // Catch:{ Exception -> 0x034f }
            r1.<init>(r0)     // Catch:{ Exception -> 0x034f }
            r0 = r16
            X.8Qz r0 = X.C161137p4.A01(r1, r0, r14)     // Catch:{ Exception -> 0x034f }
            java.util.List r1 = java.util.Collections.EMPTY_LIST     // Catch:{ Exception -> 0x034f }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ Exception -> 0x034f }
            java.util.Set r20 = A05(r14, r1, r0, r7)     // Catch:{ Exception -> 0x034f }
            goto L_0x0352
        L_0x034f:
            int r2 = r2 + 1
            goto L_0x0327
        L_0x0352:
            int r4 = r4 + 1
            goto L_0x0313
        L_0x0355:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 6zA -> 0x0735 }
            java.lang.String r0 = "cannot create certificate factory: "
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r2)     // Catch:{ 6zA -> 0x0735 }
            X.6zA r0 = X.C143596zA.A01(r0, r2)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x0366:
            java.util.HashSet r2 = X.AnonymousClass002.A0K()     // Catch:{ 6zA -> 0x0735 }
            java.util.Iterator r4 = r20.iterator()     // Catch:{ 6zA -> 0x0735 }
        L_0x036e:
            boolean r0 = r4.hasNext()     // Catch:{ 6zA -> 0x0735 }
            if (r0 == 0) goto L_0x038c
            java.lang.Object r1 = r4.next()     // Catch:{ 6zA -> 0x0735 }
            java.security.cert.X509CRL r1 = (java.security.cert.X509CRL) r1     // Catch:{ 6zA -> 0x0735 }
            java.util.Set r3 = r1.getCriticalExtensionOIDs()     // Catch:{ 6zA -> 0x0735 }
            if (r3 == 0) goto L_0x036e
            java.lang.String r0 = A05     // Catch:{ 6zA -> 0x0735 }
            boolean r0 = r3.contains(r0)     // Catch:{ 6zA -> 0x0735 }
            if (r0 == 0) goto L_0x036e
            r2.add(r1)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x036e
        L_0x038c:
            java.util.Iterator r3 = r2.iterator()     // Catch:{ 6zA -> 0x0735 }
            r2 = 0
            r1 = r2
        L_0x0392:
            boolean r0 = r3.hasNext()     // Catch:{ 6zA -> 0x0735 }
            if (r0 == 0) goto L_0x03a4
            java.lang.Object r7 = r3.next()     // Catch:{ 6zA -> 0x0735 }
            java.security.cert.X509CRL r7 = (java.security.cert.X509CRL) r7     // Catch:{ 6zA -> 0x0735 }
            r7.verify(r6)     // Catch:{ Exception -> 0x03a2 }
            goto L_0x03cc
        L_0x03a2:
            r1 = move-exception
            goto L_0x0392
        L_0x03a4:
            if (r1 != 0) goto L_0x03a8
            r7 = r2
            goto L_0x03cc
        L_0x03a8:
            java.lang.String r0 = "Cannot verify delta CRL."
            X.6zA r0 = X.C143596zA.A01(r0, r1)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x03b0:
            r1 = move-exception
            java.lang.String r0 = "Issuing distribution point extension value could not be read."
            X.6zA r0 = X.C143596zA.A01(r0, r1)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x03b9:
            r1 = move-exception
            java.lang.String r0 = "CRL number extension could not be extracted from CRL."
            X.6zA r0 = X.C143596zA.A01(r0, r1)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x03c2:
            r1 = move-exception
            java.lang.String r0 = "Cannot extract issuer from CRL."
            X.6zA r0 = X.C143596zA.A01(r0, r1)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x03cb:
            r7 = 0
        L_0x03cc:
            int r1 = r13.A00     // Catch:{ 6zA -> 0x0735 }
            r0 = 1
            if (r1 == r0) goto L_0x03ed
            java.util.Date r0 = r17.getNotAfter()     // Catch:{ 6zA -> 0x0735 }
            long r3 = r0.getTime()     // Catch:{ 6zA -> 0x0735 }
            java.util.Date r0 = r9.getThisUpdate()     // Catch:{ 6zA -> 0x0735 }
            long r1 = r0.getTime()     // Catch:{ 6zA -> 0x0735 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x03ed
            java.lang.String r0 = "No valid CRL for current time found."
            X.6zA r0 = X.C143596zA.A00(r0)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x03ed:
            X.8e3 r0 = X.C162357rn.A05(r8, r9)     // Catch:{ 6zA -> 0x0735 }
            r4 = 0
            if (r0 == 0) goto L_0x03fd
            X.8d7 r0 = X.C176508d7.A0A(r0)     // Catch:{ 6zA -> 0x0735 }
            boolean r0 = r0.A03     // Catch:{ 6zA -> 0x0735 }
            r15 = 1
            if (r0 != 0) goto L_0x03fe
        L_0x03fd:
            r15 = 0
        L_0x03fe:
            javax.security.auth.x500.X500Principal r0 = r9.getIssuerX500Principal()     // Catch:{ IOException -> 0x06f9 }
            X.8dI r0 = X.C160997on.A03(r0)     // Catch:{ IOException -> 0x06f9 }
            byte[] r3 = r0.A0L()     // Catch:{ IOException -> 0x06f9 }
            if (r11 == 0) goto L_0x0451
            X.8dH[] r0 = r11.A00     // Catch:{ 6zA -> 0x0735 }
            int r2 = r0.length     // Catch:{ 6zA -> 0x0735 }
            X.8dH[] r1 = new X.C176608dH[r2]     // Catch:{ 6zA -> 0x0735 }
            java.lang.System.arraycopy(r0, r4, r1, r4, r2)     // Catch:{ 6zA -> 0x0735 }
            r6 = 0
        L_0x0415:
            if (r4 >= r2) goto L_0x043d
            r0 = r1[r4]     // Catch:{ 6zA -> 0x0735 }
            int r5 = r0.A00     // Catch:{ 6zA -> 0x0735 }
            r0 = 4
            if (r5 != r0) goto L_0x0431
            r0 = r1[r4]     // Catch:{ IOException -> 0x0434 }
            X.8qL r0 = r0.A01     // Catch:{ IOException -> 0x0434 }
            X.8e3 r0 = r0.Bqk()     // Catch:{ IOException -> 0x0434 }
            byte[] r0 = r0.A0L()     // Catch:{ IOException -> 0x0434 }
            boolean r0 = java.util.Arrays.equals(r0, r3)     // Catch:{ IOException -> 0x0434 }
            if (r0 == 0) goto L_0x0431
            r6 = 1
        L_0x0431:
            int r4 = r4 + 1
            goto L_0x0415
        L_0x0434:
            r1 = move-exception
            java.lang.String r0 = "CRL issuer information from distribution point cannot be decoded."
            X.6zA r0 = X.C143596zA.A01(r0, r1)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x043d:
            if (r6 == 0) goto L_0x0449
            if (r15 != 0) goto L_0x046b
            java.lang.String r0 = "Distribution point contains cRLIssuer field but CRL is not indirect."
            X.6zA r0 = X.C143596zA.A00(r0)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x0449:
            java.lang.String r0 = "CRL issuer of CRL does not match CRL issuer of distribution point."
            X.6zA r0 = X.C143596zA.A00(r0)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x0451:
            javax.security.auth.x500.X500Principal r0 = r9.getIssuerX500Principal()     // Catch:{ 6zA -> 0x0735 }
            X.8dI r1 = X.C160997on.A03(r0)     // Catch:{ 6zA -> 0x0735 }
            X.8dI r0 = X.C160997on.A00(r17)     // Catch:{ 6zA -> 0x0735 }
            boolean r0 = r1.equals(r0)     // Catch:{ 6zA -> 0x0735 }
            if (r0 != 0) goto L_0x046b
            java.lang.String r0 = "Cannot find matching CRL issuer for certificate."
            X.6zA r0 = X.C143596zA.A00(r0)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x046b:
            X.8e3 r0 = X.C162357rn.A05(r8, r9)     // Catch:{ Exception -> 0x06f1 }
            X.8d7 r6 = X.C176508d7.A0A(r0)     // Catch:{ Exception -> 0x06f1 }
            if (r6 == 0) goto L_0x05d9
            X.8dF r0 = r6.A01     // Catch:{ 6zA -> 0x0735 }
            if (r0 == 0) goto L_0x058a
            X.8d7 r0 = X.C176508d7.A0A(r6)     // Catch:{ 6zA -> 0x0735 }
            X.8dF r5 = r0.A01     // Catch:{ 6zA -> 0x0735 }
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()     // Catch:{ 6zA -> 0x0735 }
            int r3 = r5.A00     // Catch:{ 6zA -> 0x0735 }
            r2 = 0
            if (r3 != 0) goto L_0x049a
            X.8qL r0 = r5.A01     // Catch:{ 6zA -> 0x0735 }
            X.8dH[] r1 = X.C176518d8.A0A(r0)     // Catch:{ 6zA -> 0x0735 }
            r0 = 0
        L_0x048f:
            int r15 = r1.length     // Catch:{ 6zA -> 0x0735 }
            if (r0 >= r15) goto L_0x049a
            r15 = r1[r0]     // Catch:{ 6zA -> 0x0735 }
            r4.add(r15)     // Catch:{ 6zA -> 0x0735 }
            int r0 = r0 + 1
            goto L_0x048f
        L_0x049a:
            r1 = 1
            if (r3 != r1) goto L_0x04dd
            X.7pW r3 = new X.7pW     // Catch:{ 6zA -> 0x0735 }
            r3.<init>()     // Catch:{ 6zA -> 0x0735 }
            javax.security.auth.x500.X500Principal r0 = r9.getIssuerX500Principal()     // Catch:{ Exception -> 0x04c2 }
            X.8dI r0 = X.C160997on.A03(r0)     // Catch:{ Exception -> 0x04c2 }
            X.8dq r0 = X.C176958dq.A0C(r0)     // Catch:{ Exception -> 0x04c2 }
            java.util.Enumeration r15 = r0.A0V()     // Catch:{ Exception -> 0x04c2 }
        L_0x04b2:
            boolean r0 = r15.hasMoreElements()     // Catch:{ Exception -> 0x04c2 }
            if (r0 == 0) goto L_0x04cb
            java.lang.Object r0 = r15.nextElement()     // Catch:{ Exception -> 0x04c2 }
            X.8qL r0 = (X.C183618qL) r0     // Catch:{ Exception -> 0x04c2 }
            r3.A03(r0)     // Catch:{ Exception -> 0x04c2 }
            goto L_0x04b2
        L_0x04c2:
            r1 = move-exception
            java.lang.String r0 = "Could not read CRL issuer."
            X.6zA r0 = X.C143596zA.A01(r0, r1)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x04cb:
            X.8qL r0 = r5.A01     // Catch:{ 6zA -> 0x0735 }
            X.8dp r0 = X.C161377pW.A00(r0, r3)     // Catch:{ 6zA -> 0x0735 }
            X.8dI r3 = X.C176618dI.A0B(r0)     // Catch:{ 6zA -> 0x0735 }
            X.8dH r0 = new X.8dH     // Catch:{ 6zA -> 0x0735 }
            r0.<init>((X.C176618dI) r3)     // Catch:{ 6zA -> 0x0735 }
            r4.add(r0)     // Catch:{ 6zA -> 0x0735 }
        L_0x04dd:
            r0 = r26
            X.8dF r3 = r0.A00     // Catch:{ 6zA -> 0x0735 }
            java.lang.String r16 = "No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point."
            if (r3 == 0) goto L_0x0565
            int r0 = r3.A00     // Catch:{ 6zA -> 0x0735 }
            if (r0 != 0) goto L_0x04f0
            X.8qL r0 = r3.A01     // Catch:{ 6zA -> 0x0735 }
            X.8dH[] r1 = X.C176518d8.A0A(r0)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0547
        L_0x04f0:
            if (r0 != r1) goto L_0x055f
            if (r11 == 0) goto L_0x04f5
            goto L_0x0503
        L_0x04f5:
            X.8dH[] r1 = new X.C176608dH[r1]     // Catch:{ 6zA -> 0x0735 }
            X.8dI r5 = X.C160997on.A00(r17)     // Catch:{ Exception -> 0x0556 }
            X.8dH r0 = new X.8dH     // Catch:{ Exception -> 0x0556 }
            r0.<init>((X.C176618dI) r5)     // Catch:{ Exception -> 0x0556 }
            r1[r2] = r0     // Catch:{ Exception -> 0x0556 }
            goto L_0x050b
        L_0x0503:
            X.8dH[] r5 = r11.A00     // Catch:{ 6zA -> 0x0735 }
            int r0 = r5.length     // Catch:{ 6zA -> 0x0735 }
            X.8dH[] r1 = new X.C176608dH[r0]     // Catch:{ 6zA -> 0x0735 }
            java.lang.System.arraycopy(r5, r2, r1, r2, r0)     // Catch:{ 6zA -> 0x0735 }
        L_0x050b:
            int r0 = r1.length     // Catch:{ 6zA -> 0x0735 }
            if (r2 >= r0) goto L_0x0547
            r0 = r1[r2]     // Catch:{ 6zA -> 0x0735 }
            X.8qL r0 = r0.A01     // Catch:{ 6zA -> 0x0735 }
            X.8e3 r0 = r0.Bqk()     // Catch:{ 6zA -> 0x0735 }
            X.8dq r0 = X.C176958dq.A0C(r0)     // Catch:{ 6zA -> 0x0735 }
            java.util.Enumeration r15 = r0.A0V()     // Catch:{ 6zA -> 0x0735 }
            X.7pW r5 = new X.7pW     // Catch:{ 6zA -> 0x0735 }
            r5.<init>()     // Catch:{ 6zA -> 0x0735 }
        L_0x0523:
            boolean r0 = r15.hasMoreElements()     // Catch:{ 6zA -> 0x0735 }
            if (r0 == 0) goto L_0x0533
            java.lang.Object r0 = r15.nextElement()     // Catch:{ 6zA -> 0x0735 }
            X.8qL r0 = (X.C183618qL) r0     // Catch:{ 6zA -> 0x0735 }
            r5.A03(r0)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0523
        L_0x0533:
            X.8qL r0 = r3.A01     // Catch:{ 6zA -> 0x0735 }
            X.8dp r0 = X.C161377pW.A00(r0, r5)     // Catch:{ 6zA -> 0x0735 }
            X.8dI r5 = X.C176618dI.A0B(r0)     // Catch:{ 6zA -> 0x0735 }
            X.8dH r0 = new X.8dH     // Catch:{ 6zA -> 0x0735 }
            r0.<init>((X.C176618dI) r5)     // Catch:{ 6zA -> 0x0735 }
            r1[r2] = r0     // Catch:{ 6zA -> 0x0735 }
            int r2 = r2 + 1
            goto L_0x050b
        L_0x0547:
            r2 = 0
        L_0x0548:
            int r0 = r1.length     // Catch:{ 6zA -> 0x0735 }
            if (r2 >= r0) goto L_0x055f
            r0 = r1[r2]     // Catch:{ 6zA -> 0x0735 }
            boolean r0 = r4.contains(r0)     // Catch:{ 6zA -> 0x0735 }
            if (r0 != 0) goto L_0x058a
            int r2 = r2 + 1
            goto L_0x0548
        L_0x0556:
            r1 = move-exception
            java.lang.String r0 = "Could not read certificate issuer."
            X.6zA r0 = X.C143596zA.A01(r0, r1)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x055f:
            X.6zA r0 = X.C143596zA.A00(r16)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x0565:
            if (r11 == 0) goto L_0x0582
            X.8dH[] r0 = r11.A00     // Catch:{ 6zA -> 0x0735 }
            int r3 = r0.length     // Catch:{ 6zA -> 0x0735 }
            X.8dH[] r1 = new X.C176608dH[r3]     // Catch:{ 6zA -> 0x0735 }
            java.lang.System.arraycopy(r0, r2, r1, r2, r3)     // Catch:{ 6zA -> 0x0735 }
        L_0x056f:
            if (r2 >= r3) goto L_0x057c
            r0 = r1[r2]     // Catch:{ 6zA -> 0x0735 }
            boolean r0 = r4.contains(r0)     // Catch:{ 6zA -> 0x0735 }
            if (r0 != 0) goto L_0x058a
            int r2 = r2 + 1
            goto L_0x056f
        L_0x057c:
            X.6zA r0 = X.C143596zA.A00(r16)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x0582:
            java.lang.String r0 = "Either the cRLIssuer or the distributionPoint field must be contained in DistributionPoint."
            X.6zA r0 = X.C143596zA.A00(r0)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x058a:
            java.lang.String r1 = A02     // Catch:{ Exception -> 0x05d0 }
            r0 = r17
            X.8e3 r0 = X.C162357rn.A05(r1, r0)     // Catch:{ Exception -> 0x05d0 }
            X.8cw r1 = X.C176398cw.A0A(r0)     // Catch:{ Exception -> 0x05d0 }
            if (r28 == 0) goto L_0x05bc
            boolean r0 = r6.A06     // Catch:{ 6zA -> 0x0735 }
            if (r0 == 0) goto L_0x05ae
            if (r1 == 0) goto L_0x05ae
            X.8dU r0 = r1.A00     // Catch:{ 6zA -> 0x0735 }
            if (r0 == 0) goto L_0x05ae
            byte r0 = r0.A00     // Catch:{ 6zA -> 0x0735 }
            if (r0 == 0) goto L_0x05ae
            java.lang.String r0 = "CA Cert CRL only contains user certificates."
            X.6zA r0 = X.C143596zA.A00(r0)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x05ae:
            boolean r0 = r6.A05     // Catch:{ 6zA -> 0x0735 }
            if (r0 == 0) goto L_0x05bc
            if (r1 == 0) goto L_0x05c8
            X.8dU r0 = r1.A00     // Catch:{ 6zA -> 0x0735 }
            if (r0 == 0) goto L_0x05c8
            byte r0 = r0.A00     // Catch:{ 6zA -> 0x0735 }
            if (r0 == 0) goto L_0x05c8
        L_0x05bc:
            boolean r0 = r6.A04     // Catch:{ 6zA -> 0x0735 }
            if (r0 == 0) goto L_0x05d9
            java.lang.String r0 = "onlyContainsAttributeCerts boolean is asserted."
            X.6zA r0 = X.C143596zA.A00(r0)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x05c8:
            java.lang.String r0 = "End CRL only contains CA certificates."
            X.6zA r0 = X.C143596zA.A00(r0)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x05d0:
            r1 = move-exception
            java.lang.String r0 = "Basic constraints extension could not be decoded."
            X.6zA r0 = X.C143596zA.A01(r0, r1)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x05d9:
            if (r7 == 0) goto L_0x067a
            boolean r0 = r7.hasUnsupportedCriticalExtension()     // Catch:{ 6zA -> 0x0735 }
            if (r0 != 0) goto L_0x0667
            X.8e3 r0 = X.C162357rn.A05(r8, r9)     // Catch:{ Exception -> 0x065e }
            X.8d7 r2 = X.C176508d7.A0A(r0)     // Catch:{ Exception -> 0x065e }
            if (r22 == 0) goto L_0x067a
            javax.security.auth.x500.X500Principal r0 = r7.getIssuerX500Principal()     // Catch:{ 6zA -> 0x0735 }
            X.8dI r1 = X.C160997on.A03(r0)     // Catch:{ 6zA -> 0x0735 }
            javax.security.auth.x500.X500Principal r0 = r9.getIssuerX500Principal()     // Catch:{ 6zA -> 0x0735 }
            X.8dI r0 = X.C160997on.A03(r0)     // Catch:{ 6zA -> 0x0735 }
            boolean r0 = r1.equals(r0)     // Catch:{ 6zA -> 0x0735 }
            if (r0 == 0) goto L_0x0656
            X.8e3 r0 = X.C162357rn.A05(r8, r7)     // Catch:{ Exception -> 0x064d }
            X.8d7 r0 = X.C176508d7.A0A(r0)     // Catch:{ Exception -> 0x064d }
            if (r2 != 0) goto L_0x060e
            if (r0 != 0) goto L_0x0645
            goto L_0x0614
        L_0x060e:
            boolean r0 = r2.equals(r0)     // Catch:{ 6zA -> 0x0735 }
            if (r0 == 0) goto L_0x0645
        L_0x0614:
            java.lang.String r0 = A01     // Catch:{ 6zA -> 0x063c }
            X.8e3 r1 = X.C162357rn.A05(r0, r9)     // Catch:{ 6zA -> 0x063c }
            X.8e3 r0 = X.C162357rn.A05(r0, r7)     // Catch:{ 6zA -> 0x0633 }
            if (r1 == 0) goto L_0x062b
            if (r0 == 0) goto L_0x0623
            goto L_0x066f
        L_0x0623:
            java.lang.String r0 = "Delta CRL authority key identifier is null."
            X.6zA r0 = X.C143596zA.A00(r0)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x062b:
            java.lang.String r0 = "CRL authority key identifier is null."
            X.6zA r0 = X.C143596zA.A00(r0)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x0633:
            r1 = move-exception
            java.lang.String r0 = "Authority key identifier extension could not be extracted from delta CRL."
            X.6zA r0 = X.C143596zA.A01(r0, r1)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x063c:
            r1 = move-exception
            java.lang.String r0 = "Authority key identifier extension could not be extracted from complete CRL."
            X.6zA r0 = X.C143596zA.A01(r0, r1)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x0645:
            java.lang.String r0 = "Issuing distribution point extension from delta CRL and complete CRL does not match."
            X.6zA r0 = X.C143596zA.A00(r0)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x064d:
            r1 = move-exception
            java.lang.String r0 = "Issuing distribution point extension from delta CRL could not be decoded."
            X.6zA r0 = X.C143596zA.A01(r0, r1)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x0656:
            java.lang.String r0 = "Complete CRL issuer does not match delta CRL issuer."
            X.6zA r0 = X.C143596zA.A00(r0)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x065e:
            r1 = move-exception
            java.lang.String r0 = "Issuing distribution point extension could not be decoded."
            X.6zA r0 = X.C143596zA.A01(r0, r1)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x0667:
            java.lang.String r0 = "delta CRL has unsupported critical extensions"
            X.6zA r0 = X.C143596zA.A00(r0)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x066f:
            boolean r0 = r1.A0T(r0)     // Catch:{ 6zA -> 0x0735 }
            if (r0 == 0) goto L_0x06ea
            r0 = r17
            X.C162357rn.A07(r0, r7, r14, r12)     // Catch:{ 6zA -> 0x0735 }
        L_0x067a:
            int r1 = r12.A00     // Catch:{ 6zA -> 0x0735 }
            r0 = 11
            if (r1 != r0) goto L_0x0685
            r0 = r17
            X.C162357rn.A07(r0, r9, r14, r12)     // Catch:{ 6zA -> 0x0735 }
        L_0x0685:
            int r1 = r12.A00     // Catch:{ 6zA -> 0x0735 }
            r0 = 8
            if (r1 != r0) goto L_0x068f
            r0 = 11
            r12.A00 = r0     // Catch:{ 6zA -> 0x0735 }
        L_0x068f:
            r0 = r38
            int r0 = r0.A00     // Catch:{ 6zA -> 0x0735 }
            int r1 = r10.A00     // Catch:{ 6zA -> 0x0735 }
            r1 = r1 | r0
            r0 = r38
            r0.A00 = r1     // Catch:{ 6zA -> 0x0735 }
            java.util.Set r0 = r9.getCriticalExtensionOIDs()     // Catch:{ 6zA -> 0x0735 }
            if (r0 == 0) goto L_0x06bf
            java.util.HashSet r1 = X.AnonymousClass0x9.A15(r0)     // Catch:{ 6zA -> 0x0735 }
            X.8dX r0 = X.C176548dB.A0K     // Catch:{ 6zA -> 0x0735 }
            java.lang.String r0 = r0.A01     // Catch:{ 6zA -> 0x0735 }
            r1.remove(r0)     // Catch:{ 6zA -> 0x0735 }
            X.8dX r0 = X.C176548dB.A0C     // Catch:{ 6zA -> 0x0735 }
            java.lang.String r0 = r0.A01     // Catch:{ 6zA -> 0x0735 }
            r1.remove(r0)     // Catch:{ 6zA -> 0x0735 }
            boolean r0 = r1.isEmpty()     // Catch:{ 6zA -> 0x0735 }
            if (r0 != 0) goto L_0x06bf
            java.lang.String r0 = "CRL contains unsupported critical extensions."
            X.6zA r0 = X.C143596zA.A00(r0)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x06bf:
            if (r7 == 0) goto L_0x06e6
            java.util.Set r0 = r7.getCriticalExtensionOIDs()     // Catch:{ 6zA -> 0x0735 }
            if (r0 == 0) goto L_0x06e6
            java.util.HashSet r1 = X.AnonymousClass0x9.A15(r0)     // Catch:{ 6zA -> 0x0735 }
            X.8dX r0 = X.C176548dB.A0K     // Catch:{ 6zA -> 0x0735 }
            java.lang.String r0 = r0.A01     // Catch:{ 6zA -> 0x0735 }
            r1.remove(r0)     // Catch:{ 6zA -> 0x0735 }
            X.8dX r0 = X.C176548dB.A0C     // Catch:{ 6zA -> 0x0735 }
            java.lang.String r0 = r0.A01     // Catch:{ 6zA -> 0x0735 }
            r1.remove(r0)     // Catch:{ 6zA -> 0x0735 }
            boolean r0 = r1.isEmpty()     // Catch:{ 6zA -> 0x0735 }
            if (r0 != 0) goto L_0x06e6
            java.lang.String r0 = "Delta CRL contains unsupported critical extension."
            X.6zA r0 = X.C143596zA.A00(r0)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x06e6:
            r18 = 1
            goto L_0x00df
        L_0x06ea:
            java.lang.String r0 = "Delta CRL authority key identifier does not match complete CRL authority key identifier."
            X.6zA r0 = X.C143596zA.A00(r0)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x06f1:
            r1 = move-exception
            java.lang.String r0 = "Issuing distribution point extension could not be decoded."
            X.6zA r0 = X.C143596zA.A01(r0, r1)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x06f9:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 6zA -> 0x0735 }
            java.lang.String r0 = "Exception encoding CRL issuer: "
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r2)     // Catch:{ 6zA -> 0x0735 }
            X.6zA r0 = X.C143596zA.A01(r0, r2)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x0709:
            java.lang.String r0 = "Cannot verify CRL."
            X.6zA r0 = X.C143596zA.A01(r0, r1)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x0710:
            r1 = move-exception
            java.lang.String r0 = "Issuer certificate for CRL cannot be searched."
            X.6zA r0 = X.C143596zA.A01(r0, r1)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x0718:
            java.lang.IllegalStateException r0 = X.AnonymousClass6CA.A0O()     // Catch:{ IOException -> 0x071d }
            throw r0     // Catch:{ IOException -> 0x071d }
        L_0x071d:
            r1 = move-exception
            java.lang.String r0 = "Subject criteria for certificate selector to find issuer certificate for CRL could not be set."
            X.6zA r0 = X.C143596zA.A01(r0, r1)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x0725:
            r1 = move-exception
            java.lang.String r0 = "Issuing distribution point extension could not be decoded."
            X.6zA r0 = X.C143596zA.A01(r0, r1)     // Catch:{ 6zA -> 0x0735 }
            goto L_0x0734
        L_0x072d:
            r1 = move-exception
            java.lang.String r0 = "Public key of issuer certificate of CRL could not be retrieved."
            X.6zA r0 = X.C143596zA.A01(r0, r1)     // Catch:{ 6zA -> 0x0735 }
        L_0x0734:
            throw r0     // Catch:{ 6zA -> 0x0735 }
        L_0x0735:
            r23 = move-exception
            goto L_0x00df
        L_0x0738:
            if (r18 == 0) goto L_0x0758
            return
        L_0x073b:
            java.lang.String r0 = "CRL issuer is omitted from distribution point but no distributionPoint field present."
            X.6zA r0 = X.C143596zA.A00(r0)     // Catch:{ 6zA -> 0x074a }
            goto L_0x0749
        L_0x0742:
            r1 = move-exception
            java.lang.String r0 = "CRL issuer information from distribution point cannot be decoded."
            X.6zA r0 = X.C143596zA.A01(r0, r1)     // Catch:{ 6zA -> 0x074a }
        L_0x0749:
            throw r0     // Catch:{ 6zA -> 0x074a }
        L_0x074a:
            r1 = move-exception
            java.lang.String r0 = "Could not get issuer information from distribution point."
            X.6zA r0 = X.C143596zA.A01(r0, r1)
            throw r0
        L_0x0752:
            java.lang.String r0 = "Validation time is in future."
            X.6zA r23 = X.C143596zA.A00(r0)
        L_0x0758:
            throw r23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7sA.A0B(java.security.PublicKey, java.security.cert.X509Certificate, java.security.cert.X509Certificate, java.util.Date, java.util.Date, java.util.List, X.8d6, X.7Op, X.8N7, X.8kX, X.7Ih, X.7pK):void");
    }
}
