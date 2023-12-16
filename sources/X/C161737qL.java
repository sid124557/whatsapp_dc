package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7qL  reason: invalid class name and case insensitive filesystem */
public final class C161737qL {
    public static final C161737qL A03 = new C161737qL(true);
    public boolean A00;
    public boolean A01;
    public final AnonymousClass8TC A02 = new C130826cb(16);

    public C161737qL(boolean z) {
        A02();
        A02();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        if (r0 >= 0) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        r0 = (long) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        r2.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
        r2.A0E(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0074, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0079, code lost:
        r2.A06(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0096, code lost:
        r4.Bsj(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0099, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c3, code lost:
        r2.A0G((X.C172548Lq) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c8, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(com.google.protobuf.CodedOutputStream r2, X.C142676xa r3, java.lang.Object r4, int r5) {
        /*
            X.6xa r0 = X.C142676xa.A08
            if (r3 != r0) goto L_0x0016
            X.8y2 r4 = (X.C187928y2) r4
            int r1 = r5 << 3
            r0 = r1 | 3
            r2.A07(r0)
            r4.Bsj(r2)
            r0 = r1 | 4
        L_0x0012:
            r2.A07(r0)
            return
        L_0x0016:
            int r1 = r3.wireType
            int r0 = r5 << 3
            r0 = r0 | r1
            r2.A07(r0)
            int[] r0 = X.AnonymousClass77E.A00
            int r0 = X.AnonymousClass6CA.A04(r3, r0)
            switch(r0) {
                case 1: goto L_0x005b;
                case 2: goto L_0x0064;
                case 3: goto L_0x0028;
                case 4: goto L_0x0028;
                case 5: goto L_0x0056;
                case 6: goto L_0x006d;
                case 7: goto L_0x0075;
                case 8: goto L_0x007d;
                case 9: goto L_0x0086;
                case 10: goto L_0x0089;
                case 11: goto L_0x009a;
                case 12: goto L_0x00a4;
                case 13: goto L_0x0036;
                case 14: goto L_0x0075;
                case 15: goto L_0x006d;
                case 16: goto L_0x003b;
                case 17: goto L_0x002d;
                case 18: goto L_0x0045;
                default: goto L_0x0027;
            }
        L_0x0027:
            return
        L_0x0028:
            long r0 = X.C18310x6.A0B(r4)
            goto L_0x0052
        L_0x002d:
            long r0 = X.C18310x6.A0B(r4)
            long r0 = X.AnonymousClass6C7.A0F(r0)
            goto L_0x0052
        L_0x0036:
            int r0 = X.AnonymousClass001.A0K(r4)
            goto L_0x0012
        L_0x003b:
            int r0 = X.AnonymousClass001.A0K(r4)
            int r1 = r0 << 1
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            goto L_0x0012
        L_0x0045:
            boolean r0 = r4 instanceof X.C181358md
            if (r0 == 0) goto L_0x0056
            X.8md r4 = (X.C181358md) r4
            int r0 = r4.BA3()
        L_0x004f:
            if (r0 >= 0) goto L_0x0012
            long r0 = (long) r0
        L_0x0052:
            r2.A0F(r0)
            return
        L_0x0056:
            int r0 = X.AnonymousClass001.A0K(r4)
            goto L_0x004f
        L_0x005b:
            double r0 = X.AnonymousClass6C9.A02(r4)
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            goto L_0x0071
        L_0x0064:
            float r0 = X.AnonymousClass001.A05(r4)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            goto L_0x0079
        L_0x006d:
            long r0 = X.C18310x6.A0B(r4)
        L_0x0071:
            r2.A0E(r0)
            return
        L_0x0075:
            int r0 = X.AnonymousClass001.A0K(r4)
        L_0x0079:
            r2.A06(r0)
            return
        L_0x007d:
            boolean r0 = X.AnonymousClass001.A1Z(r4)
            byte r0 = (byte) r0
            r2.A05(r0)
            return
        L_0x0086:
            X.8y2 r4 = (X.C187928y2) r4
            goto L_0x0096
        L_0x0089:
            X.8y2 r4 = (X.C187928y2) r4
            r1 = r4
            X.8Cg r1 = (X.C170198Cg) r1
            r0 = 0
            int r0 = r1.A0D(r0)
            r2.A07(r0)
        L_0x0096:
            r4.Bsj(r2)
            return
        L_0x009a:
            boolean r0 = r4 instanceof X.C172548Lq
            if (r0 != 0) goto L_0x00c3
            java.lang.String r4 = (java.lang.String) r4
            r2.A0J(r4)
            return
        L_0x00a4:
            boolean r0 = r4 instanceof X.C172548Lq
            if (r0 != 0) goto L_0x00c3
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            boolean r0 = r2 instanceof X.C130306bk
            if (r0 == 0) goto L_0x00b9
            X.6bk r2 = (X.C130306bk) r2
            r0 = 0
            r2.A07(r1)
            r2.A0R(r4, r0, r1)
            return
        L_0x00b9:
            X.6bj r2 = (X.C130296bj) r2
            r0 = 0
            r2.A07(r1)
            r2.A0L(r4, r0, r1)
            return
        L_0x00c3:
            X.8Lq r4 = (X.C172548Lq) r4
            r2.A0G(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161737qL.A01(com.google.protobuf.CodedOutputStream, X.6xa, java.lang.Object, int):void");
    }

    public void A02() {
        if (!this.A01) {
            int i = 0;
            while (true) {
                AnonymousClass8TC r1 = this.A02;
                if (i < r1.A00.size()) {
                    Map.Entry entry = (Map.Entry) r1.A00.get(i);
                    if (entry.getValue() instanceof C130786cX) {
                        ((C130786cX) entry.getValue()).A0K();
                    }
                    i++;
                } else {
                    r1.A04();
                    this.A01 = true;
                    return;
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ Object clone() {
        Iterable entrySet;
        C161737qL r3 = new C161737qL();
        AnonymousClass8TC r1 = this.A02;
        if (0 < r1.A00.size()) {
            Map.Entry entry = (Map.Entry) r1.A00.get(0);
            entry.getKey();
            entry.getValue();
            throw AnonymousClass001.A0g("getLiteType");
        }
        if (r1.A01.isEmpty()) {
            entrySet = C1460378i.A00;
        } else {
            entrySet = r1.A01.entrySet();
        }
        Iterator it = entrySet.iterator();
        if (it.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(it);
            A0w.getKey();
            A0w.getValue();
            throw AnonymousClass001.A0g("getLiteType");
        }
        r3.A00 = this.A00;
        return r3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C161737qL)) {
            return false;
        }
        return this.A02.equals(((C161737qL) obj).A02);
    }

    public int hashCode() {
        return this.A02.hashCode();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        r0 = ((X.C172548Lq) r4).A03();
        r1 = X.AnonymousClass6C7.A00(r0) + r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.C142676xa r3, java.lang.Object r4, int r5) {
        /*
            int r2 = X.AnonymousClass730.A04(r5)
            X.6xa r0 = X.C142676xa.A08
            if (r3 != r0) goto L_0x000a
            int r2 = r2 * 2
        L_0x000a:
            int[] r0 = X.AnonymousClass77E.A00
            int r0 = X.AnonymousClass6CA.A04(r3, r0)
            switch(r0) {
                case 1: goto L_0x006d;
                case 2: goto L_0x006b;
                case 3: goto L_0x0029;
                case 4: goto L_0x0029;
                case 5: goto L_0x009b;
                case 6: goto L_0x006d;
                case 7: goto L_0x006b;
                case 8: goto L_0x0032;
                case 9: goto L_0x0034;
                case 10: goto L_0x001a;
                case 11: goto L_0x003e;
                case 12: goto L_0x0049;
                case 13: goto L_0x0062;
                case 14: goto L_0x006b;
                case 15: goto L_0x006d;
                case 16: goto L_0x0070;
                case 17: goto L_0x0079;
                case 18: goto L_0x0086;
                default: goto L_0x0013;
            }
        L_0x0013:
            java.lang.String r0 = "There is no way to get here, but the compiler thinks otherwise."
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            throw r0
        L_0x001a:
            X.8y2 r4 = (X.C187928y2) r4
            X.8Cg r4 = (X.C170198Cg) r4
            r0 = 0
            int r0 = r4.A0D(r0)
            int r1 = X.AnonymousClass6C7.A00(r0)
            int r1 = r1 + r0
            goto L_0x0096
        L_0x0029:
            long r0 = X.C18310x6.A0B(r4)
            int r1 = com.google.protobuf.CodedOutputStream.A02(r0)
            goto L_0x0096
        L_0x0032:
            r1 = 1
            goto L_0x0096
        L_0x0034:
            X.8y2 r4 = (X.C187928y2) r4
            X.8Cg r4 = (X.C170198Cg) r4
            r0 = 0
            int r1 = r4.A0D(r0)
            goto L_0x0096
        L_0x003e:
            boolean r0 = r4 instanceof X.C172548Lq
            if (r0 != 0) goto L_0x0056
            java.lang.String r4 = (java.lang.String) r4
            int r1 = com.google.protobuf.CodedOutputStream.A03(r4)
            goto L_0x0096
        L_0x0049:
            boolean r0 = r4 instanceof X.C172548Lq
            if (r0 != 0) goto L_0x0056
            byte[] r4 = (byte[]) r4
            int r0 = r4.length
            int r1 = X.AnonymousClass6C7.A00(r0)
            int r1 = r1 + r0
            goto L_0x0096
        L_0x0056:
            X.8Lq r4 = (X.C172548Lq) r4
            int r0 = r4.A03()
            int r1 = X.AnonymousClass6C7.A00(r0)
            int r1 = r1 + r0
            goto L_0x0096
        L_0x0062:
            int r0 = X.AnonymousClass001.A0K(r4)
            int r1 = X.AnonymousClass6C7.A00(r0)
            goto L_0x0096
        L_0x006b:
            r1 = 4
            goto L_0x0096
        L_0x006d:
            r1 = 8
            goto L_0x0096
        L_0x0070:
            int r0 = X.AnonymousClass001.A0K(r4)
            int r1 = X.AnonymousClass730.A05(r0)
            goto L_0x0096
        L_0x0079:
            long r0 = X.C18310x6.A0B(r4)
            long r0 = X.AnonymousClass6C7.A0F(r0)
            int r1 = com.google.protobuf.CodedOutputStream.A02(r0)
            goto L_0x0096
        L_0x0086:
            boolean r0 = r4 instanceof X.C181358md
            if (r0 == 0) goto L_0x009b
            X.8md r4 = (X.C181358md) r4
            int r0 = r4.BA3()
        L_0x0090:
            if (r0 < 0) goto L_0x0098
            int r1 = X.AnonymousClass6C7.A00(r0)
        L_0x0096:
            int r2 = r2 + r1
            return r2
        L_0x0098:
            r1 = 10
            goto L_0x0096
        L_0x009b:
            int r0 = X.AnonymousClass001.A0K(r4)
            goto L_0x0090
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161737qL.A00(X.6xa, java.lang.Object, int):int");
    }

    public C161737qL() {
    }
}
