package X;

import android.content.Intent;
import java.util.GregorianCalendar;

/* renamed from: X.7i6  reason: invalid class name and case insensitive filesystem */
public final class C157317i6 {
    public final C194309Sj A00;
    public final AnonymousClass9RH A01;

    public final void A00(Intent intent, C89654ea r11, AnonymousClass8s2 r12) {
        C162457s7.A0J(intent, 1);
        long longExtra = intent.getLongExtra("dob_timestamp_ms", 0);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(longExtra);
        this.A00.A00(new C171638Hv(r11, r12, this), "kyc-recollect", (String) null, gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
    }

    public C157317i6(C194309Sj r1, AnonymousClass9RH r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
