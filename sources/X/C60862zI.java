package X;

import android.content.SharedPreferences;

/* renamed from: X.2zI  reason: invalid class name and case insensitive filesystem */
public class C60862zI {
    public SharedPreferences A00;
    public SharedPreferences A01;
    public final C56612sH A02;
    public final C60152y5 A03;
    public final C55832qz A04;

    public final synchronized SharedPreferences A01() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A03.A03("msg_attribute_pref_file");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public final synchronized SharedPreferences A02() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A01;
        if (sharedPreferences == null) {
            sharedPreferences = this.A03.A03("in_app_msg_source_pref_file");
            this.A01 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public C60862zI(C56612sH r1, C60152y5 r2, C55832qz r3) {
        this.A02 = r1;
        this.A04 = r3;
        this.A03 = r2;
    }

    public static final String A00(C95814uZ r2, String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        C18280x3.A0u(r2, A0o);
        return AnonymousClass000.A0V(",", str, A0o);
    }
}
