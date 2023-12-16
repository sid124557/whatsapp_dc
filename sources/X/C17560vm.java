package X;

import android.view.View;

/* renamed from: X.0vm  reason: invalid class name and case insensitive filesystem */
public class C17560vm extends AnonymousClass0QV {
    public final int A00;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r0 = 28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        super(r3, r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17560vm(int r5) {
        /*
            r4 = this;
            r4.A00 = r5
            switch(r5) {
                case 0: goto L_0x0011;
                case 1: goto L_0x0017;
                case 2: goto L_0x001f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            r2 = 2131434165(0x7f0b1ab5, float:1.8490136E38)
        L_0x000a:
            r1 = 0
        L_0x000b:
            r0 = 28
        L_0x000d:
            r4.<init>(r3, r2, r1, r0)
            return
        L_0x0011:
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            r2 = 2131434171(0x7f0b1abb, float:1.8490148E38)
            goto L_0x000a
        L_0x0017:
            java.lang.Class<java.lang.CharSequence> r3 = java.lang.CharSequence.class
            r2 = 2131434166(0x7f0b1ab6, float:1.8490138E38)
            r1 = 8
            goto L_0x000b
        L_0x001f:
            java.lang.Class<java.lang.CharSequence> r3 = java.lang.CharSequence.class
            r2 = 2131434173(0x7f0b1abd, float:1.8490152E38)
            r1 = 64
            r0 = 30
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17560vm.<init>(int):void");
    }

    public /* bridge */ /* synthetic */ Object A04(View view) {
        boolean A06;
        switch (this.A00) {
            case 0:
                A06 = C06480Xw.A06(view);
                break;
            case 1:
                return C06480Xw.A00(view);
            case 2:
                return C04950Rh.A00(view);
            default:
                A06 = C06480Xw.A05(view);
                break;
        }
        return Boolean.valueOf(A06);
    }

    public /* bridge */ /* synthetic */ void A05(View view, Object obj) {
        switch (this.A00) {
            case 0:
                C06480Xw.A04(view, AnonymousClass001.A1Z(obj));
                return;
            case 1:
                C06480Xw.A02(view, (CharSequence) obj);
                return;
            case 2:
                C04950Rh.A01(view, (CharSequence) obj);
                return;
            default:
                C06480Xw.A03(view, AnonymousClass001.A1Z(obj));
                return;
        }
    }
}
