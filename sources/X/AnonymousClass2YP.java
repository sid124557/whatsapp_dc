package X;

import android.content.SharedPreferences;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

/* renamed from: X.2YP  reason: invalid class name */
public class AnonymousClass2YP {
    public SharedPreferences A00;
    public final C60152y5 A01;

    public List A00(int i, int i2, int i3) {
        SharedPreferences sharedPreferences;
        synchronized (this) {
            sharedPreferences = this.A00;
            if (sharedPreferences == null) {
                sharedPreferences = this.A01.A03("media_bandwidth_shared_preferences_v2");
                this.A00 = sharedPreferences;
            }
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[5];
        AnonymousClass000.A1P(objArr, i, 0);
        AnonymousClass000.A1P(objArr, i3, 1);
        AnonymousClass000.A1P(objArr, i2, 2);
        AnonymousClass000.A1P(objArr, 0, 3);
        objArr[4] = "bandwidths";
        StringTokenizer stringTokenizer = new StringTokenizer(AnonymousClass0x9.A0v(sharedPreferences, String.format(locale, "%d_%d_%d_%d_%s", objArr)), ",");
        LinkedList A18 = AnonymousClass0x9.A18();
        while (stringTokenizer.hasMoreTokens()) {
            C18270x1.A1K(A18, Integer.parseInt(stringTokenizer.nextToken()));
        }
        return A18;
    }

    public AnonymousClass2YP(C60152y5 r1) {
        this.A01 = r1;
    }
}
