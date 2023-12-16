package X;

import android.os.SystemClock;
import java.util.List;

/* renamed from: X.9WT  reason: invalid class name */
public class AnonymousClass9WT {
    public static final C194439Sw A00 = new C194439Sw();

    public static void A00() {
        SystemClock.elapsedRealtime();
        List list = A00.A00;
        if (0 < list.size()) {
            list.get(0);
            throw AnonymousClass001.A0g("getLoggerHandler");
        }
    }

    public static void A01(String str, String str2) {
        StringBuilder A0l = AnonymousClass000.A0l(str);
        A0l.append(": ");
        A0l.append(str2);
        A0l.toString();
        A00();
    }

    public static void A02(String str, String str2) {
        StringBuilder A0l = AnonymousClass000.A0l(str);
        A0l.append(": ");
        A0l.append(str2);
        A0l.toString();
        A00();
    }
}
