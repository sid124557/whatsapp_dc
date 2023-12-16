package X;

import android.content.SharedPreferences;

/* renamed from: X.5NE  reason: invalid class name */
public class AnonymousClass5NE {
    public C60152y5 A00;
    public volatile SharedPreferences A01;

    public final SharedPreferences A00() {
        if (this.A01 == null) {
            synchronized (this) {
                if (this.A01 == null) {
                    this.A01 = this.A00.A03("preloads_prefs");
                }
            }
        }
        return this.A01;
    }
}
