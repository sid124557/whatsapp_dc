package X;

import java.util.Set;

/* renamed from: X.3PC  reason: invalid class name */
public final class AnonymousClass3PC implements AnonymousClass4G3, AnonymousClass4D3 {
    public final AnonymousClass32U A00;

    public Set B80() {
        return C73833g9.A06(AnonymousClass23Q.A1A, AnonymousClass23Q.A19, AnonymousClass23Q.A18, AnonymousClass23Q.A17, AnonymousClass23Q.A2n, AnonymousClass23Q.A2o);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        if (r1 == 1) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C624134x BgV(X.C50972j4 r12, X.AnonymousClass1ES r13) {
        /*
            r11 = this;
            r5 = 0
            X.32U r0 = r11.A00
            X.2z0 r2 = r0.A02(r13)
            long r0 = X.AnonymousClass32U.A00(r13)
            X.1mr r4 = new X.1mr
            r4.<init>(r2, r0)
            int r0 = r13.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0019
            X.AnonymousClass32Y.A0D(r13, r4)
        L_0x0019:
            X.23Q r3 = r13.A0M()
            X.C162457s7.A0D(r3)
            int r0 = r3.ordinal()
            r1 = 0
            switch(r0) {
                case 40: goto L_0x0047;
                case 41: goto L_0x0046;
                case 45: goto L_0x0044;
                case 46: goto L_0x0042;
                case 169: goto L_0x0047;
                case 170: goto L_0x0046;
                default: goto L_0x0028;
            }
        L_0x0028:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unexpected missed stub type "
            r1.append(r0)
            java.lang.String r0 = r3.name()
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            X.24W r0 = X.AnonymousClass24W.A01(r2, r0)
            throw r0
        L_0x0042:
            r1 = 3
            goto L_0x0047
        L_0x0044:
            r1 = 2
            goto L_0x0047
        L_0x0046:
            r1 = 1
        L_0x0047:
            r0 = 3
            r10 = 1
            if (r1 == r0) goto L_0x004e
            r9 = 0
            if (r1 != r10) goto L_0x004f
        L_0x004e:
            r9 = 1
        L_0x004f:
            r6 = 2
            r7 = 0
            X.3ZF r2 = X.AnonymousClass3ZF.A00(r4, r5, r6, r7, r9, r10)
            if (r2 == 0) goto L_0x0071
            X.23Q r1 = r13.A0M()
            X.C162457s7.A0D(r1)
            X.23Q r0 = X.AnonymousClass23Q.A2n
            if (r1 == r0) goto L_0x0067
            X.23Q r0 = X.AnonymousClass23Q.A2o
            if (r1 != r0) goto L_0x006a
        L_0x0067:
            r2.A0E(r6)
        L_0x006a:
            java.util.List r0 = java.util.Collections.singletonList(r2)
            r4.A1x(r0)
        L_0x0071:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3PC.BgV(X.2j4, X.1ES):X.34x");
    }

    public AnonymousClass3PC(AnonymousClass32U r1) {
        this.A00 = r1;
    }

    public void AyB(C52952mJ r5, AnonymousClass1A3 r6, C624134x r7) {
        C30691mr r0;
        AnonymousClass23Q r02;
        C18260x0.A0O(r7, r6);
        if (!(r7 instanceof C30691mr) || (r0 = (C30691mr) r7) == null) {
            Integer A0X = C18320x8.A0X();
            StringBuilder A0o = AnonymousClass001.A0o();
            C18260x0.A0N(C18310x6.A0c(r7, "Invalid message class: ", A0o), A0o);
            throw new AnonymousClass24A(A0X, A0o.toString());
        }
        boolean A1z = r0.A1z();
        int A1y = r0.A1y();
        if (A1z) {
            if (A1y == 0 || (A1y != 1 && A1y == 2)) {
                r02 = AnonymousClass23Q.A2n;
            } else {
                r02 = AnonymousClass23Q.A2o;
            }
        } else if (A1y == 0) {
            r02 = AnonymousClass23Q.A1A;
        } else if (A1y == 1) {
            r02 = AnonymousClass23Q.A19;
        } else if (A1y != 2) {
            r02 = AnonymousClass23Q.A17;
        } else {
            r02 = AnonymousClass23Q.A18;
        }
        r6.A0C(r02);
    }

    public AnonymousClass21E B88() {
        return AnonymousClass21E.STUB_MESSAGE;
    }
}
