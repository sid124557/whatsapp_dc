package X;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* renamed from: X.0Wr  reason: invalid class name and case insensitive filesystem */
public final class C06210Wr {
    public static final C06210Wr A01 = A01(new Locale[0]);
    public final C16590te A00;

    public static C06210Wr A00(LocaleList localeList) {
        return new C06210Wr(new C07960d6(localeList));
    }

    public static C06210Wr A01(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return A00(C02850Hv.A00(localeArr));
        }
        return new C06210Wr(new C07970d7(localeArr));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C06210Wr) || !this.A00.equals(((C06210Wr) obj).A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return this.A00.toString();
    }

    public C06210Wr(C16590te r1) {
        this.A00 = r1;
    }
}
