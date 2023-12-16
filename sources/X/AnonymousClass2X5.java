package X;

import android.content.Intent;

/* renamed from: X.2X5  reason: invalid class name */
public class AnonymousClass2X5 {
    public final C50382i5 A00;

    public AnonymousClass2X5(C50382i5 r1) {
        this.A00 = r1;
    }

    public Intent A00(String str) {
        String str2;
        StringBuilder A0o = AnonymousClass001.A0o();
        if (this.A00.A01()) {
            str2 = "market://details?id=com.whatsapp.w4b&utm_source=";
        } else {
            str2 = "https://play.google.com/store/apps/details?id=com.whatsapp.w4b&utm_source=";
        }
        return C18300x5.A08(AnonymousClass000.A0V(str2, str, A0o));
    }
}
