package X;

import android.text.TextUtils;

/* renamed from: X.3YD  reason: invalid class name */
public final class AnonymousClass3YD implements C84314Bw {
    public final C56612sH A00;
    public final AnonymousClass33p A01;

    public boolean AxE(AnonymousClass2PJ r13, C833648c r14, C833748d r15) {
        C162457s7.A0J(r13, 1);
        C183538qC r10 = this.A01.A01;
        if (C18300x5.A0B(r10).getLong("inorganic_notification_last_timestamp", 0) != 0) {
            String A0o = C18310x6.A0o("param", r13.A01);
            if (!(A0o == null || A0o.length() == 0 || !TextUtils.isDigitsOnly(A0o))) {
                if (this.A00.A0H() - C18300x5.A0B(r10).getLong("inorganic_notification_last_timestamp", 0) > Long.parseLong(A0o) * ((long) 60000)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass3YD(C56612sH r1, AnonymousClass33p r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
