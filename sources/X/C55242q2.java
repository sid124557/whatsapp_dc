package X;

import android.content.SharedPreferences;

/* renamed from: X.2q2  reason: invalid class name and case insensitive filesystem */
public class C55242q2 {
    public SharedPreferences A00;
    public final C60152y5 A01;
    public final String A02;

    public final SharedPreferences A00() {
        synchronized (this) {
            if (this.A00 == null) {
                this.A00 = this.A01.A03(this.A02);
            }
        }
        return this.A00;
    }

    public final void A03(String str, long j) {
        SharedPreferences.Editor A0E;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        SharedPreferences A002 = A00();
        if (i > 0) {
            A0E = A002.edit().putLong(str, j);
        } else {
            A0E = C18310x6.A0E(A002, str);
        }
        A0E.apply();
    }

    public C55242q2(C60152y5 r3, String str) {
        this.A01 = r3;
        this.A02 = AnonymousClass000.A0V("acs_token_", str, AnonymousClass001.A0o());
    }

    public void A01(int i) {
        SharedPreferences.Editor A0E;
        SharedPreferences A002 = A00();
        if (i > 0) {
            A0E = A002.edit().putInt("token_not_ready_reason", i);
        } else {
            A0E = C18310x6.A0E(A002, "token_not_ready_reason");
        }
        A0E.apply();
    }

    public final void A02(String str, int i) {
        SharedPreferences.Editor A0E;
        SharedPreferences A002 = A00();
        if (i >= 0) {
            A0E = A002.edit().putInt(str, i);
        } else {
            A0E = C18310x6.A0E(A002, str);
        }
        A0E.apply();
    }

    public final void A04(String str, String str2) {
        SharedPreferences.Editor A0E;
        SharedPreferences A002 = A00();
        if (str2 != null) {
            A0E = A002.edit().putString(str, str2);
        } else {
            A0E = C18310x6.A0E(A002, str);
        }
        A0E.apply();
    }
}
