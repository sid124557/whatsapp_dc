package X;

import com.whatsapp.notification.PopupNotification;
import com.whatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.6B2  reason: invalid class name */
public class AnonymousClass6B2 implements C182408oM {
    public Object A00;
    public final int A01;

    public AnonymousClass6B2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean BHm() {
        AnonymousClass5ZT r0;
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            r0 = ((MessageReplyActivity) obj).A1N;
        } else {
            r0 = ((PopupNotification) obj).A1M;
        }
        if (r0 == null || r0.A0L == null) {
            return true;
        }
        return false;
    }
}
