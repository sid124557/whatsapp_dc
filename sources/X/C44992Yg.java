package X;

import android.content.SharedPreferences;

/* renamed from: X.2Yg  reason: invalid class name and case insensitive filesystem */
public final class C44992Yg {
    public final C60152y5 A00;
    public final AnonymousClass66R A01 = C154517dI.A01(new C79463wf(this));

    public C44992Yg(C60152y5 r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final void A00(long j, boolean z) {
        SharedPreferences.Editor A04 = C18270x1.A04(this.A01);
        C162457s7.A0D(A04);
        A04.putBoolean("pref_disclosure_tos_state", z);
        A04.putLong("pref_disclosure_tos_timestamp", j);
        A04.apply();
    }
}
