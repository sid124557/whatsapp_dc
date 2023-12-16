package androidx.core.app;

import X.AnonymousClass0WQ;
import X.C04730Qk;
import X.C05610Ue;
import X.C07860cw;
import X.C14880qQ;
import android.app.Notification;

public class NotificationCompat$BigTextStyle extends C04730Qk {
    public CharSequence A00;

    public String A04() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    public void A06(C14880qQ r3) {
        Notification.BigTextStyle A002 = AnonymousClass0WQ.A00(AnonymousClass0WQ.A01(AnonymousClass0WQ.A02(((C07860cw) r3).A02), (CharSequence) null), this.A00);
        if (this.A02) {
            AnonymousClass0WQ.A03(A002, this.A01);
        }
    }

    public void A07(CharSequence charSequence) {
        this.A00 = C05610Ue.A00(charSequence);
    }
}
