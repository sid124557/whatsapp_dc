package X;

import java.util.List;

/* renamed from: X.1mr  reason: invalid class name and case insensitive filesystem */
public class C30691mr extends C30321mG {
    public AnonymousClass3ZF A00;

    public C30691mr(AnonymousClass2z0 r2, long j) {
        super(r2, (byte) 10, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r0 == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A1y() {
        /*
            r4 = this;
            java.util.List r1 = r4.A02
            boolean r0 = r1.isEmpty()
            r3 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0017
            java.lang.Object r0 = r1.get(r2)
            X.3ZF r0 = (X.AnonymousClass3ZF) r0
            boolean r0 = r0.A0L()
            r1 = 1
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            boolean r0 = r4.A20()
            if (r0 == 0) goto L_0x0022
            if (r1 == 0) goto L_0x0021
            r3 = 3
        L_0x0021:
            return r3
        L_0x0022:
            if (r1 == 0) goto L_0x0025
            r2 = 2
        L_0x0025:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30691mr.A1y():int");
    }

    public boolean A1z() {
        List list = this.A02;
        if (list.isEmpty() || !((AnonymousClass3ZF) list.get(0)).A0N()) {
            return false;
        }
        return true;
    }

    public boolean A20() {
        List list = this.A02;
        if (list.isEmpty()) {
            return this.A01;
        }
        return ((AnonymousClass3ZF) C18290x4.A0k(list)).A0L;
    }
}
