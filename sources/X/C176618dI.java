package X;

import java.util.Enumeration;

/* renamed from: X.8dI  reason: invalid class name and case insensitive filesystem */
public class C176618dI extends AnonymousClass8Q0 implements C180078kS {
    public static C158907kk A05 = C177138e8.A0g;
    public int A00;
    public C176948dp A01;
    public C158907kk A02;
    public boolean A03;
    public C176538dA[] A04;

    public boolean equals(Object obj) {
        boolean z;
        int i;
        if (obj != this) {
            if (!(obj instanceof C176618dI) && !(obj instanceof C176958dq)) {
                return false;
            }
            C183618qL r13 = (C183618qL) obj;
            if (!this.A01.A0T(r13.Bqk())) {
                try {
                    C158907kk r3 = this.A02;
                    C176618dI r1 = new C176618dI(C176958dq.A0C(r13.Bqk()), A05);
                    if (r3 instanceof C177128e7) {
                        C176538dA[] A0N = A0N();
                        C176538dA[] A0N2 = r1.A0N();
                        int length = A0N.length;
                        if (length != A0N2.length) {
                            return false;
                        }
                        for (int i2 = 0; i2 != length; i2++) {
                            if (!C161947qs.A06(A0N[i2], A0N2[i2])) {
                                return false;
                            }
                        }
                        return true;
                    }
                    C176538dA[] A0N3 = A0N();
                    C176538dA[] A0N4 = r1.A0N();
                    int length2 = A0N3.length;
                    int length3 = A0N4.length;
                    if (length2 != length3) {
                        return false;
                    }
                    if (A0N3[0].A0N() == null || A0N4[0].A0N() == null) {
                        z = false;
                    } else {
                        z = !A0N3[0].A0N().A01.A0T(A0N4[0].A0N().A01);
                    }
                    for (int i3 = 0; i3 != length2; i3++) {
                        C176538dA r32 = A0N3[i3];
                        int i4 = 0;
                        if (z) {
                            i = length3 - 1;
                            while (i >= 0) {
                                C176538dA r0 = A0N4[i];
                                if (r0 == null || !C161947qs.A06(r32, r0)) {
                                    i--;
                                }
                            }
                            return false;
                        }
                        while (i != length3) {
                            C176538dA r02 = A0N4[i];
                            if (r02 == null || !C161947qs.A06(r32, r02)) {
                                i4 = i + 1;
                            }
                        }
                        return false;
                        A0N4[i] = null;
                    }
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        }
        return true;
    }

    public static C176618dI A0B(Object obj) {
        if (obj instanceof C176618dI) {
            return (C176618dI) obj;
        }
        if (obj != null) {
            return new C176618dI(C176958dq.A0C(obj), A05);
        }
        return null;
    }

    public static C176618dI A0C(Object obj, C158907kk r3) {
        if (obj instanceof C176618dI) {
            return new C176618dI((C176618dI) obj, r3);
        }
        if (obj != null) {
            return new C176618dI(C176958dq.A0C(obj), r3);
        }
        return null;
    }

    public C176538dA[] A0N() {
        return (C176538dA[]) this.A04.clone();
    }

    public int hashCode() {
        if (this.A03) {
            return this.A00;
        }
        this.A03 = true;
        C176538dA[] A0N = A0N();
        int i = 0;
        for (int i2 = 0; i2 != A0N.length; i2++) {
            C176538dA r5 = A0N[i2];
            if (r5.A00.A01.length > 1) {
                C176448d1[] A0O = r5.A0O();
                for (int i3 = 0; i3 != A0O.length; i3++) {
                    C176448d1 r4 = A0O[i3];
                    i = AnonymousClass6CA.A05(r4.A01, i) ^ C161947qs.A01(C161947qs.A02(r4.A00)).hashCode();
                }
            } else {
                i = AnonymousClass6CA.A05(r5.A0N().A01, i) ^ C161947qs.A01(C161947qs.A02(A0N[i2].A0N().A00)).hashCode();
            }
        }
        this.A00 = i;
        return i;
    }

    public String toString() {
        return this.A02.A01(this);
    }

    public C176618dI(C176958dq r7, C158907kk r8) {
        C176948dp r1;
        this.A02 = r8;
        this.A04 = new C176538dA[r7.A0U()];
        Enumeration A0V = r7.A0V();
        boolean z = true;
        int i = 0;
        while (A0V.hasMoreElements()) {
            Object nextElement = A0V.nextElement();
            C176538dA A0B = C176538dA.A0B(nextElement);
            z &= AnonymousClass000.A1Y(A0B, nextElement);
            this.A04[i] = A0B;
            i++;
        }
        if (z) {
            r1 = (C176948dp) r7.A0O();
        } else {
            r1 = new C176948dp((C183618qL[]) this.A04);
        }
        this.A01 = r1;
    }

    public static String A0A(String str) {
        int i;
        int length = str.length();
        if (length == 0 || (str.indexOf(92) < 0 && str.indexOf(34) < 0)) {
            return str.trim();
        }
        char[] charArray = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer(length);
        if (charArray[0] == '\\' && charArray[1] == '#') {
            stringBuffer.append("\\#");
            i = 2;
        } else {
            i = 0;
        }
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        char c = 0;
        while (i != charArray.length) {
            char c2 = charArray[i];
            if (c2 != ' ') {
                z3 = true;
                if (c2 == '\"') {
                    if (!z) {
                        z2 = !z2;
                        z = false;
                        i++;
                    }
                } else if (c2 == '\\') {
                    if (!z && !z2) {
                        i2 = stringBuffer.length();
                        z = true;
                        i++;
                    }
                } else if (c2 != ' ') {
                    if (z && '0' <= c2 && (c2 <= '9' || ('a' > c2 ? !('A' > c2 || c2 > 'F') : c2 <= 'f'))) {
                        if (c != 0) {
                            stringBuffer.append((char) ((C161947qs.A00(c) * 16) + C161947qs.A00(c2)));
                            z = false;
                            c = 0;
                        } else {
                            c = c2;
                        }
                        i++;
                    }
                }
                stringBuffer.append(c2);
                z = false;
                i++;
            }
            if (!z && !z3) {
                i++;
            }
            stringBuffer.append(c2);
            z = false;
            i++;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.charAt(stringBuffer.length() - 1) == ' ' && i2 != stringBuffer.length() - 1) {
                stringBuffer.setLength(stringBuffer.length() - 1);
            }
        }
        return stringBuffer.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.8dA[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: X.8dX[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.8dX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: X.8dX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: java.lang.String} */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C176618dI() {
        /*
            r12 = this;
            java.lang.String r1 = "CN=WAUser"
            X.7kk r5 = A05
            r0 = 44
            X.7Wi r4 = new X.7Wi
            r4.<init>(r1, r0)
            X.7g8 r6 = new X.7g8
            r6.<init>(r5)
        L_0x0010:
            int r1 = r4.A01
            java.lang.String r0 = r4.A02
            int r0 = r0.length()
            boolean r0 = X.AnonymousClass001.A1X(r1, r0)
            if (r0 == 0) goto L_0x014d
            java.lang.String r2 = r4.A00()
            r1 = 43
            int r0 = r2.indexOf(r1)
            java.lang.String r11 = "badly formatted directory string"
            r9 = 61
            if (r0 <= 0) goto L_0x0105
            X.7Wi r10 = new X.7Wi
            r10.<init>(r2, r1)
            java.lang.String r0 = r10.A00()
            X.7Wi r3 = new X.7Wi
            r3.<init>(r0, r9)
            java.lang.String r2 = r3.A00()
            int r1 = r3.A01
            java.lang.String r0 = r3.A02
            int r0 = r0.length()
            boolean r0 = X.AnonymousClass001.A1X(r1, r0)
            if (r0 == 0) goto L_0x0143
            java.lang.String r8 = r3.A00()
            java.lang.String r0 = r2.trim()
            X.8dX r3 = r5.A03(r0)
            int r1 = r10.A01
            java.lang.String r0 = r10.A02
            int r0 = r0.length()
            boolean r0 = X.AnonymousClass001.A1X(r1, r0)
            if (r0 == 0) goto L_0x0128
            java.util.Vector r7 = new java.util.Vector
            r7.<init>()
            java.util.Vector r2 = new java.util.Vector
            r2.<init>()
        L_0x0072:
            r7.addElement(r3)
            java.lang.String r0 = A0A(r8)
            r2.addElement(r0)
            int r1 = r10.A01
            java.lang.String r0 = r10.A02
            int r0 = r0.length()
            boolean r0 = X.AnonymousClass001.A1X(r1, r0)
            if (r0 == 0) goto L_0x00b2
            java.lang.String r0 = r10.A00()
            X.7Wi r8 = new X.7Wi
            r8.<init>(r0, r9)
            java.lang.String r3 = r8.A00()
            int r1 = r8.A01
            java.lang.String r0 = r8.A02
            int r0 = r0.length()
            boolean r0 = X.AnonymousClass001.A1X(r1, r0)
            if (r0 == 0) goto L_0x013e
            java.lang.String r8 = r8.A00()
            java.lang.String r0 = r3.trim()
            X.8dX r3 = r5.A03(r0)
            goto L_0x0072
        L_0x00b2:
            int r10 = r7.size()
            X.8dX[] r9 = new X.C176768dX[r10]
            r1 = 0
        L_0x00b9:
            if (r1 == r10) goto L_0x00c4
            java.lang.Object r0 = r7.elementAt(r1)
            r9[r1] = r0
            int r1 = r1 + 1
            goto L_0x00b9
        L_0x00c4:
            int r11 = r2.size()
            java.lang.String[] r7 = new java.lang.String[r11]
            r1 = 0
        L_0x00cb:
            if (r1 == r11) goto L_0x00d6
            java.lang.Object r0 = r2.elementAt(r1)
            r7[r1] = r0
            int r1 = r1 + 1
            goto L_0x00cb
        L_0x00d6:
            X.8qL[] r8 = new X.C183618qL[r11]
            r3 = 0
        L_0x00d9:
            if (r3 == r11) goto L_0x00ea
            X.7kk r2 = r6.A01
            r1 = r9[r3]
            r0 = r7[r3]
            X.8qL r0 = r2.A02(r0, r1)
            r8[r3] = r0
            int r3 = r3 + 1
            goto L_0x00d9
        L_0x00ea:
            X.8d1[] r7 = new X.C176448d1[r10]
            r3 = 0
        L_0x00ed:
            if (r3 == r10) goto L_0x00fd
            r2 = r9[r3]
            r1 = r8[r3]
            X.8d1 r0 = new X.8d1
            r0.<init>(r1, r2)
            r7[r3] = r0
            int r3 = r3 + 1
            goto L_0x00ed
        L_0x00fd:
            java.util.Vector r1 = r6.A00
            X.8dA r0 = new X.8dA
            r0.<init>((X.C176448d1[]) r7)
            goto L_0x0139
        L_0x0105:
            X.7Wi r3 = new X.7Wi
            r3.<init>(r2, r9)
            java.lang.String r2 = r3.A00()
            int r1 = r3.A01
            java.lang.String r0 = r3.A02
            int r0 = r0.length()
            boolean r0 = X.AnonymousClass001.A1X(r1, r0)
            if (r0 == 0) goto L_0x0148
            java.lang.String r8 = r3.A00()
            java.lang.String r0 = r2.trim()
            X.8dX r3 = r5.A03(r0)
        L_0x0128:
            java.lang.String r1 = A0A(r8)
            X.7kk r0 = r6.A01
            X.8qL r2 = r0.A02(r1, r3)
            java.util.Vector r1 = r6.A00
            X.8dA r0 = new X.8dA
            r0.<init>(r2, r3)
        L_0x0139:
            r1.addElement(r0)
            goto L_0x0010
        L_0x013e:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r11)
            throw r0
        L_0x0143:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r11)
            throw r0
        L_0x0148:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r11)
            throw r0
        L_0x014d:
            java.util.Vector r4 = r6.A00
            int r3 = r4.size()
            X.8dA[] r2 = new X.C176538dA[r3]
            r1 = 0
        L_0x0156:
            if (r1 == r3) goto L_0x0161
            java.lang.Object r0 = r4.elementAt(r1)
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x0156
        L_0x0161:
            X.7kk r1 = r6.A01
            X.8dI r0 = new X.8dI
            r0.<init>((X.C158907kk) r1, (X.C176538dA[]) r2)
            X.8dA[] r0 = r0.A0N()
            r12.<init>((X.C158907kk) r5, (X.C176538dA[]) r0)
            r12.A02 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176618dI.<init>():void");
    }

    public C176618dI(C158907kk r3, C176538dA[] r4) {
        this.A02 = r3;
        C176538dA[] r1 = (C176538dA[]) r4.clone();
        this.A04 = r1;
        this.A01 = new C176948dp((C183618qL[]) r1);
    }

    public C176618dI(C176618dI r2, C158907kk r3) {
        this.A02 = r3;
        this.A04 = r2.A04;
        this.A01 = r2.A01;
    }
}
