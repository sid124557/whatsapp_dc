package X;

/* renamed from: X.8cu  reason: invalid class name and case insensitive filesystem */
public class C176378cu extends AnonymousClass8Q0 {
    public C176748dV A00;
    public C176748dV A01;
    public C176958dq A02;
    public C176068cP A03;
    public C176068cP A04;
    public C176618dI A05;
    public C176618dI A06;
    public C176528d9 A07;
    public C176288cl A08;
    public C176318co A09;
    public C176598dG A0A;
    public C176598dG A0B;

    public static C176378cu A0A(Object obj) {
        if (obj instanceof C176378cu) {
            return (C176378cu) obj;
        }
        if (obj != null) {
            return new C176378cu(C176958dq.A0C(obj));
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C176378cu(X.C176958dq r8) {
        /*
            r7 = this;
            r7.<init>()
            r7.A02 = r8
            r4 = 0
            X.8qL r0 = r8.A0W(r4)
            boolean r2 = r0 instanceof X.C176908dl
            r0 = 0
            r3 = 1
            if (r2 == 0) goto L_0x00b9
            X.8qL r2 = r8.A0W(r4)
            X.8dl r2 = (X.C176908dl) r2
            X.8e3 r2 = X.AnonymousClass8Q0.A03(r2)
            X.8dV r2 = X.C176748dV.A0A(r2)
            r7.A01 = r2
            r5 = 0
        L_0x0022:
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            boolean r0 = r2.A0V(r0)
            if (r0 == 0) goto L_0x0097
            r2 = 1
        L_0x002d:
            r6 = 0
        L_0x002e:
            int r0 = r5 + 1
            X.8qL r0 = r8.A0W(r0)
            X.8dV r0 = X.C176748dV.A0A(r0)
            r7.A00 = r0
            int r0 = r5 + 2
            X.8qL r0 = r8.A0W(r0)
            X.8d9 r0 = X.C176528d9.A0A(r0)
            r7.A07 = r0
            int r0 = r5 + 3
            X.8qL r0 = r8.A0W(r0)
            X.8dI r0 = X.C176618dI.A0B(r0)
            r7.A05 = r0
            int r0 = r5 + 4
            X.8qL r1 = r8.A0W(r0)
            X.8dq r1 = (X.C176958dq) r1
            X.8qL r0 = r1.A0W(r4)
            X.8dG r0 = X.C176598dG.A0A(r0)
            r7.A0B = r0
            X.8qL r0 = r1.A0W(r3)
            X.8dG r0 = X.C176598dG.A0A(r0)
            r7.A0A = r0
            int r0 = r5 + 5
            X.8qL r0 = r8.A0W(r0)
            X.8dI r0 = X.C176618dI.A0B(r0)
            r7.A06 = r0
            int r5 = r5 + 6
            X.8qL r0 = r8.A0W(r5)
            X.8co r0 = X.C176318co.A0A(r0)
            r7.A09 = r0
            int r4 = r8.A0U()
            int r4 = r4 - r5
            int r4 = r4 - r3
            if (r4 == 0) goto L_0x010e
            if (r2 == 0) goto L_0x00c3
            java.lang.String r0 = "version 1 certificate contains extra data"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0097:
            X.8dV r2 = r7.A01
            r0 = 1
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            boolean r0 = r2.A0V(r0)
            if (r0 == 0) goto L_0x00a8
            r2 = 0
            r6 = 1
            goto L_0x002e
        L_0x00a8:
            X.8dV r2 = r7.A01
            r0 = 2
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            boolean r0 = r2.A0V(r0)
            if (r0 == 0) goto L_0x010f
            r2 = 0
            goto L_0x002d
        L_0x00b9:
            X.8dV r2 = new X.8dV
            r2.<init>((long) r0)
            r7.A01 = r2
            r5 = -1
            goto L_0x0022
        L_0x00c3:
            if (r4 <= 0) goto L_0x010e
            int r0 = r5 + r4
            X.8qL r2 = r8.A0W(r0)
            X.8dl r2 = (X.C176908dl) r2
            int r1 = r2.A00
            if (r1 == r3) goto L_0x00ed
            r0 = 2
            if (r1 == r0) goto L_0x00e6
            r0 = 3
            if (r1 != r0) goto L_0x00fb
            if (r6 != 0) goto L_0x00f4
            X.8dq r0 = X.C176958dq.A0D(r2, r3)
            X.8cl r0 = X.C176288cl.A0B(r0)
            r7.A08 = r0
        L_0x00e3:
            int r4 = r4 + -1
            goto L_0x00c3
        L_0x00e6:
            X.8cP r0 = X.C176068cP.A0B(r2)
            r7.A04 = r0
            goto L_0x00e3
        L_0x00ed:
            X.8cP r0 = X.C176068cP.A0B(r2)
            r7.A03 = r0
            goto L_0x00e3
        L_0x00f4:
            java.lang.String r0 = "version 2 certificate cannot contain extensions"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x00fb:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown tag encountered in structure: "
            r1.append(r0)
            int r0 = r2.A00
            r1.append(r0)
            java.lang.IllegalArgumentException r0 = X.C18310x6.A0d(r1)
            throw r0
        L_0x010e:
            return
        L_0x010f:
            java.lang.String r0 = "version number not recognised"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176378cu.<init>(X.8dq):void");
    }
}
