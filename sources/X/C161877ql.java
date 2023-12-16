package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* renamed from: X.7ql  reason: invalid class name and case insensitive filesystem */
public class C161877ql {
    public static final C181228mP A0C = new C170098Bw(0.5f);
    public C181228mP A00;
    public C181228mP A01;
    public C181228mP A02;
    public C181228mP A03;
    public C150377Qk A04;
    public C150377Qk A05;
    public C150377Qk A06;
    public C150377Qk A07;
    public C1446672l A08;
    public C1446672l A09;
    public C1446672l A0A;
    public C1446672l A0B;

    public static C158227jd A01(Context context, AttributeSet attributeSet, int i, int i2) {
        C170088Bv r4 = new C170088Bv((float) 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1463179t.A0P, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return A02(context, r4, resourceId, resourceId2);
    }

    public static C158227jd A02(Context context, C181228mP r11, int i, int i2) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(C1463179t.A0Y);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            C181228mP A002 = A00(obtainStyledAttributes, r11, 5);
            C181228mP A003 = A00(obtainStyledAttributes, A002, 8);
            C181228mP A004 = A00(obtainStyledAttributes, A002, 9);
            C181228mP A005 = A00(obtainStyledAttributes, A002, 7);
            C181228mP A006 = A00(obtainStyledAttributes, A002, 6);
            C158227jd r1 = new C158227jd();
            r1.A06 = C160927og.A00(i4);
            r1.A02 = A003;
            r1.A07 = C160927og.A00(i5);
            r1.A03 = A004;
            r1.A05 = C160927og.A00(i6);
            r1.A01 = A005;
            r1.A04 = C160927og.A00(i7);
            r1.A00 = A006;
            return r1;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0058, code lost:
        if (r5.A01.B60(r6) != r1) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0072, code lost:
        if ((r5.A04 instanceof X.AnonymousClass6ZB) == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0032, code lost:
        if (r5.A08.getClass().equals(r1) == false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03(android.graphics.RectF r6) {
        /*
            r5 = this;
            X.72l r0 = r5.A09
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<X.72l> r1 = X.C1446672l.class
            boolean r0 = r0.equals(r1)
            r4 = 1
            if (r0 == 0) goto L_0x0034
            X.72l r0 = r5.A0A
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0034
            X.72l r0 = r5.A0B
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0034
            X.72l r0 = r5.A08
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.equals(r1)
            r3 = 1
            if (r0 != 0) goto L_0x0035
        L_0x0034:
            r3 = 0
        L_0x0035:
            X.8mP r0 = r5.A02
            float r1 = r0.B60(r6)
            X.8mP r0 = r5.A03
            float r0 = r0.B60(r6)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x005a
            X.8mP r0 = r5.A00
            float r0 = r0.B60(r6)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x005a
            X.8mP r0 = r5.A01
            float r0 = r0.B60(r6)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 1
            if (r0 == 0) goto L_0x005b
        L_0x005a:
            r2 = 0
        L_0x005b:
            X.7Qk r0 = r5.A07
            boolean r0 = r0 instanceof X.AnonymousClass6ZB
            if (r0 == 0) goto L_0x0074
            X.7Qk r0 = r5.A06
            boolean r0 = r0 instanceof X.AnonymousClass6ZB
            if (r0 == 0) goto L_0x0074
            X.7Qk r0 = r5.A05
            boolean r0 = r0 instanceof X.AnonymousClass6ZB
            if (r0 == 0) goto L_0x0074
            X.7Qk r0 = r5.A04
            boolean r1 = r0 instanceof X.AnonymousClass6ZB
            r0 = 1
            if (r1 != 0) goto L_0x0075
        L_0x0074:
            r0 = 0
        L_0x0075:
            if (r3 == 0) goto L_0x007c
            if (r2 == 0) goto L_0x007c
            if (r0 == 0) goto L_0x007c
            return r4
        L_0x007c:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161877ql.A03(android.graphics.RectF):boolean");
    }

    public C161877ql(C158227jd r2) {
        this.A06 = r2.A06;
        this.A07 = r2.A07;
        this.A05 = r2.A05;
        this.A04 = r2.A04;
        this.A02 = r2.A02;
        this.A03 = r2.A03;
        this.A01 = r2.A01;
        this.A00 = r2.A00;
        this.A0B = r2.A0B;
        this.A0A = r2.A0A;
        this.A08 = r2.A08;
        this.A09 = r2.A09;
    }

    public static C181228mP A00(TypedArray typedArray, C181228mP r4, int i) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return r4;
        }
        int i2 = peekValue.type;
        if (i2 == 5) {
            return new C170088Bv((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i2 == 6) {
            return new C170098Bw(peekValue.getFraction(1.0f, 1.0f));
        }
        return r4;
    }

    public C161877ql() {
        this.A06 = new AnonymousClass6ZB();
        this.A07 = new AnonymousClass6ZB();
        this.A05 = new AnonymousClass6ZB();
        this.A04 = new AnonymousClass6ZB();
        this.A02 = new C170088Bv(0.0f);
        this.A03 = new C170088Bv(0.0f);
        this.A01 = new C170088Bv(0.0f);
        this.A00 = new C170088Bv(0.0f);
        this.A0B = new C1446672l();
        this.A0A = new C1446672l();
        this.A08 = new C1446672l();
        this.A09 = new C1446672l();
    }
}
