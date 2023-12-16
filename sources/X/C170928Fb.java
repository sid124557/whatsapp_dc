package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.8Fb  reason: invalid class name and case insensitive filesystem */
public class C170928Fb implements C186288v3 {
    public View A00;
    public View A01;
    public AnonymousClass0P8 A02;
    public boolean A03 = true;
    public final Activity A04;
    public final C15790rw A05;
    public final C15790rw A06;
    public final AnonymousClass08M A07 = AnonymousClass08M.A01();
    public final AnonymousClass08M A08 = AnonymousClass08M.A01();
    public final C150507Ra A09 = new C150507Ra();
    public final C52412lR A0A;
    public final AnonymousClass803 A0B;
    public final C106975aT A0C;

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.view.View r12, X.AnonymousClass08M r13) {
        /*
            r11 = this;
            X.0P8 r0 = r11.A02
            if (r0 == 0) goto L_0x0030
            if (r12 == 0) goto L_0x0030
            boolean r0 = r11.A03
            if (r0 == 0) goto L_0x0018
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x0031
            android.app.Activity r0 = r11.A04
            boolean r0 = r0.isInPictureInPictureMode()
            if (r0 == 0) goto L_0x0031
        L_0x0018:
            X.7k5 r5 = X.C158507k5.A04
        L_0x001a:
            java.lang.Object r2 = r13.A07()
            if (r2 != 0) goto L_0x0027
            int r1 = r5.A00
            if (r1 == 0) goto L_0x0030
            r0 = 3
            if (r1 == r0) goto L_0x0030
        L_0x0027:
            boolean r0 = X.AnonymousClass75J.A00(r2, r5)
            if (r0 != 0) goto L_0x0030
            r13.A0G(r5)
        L_0x0030:
            return
        L_0x0031:
            X.0P8 r0 = r11.A02
            X.0vM r10 = X.AnonymousClass74V.A00(r0)
            if (r10 != 0) goto L_0x0049
            X.2lR r0 = r11.A0A
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0018
            r1 = 3
            r0 = 0
            X.7k5 r5 = new X.7k5
            r5.<init>(r0, r0, r1)
            goto L_0x001a
        L_0x0049:
            android.view.ViewParent r5 = r12.getParent()
            android.view.View r5 = (android.view.View) r5
            int r0 = r5.getHeight()
            if (r0 == 0) goto L_0x0030
            boolean r0 = r10.BIu()
            if (r0 == 0) goto L_0x0018
            int[] r7 = X.C86664Kz.A1Z()
            r5.getLocationOnScreen(r7)
            r9 = 0
            r6 = r7[r9]
            r4 = 1
            r3 = r7[r4]
            int r2 = r5.getWidth()
            int r2 = r2 + r6
            r1 = r7[r4]
            int r0 = r5.getHeight()
            int r1 = r1 + r0
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>(r6, r3, r2, r1)
            X.0fG r10 = (X.C08880fG) r10
            X.0Pg r0 = r10.A00
            int r6 = r0.A01
            int r3 = r0.A03
            int r2 = r0.A02
            int r1 = r0.A00
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r6, r3, r2, r1)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r0)
            boolean r1 = r3.intersect(r8)
            int r0 = r3.width()
            if (r0 != 0) goto L_0x009f
            int r0 = r3.height()
            if (r0 == 0) goto L_0x0018
        L_0x009f:
            if (r1 == 0) goto L_0x0018
            r0 = r7[r9]
            int r1 = -r0
            r0 = r7[r4]
            int r0 = -r0
            r3.offset(r1, r0)
            int r0 = r3.left
            if (r0 != 0) goto L_0x00c3
            int r2 = r5.getWidth()
            int r0 = r5.getHeight()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>(r2, r0)
            r0 = 2
            X.7k5 r5 = new X.7k5
            r5.<init>(r1, r3, r0)
            goto L_0x001a
        L_0x00c3:
            int r0 = r3.top
            if (r0 != 0) goto L_0x0030
            int r2 = r5.getWidth()
            int r1 = r5.getHeight()
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r2, r1)
            X.7k5 r5 = new X.7k5
            r5.<init>(r0, r3, r4)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170928Fb.A00(android.view.View, X.08M):void");
    }

    public C06270Wx B56() {
        return this.A07;
    }

    public C06270Wx B57() {
        return this.A08;
    }

    public void BXU() {
        C106975aT r1 = this.A0C;
        Activity activity = this.A04;
        synchronized (r1) {
            r1.A00();
            r1.A01(activity);
        }
    }

    public void BY5() {
        C106975aT r1 = this.A0C;
        Activity activity = this.A04;
        synchronized (r1) {
            r1.A00();
            r1.A01(activity);
        }
    }

    public void Bc7(View view) {
        this.A01 = view;
        C106975aT r1 = this.A0C;
        r1.A02(this.A06);
        r1.A02(this.A0B);
        r1.A02(this.A05);
        r1.A01(this.A04);
    }

    public void Bcl() {
        C106975aT r0 = this.A0C;
        r0.A00();
        r0.A01.clear();
    }

    public void Blr(View view) {
        this.A00 = view;
        A00(view, this.A07);
    }

    public void BmE(boolean z) {
        if (this.A03 != z) {
            this.A03 = z;
            A00(this.A01, this.A08);
            A00(this.A00, this.A07);
        }
    }

    public void onGlobalLayout() {
        A00(this.A01, this.A08);
        A00(this.A00, this.A07);
    }

    public C170928Fb(C003203q r2, AnonymousClass801 r3, C52412lR r4, AnonymousClass803 r5, C106975aT r6, AnonymousClass4FV r7) {
        this.A04 = r2;
        this.A0C = r6;
        this.A0B = r5;
        this.A05 = r3;
        this.A0A = r4;
        this.A06 = new AnonymousClass802(r2, this, r7);
    }
}
