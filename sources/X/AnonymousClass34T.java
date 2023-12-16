package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.34T  reason: invalid class name */
public final class AnonymousClass34T {
    public static final AnonymousClass34T A00 = new AnonymousClass34T();

    public static final boolean A01(AnonymousClass1ER r2) {
        C162457s7.A0J(r2, 0);
        if (r2.interactiveMessageCase_ != 6 || !A00.A02(r2, "review_and_pay")) {
            return false;
        }
        return true;
    }

    public static final List A00(AnonymousClass1C7 r5) {
        if (r5 == null) {
            return C72023d3.A00;
        }
        AnonymousClass8U9 r4 = new AnonymousClass8U9();
        for (AnonymousClass1BH r0 : r5.buttons_) {
            r4.add(new AnonymousClass395(new AnonymousClass398(r0.name_, r0.buttonParamsJson_), false));
        }
        return C159507lx.A0h(r4);
    }

    public final boolean A02(AnonymousClass1ER r4, String str) {
        AnonymousClass1BH r2;
        AnonymousClass1C7 A0N = r4.A0N();
        if (A0N == null || A0N.buttons_.size() != 1) {
            r2 = null;
        } else {
            r2 = (AnonymousClass1BH) A0N.buttons_.get(0);
        }
        if (r2 == null || !C162457s7.A0P(str, r2.name_) || TextUtils.isEmpty(r2.buttonParamsJson_)) {
            return false;
        }
        return true;
    }
}
