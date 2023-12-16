package X;

import android.content.SharedPreferences;

/* renamed from: X.2YD  reason: invalid class name */
public class AnonymousClass2YD {
    public SharedPreferences A00;
    public final C60152y5 A01;

    public int A00(int i) {
        SharedPreferences sharedPreferences;
        synchronized (this) {
            sharedPreferences = this.A00;
            if (sharedPreferences == null) {
                sharedPreferences = this.A01.A03("field-stats-events-sampling");
                this.A00 = sharedPreferences;
            }
        }
        return C18280x3.A02(sharedPreferences, String.valueOf(i));
    }

    public AnonymousClass2YD(C60152y5 r1) {
        this.A01 = r1;
    }
}
