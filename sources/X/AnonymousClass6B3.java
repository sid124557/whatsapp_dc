package X;

import android.text.InputFilter;
import android.text.Spanned;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.6B3  reason: invalid class name */
public class AnonymousClass6B3 implements InputFilter {
    public Object A00;
    public final int A01;

    public AnonymousClass6B3(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        AnonymousClass5ZT r0;
        int i5 = this.A01;
        Object obj = this.A00;
        if (i5 != 0) {
            r0 = ((MessageReplyActivity) obj).A1N;
            if (r0 == null) {
                return null;
            }
        } else {
            r0 = ((PopupNotification) obj).A1M;
        }
        if (r0.A0L != null) {
            return "";
        }
        return null;
    }
}
