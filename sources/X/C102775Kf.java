package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.datepicker.MaterialCalendar;
import com.whatsapp.R;

/* renamed from: X.5Kf  reason: invalid class name and case insensitive filesystem */
public final class C102775Kf {
    public final Paint A00;
    public final C156737h7 A01;
    public final C156737h7 A02;
    public final C156737h7 A03;
    public final C156737h7 A04;
    public final C156737h7 A05;
    public final C156737h7 A06;
    public final C156737h7 A07;

    public C102775Kf(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C160907oe.A02(context, MaterialCalendar.class.getCanonicalName(), R.attr.f3nameremoved).data, C1463179t.A0K);
        this.A01 = C156737h7.A00(context, obtainStyledAttributes.getResourceId(3, 0));
        this.A02 = C156737h7.A00(context, obtainStyledAttributes.getResourceId(1, 0));
        this.A03 = C156737h7.A00(context, obtainStyledAttributes.getResourceId(2, 0));
        this.A05 = C156737h7.A00(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList A002 = C160917of.A00(context, obtainStyledAttributes, 6);
        this.A07 = C156737h7.A00(context, obtainStyledAttributes.getResourceId(8, 0));
        this.A04 = C156737h7.A00(context, obtainStyledAttributes.getResourceId(7, 0));
        this.A06 = C156737h7.A00(context, obtainStyledAttributes.getResourceId(9, 0));
        Paint A0Z = C86664Kz.A0Z();
        this.A00 = A0Z;
        A0Z.setColor(A002.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
