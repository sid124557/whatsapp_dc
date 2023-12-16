package X;

import java.util.Collection;

/* renamed from: X.5UK  reason: invalid class name */
public final class AnonymousClass5UK {
    public final C104115Ps A00;
    public final C56982ss A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass4FV A03;

    public final void A00(int i) {
        C94444rL r2 = new C94444rL();
        r2.A01 = Integer.valueOf(i);
        r2.A02 = C86644Kx.A0f(this.A01.A03);
        r2.A00 = Boolean.valueOf(C18280x3.A1W(AnonymousClass0x2.A0F(this.A00.A00), "does_user_have_passcode"));
        this.A03.BhD(r2);
    }

    public final void A01(int i, int i2) {
        AnonymousClass1YN r1 = new AnonymousClass1YN();
        r1.A01 = Integer.valueOf(i);
        r1.A00 = Integer.valueOf(i2);
        r1.A02 = C86644Kx.A0f(this.A01.A03);
        this.A03.BhD(r1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (((X.C91584kP) r6).A01 != false) goto L_0x000b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x000e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.AnonymousClass5AS r6, java.lang.Integer r7) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C91584kP
            r2 = 3
            if (r0 == 0) goto L_0x0057
            X.4kP r6 = (X.C91584kP) r6
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x0074
        L_0x000b:
            r4 = 1
        L_0x000c:
            if (r7 == 0) goto L_0x0016
            int r3 = r7.intValue()
            r0 = 5
            if (r3 != r0) goto L_0x002d
            r2 = 1
        L_0x0016:
            X.1X7 r1 = new X.1X7
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A01 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1.A00 = r0
            X.4FV r0 = r5.A03
            r0.BhD(r1)
            return
        L_0x002d:
            r1 = 13
            r0 = 10
            if (r3 == r0) goto L_0x0055
            if (r3 == r1) goto L_0x0055
            r1 = 2
            r0 = 15
            if (r3 != r0) goto L_0x003d
            r2 = 9
            goto L_0x0016
        L_0x003d:
            r0 = 7
            if (r3 != r0) goto L_0x0043
            r2 = 10
            goto L_0x0016
        L_0x0043:
            r0 = 4
            if (r3 != r0) goto L_0x0049
            r2 = 11
            goto L_0x0016
        L_0x0049:
            if (r3 != r2) goto L_0x004e
            r2 = 12
            goto L_0x0016
        L_0x004e:
            r2 = 14
            if (r3 != r1) goto L_0x0016
            r2 = 13
            goto L_0x0016
        L_0x0055:
            r2 = 2
            goto L_0x0016
        L_0x0057:
            boolean r0 = r6 instanceof X.C91574kO
            if (r0 != 0) goto L_0x0076
            boolean r0 = r6 instanceof X.C91564kN
            if (r0 != 0) goto L_0x0076
            boolean r0 = r6 instanceof X.C91604kR
            if (r0 != 0) goto L_0x0074
            boolean r0 = r6 instanceof X.C91594kQ
            if (r0 != 0) goto L_0x000b
            boolean r0 = r6 instanceof X.C91554kM
            if (r0 != 0) goto L_0x000b
            boolean r0 = r6 instanceof X.C91544kL
            if (r0 != 0) goto L_0x000b
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x0074:
            r4 = 3
            goto L_0x000c
        L_0x0076:
            r4 = 0
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5UK.A02(X.5AS, java.lang.Integer):void");
    }

    public final void A03(AnonymousClass5AS r2, Integer num, Integer num2, int i) {
        C95814uZ r0;
        Collection collection;
        if ((r2 instanceof C91594kQ) || (r2 instanceof C91604kR)) {
            r0 = null;
        } else if (r2 instanceof C91564kN) {
            r0 = ((C91564kN) r2).A00;
        } else if (r2 instanceof C91584kP) {
            r0 = ((C91584kP) r2).A00;
        } else if (r2 instanceof C91544kL) {
            r0 = ((C91544kL) r2).A00;
        } else {
            if (r2 instanceof C91574kO) {
                collection = ((C91574kO) r2).A00;
            } else if (r2 instanceof C91554kM) {
                collection = ((C91554kM) r2).A00;
            } else {
                throw C73153f1.A00();
            }
            r0 = (C95814uZ) C73723fy.A01(collection);
        }
        A04(r0, num, num2, i);
    }

    public final void A04(C95814uZ r4, Integer num, Integer num2, int i) {
        Boolean bool;
        if (r4 != null) {
            bool = Boolean.valueOf(C627336j.A0K(r4));
        } else {
            bool = null;
        }
        C94664ri r2 = new C94664ri();
        r2.A03 = Integer.valueOf(i);
        r2.A00 = bool;
        if (this.A02.A0X(5337)) {
            r2.A01 = num;
            r2.A04 = C86644Kx.A0f(this.A01.A03);
            r2.A02 = num2;
        }
        this.A03.BhD(r2);
    }

    public final void A05(Integer num, Integer num2) {
        AnonymousClass4rK r2 = new AnonymousClass4rK();
        r2.A01 = num;
        r2.A00 = Boolean.valueOf(C18280x3.A1W(AnonymousClass0x2.A0F(this.A00.A00), "does_user_have_passcode"));
        r2.A02 = num2;
        this.A03.BhD(r2);
    }

    public AnonymousClass5UK(C104115Ps r1, C56982ss r2, AnonymousClass1VX r3, AnonymousClass4FV r4) {
        C18260x0.A0c(r3, r4, r2, r1);
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
    }
}
