package androidx.core.app;

import X.AnonymousClass001;
import X.AnonymousClass0WS;
import X.C04730Qk;
import X.C07860cw;
import X.C14880qQ;
import android.app.Notification;
import java.util.ArrayList;
import java.util.Iterator;

public class NotificationCompat$InboxStyle extends C04730Qk {
    public ArrayList A00 = AnonymousClass001.A0s();

    public String A04() {
        return "androidx.core.app.NotificationCompat$InboxStyle";
    }

    public void A06(C14880qQ r4) {
        Notification.InboxStyle A01 = AnonymousClass0WS.A01(AnonymousClass0WS.A00(((C07860cw) r4).A02), (CharSequence) null);
        if (this.A02) {
            AnonymousClass0WS.A03(A01, this.A01);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            AnonymousClass0WS.A02(A01, (CharSequence) it.next());
        }
    }
}
