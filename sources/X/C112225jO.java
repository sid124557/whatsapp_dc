package X;

import java.util.HashMap;

/* renamed from: X.5jO  reason: invalid class name and case insensitive filesystem */
public class C112225jO implements C184158rL {
    public AnonymousClass4UB A00;
    public C184238rT A01;
    public AnonymousClass7T4 A02;
    public boolean A03;
    public final C111525iE A04;
    public final C111525iE A05;
    public final C111545iG A06;
    public final AnonymousClass5QV A07;
    public final AnonymousClass4w0 A08;
    public final C105085Tn A09;
    public final AnonymousClass5ZR A0A;
    public final C105355Up A0B;
    public final AnonymousClass5ZI A0C;
    public final AnonymousClass4FS A0D;

    public void A08(AnonymousClass7KT r10) {
        if (this.A03) {
            this.A03 = false;
            AnonymousClass4UB r2 = this.A00;
            if (r2.A00 == 1) {
                r2.A02.removeCallbacks(r2.A0B);
            }
            AnonymousClass5ZI r5 = this.A0C;
            r5.A09("gps_request_end");
            this.A07.A01(r10.A01, this, r5, r10.A02, "device", r10.A00);
            return;
        }
        C105085Tn r3 = this.A09;
        AnonymousClass5ZO A012 = r3.A01();
        if (A012 != null && "device".equals(A012.A09) && AnonymousClass5ZZ.A01(AnonymousClass5ZO.A00(A012), r10.A01) > 800.0f) {
            r3.A01 = true;
            r3.A00 = null;
            this.A01.BVm();
        }
    }

    public int A01() {
        AnonymousClass5ZO r0 = this.A00.A01;
        if (r0 == null) {
            return 2;
        }
        return r0.A04();
    }

    public void A02() {
        AnonymousClass5ZI r1 = this.A0C;
        r1.A08();
        r1.A09("gps_request_start");
        this.A03 = true;
    }

    public void A03() {
        C111525iE r3;
        int i;
        Integer num;
        int i2;
        AnonymousClass4UB r2 = this.A00;
        int i3 = r2.A00;
        if (!(i3 == 0 || i3 == 2)) {
            if (i3 == 4) {
                r3 = this.A04;
                i = r2.A0I();
                num = A00(this);
                i2 = 27;
                r3.A07(num, i2, i);
            } else if (i3 != 7) {
                return;
            }
        }
        r3 = this.A04;
        i = r2.A0I();
        num = A00(this);
        i2 = 26;
        r3.A07(num, i2, i);
    }

    public void A04() {
        AnonymousClass4UB r2 = this.A00;
        C105085Tn r0 = r2.A04;
        AnonymousClass5TO r1 = r2.A05;
        AnonymousClass5ZO A012 = r0.A01();
        if (A012 == null) {
            A012 = r1.A00();
        }
        r2.A0M(A012);
        r2.A0L();
    }

    public void A05() {
        AnonymousClass4UB r2 = this.A00;
        r2.A00 = 3;
        r2.A02.removeCallbacks(r2.A0B);
        r2.A0G(r2.A0J());
    }

    public void A06() {
        AnonymousClass4UB r3 = this.A00;
        r3.A0A.BkM(new C117125rQ(r3, 31));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r2 == 7) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(X.AnonymousClass7T4 r6, int r7) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0028
            X.5iG r4 = r5.A06
            java.lang.String r0 = "imprecise_location_tile"
            java.util.Map r3 = r6.A00(r0)
            int r2 = r6.A00
            r1 = 28
            if (r2 == 0) goto L_0x001d
            r0 = 1
            if (r2 == r0) goto L_0x001b
            r0 = 4
            if (r2 == r0) goto L_0x001b
            r0 = 7
            r1 = 27
            if (r2 != r0) goto L_0x001d
        L_0x001b:
            r1 = 29
        L_0x001d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            int r0 = r0.intValue()
            r4.BK9(r3, r7, r0)
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112225jO.A09(X.7T4, int):void");
    }

    public boolean A0A() {
        int i = this.A00.A00;
        if (i == 2 || i == 0 || i == 7) {
            return true;
        }
        return false;
    }

    public void BUU(AnonymousClass7T4 r4, int i) {
        this.A02 = r4;
        AnonymousClass4UB r2 = this.A00;
        if (r2.A00 == 1) {
            int i2 = 6;
            if (i == -1) {
                i2 = 5;
            }
            r2.A00 = i2;
            r2.A02.removeCallbacks(r2.A0B);
            r2.A0H(r2.A0J());
        }
        if (i == 4) {
            this.A01.BUT(r4, i);
        }
        this.A0C.A03();
    }

    public void BUV(AnonymousClass5ZO r4) {
        AnonymousClass4UB r2 = this.A00;
        if (r2.A00 == 1) {
            r2.A02.removeCallbacks(r2.A0B);
            C18290x4.A1M(r2.A0A, r2, r4, 43);
        }
        this.A0C.A04();
    }

    public C112225jO(AnonymousClass5MC r10, AnonymousClass5MD r11, C111525iE r12, C111525iE r13, C111545iG r14, AnonymousClass4w0 r15, C105085Tn r16, AnonymousClass5TO r17, C181988ng r18, C184238rT r19, C184258rV r20, AnonymousClass5ZR r21, C105355Up r22, AnonymousClass8E9 r23, AnonymousClass4FS r24) {
        AnonymousClass4FS r8 = r24;
        this.A0D = r8;
        this.A04 = r12;
        AnonymousClass5ZR r6 = r21;
        this.A0A = r6;
        C105355Up r7 = r22;
        this.A0B = r7;
        this.A07 = r11.A00(r23, r13);
        this.A08 = r15;
        C105085Tn r2 = r16;
        this.A09 = r2;
        this.A0C = r10.A00(871839723);
        this.A00 = new AnonymousClass4UB(r15, r2, r17, r18, r20, r6, r7, r8);
        this.A01 = r19;
        this.A05 = r13;
        this.A06 = r14;
    }

    public static Integer A00(C112225jO r0) {
        return Integer.valueOf(r0.A01());
    }

    public void A07(int i) {
        HashMap A0t = AnonymousClass001.A0t();
        A0t.put("error_type", "location_error");
        A0t.put("error_description", "System location providers - GPS and Network providers - are not available");
        this.A06.BK9(A0t, i, 51);
        this.A0C.A03();
    }
}
