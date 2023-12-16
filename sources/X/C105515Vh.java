package X;

import com.whatsapp.R;

/* renamed from: X.5Vh  reason: invalid class name and case insensitive filesystem */
public class C105515Vh {
    public static final int[] A00;
    public static final int[] A01 = {R.attr.f3nameremoved};

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        if (r0 != 0) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (((X.C000500m) r5).A00 != r2) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Context A00(android.content.Context r5, android.util.AttributeSet r6, int r7, int r8) {
        /*
            int[] r0 = A01
            android.content.res.TypedArray r1 = r5.obtainStyledAttributes(r6, r0, r7, r8)
            r0 = 0
            int r2 = r1.getResourceId(r0, r0)
            r1.recycle()
            boolean r0 = r5 instanceof X.C000500m
            r4 = 1
            if (r0 == 0) goto L_0x001b
            r0 = r5
            X.00m r0 = (X.C000500m) r0
            int r1 = r0.A00
            r0 = 1
            if (r1 == r2) goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r2 == 0) goto L_0x0044
            if (r0 != 0) goto L_0x0044
            X.00m r3 = new X.00m
            r3.<init>((android.content.Context) r5, (int) r2)
            int[] r0 = A00
            android.content.res.TypedArray r2 = r5.obtainStyledAttributes(r6, r0)
            r0 = 0
            int r1 = r2.getResourceId(r0, r0)
            int r0 = r2.getResourceId(r4, r0)
            r2.recycle()
            if (r1 != 0) goto L_0x003c
            r1 = r0
            if (r0 == 0) goto L_0x0043
        L_0x003c:
            android.content.res.Resources$Theme r0 = r3.getTheme()
            r0.applyStyle(r1, r4)
        L_0x0043:
            return r3
        L_0x0044:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105515Vh.A00(android.content.Context, android.util.AttributeSet, int, int):android.content.Context");
    }

    static {
        int[] A1Z = C86664Kz.A1Z();
        A1Z[0] = 16842752;
        A1Z[1] = R.attr.f3nameremoved;
        A00 = A1Z;
    }
}
