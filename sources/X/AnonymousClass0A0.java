package X;

import android.os.Build;

/* renamed from: X.0A0  reason: invalid class name */
public final class AnonymousClass0A0 extends AnonymousClass0NF {
    public static final AnonymousClass0A0 A00 = new AnonymousClass0A0();

    public AnonymousClass0A0() {
        super(3, 4);
    }

    public void A00(C17430vW r3) {
        C162457s7.A0J(r3, 0);
        if (Build.VERSION.SDK_INT >= 23) {
            r3.B2q("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
        }
    }
}
