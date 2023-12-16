package X;

import android.app.Activity;
import com.whatsapp.R;

/* renamed from: X.5O6  reason: invalid class name */
public final class AnonymousClass5O6 {
    public final Activity A00;
    public final AnonymousClass5XZ A01;
    public final C105245Ud A02;
    public final C55652qh A03;
    public final C47092ch A04;

    public AnonymousClass5O6(Activity activity, AnonymousClass5XZ r3, C105245Ud r4, C55652qh r5, C47092ch r6) {
        C18270x1.A11(r4, 3, r5);
        this.A00 = activity;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r6;
    }

    public final boolean A00() {
        if (this.A01.A02().length() == 0 && C86634Kw.A1X(this.A02.A08)) {
            return false;
        }
        C106785aA.A01(this.A00, C1235268t.A00(this, 28), C1235268t.A00(this, 29), R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved);
        return true;
    }
}
