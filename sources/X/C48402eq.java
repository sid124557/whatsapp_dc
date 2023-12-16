package X;

import android.content.SharedPreferences;

/* renamed from: X.2eq  reason: invalid class name and case insensitive filesystem */
public class C48402eq {
    public SharedPreferences A00;
    public final C60152y5 A01;

    public final synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A03("block_reasons_prefs");
            this.A00 = sharedPreferences;
        }
        C626936e.A06(sharedPreferences);
        return sharedPreferences;
    }

    public C48402eq(C60152y5 r1) {
        this.A01 = r1;
    }

    public void A01(int i) {
        C18270x1.A0h(A00().edit(), "biz_block_reasons_api_back_off_days", i);
    }
}
