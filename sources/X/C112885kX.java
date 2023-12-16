package X;

import android.view.KeyEvent;
import com.whatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.5kX  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C112885kX implements AnonymousClass650 {
    public final /* synthetic */ MessageReplyActivity A00;

    public final void BUx(KeyEvent keyEvent, int i) {
        MessageReplyActivity messageReplyActivity = this.A00;
        if (i == 4 && keyEvent != null && keyEvent.getAction() == 1) {
            messageReplyActivity.A75();
            messageReplyActivity.A78();
            messageReplyActivity.A76();
        }
    }

    public /* synthetic */ C112885kX(MessageReplyActivity messageReplyActivity) {
        this.A00 = messageReplyActivity;
    }
}
