package X;

import android.content.SharedPreferences;

/* renamed from: X.0U8  reason: invalid class name */
public final class AnonymousClass0U8 {
    public final C380625j A00;
    public final C60152y5 A01;
    public final AnonymousClass66R A02 = C154517dI.A01(new C14140oh(this));

    public AnonymousClass0U8(C380625j r2, C60152y5 r3) {
        C162457s7.A0J(r2, 1);
        C162457s7.A0J(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final void A02() {
        A01().edit().putBoolean("_new_user", true).apply();
    }

    public final SharedPreferences A01() {
        return (SharedPreferences) this.A02.getValue();
    }

    public final void A03(Long l, String str, String str2) {
        if (l != null) {
            A01().edit().putLong(AnonymousClass000.A0T(str, str2), l.longValue()).apply();
        }
    }
}
