package X;

import android.content.Context;

/* renamed from: X.09u  reason: invalid class name and case insensitive filesystem */
public final class C012509u extends AnonymousClass0NF {
    public final Context A00;

    public void A00(C17430vW r7) {
        C162457s7.A0J(r7, 0);
        if (this.A00 >= 10) {
            Object[] A0M = AnonymousClass002.A0M();
            A0M[0] = "reschedule_needed";
            A0M[1] = 1;
            ((C08630en) r7).A00.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", A0M);
            return;
        }
        this.A00.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
    }

    public C012509u(Context context, int i, int i2) {
        super(i, i2);
        this.A00 = context;
    }
}
