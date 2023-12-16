package X;

import android.content.SharedPreferences;

/* renamed from: X.2xo  reason: invalid class name and case insensitive filesystem */
public class C59982xo {
    public static final String A02;
    public SharedPreferences A00;
    public final C60152y5 A01;

    public final synchronized SharedPreferences A01() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A03(A02);
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public long A00(String str) {
        return AnonymousClass0x2.A0B(A01(), AnonymousClass000.A0V("::", str, AnonymousClass000.A0l("KeepInChatNotif")));
    }

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(C58152un.A0A);
        A02 = AnonymousClass000.A0X("_daily_events", A0o);
    }

    public C59982xo(C60152y5 r1) {
        this.A01 = r1;
    }
}
