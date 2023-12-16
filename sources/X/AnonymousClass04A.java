package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.04A  reason: invalid class name */
public class AnonymousClass04A extends AnonymousClass04B implements C14920qU {
    public int A00;
    public int A01;
    public AnonymousClass048 A02;
    public AnonymousClass0Q2 A03;
    public boolean A04;

    public AnonymousClass04A(Resources resources, AnonymousClass048 r3) {
        super((AnonymousClass049) null);
        this.A01 = -1;
        this.A00 = -1;
        A02(new AnonymousClass048(resources, r3, this));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public /* bridge */ /* synthetic */ AnonymousClass011 A00() {
        return new AnonymousClass048((Resources) null, this.A02, this);
    }

    public /* bridge */ /* synthetic */ AnonymousClass049 A05() {
        return new AnonymousClass048((Resources) null, this.A02, this);
    }

    public Drawable mutate() {
        if (!this.A04) {
            super.mutate();
            if (this == this) {
                this.A02.A04();
                this.A04 = true;
            }
        }
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e9, code lost:
        if (A04(r4) != false) goto L_0x0025;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStateChange(int[] r13) {
        /*
            r12 = this;
            X.048 r0 = r12.A02
            int r4 = r0.A09(r13)
            int r3 = r12.A01
            if (r4 == r3) goto L_0x00ed
            X.0Q2 r1 = r12.A03
            if (r1 == 0) goto L_0x0033
            int r3 = r12.A01
            if (r4 == r3) goto L_0x0025
            int r0 = r12.A00
            if (r4 != r0) goto L_0x0030
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x0030
            r1.A00()
            int r0 = r12.A00
            r12.A01 = r0
            r12.A00 = r4
        L_0x0025:
            r1 = 1
        L_0x0026:
            android.graphics.drawable.Drawable r0 = r12.A05
            if (r0 == 0) goto L_0x002f
            boolean r0 = r0.setState(r13)
            r1 = r1 | r0
        L_0x002f:
            return r1
        L_0x0030:
            r1.A02()
        L_0x0033:
            r0 = 0
            r12.A03 = r0
            r0 = -1
            r12.A00 = r0
            r12.A01 = r0
            X.048 r2 = r12.A02
            r5 = 0
            if (r3 < 0) goto L_0x004e
            X.0i5 r1 = r2.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.Object r0 = r1.A01(r3, r0)
            int r5 = X.AnonymousClass001.A0K(r0)
        L_0x004e:
            r0 = 0
            if (r4 < 0) goto L_0x00e5
            X.0i5 r1 = r2.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.A01(r4, r0)
            int r1 = X.AnonymousClass001.A0K(r0)
            if (r1 == 0) goto L_0x00e5
            if (r5 == 0) goto L_0x00e5
            long r5 = (long) r5
            r0 = 32
            long r5 = r5 << r0
            long r0 = (long) r1
            long r0 = r0 | r5
            X.0i7 r7 = r2.A00
            r5 = -1
            java.lang.Long r8 = java.lang.Long.valueOf(r5)
            java.lang.Object r5 = r7.A05(r0, r8)
            java.lang.Number r5 = (java.lang.Number) r5
            long r5 = r5.longValue()
            int r9 = (int) r5
            if (r9 < 0) goto L_0x00e5
            X.0i7 r5 = r2.A00
            java.lang.Object r5 = r5.A05(r0, r8)
            java.lang.Number r5 = (java.lang.Number) r5
            long r10 = r5.longValue()
            r5 = 8589934592(0x200000000, double:4.243991582E-314)
            long r10 = r10 & r5
            r6 = 0
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            boolean r6 = X.AnonymousClass000.A1S(r5)
            r12.A04(r9)
            android.graphics.drawable.Drawable r5 = r12.A05
            boolean r7 = r5 instanceof android.graphics.drawable.AnimationDrawable
            if (r7 == 0) goto L_0x00cd
            X.0i7 r2 = r2.A00
            java.lang.Object r0 = r2.A05(r0, r8)
            java.lang.Number r0 = (java.lang.Number) r0
            long r7 = r0.longValue()
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            long r7 = r7 & r0
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r0)
            android.graphics.drawable.AnimationDrawable r5 = (android.graphics.drawable.AnimationDrawable) r5
            X.046 r0 = new X.046
            r0.<init>(r5, r1, r6)
        L_0x00c2:
            r0.A01()
            r12.A03 = r0
            r12.A00 = r3
            r12.A01 = r4
            goto L_0x0025
        L_0x00cd:
            boolean r0 = r5 instanceof X.AnonymousClass0AR
            if (r0 == 0) goto L_0x00d9
            X.0AR r5 = (X.AnonymousClass0AR) r5
            X.045 r0 = new X.045
            r0.<init>(r5)
            goto L_0x00c2
        L_0x00d9:
            boolean r0 = r5 instanceof android.graphics.drawable.Animatable
            if (r0 == 0) goto L_0x00e5
            android.graphics.drawable.Animatable r5 = (android.graphics.drawable.Animatable) r5
            X.044 r0 = new X.044
            r0.<init>(r5)
            goto L_0x00c2
        L_0x00e5:
            boolean r0 = r12.A04(r4)
            if (r0 == 0) goto L_0x00ed
            goto L_0x0025
        L_0x00ed:
            r1 = 0
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass04A.onStateChange(int[]):boolean");
    }

    public void A02(AnonymousClass011 r2) {
        super.A02(r2);
        if (r2 instanceof AnonymousClass048) {
            this.A02 = (AnonymousClass048) r2;
        }
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        AnonymousClass0Q2 r0 = this.A03;
        if (r0 != null) {
            r0.A02();
            this.A03 = null;
            A04(this.A01);
            this.A01 = -1;
            this.A00 = -1;
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        AnonymousClass0Q2 r0 = this.A03;
        if (r0 != null && (visible || z2)) {
            if (z) {
                r0.A01();
            } else {
                jumpToCurrentState();
                return visible;
            }
        }
        return visible;
    }

    public AnonymousClass04A() {
        this((Resources) null, (AnonymousClass048) null);
    }
}
