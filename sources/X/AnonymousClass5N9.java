package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.5N9  reason: invalid class name */
public final class AnonymousClass5N9 {
    public final C50382i5 A00;
    public final C53602nM A01;

    public final void A00(Activity activity, Context context) {
        C19340zH A002 = AnonymousClass5V0.A00(context);
        A002.A0U(R.string.f11nameremoved);
        A002.A0T(R.string.f11nameremoved);
        A002.A0i(false);
        A002.A0Y(new AnonymousClass69T(this, 16, context), R.string.f11nameremoved);
        A002.A0W(new C1891190b(activity, 46), R.string.f11nameremoved);
        AnonymousClass043 A0H = C18300x5.A0H(A002);
        A0H.setCanceledOnTouchOutside(false);
        A0H.show();
    }

    public AnonymousClass5N9(C50382i5 r1, C53602nM r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
