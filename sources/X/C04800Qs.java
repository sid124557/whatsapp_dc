package X;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.0Qs  reason: invalid class name and case insensitive filesystem */
public class C04800Qs {
    public int A00 = -1;
    public int A01 = 0;
    public C04700Qh A02;
    public C04800Qs A03;
    public HashSet A04 = null;
    public final AnonymousClass0G0 A05;
    public final AnonymousClass0R7 A06;

    public void A04(C04800Qs r3, int i) {
        A05(r3, i, -1, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0058, code lost:
        if (r1 != r0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x005a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A07(X.C04800Qs r6) {
        /*
            r5 = this;
            r4 = 0
            if (r6 == 0) goto L_0x001a
            X.0G0 r1 = r6.A05
            X.0G0 r3 = r5.A05
            r2 = 1
            if (r1 != r3) goto L_0x001b
            X.0G0 r0 = X.AnonymousClass0G0.BASELINE
            if (r3 != r0) goto L_0x005c
            X.0R7 r0 = r6.A06
            boolean r0 = r0.A0h
            if (r0 == 0) goto L_0x001a
            X.0R7 r0 = r5.A06
            boolean r0 = r0.A0h
            if (r0 != 0) goto L_0x005c
        L_0x001a:
            return r4
        L_0x001b:
            int r0 = r3.ordinal()
            switch(r0) {
                case 1: goto L_0x0031;
                case 2: goto L_0x0045;
                case 3: goto L_0x0031;
                case 4: goto L_0x0045;
                case 5: goto L_0x0022;
                case 6: goto L_0x0023;
                default: goto L_0x0022;
            }
        L_0x0022:
            return r4
        L_0x0023:
            X.0G0 r0 = X.AnonymousClass0G0.BASELINE
            if (r1 == r0) goto L_0x001a
            X.0G0 r0 = X.AnonymousClass0G0.CENTER_X
            if (r1 == r0) goto L_0x001a
            X.0G0 r0 = X.AnonymousClass0G0.CENTER_Y
            if (r1 == r0) goto L_0x001a
            r4 = 1
            return r4
        L_0x0031:
            X.0G0 r0 = X.AnonymousClass0G0.LEFT
            if (r1 == r0) goto L_0x003a
            X.0G0 r0 = X.AnonymousClass0G0.RIGHT
            if (r1 == r0) goto L_0x003a
            r2 = 0
        L_0x003a:
            X.0R7 r0 = r6.A06
            boolean r0 = r0 instanceof X.AnonymousClass05K
            if (r0 == 0) goto L_0x005c
            if (r2 != 0) goto L_0x005a
            X.0G0 r0 = X.AnonymousClass0G0.CENTER_X
            goto L_0x0058
        L_0x0045:
            X.0G0 r0 = X.AnonymousClass0G0.TOP
            if (r1 == r0) goto L_0x004e
            X.0G0 r0 = X.AnonymousClass0G0.BOTTOM
            if (r1 == r0) goto L_0x004e
            r2 = 0
        L_0x004e:
            X.0R7 r0 = r6.A06
            boolean r0 = r0 instanceof X.AnonymousClass05K
            if (r0 == 0) goto L_0x005c
            if (r2 != 0) goto L_0x005a
            X.0G0 r0 = X.AnonymousClass0G0.CENTER_Y
        L_0x0058:
            if (r1 != r0) goto L_0x005b
        L_0x005a:
            r4 = 1
        L_0x005b:
            return r4
        L_0x005c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04800Qs.A07(X.0Qs):boolean");
    }

    public int A00() {
        C04800Qs r0;
        if (this.A06.A0N == 8) {
            return 0;
        }
        int i = this.A00;
        if (i <= -1 || (r0 = this.A03) == null || r0.A06.A0N != 8) {
            return this.A01;
        }
        return i;
    }

    public final C04800Qs A01() {
        switch (this.A05.ordinal()) {
            case 1:
                return this.A06.A0X;
            case 2:
                return this.A06.A0S;
            case 3:
                return this.A06.A0W;
            case 4:
                return this.A06.A0Y;
            default:
                return null;
        }
    }

    public void A02() {
        HashSet hashSet;
        C04800Qs r0 = this.A03;
        if (!(r0 == null || (hashSet = r0.A04) == null)) {
            hashSet.remove(this);
        }
        this.A03 = null;
        this.A01 = 0;
        this.A00 = -1;
    }

    public void A03() {
        C04700Qh r0 = this.A02;
        if (r0 == null) {
            this.A02 = new C04700Qh(C02300Fq.UNRESTRICTED);
        } else {
            r0.A00();
        }
    }

    public void A05(C04800Qs r3, int i, int i2, boolean z) {
        if (r3 == null) {
            A02();
        } else if (z || A07(r3)) {
            this.A03 = r3;
            HashSet hashSet = r3.A04;
            if (hashSet == null) {
                hashSet = AnonymousClass002.A0K();
                r3.A04 = hashSet;
            }
            hashSet.add(this);
            if (i > 0) {
                this.A01 = i;
            } else {
                this.A01 = 0;
            }
            this.A00 = i2;
        }
    }

    public boolean A06() {
        HashSet hashSet = this.A04;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                if (((C04800Qs) it.next()).A01().A03 != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public C04800Qs(AnonymousClass0G0 r2, AnonymousClass0R7 r3) {
        this.A06 = r3;
        this.A05 = r2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A06.A0f);
        A0o.append(":");
        AnonymousClass000.A1B(this.A05, A0o);
        return A0o.toString();
    }
}
