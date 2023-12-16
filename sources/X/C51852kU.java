package X;

import android.content.SharedPreferences;

/* renamed from: X.2kU  reason: invalid class name and case insensitive filesystem */
public class C51852kU {
    public SharedPreferences A00;
    public final C60152y5 A01;

    public final synchronized SharedPreferences A01() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A03("network_resources_pref");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public C51852kU(C60152y5 r1) {
        this.A01 = r1;
    }

    public int A00(String str) {
        return A01().getInt(AnonymousClass000.A0V("downloadstate/", str, AnonymousClass001.A0o()), 5);
    }

    public void A02(String str, int i) {
        C18270x1.A0h(A01().edit(), AnonymousClass000.A0V("downloadstate/", str, AnonymousClass001.A0o()), i);
    }
}
