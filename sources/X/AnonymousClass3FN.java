package X;

import android.content.SharedPreferences;

/* renamed from: X.3FN  reason: invalid class name */
public class AnonymousClass3FN implements AnonymousClass4E8 {
    public final AnonymousClass2YA A00;

    public void BQW() {
        SharedPreferences.Editor edit = this.A00.A00().edit();
        edit.remove("disappearing_mode_duration");
        edit.apply();
    }

    public AnonymousClass3FN(AnonymousClass2YA r1) {
        this.A00 = r1;
    }

    public String BDW() {
        return "DisappearingModeDailyCron";
    }

    public /* synthetic */ void BQX() {
    }
}
