package X;

import android.os.Build;
import android.view.View;

/* renamed from: X.0QV  reason: invalid class name */
public abstract class AnonymousClass0QV {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Class A03;

    public abstract Object A04(View view);

    public abstract void A05(View view, Object obj);

    public Object A02(View view) {
        if (Build.VERSION.SDK_INT >= this.A01) {
            return A04(view);
        }
        Object tag = view.getTag(this.A02);
        if (!this.A03.isInstance(tag)) {
            return null;
        }
        return tag;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r1.booleanValue() == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r0 == false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(android.view.View r4, java.lang.Object r5) {
        /*
            r3 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            int r0 = r3.A01
            if (r1 < r0) goto L_0x000a
            r3.A05(r4, r5)
        L_0x0009:
            return
        L_0x000a:
            java.lang.Object r2 = r3.A02(r4)
            r0 = r3
            X.0vm r0 = (X.C17560vm) r0
            int r0 = r0.A00
            switch(r0) {
                case 1: goto L_0x0032;
                case 2: goto L_0x0032;
                default: goto L_0x0016;
            }
        L_0x0016:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r1 = r5
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r2 == 0) goto L_0x0024
            boolean r0 = r2.booleanValue()
            r2 = 1
            if (r0 != 0) goto L_0x0025
        L_0x0024:
            r2 = 0
        L_0x0025:
            if (r1 == 0) goto L_0x002e
            boolean r1 = r1.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            if (r2 != r0) goto L_0x003f
            return
        L_0x0032:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0 = r5
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0009
        L_0x003f:
            X.0WH r0 = X.C06560Yg.A03(r4)
            if (r0 != 0) goto L_0x004a
            X.0WH r0 = new X.0WH
            r0.<init>()
        L_0x004a:
            X.C06560Yg.A0O(r4, r0)
            int r0 = r3.A02
            r4.setTag(r0, r5)
            int r0 = r3.A00
            X.C06560Yg.A0H(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QV.A03(android.view.View, java.lang.Object):void");
    }

    public AnonymousClass0QV(Class cls, int i, int i2, int i3) {
        this.A02 = i;
        this.A03 = cls;
        this.A00 = i2;
        this.A01 = i3;
    }
}
