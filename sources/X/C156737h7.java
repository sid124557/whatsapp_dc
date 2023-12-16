package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;

/* renamed from: X.7h7  reason: invalid class name and case insensitive filesystem */
public final class C156737h7 {
    public final ColorStateList A00;
    public final ColorStateList A01;
    public final ColorStateList A02;
    public final Rect A03;
    public final C161877ql A04;

    public static C156737h7 A00(Context context, int i) {
        if (AnonymousClass000.A1S(i)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C1463179t.A0L);
            Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            ColorStateList A002 = C160917of.A00(context, obtainStyledAttributes, 4);
            ColorStateList A003 = C160917of.A00(context, obtainStyledAttributes, 9);
            ColorStateList A004 = C160917of.A00(context, obtainStyledAttributes, 7);
            obtainStyledAttributes.getDimensionPixelSize(8, 0);
            C161877ql r9 = new C161877ql(C161877ql.A02(context, new C170088Bv((float) 0), obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0)));
            obtainStyledAttributes.recycle();
            return new C156737h7(A002, A003, A004, rect, r9);
        }
        throw AnonymousClass6C7.A0U("Cannot create a CalendarItemStyle with a styleResId of 0");
    }

    public C156737h7(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, Rect rect, C161877ql r6) {
        C04890Rb.A00(rect.left);
        C04890Rb.A00(rect.top);
        C04890Rb.A00(rect.right);
        C04890Rb.A00(rect.bottom);
        this.A03 = rect;
        this.A02 = colorStateList2;
        this.A00 = colorStateList;
        this.A01 = colorStateList3;
        this.A04 = r6;
    }
}
