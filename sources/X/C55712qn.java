package X;

import android.content.SharedPreferences;

/* renamed from: X.2qn  reason: invalid class name and case insensitive filesystem */
public class C55712qn {
    public SharedPreferences A00;
    public final C60152y5 A01;

    public final SharedPreferences A00() {
        synchronized (this) {
            if (this.A00 == null) {
                this.A00 = this.A01.A03("privatestats_props");
            }
        }
        return this.A00;
    }

    public final void A04(String str, long j) {
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

    public C55712qn(C60152y5 r1) {
        this.A01 = r1;
    }

    public void A01(int i) {
        C18270x1.A0h(A00().edit(), "first_token_stage", i);
    }

    public void A02(int i) {
        SharedPreferences.Editor A0E;
        SharedPreferences A002 = A00();
        if (i >= 0) {
            A0E = A002.edit().putInt("redeem_count", i);
        } else {
            A0E = C18310x6.A0E(A002, "redeem_count");
        }
        A0E.apply();
    }

    public void A03(int i) {
        SharedPreferences.Editor A0E;
        SharedPreferences A002 = A00();
        if (i > 0) {
            A0E = A002.edit().putInt("token_not_ready_reason", i);
        } else {
            A0E = C18310x6.A0E(A002, "token_not_ready_reason");
        }
        A0E.apply();
    }

    public final void A05(String str, String str2) {
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
