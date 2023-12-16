package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.2oh  reason: invalid class name and case insensitive filesystem */
public class C54422oh {
    public final C54562ov A00;
    public final String A01;

    public String[] A01() {
        String[] strArr = new String[4];
        strArr[0] = this.A01;
        C54562ov r2 = this.A00;
        strArr[1] = r2.A02;
        C18280x3.A1O(strArr, r2.A01);
        strArr[3] = String.valueOf(r2.A00);
        return strArr;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C54422oh)) {
            return false;
        }
        C54422oh r4 = (C54422oh) obj;
        return this.A01.equals(r4.A01) && this.A00.equals(r4.A00);
    }

    public int hashCode() {
        return this.A01.hashCode() ^ this.A00.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002f, code lost:
        if (r0 == null) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r7 = this;
            java.lang.String r4 = r7.A01
            java.lang.String r5 = "@"
            boolean r0 = r4.contains(r5)
            r3 = 4
            if (r0 == 0) goto L_0x0031
            int r0 = r4.indexOf(r5)
            java.lang.String r6 = X.AnonymousClass0x7.A0r(r4, r0)
            int r0 = r0 + 1
            java.lang.String r2 = r4.substring(r0)
            java.lang.String r0 = "g.us"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0045
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            r0 = 15
            java.lang.String r0 = X.C107575bX.A0B(r6, r0)
        L_0x002b:
            java.lang.String r0 = X.AnonymousClass000.A0U(r0, r5, r2, r1)
            if (r0 != 0) goto L_0x0035
        L_0x0031:
            java.lang.String r0 = X.C107575bX.A0B(r4, r3)
        L_0x0035:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)
            java.lang.String r0 = "::"
            r1.append(r0)
            X.2ov r0 = r7.A00
            java.lang.String r0 = X.AnonymousClass000.A0R(r0, r1)
            return r0
        L_0x0045:
            java.lang.String r0 = "broadcast"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0031
            X.6kE r0 = X.C135166kE.A00
            java.lang.String r0 = r0.getRawString()
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x006e
            X.6kD r0 = X.C135156kD.A00
            java.lang.String r0 = r0.getRawString()
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x006e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = X.C107575bX.A0B(r6, r3)
            goto L_0x002b
        L_0x006e:
            r0 = r4
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54422oh.toString():java.lang.String");
    }

    public C54422oh(C54562ov r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public static C54422oh A00(C54562ov r2, Jid jid) {
        return new C54422oh(r2, jid.getRawString());
    }
}
