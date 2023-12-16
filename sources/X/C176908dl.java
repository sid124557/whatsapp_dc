package X;

import java.io.IOException;

/* renamed from: X.8dl  reason: invalid class name and case insensitive filesystem */
public abstract class C176908dl extends C177088e3 implements C188588zA {
    public final int A00;
    public final C183618qL A01;
    public final boolean A02;

    public static C176908dl A0A(Object obj) {
        if (obj == null || (obj instanceof C176908dl)) {
            return (C176908dl) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return A0A(C177088e3.A0I((byte[]) obj));
            } catch (IOException e) {
                throw AnonymousClass001.A0c(AnonymousClass000.A0a("failed to construct tagged object from byte[]: ", AnonymousClass001.A0o(), e));
            }
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            C18260x0.A1T(A0o, "unknown object in getInstance: ", obj);
            throw C18310x6.A0d(A0o);
        }
    }

    public C177088e3 A0O() {
        boolean z = this.A02;
        return new C177028dx(this.A01, this.A00, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r3.A0R() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r3.A0R() != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0Q(X.C159057l2 r6, boolean r7) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.C177018dw
            if (r0 == 0) goto L_0x003b
            X.8e3 r0 = X.AnonymousClass8Q0.A03(r5)
            X.8e3 r3 = r0.A0P()
            boolean r2 = r5.A02
            if (r2 != 0) goto L_0x0018
            boolean r0 = r3.A0R()
            r1 = 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x001a
        L_0x0018:
            r1 = 160(0xa0, float:2.24E-43)
        L_0x001a:
            int r0 = r5.A00
            r6.A01(r1, r0, r7)
            if (r2 == 0) goto L_0x0028
            int r0 = r3.A0N()
            r6.A00(r0)
        L_0x0028:
            boolean r0 = r6 instanceof X.C176668dN
            if (r0 != 0) goto L_0x0037
            boolean r0 = r6 instanceof X.C176678dO
            if (r0 != 0) goto L_0x0037
            java.io.OutputStream r0 = r6.A00
            X.8dN r6 = new X.8dN
            r6.<init>(r0)
        L_0x0037:
            r6.A02(r3, r2)
            return
        L_0x003b:
            boolean r0 = r5 instanceof X.C177028dx
            if (r0 == 0) goto L_0x0075
            X.8e3 r0 = X.AnonymousClass8Q0.A03(r5)
            X.8e3 r3 = r0.A0O()
            boolean r2 = r5.A02
            if (r2 != 0) goto L_0x0053
            boolean r0 = r3.A0R()
            r1 = 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0055
        L_0x0053:
            r1 = 160(0xa0, float:2.24E-43)
        L_0x0055:
            int r0 = r5.A00
            r6.A01(r1, r0, r7)
            if (r2 == 0) goto L_0x0063
            int r0 = r3.A0N()
            r6.A00(r0)
        L_0x0063:
            boolean r0 = r6 instanceof X.C176678dO
            if (r0 == 0) goto L_0x006d
            X.8dO r6 = (X.C176678dO) r6
        L_0x0069:
            r3.A0Q(r6, r2)
            return
        L_0x006d:
            java.io.OutputStream r0 = r6.A00
            X.8dO r6 = new X.8dO
            r6.<init>(r0)
            goto L_0x0069
        L_0x0075:
            r1 = 160(0xa0, float:2.24E-43)
            int r0 = r5.A00
            r6.A01(r1, r0, r7)
            r0 = 128(0x80, float:1.794E-43)
            java.io.OutputStream r3 = r6.A00
            r3.write(r0)
            boolean r0 = r5.A02
            X.8qL r4 = r5.A01
            if (r0 != 0) goto L_0x00e4
            boolean r0 = r4 instanceof X.C176778dY
            if (r0 == 0) goto L_0x00ba
            boolean r0 = r4 instanceof X.C176658dM
            if (r0 == 0) goto L_0x00ac
            X.8dM r4 = (X.C176658dM) r4
            java.util.Enumeration r2 = r4.A0U()
        L_0x0097:
            boolean r0 = r2.hasMoreElements()
            if (r0 == 0) goto L_0x00ec
            java.lang.Object r0 = r2.nextElement()
            X.8qL r0 = (X.C183618qL) r0
            X.8e3 r1 = r0.Bqk()
            r0 = 1
            r6.A02(r1, r0)
            goto L_0x0097
        L_0x00ac:
            X.8dY r4 = (X.C176778dY) r4
            byte[] r1 = r4.A00
            X.8dM r0 = new X.8dM
            r0.<init>((byte[]) r1)
            java.util.Enumeration r2 = r0.A0U()
            goto L_0x0097
        L_0x00ba:
            boolean r0 = r4 instanceof X.C176958dq
            if (r0 == 0) goto L_0x00c5
            X.8dq r4 = (X.C176958dq) r4
            java.util.Enumeration r2 = r4.A0V()
            goto L_0x0097
        L_0x00c5:
            boolean r0 = r4 instanceof X.C176998du
            if (r0 == 0) goto L_0x00d1
            X.8du r4 = (X.C176998du) r4
            X.91m r2 = new X.91m
            r2.<init>((X.C176998du) r4)
            goto L_0x0097
        L_0x00d1:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "not implemented: "
            X.C18260x0.A1T(r1, r0, r4)
            java.lang.String r1 = r1.toString()
            X.6u6 r0 = new X.6u6
            r0.<init>(r1)
            throw r0
        L_0x00e4:
            X.8e3 r1 = r4.Bqk()
            r0 = 1
            r6.A02(r1, r0)
        L_0x00ec:
            r0 = 0
            r3.write(r0)
            r3.write(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176908dl.A0Q(X.7l2, boolean):void");
    }

    public C177088e3 B99() {
        return this;
    }

    public int hashCode() {
        int i = this.A00;
        int i2 = 240;
        if (this.A02) {
            i2 = 15;
        }
        return AnonymousClass6CA.A05(AnonymousClass8Q0.A03(this), i ^ i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if ((r3 instanceof X.C180078kS) != false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C176908dl(X.C183618qL r3, int r4, boolean r5) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L_0x0014
            r2.A00 = r4
            if (r5 != 0) goto L_0x000e
            boolean r1 = r3 instanceof X.C180078kS
            r0 = 0
            if (r1 == 0) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            r2.A02 = r0
            r2.A01 = r3
            return
        L_0x0014:
            java.lang.String r0 = "'obj' cannot be null"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176908dl.<init>(X.8qL, int, boolean):void");
    }

    public String toString() {
        StringBuilder A0p = AnonymousClass001.A0p();
        A0p.append(this.A00);
        A0p.append("]");
        return AnonymousClass000.A0R(this.A01, A0p);
    }
}
