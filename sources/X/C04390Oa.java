package X;

import java.util.List;

/* renamed from: X.0Oa  reason: invalid class name and case insensitive filesystem */
public class C04390Oa {
    public C02230Fj A00;
    public String A01;
    public List A02 = null;
    public List A03 = null;

    public void A00(C02340Fu r3, String str, String str2) {
        List list = this.A02;
        if (list == null) {
            list = AnonymousClass001.A0s();
            this.A02 = list;
        }
        list.add(new C03870Lw(r3, str, str2));
    }

    public C04390Oa(C02230Fj r2, String str) {
        this.A00 = r2 == null ? C02230Fj.DESCENDANT : r2;
        this.A01 = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0013  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r5 = this;
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            X.0Fj r1 = r5.A00
            X.0Fj r0 = X.C02230Fj.CHILD
            if (r1 != r0) goto L_0x005e
            java.lang.String r0 = "> "
        L_0x000c:
            r3.append(r0)
        L_0x000f:
            java.lang.String r0 = r5.A01
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = "*"
        L_0x0015:
            r3.append(r0)
            java.util.List r0 = r5.A02
            if (r0 == 0) goto L_0x0065
            java.util.Iterator r4 = r0.iterator()
        L_0x0020:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0065
            java.lang.Object r2 = r4.next()
            X.0Lw r2 = (X.C03870Lw) r2
            r0 = 91
            r3.append(r0)
            java.lang.String r0 = r2.A01
            r3.append(r0)
            X.0Fu r0 = r2.A00
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0058
            r0 = 2
            if (r1 == r0) goto L_0x0055
            r0 = 3
            if (r1 != r0) goto L_0x004f
            java.lang.String r0 = "|="
        L_0x0047:
            r3.append(r0)
        L_0x004a:
            java.lang.String r0 = r2.A02
            r3.append(r0)
        L_0x004f:
            r0 = 93
            r3.append(r0)
            goto L_0x0020
        L_0x0055:
            java.lang.String r0 = "~="
            goto L_0x0047
        L_0x0058:
            r0 = 61
            r3.append(r0)
            goto L_0x004a
        L_0x005e:
            X.0Fj r0 = X.C02230Fj.FOLLOWS
            if (r1 != r0) goto L_0x000f
            java.lang.String r0 = "+ "
            goto L_0x000c
        L_0x0065:
            java.util.List r0 = r5.A03
            if (r0 == 0) goto L_0x0080
            java.util.Iterator r2 = r0.iterator()
        L_0x006d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0080
            java.lang.Object r1 = r2.next()
            r0 = 58
            r3.append(r0)
            r3.append(r1)
            goto L_0x006d
        L_0x0080:
            java.lang.String r0 = r3.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04390Oa.toString():java.lang.String");
    }
}
