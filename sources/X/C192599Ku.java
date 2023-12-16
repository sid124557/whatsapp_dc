package X;

import android.os.Handler;

/* renamed from: X.9Ku  reason: invalid class name and case insensitive filesystem */
public final class C192599Ku {
    public static final Handler A00(C203449ni r4) {
        String str;
        Handler handler = (Handler) r4.B5l(C203579ny.A0D);
        if (handler != null) {
            return handler;
        }
        C203679o8 r3 = (C203679o8) r4.B5k(C203679o8.A00);
        if (C162457s7.A0P(r4.B5l(C203579ny.A0E), Boolean.TRUE)) {
            str = "Lite-Urgent-SurfacePipe-Thread";
            AnonymousClass96h.A00().A00(str, -8);
        } else {
            str = "Lite-SurfacePipe-Thread";
        }
        Handler B82 = r3.B82(str);
        C162457s7.A0D(B82);
        return B82;
    }
}
