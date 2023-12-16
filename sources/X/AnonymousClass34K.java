package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.wabloks.ui.WaBloksActivity;

/* renamed from: X.34K  reason: invalid class name */
public final class AnonymousClass34K {
    public static Boolean A00;
    public static final AnonymousClass66R A01 = C154517dI.A01(C817340w.A00);

    public static final int A00(Context context) {
        C162457s7.A0J(context, 0);
        return AnonymousClass5Yj.A02(context, R.attr.f3nameremoved, R.color.f5nameremoved);
    }

    public static final int A01(Context context, int i) {
        int i2;
        Number number = (Number) AnonymousClass001.A0i(AnonymousClass0x7.A10(A01), i);
        if (number != null) {
            i2 = number.intValue();
        } else {
            i2 = R.color.f5nameremoved;
        }
        return AnonymousClass5Yj.A02(context, i, i2);
    }

    public static final int A02(Context context, int i, int i2) {
        return AnonymousClass5Yj.A02(context, i, i2);
    }

    public static void A03(Activity activity, AnonymousClass983 r5) {
        C107405bG.A07(activity, A00(activity));
        WaBloksActivity waBloksActivity = r5.A03;
        View A002 = C005205m.A00(waBloksActivity, R.id.wabloks_screen_toolbar);
        C162457s7.A0D(A002);
        Toolbar toolbar = (Toolbar) A002;
        C131666dx r2 = new C131666dx(AnonymousClass0RP.A00(waBloksActivity, R.drawable.ic_back), r5.A02);
        r2.setColorFilter(AnonymousClass0Y8.A04(activity, R.color.f5nameremoved), PorterDuff.Mode.SRC_ATOP);
        toolbar.setNavigationIcon((Drawable) r2);
        toolbar.setTitleTextColor(AnonymousClass0Y8.A04(activity, AnonymousClass5Yj.A02(activity, R.attr.f3nameremoved, R.color.f5nameremoved)));
        toolbar.setBackgroundColor(AnonymousClass0Y8.A04(activity, A00(activity)));
    }
}
