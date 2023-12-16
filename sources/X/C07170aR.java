package X;

import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: X.0aR  reason: invalid class name and case insensitive filesystem */
public class C07170aR implements View.OnTouchListener {
    public C03570Ks A00;
    public final float A01;
    public final C153427bI A02;
    public final AnonymousClass84O A03;
    public final AnonymousClass84O A04;

    public static final boolean A00(View view, float f, float f2, float f3) {
        C162457s7.A0J(view, 0);
        float f4 = -f3;
        if (f < f4 || f2 < f4 || f >= ((float) (view.getRight() - view.getLeft())) + f3 || f2 >= ((float) (view.getBottom() - view.getTop())) + f3) {
            return false;
        }
        return true;
    }

    public final void A01() {
        AnonymousClass84O r4 = this.A04;
        C835248t A0L = r4.A0L(35);
        if (A0L != null) {
            C152057Xj r2 = new C152057Xj();
            r2.A05(this.A03, 0);
            C153427bI r1 = this.A02;
            r2.A05(r1, 1);
            C159377lj.A01(r1, r4, r2.A03(), A0L);
        }
    }

    public final void A02() {
        AnonymousClass84O r4 = this.A04;
        C835248t A0L = r4.A0L(38);
        if (A0L != null) {
            C152057Xj r2 = new C152057Xj();
            r2.A05(this.A03, 0);
            C153427bI r1 = this.A02;
            r2.A05(r1, 1);
            C159377lj.A01(r1, r4, r2.A03(), A0L);
        }
    }

    public C07170aR(C153427bI r2, AnonymousClass84O r3, AnonymousClass84O r4) {
        this.A04 = r3;
        this.A02 = r2;
        this.A03 = r4;
        this.A00 = (C03570Ks) C162377rs.A05(r2, r3);
        this.A01 = (float) ViewConfiguration.get(r2.A00()).getScaledTouchSlop();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        if (r5.A00.A00 == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r1 != 4) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            int r1 = r7.getAction()
            r3 = 0
            if (r1 == 0) goto L_0x0039
            r0 = 1
            if (r1 == r0) goto L_0x0015
            r0 = 3
            if (r1 == r0) goto L_0x002f
            r0 = 4
            if (r1 == r0) goto L_0x002f
        L_0x0010:
            X.0Ks r0 = r5.A00
            boolean r0 = r0.A00
            return r0
        L_0x0015:
            X.0Ks r0 = r5.A00
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0010
            float r2 = r7.getX()
            float r1 = r7.getY()
            float r0 = r5.A01
            boolean r0 = A00(r6, r2, r1, r0)
            if (r0 == 0) goto L_0x0035
            r5.A02()
            goto L_0x0067
        L_0x002f:
            X.0Ks r0 = r5.A00
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0010
        L_0x0035:
            r5.A01()
            goto L_0x0067
        L_0x0039:
            X.84O r4 = r5.A04
            r0 = 36
            X.48t r2 = r4.A0L(r0)
            if (r2 != 0) goto L_0x0044
            return r3
        L_0x0044:
            X.7Xj r1 = new X.7Xj
            r1.<init>()
            X.84O r0 = r5.A03
            r1.A05(r0, r3)
            X.7jD r1 = r1.A03()
            X.7bI r0 = r5.A02
            java.lang.Object r2 = X.C159377lj.A01(r0, r4, r1, r2)
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 != 0) goto L_0x006c
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 != 0) goto L_0x006c
            java.lang.String r1 = "bk.components.FoaTouchExtension"
            java.lang.String r0 = "Got non-boolean result while evaluating touch down expression"
            X.C159737mN.A01(r1, r0)
        L_0x0067:
            X.0Ks r0 = r5.A00
            r0.A00 = r3
            goto L_0x0010
        L_0x006c:
            X.0Ks r1 = r5.A00
            boolean r0 = X.C159427lo.A02(r2)
            r1.A00 = r0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07170aR.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
