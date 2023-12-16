package X;

import android.app.Activity;
import android.net.Uri;
import java.util.HashMap;

/* renamed from: X.567  reason: invalid class name */
public class AnonymousClass567 extends AnonymousClass5YG {
    public int A00;
    public int A01 = 0;
    public long A02;
    public Uri A03 = new Uri.Builder().build();
    public C180218kg A04;
    public C162997t6 A05;
    public C159117l9 A06;
    public AnonymousClass8LG A07;
    public AnonymousClass5NV A08;
    public AnonymousClass4FS A09;
    public C150627Rn A0A = null;
    public C153387bE A0B;
    public C183358pu A0C;
    public AnonymousClass561 A0D;
    public boolean A0E;
    public boolean A0F = false;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R = false;
    public final C186008ub A0S = new AnonymousClass85H(this);
    public final C69263Wi A0T;
    public final C138436qM A0U;

    public static void A01(AnonymousClass567 r2, C1675381l r3) {
        r3.A00 = new C1236969k(r2, 1);
        r2.A04 = r3;
    }

    public void A0E() {
        AnonymousClass4FS r2 = this.A09;
        if (r2 != null) {
            r2.BkM(new C117095rN(this, 47));
        } else {
            super.A0E();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        if (r9.A0R == false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0f() {
        /*
            r9 = this;
            X.7t6 r0 = r9.A05
            if (r0 != 0) goto L_0x0096
            X.5NV r1 = r9.A08
            X.66R r0 = r1.A02
            boolean r0 = X.C18270x1.A1V(r0)
            X.7l9 r4 = r9.A06
            if (r0 == 0) goto L_0x00ca
            X.66R r0 = r1.A00
            java.lang.Object r3 = r0.getValue()
            android.os.Looper r3 = (android.os.Looper) r3
            X.85B r1 = new X.85B
            r1.<init>(r9)
            X.8LG r0 = r9.A07
            X.7t6 r2 = new X.7t6
            r2.<init>(r3, r1, r4, r0)
        L_0x0024:
            r9.A05 = r2
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            X.7Rn r0 = r9.A0A
            if (r0 == 0) goto L_0x00c7
            boolean r0 = r0.A00()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r0 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x0039:
            android.net.Uri r3 = r9.A03
            boolean r0 = r9.A0C
            if (r0 == 0) goto L_0x0044
            boolean r0 = r9.A0R
            r5 = 1
            if (r0 != 0) goto L_0x0045
        L_0x0044:
            r5 = 0
        L_0x0045:
            int r4 = r9.A00
            boolean r6 = r9.A0F
            boolean r7 = r2.booleanValue()
            boolean r8 = r1.booleanValue()
            X.7a6 r1 = X.C155157eN.A00(r3, r4, r5, r6, r7, r8)
            X.8kg r0 = r9.A04
            if (r0 == 0) goto L_0x005b
            r1.A03 = r0
        L_0x005b:
            X.7t6 r0 = r9.A05
            r0.A0H(r1)
            X.7t6 r2 = r9.A05
            boolean r1 = r9.A0M
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x0069
            r0 = 0
        L_0x0069:
            r2.A0B(r0)
            X.7t6 r0 = r9.A05
            X.8ub r2 = r9.A0S
            android.os.Handler r1 = r0.A0C
            r0 = 44
            android.os.Message r0 = r1.obtainMessage(r0, r2)
            r1.sendMessage(r0)
            X.6qM r1 = r9.A0U
            X.7t6 r0 = r9.A05
            r1.setPlayer(r0)
            boolean r0 = r9.A0E
            if (r0 == 0) goto L_0x0097
            long r2 = r9.A02
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00d8
            X.7t6 r0 = r9.A05
            r0.A09()
        L_0x0096:
            return
        L_0x0097:
            android.util.Pair r0 = r9.A04
            if (r0 == 0) goto L_0x0096
            int r3 = X.C18280x3.A03(r0)
            if (r3 < 0) goto L_0x00af
            X.7t6 r2 = r9.A05
            int r0 = X.C18290x4.A03(r0)
            long r0 = (long) r0
            r2.A0C(r3, r0)
        L_0x00ab:
            r0 = 0
            r9.A04 = r0
            return
        L_0x00af:
            int r0 = X.C18290x4.A03(r0)
            if (r0 < 0) goto L_0x00ab
            X.7t6 r2 = r9.A05
            X.7Ap r1 = new X.7Ap
            r1.<init>()
            r1.A00 = r0
            X.7RE r0 = new X.7RE
            r0.<init>(r1)
            r2.A0E(r0)
            goto L_0x00ab
        L_0x00c7:
            r1 = r2
            goto L_0x0039
        L_0x00ca:
            X.85B r1 = new X.85B
            r1.<init>(r9)
            X.8LG r0 = r9.A07
            X.7t6 r2 = new X.7t6
            r2.<init>(r1, r4, r0)
            goto L_0x0024
        L_0x00d8:
            X.7t6 r1 = r9.A05
            int r0 = r9.A00
            r1.A0C(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass567.A0f():void");
    }

    public AnonymousClass567(Activity activity, C69263Wi r6, C620633i r7, C54292oU r8, AnonymousClass5NV r9, AnonymousClass4FS r10, C153387bE r11, int i, boolean z) {
        this.A0T = r6;
        this.A05 = r7;
        this.A02 = activity;
        this.A07 = r9.A00();
        this.A08 = r9;
        C138436qM r0 = new C138436qM(activity, r6, z);
        this.A0U = r0;
        r0.setLayoutResizeMode(i);
        this.A0B = r11;
        this.A09 = r10;
        HashMap A0t = AnonymousClass001.A0t();
        this.A06 = C159117l9.A00(r8.A00, this.A07, C186628vg.A00, A0t);
    }
}
