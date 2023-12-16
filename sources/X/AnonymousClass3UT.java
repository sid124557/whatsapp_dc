package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.3UT  reason: invalid class name */
public class AnonymousClass3UT implements C84914Ef {
    public Set B9Z(C624134x r5) {
        String str;
        String str2;
        String str3;
        if (r5.A15 == null) {
            return null;
        }
        HashSet A0K = AnonymousClass002.A0K();
        A0K.add("");
        C624034w r2 = r5.A0P;
        if (r2 != null) {
            if (C624034w.A02(r2)) {
                str = "c";
            } else {
                str = "i";
            }
            A0K.add(str);
            if (r2.A0L()) {
                int i = r2.A02;
                if (i == 12) {
                    str3 = "n";
                } else if (i == 17) {
                    str3 = "q";
                }
                A0K.add(str3);
            }
            if (r2.A0Q) {
                str2 = "s";
            } else {
                str2 = "r";
            }
            A0K.add(str2);
        }
        return A0K;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass2M8 B9w(X.C56532s8 r6) {
        /*
            r5 = this;
            java.lang.Boolean r0 = r6.A07
            if (r0 == 0) goto L_0x000b
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0018
            r0 = 0
            return r0
        L_0x0018:
            java.util.HashSet r3 = X.AnonymousClass002.A0K()
            java.util.HashSet r2 = X.AnonymousClass002.A0K()
            X.2T7 r4 = r6.A05
            if (r4 == 0) goto L_0x0061
            boolean r0 = r4.A04
            java.lang.String r1 = "n"
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = "q"
            r2.add(r0)
            r2.add(r1)
        L_0x0034:
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = "s"
            r1.add(r0)
        L_0x0042:
            X.284 r0 = r4.A00
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = "r"
            r1.add(r0)
        L_0x004c:
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0055
            java.lang.String r0 = "c"
            r1.add(r0)
        L_0x0055:
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = "i"
            r1.add(r0)
        L_0x005e:
            r3.addAll(r1)
        L_0x0061:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = ""
            r3.add(r0)
        L_0x006c:
            X.2M8 r0 = new X.2M8
            r0.<init>()
            r0.A00 = r3
            r0.A01 = r2
            return r0
        L_0x0076:
            boolean r0 = r4.A05
            if (r0 == 0) goto L_0x0034
            r3.add(r1)
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UT.B9w(X.2s8):X.2M8");
    }

    public String B9v() {
        return "p";
    }
}
