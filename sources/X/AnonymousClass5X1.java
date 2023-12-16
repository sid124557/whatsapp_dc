package X;

import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.5X1  reason: invalid class name */
public final class AnonymousClass5X1 {
    public final C64773Ex A00;
    public final C56422rx A01;
    public final AnonymousClass5ZU A02;

    public static final void A00(Context context) {
        C162457s7.A0J(context, 0);
        C19340zH A002 = AnonymousClass5V0.A00(context);
        A002.A0T(R.string.f11nameremoved);
        A002.A0U(R.string.f11nameremoved);
        A002.A0Y(new C1892590p(5), R.string.f11nameremoved);
        C18280x3.A0q(A002);
    }

    public final void A01(Context context, C181898nW r6, String str) {
        int i;
        int i2;
        C162457s7.A0J(str, 0);
        if (str.equals("PERMANENT")) {
            i = R.string.f11nameremoved;
            i2 = R.string.f11nameremoved;
        } else if (str.equals("TEMPORARY")) {
            i = R.string.f11nameremoved;
            i2 = R.string.f11nameremoved;
        } else {
            return;
        }
        C19340zH A002 = AnonymousClass5V0.A00(context);
        A002.A0T(i2);
        A002.A0U(i);
        A002.A0Y(new C1893490y(this, 1, r6), R.string.f11nameremoved);
        A002.A0V(new C1891590f(r6, 0));
        C18280x3.A0q(A002);
    }

    public AnonymousClass5X1(C64773Ex r1, C56422rx r2, AnonymousClass5ZU r3) {
        C18260x0.A0V(r1, r3, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void A02(Context context, String str) {
        C18260x0.A0O(str, context);
        A01(context, (C181898nW) null, str);
    }
}
