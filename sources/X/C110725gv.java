package X;

import android.graphics.drawable.GradientDrawable;
import com.whatsapp.R;

/* renamed from: X.5gv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C110725gv implements C15950sE {
    public final /* synthetic */ C91484k4 A00;

    public final void BTt(AnonymousClass0TJ r6) {
        C91484k4 r4 = this.A00;
        ((C91504kC) r4.findViewById(R.id.content)).setColor(C86634Kw.A03(r4));
        AnonymousClass0Y8.A04(r4, AnonymousClass34K.A00(r4));
        AnonymousClass0YY.A04(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}), r4.findViewById(R.id.bottom_shade));
        AnonymousClass0YY.A04(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{855638016, 0}), r4.findViewById(R.id.top_shade));
    }

    public /* synthetic */ C110725gv(C91484k4 r1) {
        this.A00 = r1;
    }
}
