package X;

import android.content.SharedPreferences;

/* renamed from: X.2dr  reason: invalid class name and case insensitive filesystem */
public final class C47812dr {
    public final AnonymousClass33p A00;

    public C47812dr(AnonymousClass33p r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final C48862fb A00() {
        C183538qC r8 = this.A00.A01;
        long A0A = AnonymousClass0x2.A0A(C18300x5.A0B(r8), "account_logout_request_attempt_timestamp");
        String string = C18300x5.A0B(r8).getString("account_logout_request_server_token", (String) null);
        if (A0A < 0 || string == null) {
            return null;
        }
        return new C48862fb(A0A, C18300x5.A0B(r8).getString("account_logout_request_new_device_name", (String) null), string);
    }

    public final void A01(C48862fb r8) {
        long j;
        String str;
        String str2;
        if (r8 != null) {
            j = r8.A00;
            str2 = r8.A02;
            str = r8.A01;
        } else {
            j = -1;
            str = null;
            str2 = null;
        }
        AnonymousClass33p r4 = this.A00;
        C18270x1.A0i(C18270x1.A03(r4), "account_logout_request_attempt_timestamp", j);
        SharedPreferences.Editor A03 = C18270x1.A03(r4);
        if (str2 != null) {
            A03.putString("account_logout_request_server_token", str2);
        } else {
            A03.remove("account_logout_request_server_token");
        }
        A03.apply();
        SharedPreferences.Editor A032 = C18270x1.A03(r4);
        if (str != null) {
            A032.putString("account_logout_request_new_device_name", str);
        } else {
            A032.remove("account_logout_request_new_device_name");
        }
        A032.apply();
    }
}
