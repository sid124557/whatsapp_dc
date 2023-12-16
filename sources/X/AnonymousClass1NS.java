package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.1NS  reason: invalid class name */
public class AnonymousClass1NS extends C33991u3 {
    public final C69263Wi A00;
    public final C64773Ex A01;
    public final C56612sH A02;
    public final C46672c1 A03;
    public final C27991fJ A04;
    public final WeakReference A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1NS(X.C69263Wi r14, X.C64773Ex r15, X.C56612sH r16, X.AnonymousClass2Y1 r17, X.C46672c1 r18, X.AnonymousClass2KV r19, X.C60202yA r20, X.AnonymousClass319 r21, X.C55622qe r22, X.C54922pV r23, X.C22411Nc r24, X.C27991fJ r25, X.C1907099n r26, X.AnonymousClass9U4 r27) {
        /*
            r13 = this;
            r10 = r25
            r12 = r27
            r2 = r14
            r1 = r13
            r11 = r26
            r4 = r17
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r3 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = r16
            r13.A02 = r0
            r13.A00 = r14
            java.lang.ref.WeakReference r0 = X.AnonymousClass0x9.A14(r3)
            r13.A05 = r0
            r13.A01 = r15
            r13.A04 = r10
            r0 = r18
            r13.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NS.<init>(X.3Wi, X.3Ex, X.2sH, X.2Y1, X.2c1, X.2KV, X.2yA, X.319, X.2qe, X.2pV, X.1Nc, X.1fJ, X.99n, X.9U4):void");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C22411Nc r0 = (C22411Nc) this.A05.get();
        if (r0 != null) {
            r0.A02.A0H(C59022wD.A00);
        }
    }

    public Void A0G(Void... voidArr) {
        super.A08(voidArr);
        if (C18320x8.A1T(this)) {
            return null;
        }
        List<C30391mN> A002 = this.A03.A00(this.A04, C56612sH.A00(this.A02));
        HashSet A0K = AnonymousClass002.A0K();
        ArrayList A0s = AnonymousClass001.A0s();
        for (C30391mN r2 : A002) {
            C95814uZ r1 = r2.A1J.A00;
            if (r1 != null && !A0K.contains(r1)) {
                A0K.add(r1);
                AnonymousClass3ZH A07 = this.A01.A07(r1);
                if (A07 != null) {
                    A0s.add(new C148177Hh(A07, r2));
                }
            }
        }
        C69263Wi.A04(this.A00, this, A0s, 38);
        return null;
    }
}
