package X;

import android.content.SharedPreferences;

/* renamed from: X.5NA  reason: invalid class name */
public abstract class AnonymousClass5NA {
    public SharedPreferences A00;
    public final C60152y5 A01;

    public SharedPreferences A01() {
        SharedPreferences sharedPreferences;
        boolean z = this instanceof C96204vy;
        synchronized (this) {
            if (z) {
                sharedPreferences = this.A00;
                if (sharedPreferences == null) {
                    sharedPreferences = this.A01.A03("com.whatsapp_business_directory");
                    this.A00 = sharedPreferences;
                }
            } else {
                sharedPreferences = this.A00;
                if (sharedPreferences == null) {
                    sharedPreferences = this.A01.A03("com.whatsapp_business_search");
                    this.A00 = sharedPreferences;
                }
                C162457s7.A0C(sharedPreferences);
            }
        }
        return sharedPreferences;
    }

    public AnonymousClass5NA(C60152y5 r1) {
        this.A01 = r1;
    }

    public static SharedPreferences.Editor A00(AnonymousClass5NA r0) {
        return r0.A01().edit();
    }
}
