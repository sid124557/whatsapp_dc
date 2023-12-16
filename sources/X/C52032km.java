package X;

import android.content.SharedPreferences;

/* renamed from: X.2km  reason: invalid class name and case insensitive filesystem */
public final class C52032km {
    public final C60152y5 A00;
    public final AnonymousClass66R A01 = C154517dI.A01(new C79703x3(this));

    public C52032km(C60152y5 r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final int A00(String str) {
        C162457s7.A0J(str, 0);
        return C18310x6.A0F(this.A01).getInt(AnonymousClass000.A0V("tos_acceptance_state_", str, AnonymousClass001.A0o()), 0);
    }

    public final void A01(String str, int i) {
        C162457s7.A0J(str, 0);
        C18270x1.A0h(C18270x1.A04(this.A01), AnonymousClass000.A0V("tos_acceptance_state_", str, AnonymousClass001.A0o()), i);
    }

    public final void A02(String str, long j) {
        C162457s7.A0J(str, 0);
        SharedPreferences.Editor A04 = C18270x1.A04(this.A01);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("tos_last_refresh_timestamp_");
        C18270x1.A0k(A04, str, A0o, j);
    }
}
